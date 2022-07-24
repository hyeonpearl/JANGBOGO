const nav = document.querySelector('.navbar');
const background = document.querySelector('.main-board');
const locationBoard = document.querySelector('.setLocation');
const locationBtn = document.querySelector('.home__locationBtn');
const locationTitle = document.querySelector('#locationTitle');
const locations = Array.from(document.querySelectorAll('.location'));

function onLocationFilter() {
    locationBoard.style.display = 'block';
    nav.style.filter = 'blur(5px)';
    background.style.filter = 'blur(5px)';
}
function offLocationFilter() {
    locationBoard.style.display = 'none';
    nav.style.filter = 'none';
    background.style.filter = 'none';
}
function onLocationClick(event) {
    const id = parseInt(event.target.id);
    locationTitle.innerText = `서울시 ${locations[id].innerText}`;
    offLocationFilter();
}

locationBtn.addEventListener('click', onLocationFilter);
locations.forEach( (location) => {
    location.addEventListener('click', onLocationClick)
});