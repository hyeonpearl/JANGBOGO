'use strict';

const emailInput = document.querySelector('#register__email');
const passInput = document.querySelector('#register__password');
const checkPassInput = document.querySelector('#register__passwordCheck');
const userName = document.querySelector('#register__form_name');
const userAddress = document.querySelector('#register__form_address');
const userTel = document.querySelector('#register__form_tel');
const alertMail = document.querySelector('#alert_service_email');
const alertTel = document.querySelector('#alert_service_tel');
const submitBtn = document.querySelector('#register__form_submit');

function backLogin() {
    location.replace("login.html");
}
function onSubmitBtnClick(event) {
    event.preventDefault();
    console.log(
        emailInput.value, passInput.value, checkPassInput.value, 
        userName.value, userAddress.value, userTel.value, 
        alertMail.checked, alertTel.checked
    );
}

submitBtn.addEventListener('click', onSubmitBtnClick);