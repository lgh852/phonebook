<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<style>
</style>
<body>

	<table class="table">

  <tbody>
    <tr>
		<td>번호</td>
		<td><input type="text" name="idx" value="${guestlist.idx}" class="form-control inputborder" readonly="readonly"></td>
	</tr>
    <tr>	
		<td>제목</td>
		<td><input type="text" name="listTitle" value="${guestlist.listTitle}" class="form-control inputborder" readonly="readonly"></td>
	</tr>
   <tr>
		<td>내용</td>
		<td><textarea rows="10" cols="50" name="listText" readonly="readonly" class="form-control inputborder">${guestlist.listTitle}</textarea></td>
	</tr>
  </tbody>
  		<td colspan="2"><button type="button" class="btn btn-primary" onclick="window.location.href='<%=request.getContextPath()%>/loginck/boardlist'">리스트로</button>
  		</td>
	
</table>
</body>
</html>