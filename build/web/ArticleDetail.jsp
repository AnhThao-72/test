<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="bodyy">
                    <div class="content">
                    <c:if test="${text ne null}" >${requestScope.text} </c:if>
                    <h2>${article.title}</h2> 
                    <div>
                        <div><img src="image/${article.imagePath}" style="width: 400px; height: 400px;"></div>
                        <div class="contentDetail"  style="font-size: 20px; padding-top: 10px;width: 100%;">${article.fullContent}</div>
                    </div>
                </div>
                <jsp:include page="Share.jsp"></jsp:include>
                </div>
            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>
</html> 
