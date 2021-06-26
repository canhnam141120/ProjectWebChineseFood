<%-- 
    Document   : cart
    Created on : May 6, 2020, 9:20:27 PM
    Author     : cauch
--%>
<%@page import="entity.Account"%>
<%@page import="Page.Paging"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Chinese-Foods&Drinks - Free Bootstrap 4 Template by Colorlib</title>
        <link rel="icon" href="images/logo.jpg">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <link href="https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Lora:400,400i,700,700i&display=swap" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Amatic+SC:400,700&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="css/open-iconic-bootstrap.min.css">
        <link rel="stylesheet" href="css/animate.css">

        <link rel="stylesheet" href="css/owl.carousel.min.css">
        <link rel="stylesheet" href="css/owl.theme.default.min.css">
        <link rel="stylesheet" href="css/magnific-popup.css">

        <link rel="stylesheet" href="css/aos.css">

        <link rel="stylesheet" href="css/ionicons.min.css">

        <link rel="stylesheet" href="css/bootstrap-datepicker.css">
        <link rel="stylesheet" href="css/jquery.timepicker.css">


        <link rel="stylesheet" href="css/flaticon.css">
        <link rel="stylesheet" href="css/icomoon.css">
        <link rel="stylesheet" href="css/style.css">
<%
            Account a = (Account) session.getAttribute("account");
            Integer totalpage = (Integer) request.getAttribute("totalpage");
            Integer pageindex = (Integer) request.getAttribute("pageindex");
        %>

    </head>
    <body class="goto-here">
        <div>
            <jsp:include page="header.jsp"/>
        </div>
        <section class="ftco-section">
            <div class="row justify-content-center">
                <form class="search-form" action="management" method="get">
                    <input type="text" name="search" placeholder="Search" required>
                    <button type="submit"  class="btn btn-black">Search</button>
                </form>
                <div class="col-md-10 mb-5 text-center ">

                    <ul class="product-category ">
                        <li><a href="management" class="active" >All</a></li>
                        <li ><a href="management?type=1">Spicy sticks</a></li>
                        <li><a href="management?type=2" >Snacks</a></li>
                        <li><a href="management?type=3" >Drinks</a></li>
                        <li><a href="management?type=4" >Instant food</a></li>
                    </ul>
                </div>
            </div>
            <section class="ftco-section ftco-cart">
                <div class="container">
                    <div class="row">
                        <div class="col-md-12 ftco-animate">
                            <div class="cart-list">
                                <table class="table">
                                    <thead class="thead-primary">
                                        <tr class="text-center">
                                            <th>ID</th>
                                            <th>Image</th>
                                            <th>Product name</th>
                                            <th>Price</th>
                                            <th>Update</th>
                                            <th>&nbsp;</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach items="${requestScope.Product}" var="p">
                                            <tr class="text-center">
                                                <td class="product-id"><h4>${p.ID}</h4></td>

                                                <td class="image-prod"><div class="img" style="background-image:url(${p.image});"></div></td>

                                                <td class="product-name">
                                                    <h3>${p.name}</h3>
                                                </td>

                                                <td class="price">${p.price}</td>

                                                <%--   <td class="quantity">
                                                       <h6>${o.quantity}</h6>
       <!--                                                <div class="input-group mb-3">-->
                                                           <input type="hidden" name="quantity" class="quantity form-control input-number" value="${o.quantity}" min="1" max="100">
       <!--                                                </div>-->
                                                   </td> --%>

                                                <td class="product-update"><a href="updateproduct?id=${p.ID}" ><span class="ion-ios-settings"></span></a></td>
                                                <td class="product-remove"><a href="delete?id=${p.ID}" onclick="return confirm('You want to delete product?');"><span class="ion-ios-close"></span></a></td>
                                                
                                            </tr><!-- END TR-->
                                        </c:forEach>
                                    </tbody>
                                </table>
                                <p><a href="deleteall" style="margin-left: 70%;"  class="btn btn-black py-3 px-5">Delete All Product</a></p>
                                <p><a href="addproduct" style="margin-left: 72%;" class="btn btn-black py-3 px-5">Add Product</a></p>
                            </div>
                        </div>
                    </div>
                    <div class="row mt-5">
                    <div class="col text-center">
                        <div class="block-27 ">
                            <ul>
                                 <%=Paging.pager(2, pageindex, totalpage)%> 
                            </ul>
                        </div>
                    </div>
                </div> 
                </div>
            </section>
        </section>
        <div>
            <jsp:include page="footer.jsp"/>
        </div>




        <!-- loader -->
        <div id="ftco-loader" class="show fullscreen"><svg class="circular" width="48px" height="48px"><circle class="path-bg" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke="#eeeeee"/><circle class="path" cx="24" cy="24" r="22" fill="none" stroke-width="4" stroke-miterlimit="10" stroke="#F96D00"/></svg></div>


        <script src="js/jquery.min.js"></script>
        <script src="js/jquery-migrate-3.0.1.min.js"></script>
        <script src="js/popper.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.easing.1.3.js"></script>
        <script src="js/jquery.waypoints.min.js"></script>
        <script src="js/jquery.stellar.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.magnific-popup.min.js"></script>
        <script src="js/aos.js"></script>
        <script src="js/jquery.animateNumber.min.js"></script>
        <script src="js/bootstrap-datepicker.js"></script>
        <script src="js/scrollax.min.js"></script>
        <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
        <script src="js/google-map.js"></script>
        <script src="js/main.js"></script>



    </body>
</html>