<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商城页面</title>
	<link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                        <h2>商品详情</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="single-product-area">
        <div class="zigzag-bottom"></div>
        <div class="container"> 
            <div class="row">
               
                <div class="col-md-8">
                    <div class="product-content-right">
                       
                        <div class="row">
                            <div class="col-sm-6">
                                <div class="product-images">
                                    <div class="product-main-img">
                                        <img src="image/${book.image }" width="300px" height="400px">
                                    </div>
                                    
                                    <div class="product-gallery">
                                        <img src="image/${book.image_a }" width="70px" height="70px">
                                        <img src="image/${book.image_b }" width="70px" height="70px">                                    </div>
                                </div>
                            </div>
                          
                            <div class="col-sm-6">
                                <div class="product-inner">
                                    <h2 class="product-name"><font><font>
										书名：${book.book_name}
									</font></font></h2>
                                    <div role="tabpanel">
                                        <div class="tab-content">
                                            <div role="tabpanel" class="tab-pane fade in active" id="home">
                                                <h2>商品描述</h2>  
                                               <h2><font><font>
													${book.remark}
												</font></font></h2>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="product-inner-price">
                                        <ins>￥：${book.price}</ins> 
                                    </div>    
                                    
                                    <form action="saveCollect"  class="cart">
                                        <div class="quantity">
                                            <input type="number" size="4" class="input-text qty text" title="Qty" value="1" name="quantity" min="1" step="1">
                                        </div>
                                        <p><a href="save?book_id=${book.id }" role="botton">加入购物车</a></p>
                                        <p><a href="saveCollect?book_id=${book.id }&loginname=${user.loginname}&image=${book.image}&book_name=${book.book_name}&price${book.price}" role="botton">收藏商品</a></p>
                                    </form>   
                                </div>
                            </div>
                        </div>
                     </div>
                 </div>
              </div>
           </div>
       </div>
</body>
</html>