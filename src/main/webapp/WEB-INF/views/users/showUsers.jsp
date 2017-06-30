<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<script type="text/javascript" src="js/showUsers.js"></script>
<body>
	<form action="delete.do" method="post">
		<table border=1>
			<thead>
				<tr>
					<td>全选<input id="dels" onclick="checkSel()" type="checkbox"></td>
					<td>用户编号</td>
					<td>用户名</td>
					<td>姓名</td>
					<td>性别</td>
					<td>电话</td>
					<td>邮箱</td>
					<td>部门</td>
					<td>角色</td>
					<td>操作</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${list}" var="user">
					<tr>
						<td><input  name="chk" type="checkbox" value=${user.userId}></td>
						<td>${user.userId}</td>
						<td>${user.userName}</td>
						<td>${user.realName}</td>
						<td>${user.gender}</td>
						<td>${user.tel}</td>
						<td>${user.email}</td>
						<td>${user.departId}</td>
						<td>${user.characterType}</td>
						<td><a href="addUsers.do" >修改</a> &nbsp; <a
							href="delete.do">删除</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="submit" value="删除所选">
	</form>
</body>
</html>