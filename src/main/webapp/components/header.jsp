<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
                    <li class="nav-item"><a href="/cart" class="nav-link"><i
                                class="fa-solid fa-cart-shopping text-black"></i></a></li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle text-black" href="#" id="navbarDropdownUser"
                            role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            <i class="fa-solid fa-user"></i>
                        </a>
                        <ul class="dropdown-menu ct-subnavbar ct-subnavbar-right"
                            aria-labelledby="navbarDropdownUser">
                            <li><a class="dropdown-item" href="/login">Đăng nhập</a></li>
                            <li><a class="dropdown-item" href="#">Đăng kí</a></li>
                            <li>
                                <hr class="dropdown-divider">
                            </li>
                            <li><a class="dropdown-item" href="#">Lịch sử mua hàng</a></li>
                            <li><a class="dropdown-item" href="/profile">Thông tin cá nhân</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</nav>