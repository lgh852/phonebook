<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">Com&Uni</th>
            <th scope="col">No</th>
            <th scope="col">Friend</th>
            <th scope="col">Name</th>
            <th scope="col">PhoneNumber</th>
            <th scope="col">E-mail</th>
            <th scope="col">Address</th>
            <th scope="col">Photo</th>
            <th scope="col">ComName</th>
            <th scope="col">Maj</th>
           
        </tr>
    </thead>
 
        <c:set var="0" value="${fren.comp_nmbr}" />

        <thead class="thead-light">
            <tr>
                <c:choose>
                    <c:when test="${fren.comp_nmbr eq '0'}">
                        <th scope="col">학교친구</th>
                    </c:when>
                    <c:otherwise>
                        <th scope="col">회사친구</th>
                    </c:otherwise>
                </c:choose>
                <th scope="col">${fren.fren_nmbr}</th>
                <th scope="col">${fren.fren_nm}</th>
                <th scope="col">${fren.fren_phn_nmbr}</th>
                <th scope="col">${fren.fren_email}</th>
                <th scope="col">${fren.fren_addr}</th>
                <th scope="col"><img src="../uploadfile/memberphoto/${fren.fren_photo}" width="50px" height="50px"></th>
                <th scope="col">${fren.comp_nmbr}</th>
                <th scope="col">${fren.maj}</th>
                <th scope="col">${fren.grd}</th>
                
    
            </tr>
        </thead>


</table>
