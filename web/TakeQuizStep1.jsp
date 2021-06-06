<%-- 
    Document   : TakeQuizStep1
    Created on : May 25, 2021, 11:51:14 AM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/TakeQuiz.css" rel="stylesheet" type="text/css"/>
        <title>Take Quiz</title>
    </head>
    <body>
        <div class="container">
            <%@include file="/component/header.jsp" %> 
            <div class="main">
                <%@include file="component/menu.jsp" %>
                <div class="main-area ml-2 mr-2">
                    <div class="ml-2 mt-4 mb-4">
                        Welcome <label class="font-blue">${sessionScope.user.user}</label>
                    </div>
                    <div class="ml-2 font-color-general">
                        Enter the number of questions:
                    </div>
                    <form class="mb-10" action="StartQuiz" method="get">
                        <input class="ml-2" type="text" name="number" required=""><br/>
                        <input class="btn-start" type="submit" value="Start">
                    </form>
                    <c:if test="${warming != null}">
                            <div style="color: red"> ${warming} </div>
                    </c:if>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>

    </body>
</html>
