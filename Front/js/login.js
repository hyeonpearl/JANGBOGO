'use strict';

const loginForm = document.querySelector('#login__form');
const goFindPass = document.querySelector('.login__form_findPass');

const findPassword = document.querySelector('#findPassword');
const goLoginForm = document.querySelector('.findpass_cancle');

const HIDDEN_CLASSNAME = 'hidden';

goFindPass.addEventListener('click', function() {
    loginForm.classList.add(HIDDEN_CLASSNAME);
    findPassword.classList.remove(HIDDEN_CLASSNAME);
});

goLoginForm.addEventListener('click', function() {
    loginForm.classList.remove(HIDDEN_CLASSNAME);
    findPassword.classList.add(HIDDEN_CLASSNAME);
})