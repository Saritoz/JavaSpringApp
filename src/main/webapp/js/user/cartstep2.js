var btn_pay_ct2 = document.querySelector("#btn-ct2");
var cart_id = document.querySelector("#cart-id");
var cart_status = document.querySelector("#cart-status");
var form_ct2 = document.querySelector("#form-ct2");

btn_pay_ct2.addEventListener("click", () => {
  if (cart_status.value == "ordernow") {
    form_ct2.setAttribute("action", "/cart-step-3/ordernow");
    var FN = document.createElement("input");
    FN.setAttribute("type", "text");
    FN.setAttribute("name", "cart-id");
    FN.setAttribute("value", cart_id.value);
    form_ct2.appendChild(FN);
    form_ct2.submit();
  } else {
    form_ct2.setAttribute("action", "/cart-step-3");
    form.submit();
  }
});
