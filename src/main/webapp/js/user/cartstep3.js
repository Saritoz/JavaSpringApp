const btn_pay_ct3 = document.querySelector("#btn-ct3");
const cart_status = document.querySelector("#cart-status");
const form_ct3 = document.querySelector("#form-ct3");

btn_pay_ct3.addEventListener("click", () => {
  if (cart_status.value == "ordernow") {
    form_ct3.setAttribute("action", "/cart-step-4/ordernow");
    form_ct3.submit();
  } else {
    form_ct3.setAttribute("action", "/cart-step-4");
    form.submit();
  }
});
