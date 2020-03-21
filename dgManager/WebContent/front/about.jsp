<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>是仙女呀</title>

<!-- Included CSS Files (Uncompressed) -->
<!--
  <link rel="stylesheet" href="stylesheets/foundation.css">
  -->

<!-- Included CSS Files (Compressed) -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/foundation.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/app.css">

<script src="${pageContext.request.contextPath}/javascripts/modernizr.foundation.js"></script>
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

						<li class="has-flyout"><a href="#">More</a><a
							href="#" class="flyout-toggle"></a>

							<ul class="flyout">

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/blog.jsp">美妆博客 Blog</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/Product_productPage">商品列表 ProductList</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/contact.jsp">联系我们 ContactUs
									</a></li>
								
								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/about.jsp">关于我们 AboutUs
									</a></li>

							</ul></li>

						<li class=""><a href="${pageContext.request.contextPath}/front/userLogin.jsp">Login&Register</a></li>

					</ul>
					<script type="text/javascript">
						//<![CDATA[
						$('ul#menu-header').nav - bar();
						//]]>
					</script>
				</div>

				<div class="three columns header_logo">
					<img src="${pageContext.request.contextPath}/images/avatar/logo.png" alt="site name" />
				</div>

			</div>
			<!-- END Header -->



			<div class="row">
				<div class="six columns">
					<h3>曾小金</h3>
					<image src="${pageContext.request.contextPath}/images/ll.jpg">
				</div>

				<div class="six columns">
					<h3>韩小柴</h3>
					<image src="${pageContext.request.contextPath}/images/hzz.jpg">
				</div>
			</div>
			<div class="row">
				<div class="six columns">
					<h3>曾小熊</h3>
					<image src="${pageContext.request.contextPath}/images/zyy.jpg">
				</div>

				<div class="six columns">
					<h3>于小格</h3>
					<image src="${pageContext.request.contextPath}/images/yzy.jpg">
				</div>
			</div>

			<div class="row">
				<div class="twelve columns">
					<ul id="menu3" class="footer_menu horizontal">
						<li class=""><a href="http://www.cssmoban.com/"
							target="_blank" title="是仙女呀">是仙女呀</a></li>
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
	<script src="${pageContext.request.contextPath}/javascripts/foundation.min.js" type="text/javascript">
		
	</script>
	<!-- Initialize JS Plugins -->
	<script src="${pageContext.request.contextPath}/javascripts/app.js" type="text/javascript">
		
	</script>


</body>
</html>