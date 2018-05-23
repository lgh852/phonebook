<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<style>
	.pageNumber{
		font-size: 20px;
		font-weight: 300px;
	}
	.pageNumber>span{
		margin-left: 15px;
	}
	
	
</style>

<table class="table">
	<thead class="thead-dark">

		<tr>
			<th scope="col">Com&Uni</th>
			<th scope="col">No</th>
			<th scope="col">Name</th>
			<th scope="col">PhoneNumber</th>
			<th scope="col">E-mail</th>
			<th scope="col">Address</th>
			<th scope="col">Photo</th>
			<th scope="col">Grd</th>
			<th scope="col">Maj</th>
			<th scope="col">ComName</th>
			
			<th scope="col">Choice</th>
		</tr>
	</thead>
	<c:forEach var="fren" items="${fren}">
		<c:set var="0" value="${fren.comp_nmbr}"/>

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

				<th scope="col">${fren.rowNum}</th>
				<th scope="col">${fren.fren_nm}</th>
				<th scope="col">${fren.fren_phn_nmbr}</th>
				<th scope="col">${fren.fren_email}</th>
				<th scope="col">${fren.fren_addr}</th>
				<th scope="col"><img
					src="../uploadfile/memberphoto/${fren.fren_photo}" width="50px"
					height="50px"></th>
				
				<th scope="col">${fren.grd}</th>
				<th scope="col">${fren.maj}</th>
				<th scope="col">${fren.comp_nm}</th>
			
				
				<th scope="col"><a
					href="<%=request.getContextPath()%>/phonebook/selectView?fren_nmbr=${fren.fren_nmbr}">보기</a>

					<c:if test="${user.mmbr_nmbr == fren.mmbr_nmbr}">
						<a
							href="<%=request.getContextPath()%>/phonebook/frenUpdateForm?fren_nmbr=${fren.fren_nmbr}">수정</a>
						<a
							href="<%=request.getContextPath()%>/phonebook/FrenDelete?fren_nmbr=${fren.fren_nmbr}">삭제</a>
					</c:if></th>
			</tr>
		</thead>
	
	</c:forEach>
</table>
	<div class="pageNumber">
	<c:forEach begin="${pagemodel.minPage}" end="${pagemodel.maxPage}" step="1" var="cnt">
				
		<c:if test="${pagemodel.minPage>=cnt}">
		
			<!--1자리 이동-->
		<c:if test="${pagemodel.nowPage>pagemodel.minPage}">		
			<a href="pageUp?pageCnt=${pagemodel.nowPage}">◀</a>
		</c:if>
		
		<c:if test="${pagemodel.nowPage>pagemodel.minPage}">		
			<a href="pageUpUp?Cnt=${cnt}">◀◀</a>
		</c:if>
		</c:if>
	<c:choose>
				
	<c:when test="${pagemodel.nowPage==cnt}">
		<span>${cnt}</span>
	</c:when>
	<c:otherwise>
		    <span><a href="selectpageCnt?pageCnt=${cnt}">${cnt}</a></span>
	</c:otherwise>
	</c:choose>
		
				<!--전체페이지 번호가 현재 페이지넘버랑 같거자 작을경우-->
							<!-- 5 -->	
		
		<c:if test="${pagemodel.maxPage<=cnt}">
		
			<!--1자리 이동-->
		<c:if test="${pagemodel.nowPage<pagemodel.totalpage}">		
			<a href="pageUp?pageCnt=${pagemodel.nowPage}">▶</a>
		</c:if>
		<c:if test="${pagemodel.nowPage<pagemodel.totalpage}">		
			<a href="pageUpUp?Cnt=${cnt}">▶▶</a>
		</c:if>
	
	</c:if>
	</c:forEach>
		
		
	</div>
