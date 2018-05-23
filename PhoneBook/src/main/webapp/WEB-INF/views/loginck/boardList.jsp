<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<style>
    .center{
        text-align: center;
    }
    </style>
<table class="table">
   
    <tr>
      <th scope="col"class="center">번호</th>
      <th scope="col"class="center">제목</th>
      <th scope="col"class="center">등록일</th>
       <th scope="col"class="center">조회수</th>
      <th scope="col"class="center">수정</th>
    </tr>
  
  
  <tbody>
  	<c:forEach varStatus="status" items="${list}">
    <tr>
    
      <th scope="row" class="center">${rownum[status.index].rownum}</th>
      <td class="center"><a href="<%=request.getContextPath()%>/loginck/boardListPage?idx=${list[status.index].idx}">${list[status.index].listTitle}</a></td>
     <td class="center"> <fmt:formatDate value="${list[status.index].regdate}"
						pattern="yy-mm-dd HH:mm" /></td>
    <td class="center">${list[status.index].listcount}</td>
	<td class="center"><a href="<%=request.getContextPath()%>/loginck/boardListUpdate?idx=${list[status.index].idx}">게시글수정</a><a
					href="<%=request.getContextPath()%>/loginck/boardListDelete?idx=${list[status.index].idx}">삭제</a></td>			
    </tr>
    
  </tbody>
  	</c:forEach>
</table>

	