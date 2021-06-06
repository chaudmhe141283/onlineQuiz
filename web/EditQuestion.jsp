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
        <title>Edit Question</title>
    </head>
    <body>
        <div class="container">
            <%@include file="/component/header.jsp" %> 
            <div class="main">
                <%@include file="component/menu.jsp" %>
                <div class="main-area ml-2 mr-2">
                    <form action="edit" method="post">
                        <table class="mt-2 mb-6">
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Question:</label></td>
                                <td><textarea  rows="6" cols="60" name="question" required="">${quiz.question}</textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 1:</label></td>
                                <td><textarea  rows="2" cols="60" name="option1" required="">${quiz.option1}</textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 2:</label></td>
                                <td><textarea  rows="2" cols="60" name="option2" required="">${quiz.option2}</textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 3:</label></td>
                                <td><textarea  rows="2" cols="60" name="option3" required="">${quiz.option3}</textarea></td>
                            </tr>
                            <tr>
                                <td class="float-left"><label class="ml-2 font-color-general">Option 4:</label></td>
                                <td><textarea  rows="2" cols="60" name="option4" required="">${quiz.option4}</textarea></td>
                            </tr>
                            <tr>
                                <td><label class="ml-2 font-color-general">Answer(s):</label></td>
                                <td>
                                    <!--option 1-->        
                            <c:if test="${quiz.result != 1}">
                                <input type="checkbox" name="result" value="1">
                                <label class="font-color-general mr-2">Option 1</label>
                            </c:if>
                            <c:if test="${quiz.result == 1}">
                                <input type="checkbox" name="result" value="1" checked>
                                <label class="font-color-general mr-2">Option 1</label>
                            </c:if>
                            <!--option 2-->
                            <c:if test="${quiz.result != 2}">
                                <input type="checkbox" name="result" value="2">
                                <label class="font-color-general mr-2">Option 2</label>
                            </c:if>
                            <c:if test="${quiz.result == 2}">
                                <input type="checkbox" name="result" value="2" checked>
                                <label class="font-color-general mr-2">Option 2</label>
                            </c:if>
                            <!--option 3-->
                            <c:if test="${quiz.result != 3}">
                                <input type="checkbox" name="result" value="3">
                                <label class="font-color-general mr-2">Option 3</label>
                            </c:if>
                            <c:if test="${quiz.result == 3}">
                                <input type="checkbox" name="result" value="3" checked>
                                <label class="font-color-general mr-2">Option 3</label>
                            </c:if>
                            <!--option 4-->
                            <c:if test="${quiz.result != 4}">
                                <input type="checkbox" name="result" value="4">
                                <label class="font-color-general mr-2">Option 4</label>
                            </c:if>
                            <c:if test="${quiz.result == 4}">
                                <input type="checkbox" name="result" value="4" checked>
                                <label class="font-color-general mr-2">Option 4</label>
                            </c:if>
                            </td>
                            </tr>
                            <tr></tr>
                            <tr>
                                <td></td>
                                <td><input type="submit" value="Save"></td>
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
