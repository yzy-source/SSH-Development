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
<link rel="stylesheet" href="stylesheets/foundation.css">

<!-- Included CSS Files (Compressed) -->
<link rel="stylesheet" href="stylesheets/foundation.min.css">
<link rel="stylesheet" href="stylesheets/main.css">
<link rel="stylesheet" href="stylesheets/app.css">

<script src="javascripts/modernizr.foundation.js"></script>



<link rel="stylesheet" href="stylesheets/foundation.css">

<!-- Included CSS Files (Compressed) -->
<link rel="stylesheet" href="stylesheets/foundation.min.css">
<link rel="stylesheet" href="stylesheets/main.css">
<link rel="stylesheet" href="stylesheets/app.css">

<script src="javascripts/modernizr.foundation.js"></script>



<script type="application/x-javascript">
	
	
	
	
	
	
	
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 








</script>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<link rel="stylesheet" href="css/jquery.countdown.css" />
<!-- Custom Theme files -->
<script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
<!-- dropdown -->
<script src="js/jquery.easydropdown.js"></script>
<!-- start menu -->
<link href="css/megamenu.css" rel="stylesheet" type="text/css"
	media="all" />
<script type="text/javascript" src="js/megamenu.js"></script>
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
								
								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/about.jsp">关于我们 AboutUs
									</a></li>

							</ul></li>

						<li class=""><a href="front/userLogin.jsp">Login&Register</a></li>

					</ul>
					<script type="text/javascript">
						//<![CDATA[
						$('ul#menu-header').nav - bar();
						//]]>
					</script>
				</div>

				<div class="three columns header_logo">
					<img src="images/avatar/logo.png" alt="site name" />
				</div>

			</div>
			<!-- END Header -->



			<div class="show-for-large-up">
				<div class="row">
					<div class="twelve columns">
						<div id="featured">
							<img src="images/avatar/demo1.jpg" alt="desc" /> <img
								src="images/avatar/demo2.jpg" alt="desc" /> <img
								src="images/avatar/demo3.jpg" alt="desc" />
						</div>
					</div>
				</div>
			</div>
			<div class="copyrights">
				Collect from <a href="http://www.cssmoban.com/">Website Template</a>
			</div>

			<div class="content_top">
				<div class="">
					<div class="sellers_grid">
						<ul class="sellers">
							<i class="star"> </i>
							<li class="sellers_desc"><h2>Best Sellers</h2></li>
							<div class="clearfix"></div>
						</ul>
					</div>
					<div class="grid_2">
						<div class="col-md-3 span_6">
							<div class="box_inner">
								<img src="images/productImage/1.jpg" class="img-responsive" alt="" />
								<div class="sale-box"></div>
								<div class="desc">
									<h3>薏仁水</h3>
									<h4>￥75</h4>
									<ul class="list2">
										<li class="list2_left"><span class="m_1"><a
												href="${pageContext.request.contextPath}/front/contact.jsp" class="link">Add to Cart</a></span></li>
										<li class="list2_right"><span class="m_2"><a
												href="Product_detailview?productId=1" class="link1">See More</a></span></li>
										<div class="clearfix"></div>
									</ul>
									<div class="heart"></div>
								</div>
							</div>
						</div>
						<div class="col-md-3 span_6">
							<div class="box_inner">
								<img src="images/productImage/5.jpg" class="img-responsive" alt="" />
								<div class="sale-box"></div>
								<div class="desc">
									<h3>城野医生毛孔收敛水</h3>
									<h4>￥125</h4>
									<ul class="list2">
										<li class="list2_left"><span class="m_1"><a
												href="${pageContext.request.contextPath}/front/contact.jsp" class="link">Add to Cart</a></span></li>
										<li class="list2_right"><span class="m_2"><a
												href="Product_detailview?productId=5" class="link1">See More</a></span></li>
										<div class="clearfix"></div>
									</ul>
									<div class="heart"></div>
								</div>
							</div>
						</div>
						<div class="col-md-3 span_6">
							<div class="box_inner">
								<img src="images/productImage/10.jpg" class="img-responsive" alt="" />
								<div class="sale-box"></div>
								<div class="desc">
									<h3>5色眼影14色</h3>
									<h4>￥89</h4>
									<ul class="list2">
										<li class="list2_left"><span class="m_1"><a
												href="${pageContext.request.contextPath}/front/contact.jsp" class="link">Add to Cart</a></span></li>
										<li class="list2_right"><span class="m_2"><a
												href="Product_detailview?productId=10" class="link1">See More</a></span></li>
										<div class="clearfix"></div>
									</ul>
									<div class="heart"></div>
								</div>
							</div>
						</div>
						<div class="col-md-3 span_6">
							<div class="box_inner">
								<img src="images/productImage/13.jpg" class="img-responsive" alt="" />
								<div class="sale-box"></div>
								<div class="desc">
									<h3>mac see sheer</h3>
									<h4>￥168</h4>
									<ul class="list2">
										<li class="list2_left"><span class="m_1"><a
												href="${pageContext.request.contextPath}/front/contact.jsp" class="link">Add to Cart</a></span></li>
										<li class="list2_right"><span class="m_2"><a
												href="Product_detailview?productId=13" class="link1">See More</a></span></li>
										<div class="clearfix"></div>
									</ul>
									<div class="heart"></div>
								</div>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="content_middle">
				<div class="">
					<ul class="promote">
						<i class="promote_icon"> </i>
						<li class="promote_head"><h3>Promotion</h3></li>
					</ul>
					<ul id="flexiselDemo3">
						<li><img src="images/productImage/2.jpg" class="img-responsive" />
							<div class="grid-flex">
								<h4>sofina妆前乳</h4>
								<p>￥110</p>
								<div class="m_3">
									<a href="${pageContext.request.contextPath}/front/contact.jsp" class="link2">Add to Cart</a>
								</div>
								<div class="ticket"></div>
							</div></li>
						<li><img src="images/productImage/4.jpg" class="img-responsive" />
							<div class="grid-flex">
								<h4>肌美精3D面膜</h4>
								<p>￥65</p>
								<div class="m_3">
									<a href="${pageContext.request.contextPath}/front/contact.jsp" class="link2">Add to Cart</a>
								</div>
								<div class="ticket"></div>
							</div></li>
						<li><img src="images/productImage/12.jpg" class="img-responsive" />
							<div class="grid-flex">
								<h4>mac chili</h4>
								<p>￥168</p>
								<div class="m_3">
									<a href="${pageContext.request.contextPath}/front/contact.jsp" class="link2">Add to Cart</a>
								</div>
								<div class="ticket"></div>
							</div></li>
						<li><img src="images/productImage/7.jpg" class="img-responsive" />
							<div class="grid-flex">
								<h4>sana豆乳乳液</h4>
								<p>￥75</p>
								<div class="m_3">
									<a href="${pageContext.request.contextPath}/front/contact.jsp" class="link2">Add to Cart</a>
								</div>
								<div class="ticket"></div>
							</div></li>
						<li><img src="images/productImage/16.jpg" class="img-responsive" />
							<div class="grid-flex">
								<h4>tf白管3</h4>
								<p>￥345</p>
								<div class="m_3">
									<a href="${pageContext.request.contextPath}/front/contact.jsp" class="link2">Add to Cart</a>
								</div>
								<div class="ticket"></div>
							</div></li>
					</ul> 					
					<script type="text/javascript" src="js/jquery.flexisel.js"></script>
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
	<script src="javascripts/foundation.min.js" type="text/javascript">
		
	</script>
	<!-- Initialize JS Plugins -->
	<script src="javascripts/app.js" type="text/javascript">
		
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
	<script type="text/javascript" src="js/jquery.flexisel.js"></script>


</body>
</html>
