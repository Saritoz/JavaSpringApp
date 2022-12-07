var btn_pay_ct1 = document.querySelector("#btn-pay-ct1");
var cart_id = document.querySelector("#cart-id");
var cart_status = document.querySelector("#cart-status");

btn_pay_ct1.addEventListener("click", () => {
  if (cart_status.value == "ordernow") {
    var form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", "/cart-step-2/ordernow");

    var FN = document.createElement("input");
    FN.setAttribute("type", "text");
    FN.setAttribute("name", "cart-id");
    FN.setAttribute("value", cart_id.value);
    form.appendChild(FN);
    document.getElementsByTagName("body")[0].appendChild(form);
    form.submit();
  } else {
    var form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", "/cart-step-2");
    document.getElementsByTagName("body")[0].appendChild(form);
    form.submit();
  }
});
