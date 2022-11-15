let currentImage = 0;

let imageSlider = document.querySelector("#image-slider");

let slider = imageSlider.querySelector(".images");
let imageNodes = slider.querySelectorAll(".item-slider");

let thumbnails = imageSlider.querySelector(".thumbnails");
let thumbnailNodes = thumbnails.querySelectorAll(".item-thumbnail");
let backBtn = imageSlider.querySelector(".back-btn");
let nextBtn = imageSlider.querySelector(".next-btn");

let amount = document.querySelector("#amount");

imageNodes[currentImage].classList.add("active");
thumbnailNodes[currentImage].classList.add("active");

for (let index = 0; index < thumbnailNodes.length; index++) {
  thumbnailNodes[index].addEventListener("click", () => {
    thumbnails.querySelector("img.active").classList.remove("active");
    thumbnailNodes[index].classList.add("active");
    imageNodes[currentImage].classList.remove("active");
    currentImage = index;
    imageNodes[currentImage].classList.add("active");
  });
}

backBtn.addEventListener("click", () => {
  imageNodes[currentImage].classList.remove("active");
  currentImage--;
  if (currentImage < 0) {
    currentImage = imageNodes.length - 1;
  }
  imageNodes[currentImage].classList.add("active");
  thumbnails.querySelector("img.active").classList.remove("active");
  thumbnailNodes[currentImage].classList.add("active");
});

nextBtn.addEventListener("click", () => {
  imageNodes[currentImage].classList.remove("active");
  currentImage = (currentImage + 1) % imageNodes.length;
  imageNodes[currentImage].classList.add("active");
  thumbnails.querySelector("img.active").classList.remove("active");
  thumbnailNodes[currentImage].classList.add("active");
});

function addAmount() {
    if (parseInt(amount.value) < 99) {
        amount.value = parseInt(amount.value) + 1;
    }
}

function subAmount() {
    if (parseInt(amount.value) > 1) {
        amount.value = parseInt(amount.value) - 1;
    }
}