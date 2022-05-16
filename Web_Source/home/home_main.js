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
    var backgro = document.getElementsByClassName('home__board')[0];

    searbtn.checked = false;

    backgro.style.filter = 'none';
}

function searchOn() {
    var sidebtn = document.getElementById("navbar__sidebtn");
    var searbtn = document.getElementById("navbar__searchbtn");
    var backgro = document.getElementsByClassName('home__board')[0];

    sidebtn.checked = false;

    if (searbtn.checked) {
        backgro.style.filter = 'blur(10px)';
    } else {
        backgro.style.filter = 'none';
    }
    
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

let banner = {
    rollId: null,
    interval: 2000,

    //롤링 배너 초기화
    rollInit: function (newinterval) {
        if(parseInt(newinterval) > 0){
            this.interval = newinterval;
        }
        //현재 배너
        let firstitem = document.querySelector('.home__banner_list li');
        if(firstitem){
            firstitem.classList.add('currentroll');
        }
        //다음 배너
        let seconditem = document.querySelectorAll('.home__banner_list li')[1];
        if(seconditem){
            seconditem.classList.add('nextroll');
        }
        //이전 배너
        document.querySelector('.home__banner_list li:last-child').classList.add('prevroll');
        this.rollId = setInterval(this.rollNext, this.interval);//롤링 인터벌 호출
    },
    
    //다음 배너 롤링
    rollNext: function () {
        if(document.querySelector('.prevroll')){
            document.querySelector('.prevroll').classList.remove('prevroll');
        }
        if(document.querySelector('.currentroll')){
            document.querySelector('.currentroll').classList.add('prevroll');
            document.querySelector('.currentroll').classList.remove('currentroll');
        }
        if(document.querySelector('.nextroll')){
            document.querySelector('.nextroll').classList.add('currentroll');
            document.querySelector('.nextroll').classList.remove('nextroll');
        }
    //다음 이미지 있으면 다음 롤링 이미지로 선택, 없으면 첫번째 이미지를 롤링 이미지로 지정
        if(document.querySelector('.currentroll').nextElementSibling){
            document.querySelector('.currentroll').nextElementSibling.classList.add('nextroll');
        }else{
            document.querySelector('.home__banner_list li').classList.add('nextroll');
        }
    }
}

document.addEventListener('DOMContentLoaded', function(){
    banner.rollInit(4000); // 배너 롤링
});



