<%-- 
    Document   : TakeQuizStep1
    Created on : May 25, 2021, 12:51:14 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Take Quiz</title>
    </head>
    <body>
        <div class="container">
            <%@include file="/component/header.jsp" %> 
            <div class="main">
                <%@include file="component/menu.jsp" %>
                <div style="padding: 100px;" class="main-area ml-2 mr-2">
                    <c:if test="${sessionScope.user != null}">
                        <div class="ml-2 mt-4 mb-4">
                            <h2>Welcome <label style="margin-right: 0" class="font-blue">${sessionScope.user.user}</label>
                            to Quiz Online</h2>
                        </div>
                    </c:if>
                    <c:if test="${sessionScope.user == null}">
                        <h1 class="ml-2 mt-4 mb-4">Please <a href="LoginForm.jsp">LOGIN</a> to do Quiz</h1>
                    </c:if>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>

    </body>
</html>
