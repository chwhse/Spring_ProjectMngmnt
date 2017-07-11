<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/common.css">
<style type="text/css">
	form{
		width:500px;
	}
   label{
      width : 150px;
      text-align: right;
      float: left;
      margin-right: 20px;
   }
   .a1{
      padding-left: 850px;
   }
</style>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/common.js"></script>
<script>
  $( function() {
     $( "#startdate" ).datepicker({
       dateFormat: "yy-mm-dd"    
    });
    $( "#enddate" ).datepicker({
       dateFormat: "yy-mm-dd"
       
    });   
    
    $("form[name='f1']").submit(function () {
		$(".error").css("display","none");
		$(".error2").css("display","none");
	
		if(checkInputEmpty($("input[name]"))==false){
			return false;
		};

		alert("등록되었습니다.");

	});
  });
  </script>

<title>Insert title here</title>
</head>
<body>
	<form action="register" name="f1" method="post">
		<p>
			<label>프로젝트 이름</label><input type="text" name="projectname" id="projectname" value="">
			<span class="error">프로젝트 이름을 입력하세요.</span>
		</p>
		
		<p>
			<label>프로젝트 내용</label><input type="text" name="content" value="">
			<span class="error">프로젝트 내용을 입력하세요.</span>
		</p>
		<p>
			<label>시작날짜</label><input type="text" name="startdate"  id="startdate" value="">
			<span class="error">시작날짜을 입력하세요.</span>
		</p>
		<p>
			<label>종료날짜</label><input type="text" name="enddate" id="enddate" value="">
			<span class="error">종료날짜을 입력하세요.</span>
		</p>
			<label>진행상태</label>
			<select name="projecting" id="projecting">
				<option>준비</option>
				<option>진행중</option>
				<option>종료</option>
				<option>보류</option>
				
			</select>
		<p>
			<input type="submit" value="추가">
		</p>
	</form>
</body>
</html>