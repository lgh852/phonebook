<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

    <!-- 합쳐지고 최소화된 최신 CSS -->
<style>
    .text {
        text-align: left;
        font-size: 30px;
   		
    }
	.marginTop{
        margin-top: 30px;
        margin-bottom: 30px;
    }
    .inputborder {
        height: 50px;
        font-size: 30px;
    }
    .upload{
        margin-top: 30px;
    }
    .submit{
        margin-right: 30px;
    }
    .center{
    	margin: 0 auto;
    }

</style>
<script>
        window.onload = function() {



            var form = document.querySelector('#form');
            form.onsubmit = function() {
                var userName = document.querySelector("#name").value;
                var uesrId = document.querySelector("#userName").value;
                var userPw = document.querySelector("#password").value;
                var userE_mail = document.querySelector("#E-mail").value;
                var userPhoneNumber = document.querySelector("#PhoneNumber").value;
                 if(userName.trim().length<1){
                alert('이름을 입력해주세요');

            }
            if (uesrId.trim().length < 1) {
                alert('아이디를 입력해주세요');

            }
            if (userPw.trim().length < 1) {
                alert('비밀번호를 입력해주세요');

            }
            if (userE_mail.trim().length < 1) {
                alert('비밀번호를 입력해주세요');

            }
            if (userPhoneNumber.trim().length < 1) {
                alert('비밀번호를 입력해주세요');

            }
            
           

        };

        };
    </script>
<body>
<form action="<%=request.getContextPath()%>/phonebook/memberRegForm" method="post">
    <div class="regForm">
        <div class="form-group has-success ">

            <label class="control-label text marginTop " for="name">name</label>
            <input type="text" name="mmbr_id" class="form-control inputborder" id="name" >

            <label class="control-label text marginTop" for="password">password</label>
            <input type="password" name="mmbr_password " class="form-control inputborder" id="password">

            <label class="control-label text marginTop" for="E-mail">E-mail</label>
            <input type="text" name="mmbr_email" class="form-control inputborder" id="E-mail">

            <label class="control-label text marginTop" for="PhoneNumber">PhoneNumber</label>
            <input type="text" name="mmbr_nm" class="form-control inputborder" id="PhoneNumber">

            </div>
            
            
      
                
                <div class="custom-file upload">
                    <input type="file" name="filename" class="custom-file-input" id="inputGroupFile01">
                    <label class="custom-file-label textLeft" for="inputGroupFile01"></label>
                </div>
          <div class="input-group mb-3 center" >
			
            <input type="submit" value="회원가입" class="btn btn-success submit marginTop">
            <input type="reset" class="btn btn-success marginTop">
          </div>
        
    </div>
</form>
</body>