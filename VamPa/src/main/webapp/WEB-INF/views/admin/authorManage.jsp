<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../resources/css/admin/authorManage.css">

<script
  src="https://code.jquery.com/jquery-3.4.1.js"
  integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="
  crossorigin="anonymous"></script>
</head>
</head>
<body>

				<%@include file="../includes/admin/header.jsp" %>
				
                <div class="admin_content_wrap">
                    <div class="admin_content_subject"><span>작가 관리</span></div>
                </div>
 
 				<%@include file="../includes/admin/footer.jsp" %>

<script>
$(document).ready(function(){
	
	let result = '<c:out value="${enroll_result}"/>';
	
	checkResult(result);
	
	function checkResult(result){
		
		if(result === ''){
			return;
		}
		
		alert("작가'${enroll_result}'을 등록하였습니다.");
		
	}

});
</script>

</body>
</html>