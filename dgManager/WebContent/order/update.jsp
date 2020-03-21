<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>订单信息查询</title>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="shortcut icon" href="images/icons/favicon.ico">
<link rel="apple-touch-icon" href="images/icons/favicon.png">
<link rel="apple-touch-icon" sizes="72x72"
	href="images/icons/favicon-72x72.png">
<link rel="apple-touch-icon" sizes="114x114"
	href="images/icons/favicon-114x114.png">
<!--Loading bootstrap css-->
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Open+Sans:400italic,400,300,700">
<link type="text/css" rel="stylesheet"
	href="http://fonts.googleapis.com/css?family=Oswald:400,700,300">
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
</head>
<body>
	<div>
		<!--BEGIN BACK TO TOP-->
		<a id="totop" href="#"><i class="fa fa-angle-up"></i></a>
		<!--END BACK TO TOP-->
		<!--BEGIN TOPBAR-->
		<div id="header-topbar-option-demo" class="page-header-topbar">
			<nav id="topbar" role="navigation" style="margin-bottom: 0;"
				data-step="3" class="navbar navbar-default navbar-static-top">
			<div class="navbar-header">
				<button type="button" data-toggle="collapse"
					data-target=".sidebar-collapse" class="navbar-toggle">
					<span class="sr-only">Toggle navigation</span><span
						class="icon-bar"></span><span class="icon-bar"></span><span
						class="icon-bar"></span>
				</button>
				<a id="logo" href="index.html" class="navbar-brand"><span
					class="fa fa-rocket"></span><span class="logo-text">是仙女呀</span><span
					style="display: none" class="logo-text-icon">µ</span></a>
			</div>
			<div class="topbar-main">
				<a id="menu-toggle" href="#" class="hidden-xs"><i
					class="fa fa-bars"></i></a>

				<form id="topbar-search" action="" method=""
					class="hidden-sm hidden-xs">
					<div class="input-icon right text-white">
						<a href="#"><i class="fa fa-search"></i></a><input type="text"
							placeholder="Search here..." class="form-control text-white" />
					</div>
				</form>
				<ul class="nav navbar navbar-top-links navbar-right mbn">
					<li class="dropdown topbar-user"><a data-hover="dropdown"
						href="#" class="dropdown-toggle"><img
							src="images/avatar/48.jpg" alt=""
							class="img-responsive img-circle" />&nbsp;<span
							class="hidden-xs">${sessionScope.adminName}</span>&nbsp;<span class="caret"></span></a>
						<ul class="dropdown-menu dropdown-user pull-right">
							<li><a href="#"><i class="fa fa-user"></i>My Profile</a></li>
							<li><a href="frontIndex.jsp"><i class="fa fa-tasks"></i>Back
									to Index<span class="badge badge-success">7</span></a></li>
							<li class="divider"></li>
							<li><a href="adminLogin.jsp"><i class="fa fa-key"></i>Log
									Out</a></li>
						</ul></li>
				</ul>
			</div>
			</nav>
			<!--BEGIN MODAL CONFIG PORTLET-->
			<div id="modal-config" class="modal fade">
				<div class="modal-dialog">
					<div class="modal-content">
						<div class="modal-header">
							<button type="button" data-dismiss="modal" aria-hidden="true"
								class="close">&times;</button>
							<h4 class="modal-title">Modal title</h4>
						</div>
						<div class="modal-body">
							<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Sed eleifend et nisl eget porta. Curabitur elementum sem
								molestie nisl varius, eget tempus odio molestie. Nunc vehicula
								sem arcu, eu pulvinar neque cursus ac. Aliquam ultricies
								lobortis magna et aliquam. Vestibulum egestas eu urna sed
								ultricies. Nullam pulvinar dolor vitae quam dictum condimentum.
								Integer a sodales elit, eu pulvinar leo. Nunc nec aliquam nisi,
								a mollis neque. Ut vel felis quis tellus hendrerit placerat.
								Vivamus vel nisl non magna feugiat dignissim sed ut nibh. Nulla
								elementum, est a pretium hendrerit, arcu risus luctus augue,
								mattis aliquet orci ligula eget massa. Sed ut ultricies felis.</p>
						</div>
						<div class="modal-footer">
							<button type="button" data-dismiss="modal"
								class="btn btn-default">Close</button>
							<button type="button" class="btn btn-primary">Save
								changes</button>
						</div>
					</div>
				</div>
			</div>
			<!--END MODAL CONFIG PORTLET-->
		</div>
		<!--END TOPBAR-->
		<div id="wrapper">
			<!--BEGIN SIDEBAR MENU-->
			<nav id="sidebar" role="navigation" data-step="2"
				data-intro="Template has &lt;b&gt;many navigation styles&lt;/b&gt;"
				data-position="right" class="navbar-default navbar-static-side">
			<div class="sidebar-collapse menu-scroll">
				<ul id="side-menu" class="nav">

					<div class="clearfix"></div>
					<li><a href="customer_search"><i
							class="fa fa-tachometer fa-fw">
								<div class="icon-bg bg-orange"></div>
						</i><span class="menu-title">客户管理</span></a></li>
					<li><a href="Product_search"><i
							class="fa fa-desktop fa-fw">
								<div class="icon-bg bg-pink"></div>
						</i><span class="menu-title">商品管理</span></a></li>
					<li><a href="show"><i class="fa fa-send-o fa-fw">
								<div class="icon-bg bg-green"></div>
						</i><span class="menu-title">库存管理</span></a></li>
					<li class="active"><a href="orderinfo_search"><i
							class="fa fa-edit fa-fw">
								<div class="icon-bg bg-violet"></div>
						</i><span class="menu-title">订单管理</span></a></li>
				</ul>
			</div>
			</nav>
			<div id="page-wrapper">
				<!--BEGIN TITLE & BREADCRUMB PAGE-->
				<div id="title-breadcrumb-option-demo" class="page-title-breadcrumb">
					<div class="page-header pull-left">
						<div class="page-title">订单查询</div>
					</div>
					<ol class="breadcrumb page-breadcrumb pull-right">
						<li><i class="fa fa-home"></i>&nbsp;<a href="dashboard.html">是仙女呀</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="hidden"><a href="#">forms</a>&nbsp;&nbsp;<i
							class="fa fa-angle-right"></i>&nbsp;&nbsp;</li>
						<li class="active">订单查询</li>
					</ol>
					<div class="clearfix"></div>
				</div>
				<!--END TITLE & BREADCRUMB PAGE-->
				<!--BEGIN CONTENT-->
				<div class="page-content">
					<div id="tab-general">
						<div class="row mbl">
							<div class="col-lg-12">
								<div class="col-md-12">
									<div id="area-chart-spline"
										style="width: 100%; height: 300px; display: none;"></div>
								</div>
							</div>

							<div class="col-lg-12">
								<div class="col-lg-12">
									<ul id="generalTab" class="nav nav-tabs responsive">
										<li class="active"><a href="#alert-tab" data-toggle="tab">订单查询</a></li>
										<li><a href="#note-tab" data-toggle="tab">添加订单</a></li>
									</ul>

									<div id="generalTabContent" class="tab-content responsive">
										<div id="alert-tab" class="tab-pane fade in active">
											<div id="tab-general">
												<div class="row">
													<div class="col-lg-6">
														<form action="orderinfo_update" method="post">
															<div class="form-body pal">
																<div class="form-group">
																	<div class="input-icon right">
																		<i class="fa fa-envelope"></i> <input id="inputName"
																			name="oid" type="text" placeholder="订单编号"
																			class="form-control"
																			value="${requestScope.Orderinfo.oid}" />
																	</div>
																</div>
																<div class="form-group">
																	<div class="input-icon right">
																		<i class="fa fa-user"></i> <input id="inputEmail"
																			name="customer.uid" type="text" placeholder="顾客编号"
																			class="form-control"
																			value="${requestScope.Orderinfo.customer.uid}" />
																	</div>
																</div>
																<div class="form-group">
																	<div class="input-icon right">
																		<i class="fa fa-calendar"></i> <input
																			id="inputPassword" name="orderTime" type="text"
																			placeholder=" 下单时间" class="form-control"
																			value="${requestScope.Orderinfo.orderTime}" />
																	</div>
																</div>
																<div class="form-group">
																	<div class="input-icon right">
																		<i class="fa fa-money"></i> <input
																			id="inputConfirmPassword" name="totalMoney"
																			type="text" placeholder=" 总价钱 " class="form-control"
																			value="${requestScope.Orderinfo.totalMoney}" />
																	</div>
																</div>
																<div class="form-group">
																	<div class="input-icon right">
																		<i class="fa fa-smile-o"></i> <input
																			id="inputFirstName" name="totalAmount" type="text"
																			placeholder=" 总数量" class="form-control"
																			value="${requestScope.Orderinfo.totalAmount}" />
																	</div>
																</div>
																<hr />
																<div class="form-actions text-right pal">
																	<button type="submit" class="btn btn-primary">
																		Submit</button>
																</div>
														</form>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div id="note-tab" class="tab-pane fade">
										<div class="panel panel-orange">
											<div class="panel-heading">添加订单</div>
											<div class="panel-body pan">
												<form action="orderinfo_add">
													<div class="form-body pal">
														<div class="form-group">
															<div class="input-icon right">
																<i class="fa fa-envelope"></i> <input id="inputName"
																	name="oid" type="text" placeholder="订单编号"
																	class="form-control" />
															</div>
														</div>
														<div class="form-group">
															<div class="input-icon right">
																<i class="fa fa-user"></i> <input id="inputEmail"
																	name="customer.uid" type="text" placeholder="顾客编号"
																	class="form-control" />
															</div>
														</div>
														<div class="form-group">
															<div class="input-icon right">
																<i class="fa fa-calendar"></i> <input id="inputPassword"
																	name="orderTime" type="text" placeholder=" 下单时间"
																	class="form-control" />
															</div>
														</div>
														<div class="form-group">
															<div class="input-icon right">
																<i class="fa fa-money"></i> <input
																	id="inputConfirmPassword" name="totalMoney" type="text"
																	placeholder=" 总价钱 " class="form-control" />
															</div>
														</div>
														<div class="form-group">
															<div class="input-icon right">
																<i class="fa fa-smile-o"></i> <input id="inputFirstName"
																	name="totalAmount" type="text" placeholder=" 总数量"
																	class="form-control" />
															</div>
														</div>
														<hr />
														<div class="form-actions text-right pal">
															<button type="submit" class="btn btn-primary">
																Submit</button>
														</div>
												</form>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--END CONTENT-->
		<!--BEGIN CONTENT-->
		<div class="page-content">
			<div id="tab-general">
				<div class="row mbl">
					<div class="col-lg-12">
						<div class="col-md-12">
							<div id="area-chart-spline"
								style="width: 100%; height: 300px; display: none;"></div>
						</div>
					</div>
					<div class="col-lg-12">
						<div class="row"></div>
					</div>
				</div>
			</div>
			<!--END CONTENT-->
			<!--BEGIN FOOTER-->
			<div id="footer">
				<div class="copyright">
					<a href="#">2017 ©Copyright是仙女呀</a>
				</div>
			</div>
			<!--END FOOTER-->
		</div>
		<!--END PAGE WRAPPER-->
	</div>
	</div>
	<script src="script/jquery-1.10.2.min.js"></script>
	<script src="script/jquery-migrate-1.2.1.min.js"></script>
	<script src="script/jquery-ui.js"></script>
	<script src="script/bootstrap.min.js"></script>
	<script src="script/bootstrap-hover-dropdown.js"></script>
	<script src="script/html5shiv.js"></script>
	<script src="script/respond.min.js"></script>
	<script src="script/jquery.metisMenu.js"></script>
	<script src="script/jquery.slimscroll.js"></script>
	<script src="script/jquery.cookie.js"></script>
	<script src="script/icheck.min.js"></script>
	<script src="script/custom.min.js"></script>
	<script src="script/jquery.news-ticker.js"></script>
	<script src="script/jquery.menu.js"></script>
	<script src="script/pace.min.js"></script>
	<script src="script/holder.js"></script>
	<script src="script/responsive-tabs.js"></script>
	<script src="script/jquery.flot.js"></script>
	<script src="script/jquery.flot.categories.js"></script>
	<script src="script/jquery.flot.pie.js"></script>
	<script src="script/jquery.flot.tooltip.js"></script>
	<script src="script/jquery.flot.resize.js"></script>
	<script src="script/jquery.flot.fillbetween.js"></script>
	<script src="script/jquery.flot.stack.js"></script>
	<script src="script/jquery.flot.spline.js"></script>
	<script src="script/zabuto_calendar.min.js"></script>
	<script src="script/index.js"></script>
	<!--LOADING SCRIPTS FOR CHARTS-->
	<script src="script/highcharts.js"></script>
	<script src="script/data.js"></script>
	<script src="script/drilldown.js"></script>
	<script src="script/exporting.js"></script>
	<script src="script/highcharts-more.js"></script>
	<script src="script/charts-highchart-pie.js"></script>
	<script src="script/charts-highchart-more.js"></script>
	<!--CORE JAVASCRIPT-->
	<script src="script/main.js"></script>

</body>
</html>

</body>
</html>