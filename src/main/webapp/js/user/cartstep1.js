const btn_pay_ct1 = document.querySelector("#btn-pay-ct1");
const cart_id = document.querySelector("#cart-id");
const cart_status = document.querySelector("#cart-status");
const total_flower = document.querySelector("#totalFlower");
const total = document.querySelector("#total");
const id_flower = document.querySelector("#id-flower");
const name_flower = document.querySelector("#name-flower");

btn_pay_ct1.addEventListener("click", () => {
  if (cart_status.value == "ordernow") {
    const form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", "/cart-step-2/ordernow");

    const FN1 = document.createElement("input");
    FN1.setAttribute("type", "text");
    FN1.setAttribute("name", "quantity-flower");
    FN1.setAttribute("value", total_flower.value);
    form.appendChild(FN1);
    const FN2 = document.createElement("input");
    FN2.setAttribute("type", "text");
    FN2.setAttribute("name", "cart-status");
    FN2.setAttribute("value", cart_status.value);
    form.appendChild(FN2);
    const FN3 = document.createElement("input");
    FN3.setAttribute("type", "text");
    FN3.setAttribute("name", "id-flower");
    FN3.setAttribute("value", id_flower.value);
    form.appendChild(FN3);
    const FN4 = document.createElement("input");
    FN4.setAttribute("type", "text");
    FN4.setAttribute("name", "total");
    FN4.setAttribute("value", total.value);
    form.appendChild(FN4);
    const FN5 = document.createElement("input");
    FN5.setAttribute("type", "text");
    FN5.setAttribute("name", "name-flower");
    FN5.setAttribute("value", name_flower.value);
    form.appendChild(FN5);
    document.getElementsByTagName("body")[0].appendChild(form);
    form.submit();
  } else {
    const form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", "/cart-step-2");
    const FN1 = document.createElement("input");
    FN1.setAttribute("type", "text");
    FN1.setAttribute("name", "quantity-flower");
    FN1.setAttribute("value", total_flower.value);
    form.appendChild(FN1);
    const FN3 = document.createElement("input");
    FN3.setAttribute("type", "text");
    FN3.setAttribute("name", "id-flower");
    FN3.setAttribute("value", id_flower.value);
    form.appendChild(FN3);
    const FN4 = document.createElement("input");
    FN4.setAttribute("type", "text");
    FN4.setAttribute("name", "total");
    FN4.setAttribute("value", total.value);
    form.appendChild(FN4);
    const FN5 = document.createElement("input");
    FN5.setAttribute("type", "text");
    FN5.setAttribute("name", "name-flower");
    FN5.setAttribute("value", name_flower.value);
    form.appendChild(FN5);
    document.getElementsByTagName("body")[0].appendChild(form);
    form.submit();
  }
});
