<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Home Page</title>

    </head>     

    <body>
        <!--Header-->
        <div class="container">
             <jsp:include page="Header.jsp"></jsp:include>
            <!--Body-->
            <div class="bodyy">
                <div class="content" >
                    <img class="image" src="image/i282319414620330848._szw1280h1280_.jpg" alt=""/>
                    <table>
                        <c:forEach items="${articles}" var="i">
                            <tr>
                                <td colspan="2" style="font-size: 20px;"><b>${i.title}</b></td>
                            </tr>
                            <tr>
                                <td><a href="detail?id=${i.id}"><img class="imgSushi" src="image/${i.imagePath}" width="400" height="400"/></a></td>
                                <td class="contentItem">${i.shortContent}</td>
                            </tr>
                        </c:forEach>
                    </table>
                    <div class="page">
                        <form action="home" method="post">
                            <c:forEach items="${listCount}" var="i" >
                                <input type="submit" value="${i}" name="pageindex" style="color:${i==pageindex?"red":""}" >                         
                            </c:forEach>
                        </form>
                    </div>
                </div>
                <jsp:include page="Share.jsp"></jsp:include>
                </div>
            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>

</html>
