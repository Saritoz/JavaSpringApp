<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Trang chủ</title>
        <link rel="stylesheet" href="../css/user/home.css">
        <link rel="stylesheet" href="../css/user/header.css">
        <link rel="stylesheet" href="../css/user/footer.css">
    </head>

    <body>
        <%@include file="../../components/header.jsp" %>
        <section class="home-page">
            <div id="carouselHomePage" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-indicators">
                    <button type="button" data-bs-target="#carouselHomePage" data-bs-slide-to="0" class="active"
                        aria-current="true" aria-label="Image 1"></button>
                    <button type="button" data-bs-target="#carouselHomePage" data-bs-slide-to="1"
                        aria-label="Image 2"></button>
                    <button type="button" data-bs-target="#carouselHomePage" data-bs-slide-to="2"
                        aria-label="Image 3"></button>
                </div>
                <div class="carousel-inner">
                    <div class="carousel-item active ">
                        <img src="../../imgs/banner1.jpg" class="d-block w-100" alt="">
                    </div>
                    <div class="carousel-item">
                        <img src="../../imgs/banner2.jpg" class="d-block w-100" alt="">
                    </div>
                    <div class="carousel-item">
                        <img src="../../imgs/banner3.jpg" class="d-block w-100" alt="">
                    </div>
                </div>
            </div>
        </section>
        <%@include file="../../components/footer.jsp" %>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
    </body>

    </html>