'use strict';

window.addEventListener("scroll", (event) => {
    let scrollY = this.scrollY;
    let btn = document.getElementsByClassName('scroll-up')[0];
    
    if (scrollY > 30) {
        btn.style.display = 'block';
    } else {
        btn.style.display = 'none';
    }
});