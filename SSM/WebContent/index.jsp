<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>List展示</h3>
	<table border="1" >
		<tr>
			<td>id</td>
			<td>name</td>
			<td>password</td>
			<td>age</td>
			<td>操作</td>
		</tr>
		
		<c:forEach items="${users}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.password}</td>
				<td>${user.age}</td>
				<td>
					<a  onclick="deleteUser(${user.id})" href="javascript:void(0)">删除</a>
					<a href="">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
<script type="text/javascript">
	function deleteUser(userId){
		if(confirm("确认删除吗？")){
			window.location.href="${pageContext.request.contextPath}/delete.do?userId="+userId;
		}
	}

</script>

</html>