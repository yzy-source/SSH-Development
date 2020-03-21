<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="../stylesheets/foundation.min.css">
<link rel="stylesheet" href="../stylesheets/main.css">
<link rel="stylesheet" href="../stylesheets/app.css">

<script src="../javascripts/modernizr.foundation.js"></script>

<title>Insert title here</title>
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
				<div class="">

					<div class="blog_post">
						<!-- Begin Blog Post -->
						<div class="heading">
							<h3>
								<span class="heading_bg">快时尚挑选指南</span>
							</h3>
						</div>
						<div class="heading">
							<h3>
								<span class="heading_bg">ZARA、H&M衣服丑哭？那是因为你不会挑</span>
							</h3>
						</div>
						<img src="../images/blogs/zara.jpg" alt="desc" style="width: 100%" />

						<p>
							<em>20th oct 2012 | Posted by: 徐老师 | 深夜发媸</a></em>
						</p>

						<p>
							宝宝们晚上好 每次给大家推荐Zara、Topshop 这些快时尚品牌时 总会看见很多妹子留言说

							「为什么我从来没有在店里看见过这些款式？」 放心，你并没有逛到假店 只是因为店铺普遍都存在挑款问题 要么不全要么太土 <a
								href="http://mp.weixin.qq.com/s/0ABwvTmGvwu7jHSleKzUwg">查看更多</a>
						</p>

					</div>
					<!-- END blog post -->



					<div class="blog_post">
						<!-- Begin Blog Post -->
						<div class="heading_dots_grey">
							<h3>
								<span class="heading_bg">怎么用最少钱，集齐所有口红颜色？</span>
							</h3>
						</div>
						<img src="../images/blogs/img1.jpg" alt="desc" style="width: 100%" />

						<p>
							<em>20th oct 2012 | Posted by: 羊咩咩|化妆师MK-雷韵祺</a></em>
						</p>

						<p>
							hello~everyone~我是被虐得苟延残喘终于等到素素跳诛仙台，姑姑姑父发糖的羊咩咩。 <a
								href="http://mp.weixin.qq.com/s/bdHmZ4pfVWEJqia17d1Zqg">查看更多
								&raquo;</a>
						</p>

					</div>
					<!-- END blog post -->


					<div class="blog_post">
						<!-- Begin Blog Post -->
						<div class="heading_dots_grey">
							<h3>
								<span class="heading_bg">只会用手上妆？难怪你怎么化都不美</span>
							</h3>
						</div>
						<img src="../images/blogs/img4.jpg" alt="desc" style="width: 100%" />

						<p>
							<em>20th oct 2012 | Posted by: 咸咸|化妆师MK-雷韵祺</a></em>
						</p>

						<p>
							“工欲善其事，必先利其器。“没有好的化妆工具，怎么能化出倾国倾城闭月羞花的妆容。 <a
								href="http://mp.weixin.qq.com/s/2A_4uWYD6kuhiK1VjxekPw">查看更多
								&raquo;</a>
						</p>

					</div>
					<!-- END blog post -->
				</div>
				<!-- END row blog -->
			</div>
			<div class="row">
				<div class="twelve columns">
					<ul id="menu3" class="footer_menu horizontal">
						<li class=""><a href="front/blog.jsp">Blog</a> <a
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