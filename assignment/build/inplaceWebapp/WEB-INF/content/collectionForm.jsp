<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城页面</title>
 	<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/responsive.css">
</head>
<body>
欢迎[${sessionScope.user.username }]访问WM书城
    <div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>购物车</h2>                    </div>
                </div>
            </div>
        </div>
    </div> 
    <a href="main">返回商城首页</a>
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="product-content-right">
                        <div class="woocommerce">
                            <form method="post" action="#">
                                <table cellspacing="0" class="shop_table cart">
                                    <thead>
                                        <tr>
                                            <th class="product-thumbnail">&nbsp;</th>
                                            <th class="product-gallery img ">图书</th>
                                            <th class="product-name">书名</th>
                                            <th class="product-price">价格</th>
                                            <th class="product-quantity">购买数量</th>
                                        </tr>
                                    </thead>
                <c:forEach items="${requestScope.collection_list }" var="collection">

                                    <tbody>
                                        <tr class="cart_item">
                                            <td class="product-remove">
                                                <a title="Remove this item" class="remove" href="removecollection?book_id=${book.id}">×</a> 
                                            </td>

                                            <td class="product-thumbnail">
                                                <img width="145" height="145" alt="poster_1_up" class="shop_thumbnail" src="image/${book.image}"></a>
                                            </td>

                                            <td class="product-name">
                                                <a href="Bookdetail">${book.book_name}</a> 
                                            </td>

                                            <td class="product-price">
                                                <span class="amount">￥：${book.price}</span> 
                                            </td>             
                                        </tr>
                                    </tbody>
                            </c:forEach>                        
                            </form>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>