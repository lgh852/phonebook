<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<style>
#imgbox {
	width: 450px;
	height: 450px;
	margin: 0 auto;
	border: 1px solid black;
}

.inputsize {
	width: 250px;
}

.imgcenter {
	padding-top: 50px;
	width: 100%;
	height: 550px;
	border: 1px solid black;
	overflow: hidden;
}

.margincen {
	margin: 0 auto;
	border: 1px solid black;
}
</style>


<div class="imgcenter">
	<div id="imgbox">
		<img id="imgPre" alt="aa" src="" height="450px" width="450px"
			style="margin: 0 auto;">
	</div>
</div>

<form action="<%=request.getContextPath()%>/board/boardFrom"
	method="post" enctype="multipart/form-data">




	<div class="input-group mb-3 inputsize margincen imgcente "
		style="width: 1170px; height: 600px; margin: 0 auto;">
		
		<div style="margin: 0 auto; padding-top: 50px">
		<h2>title</h2>
			<input type="text" class="form-control" aria-label="Default"
				aria-describedby="inputGroup-sizing-default" name="board_title" style ="margin: 0 auto;">
		</div>
		<div style="margin: 0 auto">

			<input type="file" class="custom-file-input fileboxsize"
				id="inputGroupFile02" name="FileName"
				style="margin: 0 auto; padding-top: 50px">


			<div class="input-group mb-3 inputsize"
				style="margin: 0 auto; padding-top: 50px">
				<select class="custom-select" id="inputGroupSelect02"
					name="category_room" style="width: 450px; height: 40px;">
					<option selected value="0">모든 공간</option>
					<option value="1">원룸</option>
					<option value="2">거실</option>
					<option value="3">침실</option>
					<option value="4">키친</option>
					<option value="5">욕실</option>
					<option value="6">아이방</option>
					<option value="7">드레스룸</option>
					<option value="8">서재&작업실</option>
					<option value="9">침실</option>
					<option value="4">베란다</option>
					<option value="5">사무공간</option>
					<option value="6">상업공간</option>
					<option value="7">가구&소품</option>
					<option value="8">현관</option>
					<option value="9">외관&기타</option>
					<option value="10">복도</option>
					<option value="11">제품후기</option>
				</select>

			</div>



			<div class="input-group mb-3 inputsize"
				style="margin: 0 auto; padding-top: 50px">
				<select class="custom-select" id="inputGroupSelect02"
					name="category_space" style="width: 450px; height: 40px;">
					<option selected value="0">모든 평수</option>
					<option value="1">10평 미만</option>
					<option value="2">10평대</option>
					<option value="3">20평대</option>
					<option value="1">30평대</option>
					<option value="2">40평대 이상</option>
				</select>
			</div>
		</div>
		<textarea rows="30" cols="30" name="board_contents"
			style="width: 800px; height: 150px;"></textarea>
		<div style="margin: 0 auto">
			<input type="submit" value="입력" class="btn btn-primary" /> <input
				type="reset" value="취소" class="btn btn-primary" />
		</div>
	</div>
</form>


