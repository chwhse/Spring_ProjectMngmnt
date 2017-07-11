<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/common.js"></script>
<script type="text/javascript">

	$(function () {
		$("#del").click(function(e) {
			e.preventDefault();
			var res = confirm("정말로 삭제하시겠습니까?");
			var no = ${project.projectno};
			if(res == true){
				location.href = "delete?no="+no; 
			}else{
				return false;
			}
		});
	});
</script>
</head>
<body>
	
	<table border="1">
			<tr>
				<th>프로젝트 이름</th>
				<td>${project.projectname}</td>
			</tr>
			<tr>
				<th>프로젝트 내용</th>
				<td>${project.content}</td>
			</tr>
			<tr>
				<th>시작날짜</th>
				<td>${project.startdate}</td>
			</tr>
		<%-- 	<td><fmt:formatDate value="${project.startDay}" pattern="yyyy-MM-dd"/></td>
			 --%>
			<tr>
				<th>종료날짜</th>
				<td>${project.enddate}</td>
			</tr>
			<tr>
				<th>상태</th>
				<td>${project.projecting}</td>
			</tr>
			
	</table>
	
	
	<a href="modify?no=${project.projectno }">[수정]</a>
	<a href="#" id="del">[삭제]</a>
	
	<a href="listPage">[돌아가기]</a>
	
	
	
</body>
</html>