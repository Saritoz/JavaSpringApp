<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Flowers</title>
    <link rel="stylesheet" href="../css/flowerlist.css">
</head>

<body>
    <section class="flower-list container m-header">
        <div class="row">
            <div class="col-4">
                <div class="filter-title">Bộ lọc sản phẩm</div>
                <form action="" method="post">
                    <div class="mb-3">
                        <label for="sort-asc-desc" class="form-label">Theo thứ tự</label>
                        <select id="sort-asc-desc" class="form-select" aria-label="Sort" name="sort-price">
                            <option value="0" selected>Chọn thứ tự</option>
                            <option value="1">Thấp đến cao</option>
                            <option value="2">Cao đến thấp</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="sort-price-inrange" class="form-label">Theo giá</label>
                        <div class="input-group">
                            <span class="ct-input-group-text">Từ</span>
                            <input type="text" class="form-control" name="price-from" placeholder="form"
                                aria-label="form">
                            <span class="ct-input-group-text ms-2">Đến</span>
                            <input type="text" class="form-control" name="price-to" placeholder="to" aria-label="to">
                        </div>
                    </div>
                    <div class="mb-3">
                        <label for="sort-az" class="form-label">Theo tên</label>
                        <select id="sort-az" class="form-select" aria-label="sort-az" name="sort-name">
                            <option value="0" selected>Từ A->Z</option>
                            <option value="1">Từ Z->A</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="byname" class="form-label">Tìm theo tên</label>
                        <input id="byname" type="text" class="form-control" name="byname">
                    </div>
                    <div class="mb-3">
                        <label for="byid" class="form-label">Tìm theo tên</label>
                        <input id="byid" type="text" class="form-control" name="byid">
                    </div>
                    <button class="ct-outline-button" style="--ct-color: blue">Lọc</button>
                </form>
            </div>
            <div class="col-8">
                <div class="row row-cols-1 row-cols-md-2 row-cols-lg-3 row-cols-xl-4 g-2">
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="/flowerinfo/1" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col">
                        <div class="card" style="width: 100%;">
                            <img src="../imgs/itemflower1.jpg" class="card-img-top" alt="..." width="100%">
                            <div class="ct-card-flip">
                                <div class="ct-flip-box">
                                    <div class="card-body ct-card-front">
                                        <div class="card-title text-center">Flower A</div>
                                        <p class="ct-text-gray text-center text-danger">236.000vnd</p>
                                    </div>
                                    <div class="card-body ct-card-back">
                                        <a href="" class="ct-outline-button" style="--ct-color: green">Xem chi tiết</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
        crossorigin="anonymous"></script>
</body>

</html>