<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册页面</title>
	<link rel="stylesheet" href="css/animate1.css">
	<link rel="stylesheet" href="css/bootstrap1.css">
	<link rel="stylesheet" href="css/style1.css">
</head>
<body>
<h3>欢迎注册WM书城</h3>
<form action="regist" method="post">
	<font color="red">${requestScope.message }</font>
     <table>
         <tr>
         	<td><label>登录名: </label></td>
             <td><input type="text" id="loginname" name="loginname" ></td>
         </tr>
         <tr>
         	<td><label>用户名: </label></td>
             <td><input type="text" id="username" name="username" ></td>
         </tr>
         <tr>
         	<td><label>密码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
         	<td><label>电话号码: </label></td>
             <td><input type="text" id="phone" name="phone" ></td>
         </tr>
         <tr>
         	<td><label>地址: </label></td>
             <td><input type="text" id="address" name="address" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="注册"></td>
         </tr>
     </table>
</form>
</body>
</html>