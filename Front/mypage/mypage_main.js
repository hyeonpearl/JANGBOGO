'use strict';

function menuOn() {
    let sidebtn = document.getElementById("navbar__sidebtn");
    let searbtn = document.getElementById("navbar__searchbtn");
    let backgro = document.getElementsByClassName('mypage__board')[0];

    searbtn.checked = false;

    backgro.style.filter = 'none';
}

function searchOn() {
    let sidebtn = document.getElementById("navbar__sidebtn");
    let searbtn = document.getElementById("navbar__searchbtn");
    let backgro = document.getElementsByClassName('mypage__board')[0];

    sidebtn.checked = false;

    if (searbtn.checked) {
        backgro.style.filter = 'blur(10px)';
    } else {
        backgro.style.filter = 'none';
    }
    
}