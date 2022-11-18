<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
    <link rel="stylesheet" href="../../css/user/cartstep1.css">
    <link rel="stylesheet" href="../../css/user/header.css">
</head>

<body>
    <%@include file="../../components/header.jsp" %>
    <section class="cart step-1 container m-header">
        <div class="cart-progress">
            <div class="cart-step1 step-active">
                <i class="fa fa-cart-shopping"></i>
            </div>
            <div class="cart-line"></div>
            <div class="cart-step2">
                <i class="fa fa-location-dot"></i>
            </div>
            <div class="cart-line"></div>
            <div class="cart-step3">
                <i class="fa fa-money-check"></i>
            </div>
        </div>
        <div class="cart-step-title">
            <p>Giỏ hàng</p>
        </div>

        <div class="row row-cols-1 row-cols-lg-2 g-4">
            <div class="col-12 col-lg-8">
                <table class="table table-hover w-100">
                    <thead class="text-center">
                        <tr>
                            <th scope="col">Sản phẩm</th>
                            <th scope="col">Tên sản phẩm</th>
                            <th scope="col">Số lượng</th>
                            <th scope="col">Tổng tiền</th>
                            <th scope="col"> </th>
                        </tr>
                    </thead>
                    <tbody class="text-center" style="vertical-align: middle;">
                        <tr>
                            <td><img class="ct-img" src="../../imgs/itemflower1.jpg" alt="" width="200"></td>
                            <td>Flower 1</td>
                            <td><input type="number" value="1" min="1" max="99" width="50"></td>
                            <td>283.000 VND</td>
                            <td><i class="fa-solid fa-trash-can text-danger ct-icon"></i></td>
                        </tr>
                        <tr>
                            <td><img class="ct-img" src="../../imgs/itemflower1.jpg" alt="" width="200"></td>
                            <td>Flower 1</td>
                            <td><input type="number" value="1" min="1" max="99" width="50"></td>
                            <td>283.000 VND</td>
                            <td><i class="fa-solid fa-trash-can text-danger ct-icon"></i></td>
                        </tr>
                        <tr>
                            <td><img class="ct-img" src="../../imgs/itemflower1.jpg" alt="" width="200"></td>
                            <td>Flower 1</td>
                            <td><input type="number" value="1" min="1" max="99" width="50"></td>
                            <td>283.000 VND</td>
                            <td><i class="fa-solid fa-trash-can text-danger ct-icon"></i></td>
                        </tr>
                    </tbody>
                </table>
            </div>
            <div class="col-12 col-lg-4">
                <table class="table w-100">
                    <thead class="text-center">
                      <tr>
                        <th colspan="2" scope="col">Tổng tiền giỏ hàng</th>
                      </tr>
                    </thead>
                    <tbody class="ct-table-body">
                      <tr>
                        <td>Tổng sản phẩm</td>
                        <td>3</td>
                      </tr>
                      <tr>
                        <td>Tổng tiền hàng</td>
                        <td>849.000 <span>VND</span></td>
                      </tr>
                    </tbody>
                    <tfoot class="ct-table-footer">
                        <tr>
                            <td>Tạm tính</td>
                            <td>849.000 <span>VND</span></td>
                        </tr>
                    </tfoot>
                  </table>
                  <a href="/" class="d-inline-block ct-btn-cart me-2" style="--ct-color: #0000ff">Tiếp tục mua hàng</a>
                  <a href="/cart-step-2" class="d-inline-block ct-btn-cart me-2" style="--ct-color: #ff0000">Thanh toán</a>
            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>

</html>