<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>忘记密码</title>
	<link rel="stylesheet" href="css/animate1.css">
	<link rel="stylesheet" href="css/bootstrap1.css">
	<link rel="stylesheet" href="css/style1.css">
	
</head>
<body>
<h3>找回密码</h3>
<form method="post" action="find">
	<font color="red">${requestScope.message }</font>
     <table>
         <tr>
         	<td><label>登录名: </label></td>
             <td><input type="text" id="loginname" name="loginname" ></td>
         </tr>
         <tr>
         	<td><label>你的邮箱: </label></td>
             <td><input type="text" id="email" name="email" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="发送邮件"></td>
         </tr>
     </table>
</form>
</body>
</html>