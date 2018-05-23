<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<form method="post" enctype="multipart/form-data">
    <div class="regForm">
        <div class="form-group has-success">

            <label class="control-label text marginTop " for="fren_nm">name</label>
            <input type="text" name="fren_nm" class="form-control inputborder" id="fren_nm" value="${all.fren_nm}">


            <label class="control-label text marginTop" for="fren_phn_nmbr">PhoneNumber</label>
            <input type="text" name="fren_phn_nmbr" class="form-control inputborder" id="fren_phn_nmbr" value="${all.fren_phn_nmbr}">

            <label class="control-label text marginTop" for="fren_email">E-mail</label>
            <input type="text" name="fren_email" class="form-control inputborder" id="fren_email" value="${all.fren_email}">

            <label class="control-label text marginTop" for="fren_addr">
            Address</label>
            <input type="text" name="fren_addr" class="form-control inputborder" id="fren_addr" value="${all.fren_addr}">

            <c:if test="${all.comp_nm==null}">
                <input type="hidden" name="id" value="${all.id}">
                <label class="control-label text marginTop" for="Maj">
            Maj</label>
                <input type="text" name="Maj" class="form-control inputborder" id="Maj" value="${all.maj}">

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
            </c:if>
            <c:if test="${all.comp_nm!=null}">
                <input type="hidden" name="id2" value="${all.id2}">
                <label class="control-label text marginTop" for="Comp_nm">
            Comp_name</label>
                <input type="text" name="Comp_nm" class="form-control inputborder" id="Comp_nm" value="${all.comp_nm}">
            </c:if>

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
