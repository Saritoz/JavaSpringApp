<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Method</title>
    <link rel="stylesheet" href="../css/cartstep3.css">
</head>

<body>
    <section class="cart step-3 container m-header">
        <div class="cart-progress">
            <div class="cart-step1 step-active">
                <i class="fa fa-cart-shopping"></i>
            </div>
            <div class="cart-line line-active"></div>
            <div class="cart-step2 step-active">
                <i class="fa fa-location-dot"></i>
            </div>
            <div class="cart-line line-active"></div>
            <div class="cart-step3 step-active">
                <i class="fa fa-money-check"></i>
            </div>
        </div>
        <div class="cart-step-title">
            <p>Thanh toán</p>
        </div>
        <div class="row row-cols-1 row-cols-lg-2 g-4">
            <div class="col-12 col-lg-8">
                <form action="/cart-step-3" method="post" class="row g-3 needs-validation" novalidate>
                    <div class="col-12">
                        <label for="shipment" class="form-label fs-5 ct-label d-block">Phương thức giao hàng</label>
                        <div class="form-check">
                            <input checked class="form-check-input" type="radio" name="shipment" id="shipment1">
                            <label class="form-check-label" for="shipment1">
                                Giao hàng thường
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="shipment" id="shipment2">
                            <label class="form-check-label" for="shipment2">
                                Giao hàng chuyển phát nhanh
                            </label>
                        </div>
                        <div class="invalid-feedback">
                            Vui lòng chọn phương thức giao hàng!
                        </div>
                    </div>
                    <div class="col-12">
                        <label for="payment" class="form-label fs-5 ct-label d-block">Phương thức thanh toán</label>
                        <div class="form-check">
                            <input checked class="form-check-input" type="radio" name="payment" id="payment1">
                            <label class="form-check-label" for="payment1">
                                Tiền mặt
                            </label>
                        </div>
                    </div>
                    <div class="col-12">
                        <a href="" class="d-block text-warning">&lt;&lt; Quay lại thông tin giao hàng</a>
                        <button class="ms-auto float-end ct-btn-cart" style="--ct-color: #0000ff">Xác nhận thanh
                            toán</button>
                        <div class="clearfix"></div>
                    </div>
                </form>
            </div>
            <div class="col-12 col-lg-4">
                <table class="table table-hover w-100">
                    <tbody class="ct-table-body" style="vertical-align: middle;">
                        <tr>
                            <td>Tổng tiền hàng</td>
                            <td>566.000 VND</td>
                        </tr>
                        <tr>
                            <td>Phí vận chuyển</td>
                            <td>32.000 VND</td>
                        </tr>
                    </tbody>
                    <tfoot class="ct-table-footer" style="vertical-align: middle;">
                        <tr>
                            <th>Tổng tiền thanh toán</th>
                            <th>598.000 VND</th>
                        </tr>
                    </tfoot>
                </table>
            </div>
        </div>

    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
    <script src="../js/formvalidation.js"></script>
</body>

</html>