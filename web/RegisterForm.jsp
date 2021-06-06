<%-- 
    Document   : RegisterForm
    Created on : May 26, 2021, 1:56:38 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                        Registration Form
                    </div>

                    <form class="mr-2 mb-10" action="register" method="get">
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
                                <td><label class="font-color-general ml-1">User Type:</label></td>
                                <td>
                                    <select name="type">
                                        <option value="1">Student</option>
                                        <option value="2">Teacher</option>
                                    </select>
                                </td>
                            </tr>
                            <tr> 
                                <td><label class="font-color-general ml-1">Email:</label></td>
                                <td><input class="input-text" type="text" name="email" required=""></td>
                            </tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Register">
                                </td>
                            </tr>
                            <c:if test="${notify != null}">
                                <tr>
                                <td><div style="color:red">${notify}</div></td>
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
