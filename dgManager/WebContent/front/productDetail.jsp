<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<% 
String datetime=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()); //获取系统时间 
request.setAttribute("currentTime",datetime);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="stylesheets/foundation.min.css">
<link rel="stylesheet" href="stylesheets/main.css">
<link rel="stylesheet" href="stylesheets/app.css">


<script src="javascripts/modernizr.foundation.js"></script>

<title>是仙女呀 | 商品详情</title>
</head>
<script type="text/javascript">
	function test() {
		var a = document.getElementById('price').value ;
		$("#grandTotal").text("￥"+String($("#num").val() * a));
		return $("#num").val() * a;
	}
</script>
<body>
<s:actionerror/>
	<div class="row page_wrap">
		<!-- page wrap -->
		<div class="twelve columns">
			<!-- page wrap -->

			<div class="row">
				<div class="nine columns header_nav">
					<ul id="menu-header" class="nav-bar horizontal">
						<li><a href="frontIndex.jsp">Home</a></li>
						<li class="has-flyout"><a href="#">More</a><a href="#"
							class="flyout-toggle"></a>
							<ul class="flyout">
								<li class="has-flyout"><a href="front/blog.jsp">美妆博客
										Blog</a></li>
								<li class="has-flyout"><a href="Product_productPage">商品列表
										ProductList</a></li>
								<li class="has-flyout"><a href="front/contact.jsp">联系我们
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





			<div class="row">
				<div class="six columns">
					<img
						src="images/productImage/${requestScope.product.productId}Big.jpg"
						alt="Product Image Description">
				</div>

				<div class="six columns">
					<div class="panel">

						<h3>${requestScope.product.productName}</h3>

						<p>售价：￥${requestScope.product.price}</p>
						<p>VIP价：￥${requestScope.product.vipPrice}</p>
						<p>库存：${requestScope.storeNum}</p>
						<p>官网售价：￥${requestScope.product.webPrice}</p>
						<p>
							热门指数：
							<c:forEach begin="1" end="${requestScope.product.hotLevel}"
								step="1" var="i">
								 <img src="images/avatar/hot.png"/>
							</c:forEach>
						</p>
						<p>发货地：${requestScope.product.sendAddr}</p>



							<label><strong>购买数量</strong></label> <input name="width" id="num"
								value="1" class="input_title_invoice" type="text"
								style="width: 100px" onblur="test();">
							<p>
								<input type="hidden" value="${requestScope.product.price}"
									id="price" /> 
							</p>

							<p style="font-size: 24px">
								Totals: <span id="grandTotal">￥${requestScope.product.price}
								</script></span>
							</p>

							<button style="background: no-repeat 24px 10px #e05b5b;padding: 12.5px 38px; border: none;"><a href="${pageContext.request.contextPath}/front/contact.jsp" style="color:#fff;; text-decoration:none;">立即购买</a></button>



					</div>
					<!-- end panel -->

				</div>
			</div>
			<!-- end row -->

			<h4>Product Info</h4>

			<div class="row">
				<div class="twelve columns">

					<dl class="tabs three-up">
						<dd class="active">
							<a href="#simple1">详情</a>
						</dd>
						<dd>
							<a href="#simple2">规格</a>
						</dd>
						<dd>
							<a href="#simple3">评论</a>
						</dd>
					</dl>

					<ul class="tabs-content">
						<li class="active" id="simple1Tab">
							<image src="${pageContext.request.contextPath}/images/detailImage/${requestScope.product.productId}.1.jpg"/>
                            <image src="${pageContext.request.contextPath}/images/detailImage/${requestScope.product.productId}.2.jpg"/>
						</li>
						<li id="simple2Tab">
							<h4 style="color: gray">产品参数</h4> <strong>品&nbsp;牌：</strong>&nbsp;&nbsp;${requestScope.product.brand.bname}<br>
							<strong>国&nbsp;家：</strong>&nbsp;&nbsp;${requestScope.product.brand.country}<br>
							<strong>类&nbsp;型:</strong>&nbsp;&nbsp;${requestScope.product.type }<br>
							<strong> 详&nbsp;细&nbsp;信&nbsp;息：</strong>&nbsp;&nbsp;${requestScope.product.detailInfo}<br>
						</li>
						<li id="simple3Tab">
							<form action="message_messAdd" method="post">
							<input type="hidden" name="msgId" value="${requestScope.message.msgId}" />
								<!--<textarea placeholder="说点什么^_^"></textarea>  -->
								<input id="inputMessage" type="text" placeholder="说点什么^_^" name="content" class="form-control"  style="height:80px"/>
								<input type="hidden" name="products.productId" value="${requestScope.product.productId}">
 								<input type="hidden" name="customer.uid" value="${sessionScope.uid}">
								<input type="hidden" name="msgTime" value="${currentTime}">
								<button>提交</button>
							</form>
							<h4>历史评论</h4> <font style="color: gray">累计评论：${requestScope.messageNum}</font>
							<hr> <c:forEach items="${requestScope.product.messageboxes}"
								var="message">
								<p>
									${message.content} <br> <br> <font
										style="font-style: italic; font-family: Georgia; color: gray">顾客：${message.customer.username}</font>
									<br> <font
										style="font-style: italic; font-family: Georgia; color: gray">
										留言时间：${message.msgTime}</font>
								</p>
								<hr>
							</c:forEach>
						</li>

					</ul>

				</div>
			</div>


			<div class="row">
				<div class="twelve columns">
					<ul id="menu3" class="footer_menu horizontal">
						<li class=""><a href="">Detail</a> <a
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
	<script src="javascripts/foundation.min.js" type="text/javascript">
		
	</script>
	<!-- Initialize JS Plugins -->
	<script src="javascripts/app.js" type="text/javascript">
		
	</script>
</body>
</html>
