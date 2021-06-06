<%-- 
    Document   : MakeQuiz
    Created on : May 25, 2021, 12:47:56 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Make Quiz</title>
    </head>
    <body>
        <div class="container">
            <%@include file="/component/header.jsp" %> 
            <div class="main">
                <%@include file="component/menu.jsp" %>
                <div class="main-area ml-2 mr-2">
                    <form action="makeQuiz" method="post">
                        <table class="mt-2 mb-6">
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Question:</label></td>
                                <td><textarea  rows="6" cols="60" name="question" required=""></textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 1:</label></td>
                                <td><textarea  rows="2" cols="60" name="option1" required=""></textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 2:</label></td>
                                <td><textarea  rows="2" cols="60" name="option2" required=""></textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 3:</label></td>
                                <td><textarea  rows="2" cols="60" name="option3" required=""></textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 4:</label></td>
                                <td><textarea  rows="2" cols="60" name="option4" required=""></textarea></td>
                            </tr>
                            <tr>
                                <td><label class="ml-2 font-color-general">Answer(s):</label></td>
                                <td><input type="checkbox" name="result" value="1"/>
                                    <label class="font-color-general mr-2">Option 1</label>
                                    <input type="checkbox" name="result" value="2"/>
                                    <label class="font-color-general mr-2">Option 2</label>
                                    <input type="checkbox" name="result" value="3"/>
                                    <label class="font-color-general mr-2">Option 3</label>
                                    <input type="checkbox" name="result" value="4"/>
                                    <label class="font-color-general mr-2">Option 4</label></td>
                            </tr>
                            <tr></tr>
                            <tr>
                                <td></td>
                                <td><input class="" type="submit" value="Save"></td>
                            </tr>

                        </table>
                    </form>
                    <c:if test="${mess != null}">
                        <div style="color: green"> ${mess} </div>
                    </c:if>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>

    </body>
</html>
