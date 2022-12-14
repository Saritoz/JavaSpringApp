const moreInfoOrderModal = new bootstrap.Modal(
  document.querySelector("#moreInfoOrderModal"),
  {}
);
const btn_delivery = document.querySelector("#btn-delivery");
const btn_success = document.querySelector("#btn-success");
const btn_deny = document.querySelector("#btn-deny");
let idOrder;
let statusOrder;
function openOrderInfoModal(e) {
  idOrder = e.dataset.id;
  statusOrder = e.dataset.status;
  document.querySelector("#moreInfoOrderModal #id-order").value = e.dataset.id;
  document.querySelector("#moreInfoOrderModal #price-product").value =
    e.dataset.total;
  document.querySelector("#moreInfoOrderModal #shipment-order").value =
    e.dataset.shipment;
  document.querySelector("#moreInfoOrderModal #status-order").value =
    e.dataset.status;
  document.querySelector("#moreInfoOrderModal #owner-order").value =
    e.dataset.fullname;
  document.querySelector("#moreInfoOrderModal #phone-order").value =
    e.dataset.pnumber;
  document.querySelector("#moreInfoOrderModal #email-order").value =
    e.dataset.email;
  document.querySelector("#moreInfoOrderModal #address-order").value =
    e.dataset.address;
  $.ajax({
    type: "GET",
    contentType: "application/json",
    url: "/admin/ordermanagement/detail/" + e.dataset.id,
    dataType: "json",
    cache: false,
    timeout: 600000,
    success: function (data) {
      const tbody_order = document.querySelector("#tbody-order");
      tbody_order.innerHTML = "";
      for (let i = 0; i < data.length; i++) {
        let tr = document.createElement("tr");
        let td_id = document.createElement("td");
        let td_name = document.createElement("td");
        let td_quantity = document.createElement("td");
        let td_price = document.createElement("td");

        let text_id = document.createTextNode(data[i].idFlower);
        let text_name = document.createTextNode(data[i].nameFlower);
        let text_quantity = document.createTextNode(data[i].quantityFlower);
        let text_price = document.createTextNode(data[i].totalPriceFlower);

        td_id.appendChild(text_id);
        td_name.appendChild(text_name);
        td_quantity.appendChild(text_quantity);
        td_price.appendChild(text_price);

        tr.appendChild(td_id);
        tr.appendChild(td_name);
        tr.appendChild(td_quantity);
        tr.appendChild(td_price);
        tbody_order.appendChild(tr);
      }
    },
    error: function (e) {
      console.log("ERROR : ", e);
    },
  });
  moreInfoOrderModal.show();

  btn_deny.disabled = false;
  btn_delivery.disabled = false;
  btn_success.disabled = false;

  if (statusOrder == "Đang giao hàng") {
    btn_deny.disabled = true;
    btn_delivery.disabled = true;
  } else if (statusOrder == "Thành công" || statusOrder == "Từ chối") {
    btn_deny.disabled = true;
    btn_delivery.disabled = true;
    btn_success.disabled = true;
  } else if (statusOrder == "Chờ xác nhận") {
    btn_success.disabled = true;
  }
}

btn_delivery.addEventListener("click", () => {
  const form = document.createElement("form");
  form.setAttribute("method", "post");
  form.setAttribute("action", "/admin/ordermanagement/delivery");

  const FN1 = document.createElement("input");
  FN1.setAttribute("type", "text");
  FN1.setAttribute("name", "idOrder");
  FN1.setAttribute("value", idOrder);
  form.appendChild(FN1);
  document.getElementsByTagName("body")[0].appendChild(form);
  form.submit();
});

btn_success.addEventListener("click", () => {
  const form = document.createElement("form");
  form.setAttribute("method", "post");
  form.setAttribute("action", "/admin/ordermanagement/success");

  const FN1 = document.createElement("input");
  FN1.setAttribute("type", "text");
  FN1.setAttribute("name", "idOrder");
  FN1.setAttribute("value", idOrder);
  form.appendChild(FN1);
  document.getElementsByTagName("body")[0].appendChild(form);
  form.submit();
});

btn_deny.addEventListener("click", () => {
  const form = document.createElement("form");
  form.setAttribute("method", "post");
  form.setAttribute("action", "/admin/ordermanagement/deny");

  const FN1 = document.createElement("input");
  FN1.setAttribute("type", "text");
  FN1.setAttribute("name", "idOrder");
  FN1.setAttribute("value", idOrder);
  form.appendChild(FN1);
  document.getElementsByTagName("body")[0].appendChild(form);
  form.submit();
});
