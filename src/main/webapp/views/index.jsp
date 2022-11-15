<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home Page</title>
        <link rel="stylesheet" href="../css/home.css">
    </head>

    <body>
        <nav class="navbar navbar-expand-xl navbar-light fixed-top ct-navbar">
            <div class="container-fluid container">
                <a class="navbar-brand" href="#">Flower Shop</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarScroll"
                    aria-controls="navbarScroll" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fa-solid fa-bars"></i>
                </button>
                <div class="collapse navbar-collapse" id="navbarScroll">
                    <ul class="navbar-nav me-auto my-2 my-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="/">Trang chủ</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="/flowers">Hoa</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownFlowerTheme" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">
                                Hoa chủ đề
                            </a>
                            <ul class="dropdown-menu ct-subnavbar" aria-labelledby="navbarDropdownFlowerTheme">
                                <li><a class="dropdown-item" href="#">Hoa sinh nhật</a></li>
                                <li><a class="dropdown-item" href="#">Hoa chia buồn</a></li>
                                <li><a class="dropdown-item" href="#">Hoa chúc mừng</a></li>
                                <li><a class="dropdown-item" href="#">Hoa tình yêu</a></li>
                            </ul>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownFlowerEvent" role="button"
                                data-bs-toggle="dropdown" aria-expanded="false">
                                Hoa sự kiện
                            </a>
                            <ul class="dropdown-menu ct-subnavbar" aria-labelledby="navbarDropdownFlowerEvent">
                                <li><a class="dropdown-item" href="#">Hoa khai trương</a></li>
                                <li><a class="dropdown-item" href="#">Hoa đám cưới</a></li>
                            </ul>
                        </li>
                        <li class="nav-item"><a href="" class="nav-link">Hoa ngoại nhập</a></li>
                        <li class="nav-item"><a href="" class="nav-link">Thông tin</a></li>
                    </ul>
                    <div class="d-flex">
                        <ul class="nav">
                            <li class="nav-item"><a href="" class="nav-link"><i
                                        class="fa-solid fa-cart-shopping text-black"></i></a></li>
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle text-black" href="#" id="navbarDropdownUser"
                                    role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                    <i class="fa-solid fa-user"></i>
                                </a>
                                <ul class="dropdown-menu ct-subnavbar ct-subnavbar-right"
                                    aria-labelledby="navbarDropdownUser">
                                    <li><a class="dropdown-item" href="#">Đăng nhập</a></li>
                                    <li><a class="dropdown-item" href="#">Đăng kí</a></li>
                                    <li>
                                        <hr class="dropdown-divider">
                                    </li>
                                    <li><a class="dropdown-item" href="#">Lịch sử mua hàng</a></li>
                                    <li><a class="dropdown-item" href="#">Thông tin cá nhân</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
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
                        <img src="../imgs/banner1.jpg" class="d-block w-100" alt="">
                    </div>
                    <div class="carousel-item">
                        <img src="../imgs/banner2.jpg" class="d-block w-100" alt="">
                    </div>
                    <div class="carousel-item">
                        <img src="../imgs/banner3.jpg" class="d-block w-100" alt="">
                    </div>
                </div>
            </div>
        </section>
        <footer class="footer container mt-5">
            <div class="d-flex">
                <div class="p-2 ct-flex-1">
                    <div class="text-center text-uppercase fw-bold title">Flower Shop</div>
                    <p class="text-center ct-textgray">Web App Java Project - Flower Shop Project © 2022</p>
                </div>
                <div class="p-2 ct-flex-1">
                    <div class="text-center text-uppercase fw-bold title">Theo dõi tại</div>
                    <div class="d-flex justify-content-center mt-2">
                        <a href="" class="px-2"><img src="../imgs/facebook.png" alt="" width="30px"></a>
                        <a href="" class="px-2"><img src="../imgs/instagram.png" alt="" width="30px"></a>
                        <a href="" class="px-2"><img src="../imgs/youtube.png" alt="" width="30px"></a>
                    </div>
                </div>
                <div class="p-2 ct-flex-1">
                    <div class="text-center text-uppercase fw-bold title">Liên hệ</div>
                    <div class="text-center ct-textgray">Chúng tôi luôn sẵn lòng hỗ trợ bạn</div>
                    <div class="text-center ct-textgray">abc@gmail.com</div>
                    <div class="text-center ct-textgray">Powered by Sarito</div>
                </div>
            </div>
        </footer>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
    </body>

    </html>