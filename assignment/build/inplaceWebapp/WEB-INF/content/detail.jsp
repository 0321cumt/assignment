<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1">
<title>商城页面</title>
	<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="css/responsive.css">

</head>
<body>
	<div class="mainmenu-area">
        <div class="container">
            <div class="row">
                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="main">WM商城</a></li>
                        <li><a href="Education.jsp">教育类图书</a></li>
                        <li><a href="Art.jsp">文艺类图书</a></li>
                        <li><a href="cart.jsp">Cart</a></li>
                        <li><a href="#">order</a></li>
                    </ul>
                </div>  
            </div>
        </div>
    </div> 
    <div class="single-product-area">
    <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
            	<c:forEach items="${book_list }" var="book">
                <div class="col-md-3 col-sm-6">
                    <div class="single-shop-product">
                        <div class="product-upper">
                        	<img src="image/${book.image }" width=200px height=300px/>
                        </div>
                        	<h2><font><font>
								书名：<a href="details">${book.name}</a>
							</font></font></h2>
                        <div class="product-carousel-price">
                         	<font><font>
								价格：${book.price}
							</font></font>
                        </div> 
                         <div class="product-option-shop">
                            <a class="add_to_cart_button" data-quantity="1" data-product_sku="" data-product_id="70" rel="nofollow" href="Cart.jsp">加入购物车</a>
                        </div> 
                     </div>
                 </div>
                 </c:forEach>
             </div>
          </div>
       </div>
</body>
</html>