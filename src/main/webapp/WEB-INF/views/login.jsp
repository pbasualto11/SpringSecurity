<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!--A Design by W3layouts
   Author: W3layout
   Author URL: http://w3layouts.com
   License: Creative Commons Attribution 3.0 Unported
   License URL: http://creativecommons.org/licenses/by/3.0/
   -->
<!--A Design by W3layouts
   Author: W3layout
   Author URL: http://w3layouts.com
   License: Creative Commons Attribution 3.0 Unported
   License URL: http://creativecommons.org/licenses/by/3.0/
   -->
   <!DOCTYPE html>
   <html lang="es-cl">
      <head>
         <title>Laser Airlines - Login</title>
         <!--meta tags -->
         <meta charset="UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <meta name="keywords" content="Convey a Transportation Category Bootstrap Responsive Web Template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
            Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
         <script type="application/x-javascript">
            addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); }
         </script>
         <!--//meta tags ends here-->
         <!--booststrap-->
         <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all">
         <!--//booststrap end-->
         <!--stylesheets-->
         <link href="css/style.css" rel='stylesheet' type='text/css' media="all">
         <!--//stylesheets--> 
         <!-- font-awesome icons -->
         <link href="css/font-awesome.min.css" rel="stylesheet">
         <!-- partner js-->
         <link href="//fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet">
      </head>
      <body>
         
         <!--navbar-->
         <jsp:include page="/WEB-INF/views/shared/navbar.jsp" flush="true"/>
         <!-- end navbar-->
         
         <br />
         <br />
         <br />
         <br />
         <br />
         <br />
         <!--contact-->
         <div id="contact">
            <div class="container mb-4">
            		<c:if test="${param.error != null }">
						<div class="col-sm">
							<div class="alert alert-danger alert-dismissible" role="alert">
								<button type="button" class="close" data-dismiss="alert">&times;</button>
								<strong>Alert!</strong> Credenciales no validas. Intente nuevamente
							</div>
						</div>
					</c:if>
			   <h3 class="title">Login  <span class="fa fa-key" aria-hidden="true"></span></h3>
               <div class="col-md-6 col-md-offset-3 contact-us">
                  <form action="/login" method="POST">
                  	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
                    <div class="form-group">
                        <label for="username" class="font-weight-bold">Username:</label>
                        <input type="text" id="username" name="username" class="form-control" placeholder="Insert your username" required>
                    </div>
                    <div class="form-group">
                        <label for="password" class="font-weight-bold">Password:</label>
                        <input type="password" id="password" name="password" class="form-control" placeholder="Insert your password" required>
                    </div>  
                    <div class="form-group click">
                        <div class="click">
                            <input class="btn btn-block btn-lg btn-info" type="submit" value="Login">
                         </div>
                    </div>
                  </form>
               </div>
               <div class="clearfix"> </div>
            </div>
         </div>
         <!--//contact-->
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
         <br>
		 <br>
         <br>
         <br>	
      <!--footer -->
      <jsp:include page="/WEB-INF/views/shared/footer.jsp" flush="true"/>
      <!--//footer -->
      
         <!--js working-->
         <script src='js/jquery-2.2.3.min.js'></script>
         <!-- //js  working-->
         <!-- start-smoth-scrolling -->
         <script src="js/move-top.js"></script>
         <script src="js/easing.js"></script>
         <script>
            jQuery(document).ready(function ($) {
                $(".scroll").click(function (event) {
                    event.preventDefault();
                    $('html,body').animate({
                        scrollTop: $(this.hash).offset().top
                    }, 1000);
                });
            });
         </script>
         <!-- start-smoth-scrolling -->
         <!-- for-bottom-to-top smooth scrolling -->
         <script>
            $(document).ready(function () {
                /*
                    var defaults = {
                    containerID: 'toTop', // fading element id
                    containerHoverID: 'toTopHover', // fading element hover id
                    scrollSpeed: 1200,
                    easingType: 'linear' 
                    };
                */
                $().UItoTop({
                    easingType: 'easeOutQuart'
                });
            });
         </script>
         <a href="#" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>
         <!-- //for-bottom-to-top smooth scrolling -->
         <!-- bootstrap-->
         <script src="js/bootstrap.js"></script>
         <!--// bootstrap-->
      </body>
   </html>