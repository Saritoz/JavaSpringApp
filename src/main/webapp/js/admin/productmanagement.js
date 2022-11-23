const addProductModal = new bootstrap.Modal(document.querySelector("#addProductModal"), {});
const editProductModal = new bootstrap.Modal(document.querySelector("#editProductModal"), {});
const deleteProductModal = new bootstrap.Modal(document.querySelector("#deleteProductModal"), {}) 
const moreInfoProductModal = new bootstrap.Modal(document.querySelector("#moreInfoProductModal"), {});

function openMoreInfoModal(e) {
    if (e.target.parentNode !== e.currentTarget) {
        return;
    }
    moreInfoProductModal.show();
}

function openNewProductModal() {
    addProductModal.show();
}

function openEditProductModal(e) {
    editProductModal.show()
}

function openDeleteProductModal(e) {
    deleteProductModal.show();
}