<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
	<link rel="stylesheet" href="css/animate1.css">
	<link rel="stylesheet" href="css/bootstrap1.css">
	<link rel="stylesheet" href="css/style1.css">
	
</head>
<body>
<h3>修改密码</h3>
<form method="post" action="update">
	<font color="red">${requestScope.message }</font>
     <table>
        <tr>
         	<td><label>用户名: </label></td>
             <td><input type="username" id="username" name="username" ></td>
         </tr>
         <tr>
         	<td><label>新密码: </label></td>
             <td><input type="password" id="password" name="password" ></td>
         </tr>
         <tr>
             <td><input type="submit" value="确认修改"></td>
         </tr>
     </table>
</form>
</body>
</html>