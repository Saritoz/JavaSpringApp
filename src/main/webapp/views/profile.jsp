<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile</title>
    <link rel="stylesheet" href="../css/profile.css">
    <link rel="stylesheet" href="../css/header.css">
</head>
<body>
    <%@include file="../components/header.jsp" %>
    <section class="personal-info container m-header">
        <div class="image-user">
            <img src="../imgs/defaultimg.png" alt="" width="100%">
        </div>
        <div class="name-user">
            <p>Sarito</p>
        </div>
        <div class="row mt-5 g-5">
            <div class="col-12 col-md-6 info-item" style="--delay: 0s">
                <label for="">Họ tên</label>
                <input type="text" autocomplete="off" value="Nguyen Dinh Dung" disabled>
            </div>
            <div class="col-12 col-md-6 info-item" style="--delay: 0.3s">
                <label for="">Username</label>
                <input type="text" autocomplete="off" value="Sarito" disabled>
            </div>
            <div class="col-12 col-md-6 info-item" style="--delay: 0.6s">
                <label for="">Email</label>
                <input type="text" autocomplete="off" value="abc@gmail.com" disabled>
            </div>
            <div class="col-12 col-md-6 info-item" style="--delay: 0.9s">
                <label for="">Số điện thoại</label>
                <input type="text" autocomplete="off" value="0123456789" disabled>
            </div>
            <div class="col-12 d-flex flex-row-reverse">
                <button class="ct-btn-profile ms-3" style="--ct-color: #0000ff">Chỉnh sửa</button>
                <button class="ct-btn-profile" style="--ct-color: #ff0000">Xóa tài khoản</button>
            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
</body>
</html>