<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> -->


<!-- paulirish.com/2008/conditional-stylesheets-vs-css-hacks-answer-neither/ -->
<!--[if lt IE 7]> <html class="no-js lt-ie9 lt-ie8 lt-ie7" lang="en"> <![endif]-->
<!--[if IE 7]>    <html class="no-js lt-ie9 lt-ie8" lang="en"> <![endif]-->
<!--[if IE 8]>    <html class="no-js lt-ie9" lang="en"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js" lang="en"> <!--<![endif]-->
<head>
  <meta charset="utf-8" />

  <!-- Set the viewport width to device width for mobile -->
  <meta name="viewport" content="width=device-width" />

  <title>添加订单</title>
  
  <!-- Included CSS Files (Uncompressed) -->
  <!--
  <link rel="stylesheet" href="stylesheets/foundation.css">
  -->
  
  <!-- Included CSS Files (Compressed) -->
  <link rel="stylesheet" href="stylesheets/foundation.min.css">
  <link rel="stylesheet" href="stylesheets/main.css">
  <link rel="stylesheet" href="stylesheets/app.css">

  <script src="javascripts/modernizr.foundation.js"></script>
  
  <!-- Google fonts -->
<link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300|Playfair+Display:400italic' rel='stylesheet' type='text/css' />

  <!-- IE Fix for HTML5 Tags -->
  <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
  <![endif]-->

</head>
<body>

  <div class="row page_wrap">
    <!-- page wrap -->
    <div class="twelve columns">
      <!-- page wrap -->

      <div class="row">
        <div class="nine columns header_nav">
            <ul id="menu-header" class="nav-bar horizontal">
              <li><a href="index.html">Home</a></li>

              <li class="has-flyout">
                <a href="#">Example Pages</a><a href="#" class="flyout-toggle"></a>

                <ul class="flyout">
                
                  <li class="has-flyout"><a href="blog.html">Blog</a></li>
                  
                  <li class="has-flyout"><a href="blog_single.html">Blog Single Page</a></li>
                  
                  <li class="has-flyout"><a href="products-page.html">Products Page</a></li>

                  <li class="has-flyout"><a href="product-single.html">Product Single</a></li>

                  <li class="has-flyout"><a href="contact.html">Contact Page</a></li>

                </ul>
              </li>

              <li class=""><a href="galleries.html">Galleries</a></li>

            </ul><script type="text/javascript">
           //<![CDATA[
           $('ul#menu-header').nav-bar();
            //]]>
            </script>
          </div>
          
          <div class="three columns header_logo">
             <img src="images/logo.png" alt="site name" />
          </div>
          
        </div><!-- END Header -->





<div class="row">


<div class="six columns">
<div class="panel">
				
				      <h3>订单</h3>
<!-- 					  <p style="font-style: italic; font-family: Georgia">Example only. Not included</p> -->


          <form name="product_list" action="#">
  
		  <label><strong>姓名</strong></label>
		  <input name="username" id="width"  class="input_title_invoice" type="text"><p></p>
		  
		    <label><strong>地址</strong></label>
		  <input name="address" id="length"  class="input_title_invoice" type="text"><p></p>
		  
		  <label><strong>产品名称</strong></label>
		  <input name="product_name" id="length"  class="input_title_invoice" type="text"><p></p>
		  
          <label style="font-weight:bold">产品数量</label>
           
           <select name="print">
		   <option value="1">1</option>
           <option value="2">2</option>
		   <option value="3">3</option>
           </select>
					   			   
<!-- 			<p style="font-size: 11px; padding: 0 0 11px; margin-top: 9px"> -->
<!-- 			<strong>*Cheese:</strong> Some description text goes here.<br>  -->
<!-- 			<strong>*Vegetables:</strong> Some description text goes here.<br>  -->
<!-- 			<strong>*Potatos:</strong> Some description text goes here. -->
<!-- 			</p>		    -->

             <input type="submit" name="提交"/>

      </form>

	</div> <!-- end panel -->

</div>
</div><!-- end row -->

 
      </div><!-- end page wrap) -->
    </div><!-- end page wrap) -->
    <!-- Included JS Files (Compressed) -->
    <script src="javascripts/foundation.min.js" type="text/javascript">
</script> <!-- Initialize JS Plugins -->
     <script src="javascripts/app.js" type="text/javascript">
</script>
  
</body>
</html>
