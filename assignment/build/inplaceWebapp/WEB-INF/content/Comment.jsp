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
<body class="contact">
欢迎[${sessionScope.user.username }]访问WM书城
<div class="product-big-title-area">
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="product-bit-title text-center">
                       <a title="Return to Home" href="index.html">
                                <i class="icon-home"></i>
                            </a>
                            <span class="navigation-pipe">></span>
                            <span class="navigation-page">
                              	 用户反馈
                            </span>
                    </div>
                </div>
            </div>
        </div>
    </div> 
        <div class="contact-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-sm-8 col-xs-12">
                        <div class="contact-form wow fadeIn" data-wow-duration=".5s" data-wow-delay=".5s">
                            <h3>
                                <i class="fa fa-comment-o"></i>
                                	商品评论
                            </h3>
                            <div class="row">
                                <form action="com" id="comment" method="post">
                                    <div class="col-md-6 col-sm-6 col-xs-12">
                                        <input type="text" placeholder="Name (required)" />
                                    </div>
                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <input type="text" placeholder="Subject" />
                                    </div>
                                    <div class="col-md-12 col-sm-12 col-xs-12">
                                        <textarea placeholder="Message" id="message" cols="30" rows="10"></textarea>
                                        <input type="submit" value="Submit Form" />
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>