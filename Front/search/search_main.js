'use strict';

// 로그인 폼
function checkOn() {
    let checkOn = document.getElementById("cheOn");
    let checkOff = document.getElementById("cheOff");

    checkOn.style.display = 'block';
    checkOff.style.display = 'none';
}

function checkOff() {
    let checkOn = document.getElementById("cheOn");
    let checkOff = document.getElementById("cheOff");

    checkOn.style.display = 'none';
    checkOff.style.display = 'block';
}
// 비밀번호 찾기
function findPass() {
    let login = document.getElementsByClassName('login__form')[0];
    let pass = document.getElementsByClassName('login__findpass')[0];

    login.style.display = 'none';
    pass.style.display = 'block';
}

// 비밀번호 찾기 => 로그인 폼
function backLogin() {
    let login = document.getElementsByClassName('login__form')[0];
    let pass = document.getElementsByClassName('login__findpass')[0];

    login.style.display = 'block';
    pass.style.display = 'none';
}


// 메뉴 옵션
function menuOn() {
    let sidebtn = document.getElementById("navbar__sidebtn");
    let searbtn = document.getElementById("navbar__searchbtn");
    let backgro = document.getElementsByClassName('search__board')[0];

    searbtn.checked = false;

    backgro.style.filter = 'none';
}

function searchOn() {
    let sidebtn = document.getElementById("navbar__sidebtn");
    let searbtn = document.getElementById("navbar__searchbtn");
    let backgro = document.getElementsByClassName('search__board')[0];

    sidebtn.checked = false;

    if (searbtn.checked) {
        backgro.style.filter = 'blur(10px)';
    } else {
        backgro.style.filter = 'none';
    }
    
}

// 정렬 기준
{
    let sub = document.getElementsByClassName('dropdown_subMenu')[0];
    let sortbtn = document.getElementById('sortBtn');
    let title = document.getElementById('sortTitle');

    sortbtn.addEventListener('click', clickSort);

    function clickSort() {
        if (sub.style.display == 'block') {
            sub.style.display = 'none';
        } else {
            sub.style.display = 'block';
        }
    }

    let favorit = document.getElementById('sort_favorit');
    let low = document.getElementById('sort_low');
    let high = document.getElementById('sort_high');

    favorit.addEventListener('click', setFavor);
    low.addEventListener('click', setLow);
    high.addEventListener('click', setHigh);

    function setFavor() {
        sortbtn.innerText = '찜 많은 순';
        sub.style.display = 'none';
    }
    function setLow() {
        sortbtn.innerText = '낮은 가격순';
        sub.style.display = 'none';
    }
    function setHigh() {
        sortbtn.innerText = '높은 가격순';
        sub.style.display = 'none';
    }
}