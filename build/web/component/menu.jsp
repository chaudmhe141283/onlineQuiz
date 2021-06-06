<%-- 
    Document   : menu
    Created on : May 24, 2021, 5:30:01 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div class="menu">
            <ul class="nav">
                <li><a href="Home.jsp">Home</a></li>
                    <c:if test="${sessionScope.user != null}">
                        <c:if test="${sessionScope.takingQuiz == null}">
                        <li><a href="TakeQuizStep1.jsp">Take Quiz</a></li>
                        </c:if>
                        <c:if test="${sessionScope.takingQuiz != null}">
                        <li><a href="TakeQuizStep2.jsp">Take Quiz</a></li>
                        </c:if>
                        <c:if test="${sessionScope.user.type == 2}">
                        <li><a href="MakeQuiz.jsp">Make Quiz</a></li>
                        <li><a href="manageQuiz?indexPage=1">Manage Quiz</a></li>
                        </c:if>
                    <li><a href="logout">Log out</a></li>
                    </c:if>
            </ul>
        </div>
    </body>
</html>
