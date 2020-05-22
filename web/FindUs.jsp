<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Find us</title>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container">
             <jsp:include page="Header.jsp"></jsp:include>
            <!--Body-->
            <div class="bodyy">
                <div class="content">
                    <div class="address">

                        <div class=" left"><h2>Address and Contact</h2></div>
                        <div class="right"><h2>Opening Hours</h2></div>

                        <td>
                            <div class="resInfor">
                                <div class="left">
                                    <p class="resTel">${info.address}</p>  

                                    <p class="resTel">Tel:  ${info.tel}</p>  

                                    <p class="resTel">Email:  ${info.email}</p>  
                                </div>
                                <div class="right">
                                    <p>${info.openDay}</p>
                                </div>
                            </div>

                    </div>
                    <div class="map">
                        <img class="image" src="image/map.jpg">
                    </div>
                </div>
                <jsp:include page="Share.jsp"></jsp:include>
                </div>
            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>
</html>

