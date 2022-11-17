const signinBtn = document.querySelector('.signinBtn');
const signupBtn = document.querySelector('.signupBtn');
const validationBox = document.querySelector('.validation-box');
const formBox = document.querySelector('.formBox');

signupBtn.addEventListener('click', () => {
    formBox.classList.add('active');
    validationBox.classList.add('active');
})

signinBtn.addEventListener('click', () => {
    formBox.classList.remove('active');
    validationBox.classList.remove('active');
})