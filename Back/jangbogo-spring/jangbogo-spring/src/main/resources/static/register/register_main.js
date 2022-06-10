function backHome() {
    var btn = document.getElementById('register__form_cancle');

    location.replace("/home/home_index.html");
}

function checkEmail(){
    var email = document.getElementById('register__email').value;
    var email_regex = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.[A-Za-z0-9\-]+/;

    if(email == ""){
        alert("이메일을 입력해주세요.");
        return;
    }

    if(email_regex.test(email))
    {
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
                    alert("사용가능한 이메일입니다.");
                }
            }
        });
    }
    else
    {
        alert("이메일 형식으로 작성해주세요.");
    }
}
