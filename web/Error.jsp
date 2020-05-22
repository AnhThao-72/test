<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Error Page</title>
    </head>
    <body>
        <div class="container">
            <div class="header">
                <h1><a href="home">The Sushi Restaurant</a></h1>
                <h3>Welcome to this website</h3>
            </div>
            <div class="menu">
                <a class="menuItem" href="home">Home</a>
                <a class="menuItem" href="menu">Menu and Price list</a>
                <a class="menuItem" href="findUs">Find us</a>
            </div>
            <div class="bodyy">
                <div class="err">
                    <div class="error">${error}</div>
                </div>
               <jsp:include page="Share.jsp"></jsp:include>
            </div>
            <div class="footer">
                <div><a href="#">Created with SimpleSite</a></div>
                <div class="number">0 2 4 9 5 4</div>
            </div>
        </div>
    </body>
</html>
