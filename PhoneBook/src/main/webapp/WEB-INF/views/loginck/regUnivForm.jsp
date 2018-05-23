<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
    .text {
        text-align: left;
        font-size: 30px;

    }

    .marginTop {
        margin-top: 30px;
        margin-bottom: 30px;
    }

    .inputborder {
        height: 50px;
        font-size: 30px;
    }

    .upload {
        margin-top: 30px;
    }

    .submit {
        margin-right: 30px;
    }

    .center {
        margin: 0 auto;
    }

</style>
<script>
        window.onload = function() {



            var form = document.querySelector('#form');
            form.onsubmit = function() {
                var userfren_nm = document.querySelector("#fren_nm").value;
                var uesrfren_phn_nmbr = document.querySelector("#fren_phn_nmbr").value;
                var userfren_email = document.querySelector("#fren_email").value;
                var userfren_addr = document.querySelector("#fren_addr").value;
                var userMaj = document.querySelector("#Maj").value;
                 if(userfren_nm.trim().length<1){
                alert('이름을 입력해주세요');

            }
            if (uesrfren_phn_nmbr.trim().length < 1) {
                alert('핸드폰번호를 입력해주세요');

            }
            if (userfren_email.trim().length < 1) {
                alert('이메일주소를 입력해주세요');

            }
            if (userfren_addr.trim().length < 1) {
                alert('주소를 입력해주세요');

            }
           
            if (userMaj.trim().length < 1) {
                alert('전공을 입력해주세요');

            }
        
            
           

        };

        };
    </script>
<form method="post" enctype="multipart/form-data" >
<div class="regForm">
        <div class="form-group has-success">

            <label class="control-label text marginTop " for="fren_nm">name</label>
            <input type="text" name="fren_nm" class="form-control inputborder" id="fren_nm">


            <label class="control-label text marginTop" for="fren_phn_nmbr">PhoneNumber</label>
            <input type="text" name="fren_phn_nmbr" class="form-control inputborder" id="fren_phn_nmbr">

            <label class="control-label text marginTop" for="fren_email">E-mail</label>
            <input type="text" name="fren_email" class="form-control inputborder" id="fren_email">

            <label class="control-label text marginTop" for="fren_addr">
            Address</label>
            <input type="text" name="fren_addr" class="form-control inputborder" id="fren_addr">


            <label class="control-label text marginTop" for="Maj">
            Maj</label>
            <input type="text" name="Maj" class="form-control inputborder" id="Maj">

            <div class="input-group mb-3 ">
                <div class="input-group-prepend">
                    <label class="input-group-text marginTop inputborder" for="inputGroupSelect01">학년</label>
                </div>
                <select class="custom-select marginTop inputborder" id="inputGroupSelect01" name="Grd">
    <option>1</option>
    <option>2</option>
    <option>3</option>
  </select>
            </div>

        </div>






        <div class="custom-file upload">
            <input type="file" name="filename" class="custom-file-input" id="inputGroupFile01">
            <label class="custom-file-label textLeft" for="inputGroupFile01"></label>
        </div>


        <div class="input-group mb-3 center">

            <input type="submit" value="입력" class="btn btn-success submit marginTop">
            <input type="reset" class="btn btn-success marginTop">
        </div>

    </div>
</form>