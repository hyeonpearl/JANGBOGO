function findPass() {
    var login = document.getElementsByClassName('login__form')[0];
    var pass = document.getElementsByClassName('login__findpass')[0];

    login.style.display = 'none';
    pass.style.display = 'block';
}

function backLogin() {
    var login = document.getElementsByClassName('login__form')[0];
    var pass = document.getElementsByClassName('login__findpass')[0];

    login.style.display = 'block';
    pass.style.display = 'none';
}

function menuOn() {
    var sidebtn = document.getElementById("navbar__sidebtn");
    var searbtn = document.getElementById("navbar__searchbtn");

    searbtn.checked = false;
}

function searchOn() {
    var sidebtn = document.getElementById("navbar__sidebtn");
    var searbtn = document.getElementById("navbar__searchbtn");
    var backgro = document.getElementsByClassName('home__board')[0];

    sidebtn.checked = false;

    /* backgro.style.filter = 'blur(5px)'; */
}

function checkOn() {
    var checkOn = document.getElementById("cheOn");
    var checkOff = document.getElementById("cheOff");

    checkOn.style.display = 'block';
    checkOff.style.display = 'none';
}

function checkOff() {
    var checkOn = document.getElementById("cheOn");
    var checkOff = document.getElementById("cheOff");

    checkOn.style.display = 'none';
    checkOff.style.display = 'block';
}
