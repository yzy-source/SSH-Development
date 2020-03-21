<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="css/sss.css" rel='stylesheet' type='text/css' />
</head>
<body>
<div class="header_bottom">
				<div class="">
					<div class="header_bottom-box">
						<div class="header_bottom_right">
							<div class="search">
								<form action="Product_frontSearch" method="post">
									<input type="text" value="Search here"
										onFocus="this.value = '';"
										onBlur="if (this.value == '') {this.value = 'Search here';}"
										name="str">
										 <input type="submit" value="" style="float: right">
								</form>
							</div>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
			</div>

</body>
</html>