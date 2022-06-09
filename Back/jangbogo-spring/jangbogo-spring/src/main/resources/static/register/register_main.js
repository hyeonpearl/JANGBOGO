function backHome() {
    var btn = document.getElementById('register__form_cancle');

    location.replace("/home/home_index.html");
}

function checkEmail(){
    var email = document.getElementById('register__email').value;

    $.ajax({
        async: true,
        type:'POST',
        data:{email : email},
        url:"/emailCheck",
        dataType:"json",
        success: function(data){
            if(data == 1){
                alert("존재하는 이메일입니다.");
            }
            else{
                alert(email);
            }
        }
    });
}
