const addProductModal = new bootstrap.Modal(
  document.querySelector("#addProductModal"),
  {}
);
const editProductModal = new bootstrap.Modal(
  document.querySelector("#editProductModal"),
  {}
);
const deleteProductModal = new bootstrap.Modal(
  document.querySelector("#deleteProductModal"),
  {}
);
const moreInfoProductModal = new bootstrap.Modal(
  document.querySelector("#moreInfoProductModal"),
  {}
);

function openMoreInfoModal(e, event) {
  if (event.target.parentNode !== event.currentTarget) {
    return;
  }
  document.querySelector("#moreInfoProductModal #name-product").value = e.dataset.name;
  document.querySelector("#moreInfoProductModal #price-product").value = e.dataset.price;
  document.querySelector("#moreInfoProductModal #desc-product").value = e.dataset.desc;
  document.querySelector("#moreInfoProductModal #quantity-product").value = e.dataset.quantity;
  moreInfoProductModal.show();
}

function openNewProductModal() {
  addProductModal.show();
}

function openEditProductModal(e) {
  document.querySelector("#editProductModal #id-product").value = e.dataset.id;
  document.querySelector("#editProductModal #name-product").value = e.dataset.name;
  document.querySelector("#editProductModal #price-product").value = e.dataset.price;
  document.querySelector("#editProductModal #desc-product").value = e.dataset.desc;
  document.querySelector("#editProductModal #quantity-product").value = e.dataset.quantity;
  editProductModal.show();
}

function openDeleteProductModal(e) {
    var form = document.createElement("form");
    form.setAttribute("method", "post");
    form.setAttribute("action", "/admin/productmanagement/delete");

    var FN = document.createElement("input");
    FN.setAttribute("type", "text");
    FN.setAttribute("name", "id-product");
    FN.setAttribute("value", e.dataset.id);
    form.appendChild(FN);
    document.getElementsByTagName("body")[0].appendChild(form);
    document.querySelector("#deleteProductModal #btn-delete-flower").addEventListener("click", function(){
        form.submit();
    })
  deleteProductModal.show();
}
