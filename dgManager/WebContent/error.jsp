<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Set the viewport width to device width for mobile -->
<meta name="viewport" content="width=device-width" />

<title>是仙女呀</title>

<!-- Included CSS Files (Uncompressed) -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/foundation.css">

<!-- Included CSS Files (Compressed) -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/foundation.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/app.css">

<script src="${pageContext.request.contextPath}/javascripts/modernizr.foundation.js"></script>



<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/foundation.css">

<!-- Included CSS Files (Compressed) -->
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/foundation.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/main.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/stylesheets/app.css">

<script src="${pageContext.request.contextPath}/javascripts/modernizr.foundation.js"></script>



<script type="application/x-javascript">
	
	
	
	
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 








</script>
<link href="${pageContext.request.contextPath}/css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="${pageContext.request.contextPath}/css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.countdown.css" />
<!-- Custom Theme files -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<!-- dropdown -->
<script src="${pageContext.request.contextPath}/js/jquery.easydropdown.js"></script>
<!-- start menu -->
<link href="${pageContext.request.contextPath}/css/megamenu.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="${pageContext.request.contextPath}/js/megamenu.js"></script>
<script>
	$(document).ready(function() {
		$(".megamenu").megamenu();
	});
</script>
<script src="js/responsiveslides.min.js"></script>
<script>
	$(function() {
		$("#slider").responsiveSlides({
			auto : true,
			nav : false,
			speed : 500,
			namespace : "callbacks",
			pager : true,
		});
	});
</script>
<script src="js/jquery.countdown.js"></script>
<script src="js/script.js"></script>
</head>
<body>
    <div style="margin:0 auto">
	<div class="row page_wrap" style="margin:0 auto">
		<!-- page wrap -->
		<div class="twelve columns">
			<!-- page wrap -->

			<div class="row">
				<div class="nine columns header_nav">
					<ul id="menu-header" class="nav-bar horizontal">
						<li><a href="frontIndex.jsp">Home</a></li>

						<li class="has-flyout"><a href="#">More</a><a
							href="#" class="flyout-toggle"></a>

							<ul class="flyout">

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/blog.jsp">美妆博客 Blog</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/Product_productPage">商品列表 ProductList</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/contact.jsp">联系我们 ContactUs
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
			<div class="twelve columns">
			<img src="${pageContext.request.contextPath}/images/error.jpg" >
			</div>
			</div>


			

			
			<div class="row">
				<div class="twelve columns">
					<ul id="menu3" class="footer_menu horizontal">
						<li class=""><a href="index.html">Home</a><a
							href="http://www.cssmoban.com/" target="_blank" title="模板之家">是仙女呀</a></li>
					</ul>
				</div>
			</div>

			<script type="text/javascript">
				//<![CDATA[
				$('ul#menu3').nav - bar();
				//]]>
			</script>

		</div>

	</div>
	</div>
	<!-- end page wrap) -->
	<!-- Included JS Files (Compressed) -->
	<script src="${pageContext.request.contextPath}/javascripts/foundation.min.js" type="text/javascript">
		
	</script>
	<!-- Initialize JS Plugins -->
	<script src="${pageContext.request.contextPath}/javascripts/app.js" type="text/javascript">
		
	</script>

	<script type="text/javascript">
		$(window).load(function() {
			$("#flexiselDemo3").flexisel({
				visibleItems : 6,
				animationSpeed : 1000,
				autoPlay : true,
				autoPlaySpeed : 3000,
				pauseOnHover : true,
				enableResponsiveBreakpoints : true,
				responsiveBreakpoints : {
					portrait : {
						changePoint : 480,
						visibleItems : 1
					},
					landscape : {
						changePoint : 640,
						visibleItems : 2
					},
					tablet : {
						changePoint : 768,
						visibleItems : 3
					}
				}
			});

		});
	</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.flexisel.js"></script>


</body>
</html>
