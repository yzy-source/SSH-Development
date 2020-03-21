<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width" />

<title>是仙女呀</title>

<!-- Included CSS Files (Uncompressed) -->
<!--
  <link rel="stylesheet" href="stylesheets/foundation.css">
  -->

<!-- Included CSS Files (Compressed) -->
<link rel="stylesheet" href="../stylesheets/foundation.min.css">
<link rel="stylesheet" href="../stylesheets/main.css">
<link rel="stylesheet" href="../stylesheets/app.css">

<script src="../javascripts/modernizr.foundation.js"></script>
</head>
<body>
	<div class="row page_wrap">
		<!-- page wrap -->
		<div class="twelve columns">
			<!-- page wrap -->

			<div class="row">
				<div class="nine columns header_nav">
					<ul id="menu-header" class="nav-bar horizontal">
						<li><a href="${pageContext.request.contextPath}/frontIndex.jsp">Home</a></li>

						<li class="has-flyout"><a href="#">More</a><a href="#"
							class="flyout-toggle"></a>

							<ul class="flyout">

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/blog.jsp">美妆博客 Blog</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/Product_productPage">商品列表
										ProductList</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/contact.jsp">联系我们
										ContactUs </a></li>
										
								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/about.jsp">关于我们 AboutUs
									</a></li>

							</ul></li>

						<li class=""><a href="userLogin.jsp">Login&Register</a></li>
					</ul>
					<script type="text/javascript">
						//<![CDATA[
						$('ul#menu-header').nav - bar();
						//]]>
					</script>
				</div>

				<div class="three columns header_logo">
					<img src="../images/avatar/logo.png" alt="site name" />
				</div>

			</div>
			<!-- END Header -->



			<div class="row">
				<div class="six columns">
					<h3>Contact us</h3>

					<p>
						<strong>是仙女呀</strong>
					</p>

					<p>
						Telephone:小仙女不用电话<br /> E-mail: 小仙女也不用邮箱
					</p>
					<!-- // MAILCHIMP SUBSCRIBE CODE \\ -->


					<p>
						<strong>Office:南开大学 Nankai University
						</strong><br />
					</p>
				</div>

				<div class="six columns">
					<h3>Where to find us</h3>
					<image src="../images/avatar/code.jpg">
				</div>
			</div>

			<div class="row">
				<div class="twelve columns">
					<ul id="menu3" class="footer_menu horizontal">
						<li class="">Contact<a
							href="http://www.cssmoban.com/" target="_blank" title="模板之家">是仙女呀</a></li>
					</ul>
					<script type="text/javascript">
						//<![CDATA[
						$('ul#menu3').nav - bar();
						//]]>
					</script>
				</div>
			</div>

		</div>
		<!-- end page wrap) -->
	</div>
	<!-- end page wrap) -->

	<!-- Included JS Files (Compressed) -->
	<script src="../javascripts/foundation.min.js" type="text/javascript">
		
	</script>
	<!-- Initialize JS Plugins -->
	<script src="../javascripts/app.js" type="text/javascript">
		
	</script>

</body>
</html>