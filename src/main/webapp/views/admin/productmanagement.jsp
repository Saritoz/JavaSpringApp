<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <div class="m-5">
        <div class="d-flex justify-content-end mb-3">
            <button class="btn btn-outline-success" onclick="openNewProductModal()"><i class="fa-solid fa-plus"></i> Add new product</button>
        </div>
        <table class="table table-hover">
            <thead class="text-center">
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Description</th>
                    <th>Quantity</th>
                    <th></th>
                </tr>
            </thead>
            <tbody class="text-center">
                <tr onclick="openMoreInfoModal(event)">
                    <td>1</td>
                    <td>Duy's Flower</td>
                    <td>250000</td>
                    <td>Just flowers.</td>
                    <td>250</td>
                    <td>
                        <div>
                            <a class="text-info me-2" href="#" onclick="openEditProductModal(this); return false;">Edit</a>
                            <a class="text-danger" href="#" onclick="openDeleteProductModal(this)">Delete</a>
                        </div>
                    </td>
                </tr>
                <tr onclick="openMoreInfoModal(event)">
                    <td>1</td>
                    <td>Duy's Flower</td>
                    <td>250000</td>
                    <td>Just flowers.</td>
                    <td>250</td>
                    <td><a class="text-info me-2" href="#" onclick="openEditProductModal(this); return false;">Edit</a>
                        <a class="text-danger" href="#" onclick="openDeleteProductModal(this)">Delete</a>
                    </td>
                </tr>
                <tr onclick="openMoreInfoModal(event)">
                    <td>1</td>
                    <td>Duy's Flower</td>
                    <td>250000</td>
                    <td>Just flowers.</td>
                    <td>250</td>
                    <td><a class="text-info me-2" href="#" onclick="openEditProductModal(this); return false;">Edit</a>
                        <a class="text-danger" href="#" onclick="openDeleteProductModal(this)">Delete</a>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
    <div class="modal fade" id="addProductModal" tabindex="-1" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalLabel">New product</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="" id="addform" method="post" class="needs-validation" novalidate>
                        <div class="mb-3">
                            <label for="name-product" class="form-label">Name</label>
                            <input type="text" class="form-control" id="name-product" value="" required>
                            <div class="invalid-feedback">
                              Name cannot empty!
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="price-product" class="form-label">Price</label>
                            <input type="text" class="form-control" id="price-product" value="" required>
                            <div class="invalid-feedback">
                              Price cannot empty!
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="desc-product" class="form-label">Description</label>
                            <textarea class="form-control" id="desc-product" placeholder="Description" required></textarea>
                            <div class="invalid-feedback">
                              Description cannot empty!
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="quantity-product" class="form-label">Quantity</label>
                            <input type="text" class="form-control" id="quantity-product" value="" required>
                            <div class="invalid-feedback">
                              Price cannot empty!
                            </div>
                        </div>
                        <div class="mb-3">
                            <label for="images-product" class="form-label">Images</label>
                            <input type="file" class="form-control" id="images-product" multiple required accept="image/*">
                            <div class="invalid-feedback">
                              Please choose maximum 5 files
                            </div>
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="reset" class="btn btn-outline-secondary" data-bs-dismiss="modal">Cancel</button>
                    <input type="submit" form="addform" class="btn btn-outline-success" value="Add">
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="editProductModal" tabindex="-1" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalLabel">Edit product</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <form action="" id="editform" method="post">
                        <div class="mb-3">
                            <label for="name-product" class="form-label">Name</label>
                            <input type="text" class="form-control" id="name-product" value="Mark">
                            
                        </div>
                        <div class="mb-3">
                            <label for="price-product" class="form-label">Price</label>
                            <input type="text" class="form-control" id="price-product" value="Mark">
                            
                        </div>
                        <div class="mb-3">
                            <label for="desc-product" class="form-label">Description</label>
                            <textarea class="form-control" id="desc-product" placeholder="Description"></textarea>
                            
                        </div>
                        <div class="mb-3">
                            <label for="quantity-product" class="form-label">Quantity</label>
                            <input type="text" class="form-control" id="quantity-product" value="Mark">
                        </div>
                        <div class="mb-3">
                            <label for="images-product" class="form-label">Images</label>
                            <input type="file" class="form-control" id="images-product" multiple accept="image/*">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="reset" class="btn btn-outline-secondary" data-bs-dismiss="modal">Cancel</button>
                    <input type="submit" form="editform" class="btn btn-outline-success" value="Update" data-bs-dismiss="modal">
                </div>
            </div>
        </div>
    </div>
    <div class="modal fade" id="moreInfoProductModal" tabindex="-1" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog modal-dialog-centered">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalLabel">Full information product</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <div class="mb-3">
                        <label for="name-product" class="form-label">Name</label>
                        <input type="text" class="form-control" id="name-product" value="" disabled>
                    </div>
                    <div class="mb-3">
                        <label for="price-product" class="form-label">Price</label>
                        <input type="text" class="form-control" id="price-product" value="" disabled>
                        
                    </div>
                    <div class="mb-3">
                        <label for="desc-product" class="form-label">Description</label>
                        <textarea class="form-control" id="desc-product" placeholder="Description" disabled></textarea>
                        
                    </div>
                    <div class="mb-3">
                        <label for="quantity-product" class="form-label">Quantity</label>
                        <input type="text" class="form-control" id="quantity-product" value="" disabled>
                    </div>
                    <div class="mb-3">
                        <label for="images-product" class="form-label">Images</label>
                        <div class="row">
                            <div class="col-6"><img src="" alt=""></div>
                            <div class="col-6"><img src="" alt=""></div>
                            <div class="col-6"><img src="" alt=""></div>
                            <div class="col-6"><img src="" alt=""></div>
                            <div class="col-6"><img src="" alt=""></div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-outline-secondary" data-bs-dismiss="modal">Cancel</button>
                    <input type="button" class="btn btn-outline-success" value="Ok" data-bs-dismiss="modal">
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="../../components/confirmModal.jsp">
        <jsp:param name="idModal" value="deleteProductModal" />
        <jsp:param name="titleModal" value="Delete Product" />
        <jsp:param name="contentModal" value="Are you sure to delete this products?" />
    </jsp:include>
    <script src="../../js/admin/productmanagement.js"></script>
    <script src="../../js/formvalidation.js"></script>