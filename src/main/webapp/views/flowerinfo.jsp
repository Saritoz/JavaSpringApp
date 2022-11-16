<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Info Flower</title>
    <link rel="stylesheet" href="../css/flowerinfo.css" />
    <link rel="stylesheet" href="../css/header.css">
</head>

<body>
    <%@include file="../components/header.jsp" %>
    <section class="info-flower container m-header">
        <div class="flower-title">
            <p class="flower-name">Flower 1</p>
        </div>
        <div class="row row-cols-1 row-cols-lg-2 g-4">
            <div class="col-12 col-lg-6">
                <div class="slider-container">
                    <div class="image-slider" id="image-slider">
                        <div class="images">
                            <img class="item-slider" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-slider" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-slider" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-slider" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-slider" src="../imgs/itemflower1.jpg" alt="" />
                        </div>
                        <div class="thumbnails">
                            <img class="item-thumbnail" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-thumbnail" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-thumbnail" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-thumbnail" src="../imgs/itemflower1.jpg" alt="" />
                            <img class="item-thumbnail" src="../imgs/itemflower1.jpg" alt="" />
                        </div>
                        <div class="back-btn">
                            <i class="fa-solid fa-chevron-left"></i>
                        </div>
                        <div class="next-btn">
                            <i class="fa-solid fa-chevron-right"></i>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-12 col-lg-6">
                <ul class="nav nav-tabs ct-tabs" id="myTab" role="tablist">
                    <li class="nav-item" role="presentation">
                        <button class="nav-link active" id="addcart-tab" data-bs-toggle="tab" data-bs-target="#addcart"
                            type="button" role="tab" aria-controls="addcart" aria-selected="true">Đặt hàng</button>
                    </li>
                    <li class="nav-item" role="presentation">
                        <button class="nav-link" id="desc-tab" data-bs-toggle="tab" data-bs-target="#desc"
                            type="button" role="tab" aria-controls="desc" aria-selected="false">Mô tả</button>
                    </li>
                    <li class="nav-item" role="presentation">
                        <button class="nav-link" id="moreinfo-tab" data-bs-toggle="tab" data-bs-target="#moreinfo"
                            type="button" role="tab" aria-controls="moreinfo" aria-selected="false">Thành phần</button>
                    </li>
                </ul>
                <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="addcart" role="tabpanel" aria-labelledby="addcart-tab">
                        <div class="mt-2 text-uppercase text-danger fs-4 status-item">Còn hàng</div>
                        <div class="my-2 price-item">283.000 <span class="currency-price-item">VND</span></div>
                        <div class="mb-4">
                            <label class="amount-label text-gray" for="amount-item">Số lượng:</label>
                            <button class="fa-solid fa-minus text-gray ct-btn-amount" onclick="subAmount()"></button>
                            <input type="number" class="amount-item" name="amount" value="1" min="1" maxlength="2" id="amount">
                            <button class="fa-solid fa-plus text-gray ct-btn-amount" onclick="addAmount()"></button>
                        </div>
                        <a href="" class="ct-btn me-4" style="--ct-color: #ffa500">Đặt hàng ngay</a>
                        <a href="" class="ct-btn" style="--ct-color: #ffd400">Thêm vào giỏ</a>
                    </div>
                    <div class="tab-pane fade" id="desc" role="tabpanel" aria-labelledby="desc-tab">
                        <p class="mt-2 text-justify text-gray">
                            Hướng dương luôn được biết đến như một loài hoa mang đến sự may mắn trong tình yêu, công việc hay sự nghiệp. Một giỏ hoa hướng dương là một lời chúc thành công đầy chân thành nhất. Đôi khi trong cuộc sống không cần gì nhiều lằm, chỉ một giỏ hoa xinh xắn bất ngờ sẽ là một lời động viên tâm hồn lớn lao đối với mỗi người đấy. Giỏ hoa nụ cười phù hợp để làm quà tặng trong dịp sinh nhật, mừng khai trương và tất cả những sự kiện đặc biệt trong năm.
                        </p>
                    </div>
                    <div class="tab-pane fade" id="moreinfo" role="tabpanel" aria-labelledby="moreinfo-tab">
                        <p class="mt-2 text-justify fs-5">
                            Sản phẩm bao gồm:
                            <ul>
                                <li class="text-gray">1 bó hoa hướng dương</li>
                            </ul>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
    <script src="../js/flowerinfo.js"></script>
</body>

</html>