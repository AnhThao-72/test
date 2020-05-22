<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/lib.css" rel="stylesheet" type="text/css"/>
        <title>Menu and Price List</title>
    </head>
    <style>
        .abc focus{
            color: red;
        }
    </style>
    <body>
        <div class="container">
            <!--Header-->
            <jsp:include page="Header.jsp"></jsp:include>

                <div class="bodyy">


                    <div class="content">
                        <h2>Menu and price list</h2>
                        <table border="0" cellpadding="0" cellspacing="0">
                        <c:forEach items="${menus}" var="i">
                            <tr>
                                <td><div class="row1">Menu ${i.id}</div></td>
                                <td align="right"><div class="row1">Price</div></td>
                            </tr>    
                            <tr>
                                <td style="padding-bottom: 20px;">${i.name}</td>
                                <td style="padding-bottom: 20px;" align="right">$${i.price}</td>
                            </tr>
                            <tr>
                                <td colspan="2"><div class="row2">${i.content}</div></td>
                            </tr>
                            <br>
                        </c:forEach>
                    </table>

                    <div class="page">
                        <form action="menu" method="post">
                            <c:forEach items="${listCount}" var="i" >                                
                                <input type="submit" value="${i}" name="pageindex" class="abc" style="color:${i==pageindex?"red":""}">                         
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

