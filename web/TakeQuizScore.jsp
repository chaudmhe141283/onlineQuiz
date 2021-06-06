<%-- 
    Document   : TakeQuizScore
    Created on : May 25, 2021, 12:37:45 PM
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
                        Your score <label class="font-blue">${sessionScope.score} 
                            (${sessionScope.scorePercent}%) 
                            - ${sessionScope.status}</label>
                    </div>
                    <form class="mb-10" action="TakeQuizStep1.jsp" method="get">
                    <label class="ml-2 font-color-general">Take another test</label>
                        <input type="submit" value="Start">
                    </form>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>

    </body>
</html>
