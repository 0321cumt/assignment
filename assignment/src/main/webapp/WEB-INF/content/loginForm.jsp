<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
	<link rel="stylesheet" href="css/animate1.css">
	<link rel="stylesheet" href="css/bootstrap1.css">
	<link rel="stylesheet" href="css/style1.css">
	
	
</head>
<body>
<h3>登录页面</h3>
<form action="login" id="loginForm" method="post">
	<font color="red">${requestScope.message }</font>
     <table>
         <tr>
         	<td><label>登录名: </label></td>
             <td><input type="text" id="loginname" name="loginname" ></td>
         </tr>
         <tr>
         	<td><label>密码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
    			<td><label>
    			<input  type="checkbox" id="remember" name="remember">
    			记住密码  </label>
    			</td>
		</tr>
         <tr>
             <td><input type="submit" value="登录"></td>
         </tr>
         <tr>
              <td> <a href="Find">忘记密码</a></td>
         </tr>
     </table>
</form>
<script src="js/bootstrap2.js"></script>
<script src="js/rememberpwd.js"></script>

</body>
</html>