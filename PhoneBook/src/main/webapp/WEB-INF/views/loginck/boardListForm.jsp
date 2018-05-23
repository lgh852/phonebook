<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <!-- Custom styles for this template -->
    <link href="<%=request.getContextPath()%>/resources/css/offcanvas.css" rel="stylesheet">
    
    <link href="<%=request.getContextPath()%>/resources/dist/summernote.css" rel="stylesheet">
<script>
	$(document).ready(function() {
		$('#summernote').summernote({
			height : 300,
			width : 600,
			MinHeight : null,
			maxHeight : null,
			focus : true

		});
	});
</script>
<title>Insert title here</title>
</head>
<style>
</style>
<body>
	<form method="post">
		<table class="table">
			<tr>
				<td colspan="2" align="center">게시판</td>
			</tr>
			<tr>
				<td>제목</td>
				<td><input type="text" name="listTitle"
					class="form-control inputborder"></td>
			</tr>
			<tr>
				<td>내용</td>
				<td><textarea rows="10" cols="50" name="listText"
						class="form-control inputborder"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" class="btn btn-primary"
					value="확인"> <input type="reset" class="btn btn-primary++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
					value="취소"></td>
			</tr>
		</table>
	</form>

</body>
</html>