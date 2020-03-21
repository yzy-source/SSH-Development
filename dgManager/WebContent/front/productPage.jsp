<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="stylesheets/foundation.min.css">
<link rel="stylesheet" href="stylesheets/main.css">
<link rel="stylesheet" href="stylesheets/app.css">


<link type="text/css" rel="stylesheet"
	href="styles/jquery-ui-1.10.4.custom.min.css">
<link type="text/css" rel="stylesheet"
	href="styles/font-awesome.min.css">
<link type="text/css" rel="stylesheet" href="styles/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="styles/animate.css">
<link type="text/css" rel="stylesheet" href="styles/all.css">
<link type="text/css" rel="stylesheet" href="styles/main.css">
<link type="text/css" rel="stylesheet"
	href="styles/style-responsive.css">
<link type="text/css" rel="stylesheet"
	href="styles/zabuto_calendar.min.css">
<link type="text/css" rel="stylesheet" href="styles/pace.css">
<link type="text/css" rel="stylesheet"
	href="styles/jquery.news-ticker.css">
<link type="text/css" rel="stylesheet" href="styles/jplist-custom.css">


<script src="javascripts/modernizr.foundation.js"></script>



<!-- <link href="css/sss.css" rel='stylesheet' type='text/css' /> -->

<title>是仙女呀|商品列表</title>
</head>
<body>
	<div class="row page_wrap" style="margin: 0 auto">
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

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/blog.jsp">美妆博客
										Blog</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/Product_productPage">商品列表
										ProductList</a></li>

								<li class="has-flyout"><a href="${pageContext.request.contextPath}/front/contact.jsp">联系我们
										ContactUs </a></li>
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
			<div class="header_bottom">
				<div class="">
					<div class="header_bottom-box">
						<div class="header_bottom_right"
							style="width: 100%; float: left; margin-right: 25%;">
							<div style="width: 100%; margin-right: 50px;">
								<form action="Product_frontSearch" method="post">
									<input class="productsearch" value="Search here"
										onFocus="this.value = '';"
										onBlur="if (this.value == '') {this.value = 'Search here';}"
										name="str"
										style="padding: 15px; outline: none; color: #B6B2AE; background: #fff; border: 1px solid #f8d5d1; width: 85%; line-height: 1.5em; font: 500 13px/13px 'Raleway', sans-serif; -webkit-appearance: none;width:300px;height:50px">
									<input type="submit" class="productsubmit" value=""
										style="background: url('${pageContext.request.contextPath}/images/search.png') no-repeat 24px 10px #e05b5b; padding: 12.5px 38px; border: none; cursor: pointer; position: absolute; outline: none; float: left;width:30px;height:50px">
								</form>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>

			<!-- 			<div class="form-group"> -->
			<!-- 				<label class="col-sm-3 control-label">品牌</label> -->

			<!-- 				<div class="col-sm-9 controls"> -->
			<!-- 					<div class="row"> -->
			<!-- 						<div class="col-xs-4"> -->
			<!-- 							<select class="form-control" name="brand.bname"> -->
			<%-- 								<c:forEach items="${requestScope.brandPage.brandList}" --%>
			<%--  									var="brand"> --%>
			<%--  									<option>${brand.bname}</option> --%>
			<%--  								</c:forEach>  --%>
			<!-- 							</select> -->
			<!-- 						</div> -->
			<!-- 					</div> -->
			<!-- 				</div> -->
			<!-- 			</div> -->


			<div id="container"
				style="width: 99.5%; background: none; box-shadow: none; margin: 0.5% auto">


				<c:forEach items="${requestScope.productPage.productList}"
					var="product">
					<div class='box photo col2'>
						<img src='images/productImage/${product.productId}.jpg' alt="desc" />
						<p>${product.productName}</p>
						<p style='text-align: center; margin-bottom: 12px'>
							<a href='Product_detailview?productId=${product.productId}'
								class='button small secondary round'>More Info &#187;</a>
						</p>
					</div>
				</c:forEach>


			</div>
			<div>
				<ul class="pagination mtm mbm">
					<c:if test="${requestScope.productPage.currentPage==1}">
						<li><a
							href="Product_productPage?currentPage=${requestScope.productPage.currentPage}">&laquo;</a></li>

					</c:if>
					<c:if test="${requestScope.productPage.currentPage!=1}">
						<li><a
							href="Product_productPage?currentPage=${requestScope.productPage.currentPage-1}">&laquo;</a></li>
					</c:if>
					<c:forEach begin="1" end="${requestScope.productPage.totalPage}"
						step="1" var="i">
						<c:if test="${i==requestScope.productPage.currentPage}">
							<li class="active"><a href="#">${i}</a></li>

						</c:if>
						<c:if test="${i!=requestScope.productPage.currentPage}">
							<li><a href="Product_productPage?currentPage=${i}">${i}</a></li>
						</c:if>
					</c:forEach>
					<c:if
						test="${requestScope.productPage.currentPage==requestScope.productPage.totalPage}">
						<li><a
							href="Product_productPage?currentPage=${requestScope.productPage.currentPage}">&raquo;</a></li>

					</c:if>
					<c:if
						test="${requestScope.productPage.currentPage!=requestScope.productPage.totalPage}">
						<li><a
							href="Product_productPage?currentPage=${requestScope.productPage.currentPage+1}">&raquo;</a></li>
					</c:if>
				</ul>
			</div>
			<!-- end Masonry container -->
			<div class="row">
				<div class="twelve columns">
					<ul id="menu3" class="footer_menu horizontal">
						<li class=""><a href="index.html">ProductList</a><a
							href="http://www.cssmoban.com/" target="_blank" title="模板之家">是仙女呀</a></li>
					</ul>
					<script type="text/javascript">
						//<![CDATA[
						$('ul#menu3').nav - bar();
						//]]>
					</script>
				</div>
			</div>
			<!-- end page wrap) -->
			<!-- Included JS Files (Compressed) -->
			<script src="javascripts/foundation.min.js" type="text/javascript">
				
			</script>
			<!-- Initialize JS Plugins -->
			<script src="javascripts/app.js" type="text/javascript">
				
			</script>
			<!-- Masonry for galleries -->
			<script src="javascripts/masonry.js" type="text/javascript">
				
			</script>
			<script type="text/javascript">
				//<![CDATA[
				$(function() {
					var $container = $('#container');
					$container.imagesLoaded(function() {
						$container.masonry({
							itemSelector : '.box',
							isFitWidth : true,
							isAnimated : true
						});
					});
				});
				//]]>
			</script>
			<!-- END Masonry -->

		</div>
		<!-- END page wrap -->
	</div>
	<!-- END page wrap -->

</body>
</html>