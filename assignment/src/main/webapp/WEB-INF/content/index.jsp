<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到WM购物网站</title>
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col-md-12">
			<h3 class="text-center">  
				欢迎来到WM书城。
			</h3> 
			<div>
			当前在线人数：${applicationScope.count}
			</div>
			<a href="main">进入商城</a>
			<a href="change">修改密码</a>
				<div class="col-md-6">
					<img src=./image/5.jpg>
					<blockquote>
						<p><cite>读一本好书</cite>
							书籍是人类进步的阶梯，其实，读书就是将人类浓缩几千年的科技、文化快速习得的最佳方式，
							读书能够让你在极短的时间内，掌握大量的科学文化知识，摆脱愚昧和迷信，你不再是一个空
							白的人，而是通过读书赋予了自己丰富的知识色彩。
						</p> 
					</blockquote>
				</div>
			</div>
		</div>
	</div>
</div>

    <script src="js/jquery1.min.js"></script>
    <script src="js/bootstrap1.min.js"></script>
    <script src="js/scripts1.js"></script>
  
</body>
</html>