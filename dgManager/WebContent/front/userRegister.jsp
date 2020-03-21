<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s"  uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8" />
  <!-- Set the viewport width to device width for mobile -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content="Gifty Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
  Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
  <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
  <link href="../css/bootstrap.css" rel='stylesheet' type='text/css' />
  <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
  <!-- Custom Theme files -->
  <link href="../css/style.css" rel='stylesheet' type='text/css' />
  <!-- Custom Theme files -->
  <!--webfont-->

  <script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
  <!-- dropdown -->
  <script src="../js/jquery.easydropdown.js"></script>
  <!-- start menu -->
  <link href="../css/megamenu.css" rel="stylesheet" type="text/css" media="all" />
  <script type="text/javascript" src="../js/megamenu.js"></script>
  <script>$(document).ready(function(){$(".megamenu").megamenu();});</script>

  <title>Login</title>
  
  <!-- Included CSS Files (Uncompressed) -->
  <!--
  <link rel="stylesheet" href="stylesheets/foundation.css">
  -->
  
  <!-- Included CSS Files (Compressed) -->
  <link rel="stylesheet" href="../stylesheets/foundation.min.css">
  <link rel="stylesheet" href="../stylesheets/main.css">
  <link rel="stylesheet" href="../stylesheets/app.css">

  <script src="../javascripts/modernizr.foundation.js"></script>
  
  <!-- IE Fix for HTML5 Tags -->
  <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->
</head>
<body>
<s:actionerror/>
  <div class="row page_wrap">
    <!-- page wrap -->
    <div class="twelve columns">
      <!-- page wrap -->

      <div class="row">
        <div class="nine columns header_nav">
            <ul id="menu-header" class="nav-bar horizontal">
              <li><a href="../frontIndex.jsp">Home</a></li>

						<li class="has-flyout"><a href="#">More</a><a
							href="#" class="flyout-toggle"></a>

							<ul class="flyout">

								<li class="has-flyout"><a href="blog.jsp">美妆博客 Blog</a></li>

								<li class="has-flyout"><a href="../Product_productPage">商品列表 ProductList</a></li>

								<li class="has-flyout"><a href="contact.jsp">联系我们 ContactUs
									</a></li>
								
								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/about.jsp">关于我们 AboutUs
									</a></li>

							</ul></li>

						<li class=""><a href="userLogin.jsp">Login&Register</a></li>

            </ul><script type="text/javascript">
           //<![CDATA[
           $('ul#menu-header').nav-bar();
            //]]>
            </script>
          </div>
          
          <div class="three columns header_logo">
             <img src="../images/avatar/logo.png" alt="site name" />
          </div>
          
        </div><!-- END Header -->
        
		  	  <form action="${pageContext.request.contextPath}/userlogin!registerUser" method="post"> 
		  	  <input type="hidden" name="uid" value="${requestScope.customer.uid}">
				 <div class="col-md-6 login-right">
					<h3>PERSONAL INFORMATION</h3>
					 <div>
						<span>User Name *</span>						
						<input type="text" name="username"> 
					 </div>
					 <div class="clearfix"> </div>
					 <div>
						 <span>Password *</span>
						 <input type="password" name="password"> 
					 </div>
					 <div class="clearfix"> </div>
					 <div>
						 <span>User Address *</span>
						 <input type="text" name="address"> 
					 </div>
					 <div class="clearfix"> </div>
					 <div> 
						 <span>User Telephone *</span>
						 <input type="text" name="telephone"> 
					 </div>
					 <div class="clearfix"> </div>
					 
					 <div  align="center">
					   <input type="submit" value="submit">
					   <div class="clearfix"> </div>
				    </div>
					 </div>   
				</form>
				

      <div class="row">
        <div class="twelve columns">
          <ul id="menu3" class="footer_menu horizontal">
            <li class=""><a href="userRegister.jsp">Register</a> <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">是仙女呀</a></li>
          </ul>
      </div>
      </div>
		  
		  <script type="text/javascript">
          //<![CDATA[
          $('ul#menu3').nav-bar();
          //]]>
          </script>

      </div>

    </div><!-- end page wrap) -->
    <!-- Included JS Files (Compressed) -->
    <script src="../javascripts/foundation.min.js" type="text/javascript">
</script> <!-- Initialize JS Plugins -->
     <script src="../javascripts/app.js" type="text/javascript">
</script>
  
</body>
</html>
