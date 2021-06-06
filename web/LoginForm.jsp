<%-- 
    Document   : LoginForm
    Created on : May 24, 2021, 1:48:26 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <%@include file="/component/header.jsp" %> 
            <div class="main">
                <%@include file="component/menu.jsp" %>
                <div class="main-area ml-2 mr-2">
                    <div class="login-title ml-1 mt-6 mb-6 font-blue">
                        Login Form
                    </div>

                    <form class="mr-2 mb-10" action="login" method="post">
                        <table>
                            <tr>
                                <td><label class="font-color-general ml-1">Username:</label></td>
                                <td><input class="input-text" type="text" name="username" required=""><br/></td>
                            </tr>
                            <tr> 
                                <td><label class="font-color-general ml-1">Password:</label></td>
                                <td><input class="input-text" type="password" name="password" required=""></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Sign in">
                                    <a class="btn-register font-color-general ml-1 mr-2" href="RegisterForm.jsp">Register</a>
                                </td>
                            </tr>
                            <c:if test="${sessionScope.failed != null}">
                                <tr >
                                <div style="color: red"> ${sessionScope.failed}</div>
                                </tr>
                            </c:if>
                        </table>
                    </form>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>

    </body>
</html>
