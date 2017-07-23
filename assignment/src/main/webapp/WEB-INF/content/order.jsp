<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城页面</title>
<style type="text/css">
	table{border-collapse:collapse;border-spacing:0;border-left:1px solid #888;border-top:1px solid #888;background:#efefef;}
	th,td{border-right:1px solid #888;border-bottom:1px solid #888;padding:5px 15px;}
	th{font-weight:bold;background:#ccc;}
</style>
</head>
<body>
欢迎[${sessionScope.user.loginname }]访问
<br>
<form action="new" method="post">
<table border="1">
	<tr>
     	<th>商品编号</th>
		<th>商品名称</th>
        <th>仓库剩余</th> 
        <th>购买数量</th>
	</tr>
	
		<tr>
		    <td><input type="text" name="book_id" value="1"></td>
			<td>javaEE</td>
			<td>剩余40件</td> 
			<td><input type="text" name="amout1" /></td>		
		</tr>		
			<tr>
		    <td><input type="text" name="book_id" value="2"></td>
			<td>Spring</td>
			<td>剩余50件</td> 
			<td><input type="text" name="amout2" /></td>		
		</tr>		
		<tr>
		    <td><input type="text" name="book_id" value="3"></td>
			<td>Mybatis</td>
			<td>剩余60件</td> 
			<td><input type="text" name="amout3" /></td>		
		</tr>	
<tr>
    <td><input type="text" name="order_id" value="请填写订单编号"></td>
	<td><input type="submit" value="提交订单" ></td>
		</tr>	
</table>
</form>
</body>
</html>