<%-- 
    Document   : ManageQuiz
    Created on : Jun 2, 2021, 8:48:59 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <link href="css/ManageQuiz.css" rel="stylesheet" type="text/css"/>
        <title>Manage Quiz</title>
    </head>
    <body>
        <div class="container">
            <%@include file="/component/header.jsp" %> 
            <div class="main">
                <%@include file="component/menu.jsp" %>
                <div class="main-area ml-2 mr-2">
                    <table class="mb-6 mt-2">
                        <c:if test="${hmQuiz.isEmpty()}">
                            <h5 class="mt-6 ml-3">${sessionScope.user.user} hasn't created any question</h5>
                        </c:if>
                        <c:forEach items="${hmQuiz}" var="entry">
                            <tr>
                                <td class="row-questionId" colspan="2">
                                    <div class="ml-2">Number of question: 
                                        <lable class="font-blue">${entry.key}</lable>
                                    </div>
                                </td>
                            </tr>
                            <tr>
                                <td class="col-left">
                                    <div class="ml-2  font-blue">
                                        Question:
                                    </div>
                                </td>
                                <td class="col-right">
                                    <div class="font-blue">DateCreated</div>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <div ><a class="font-color-general ml-2" href="edit?id=${entry.key}">${entry.value.question}</a></div>
                                </td>
                                <td><div class="font-color-general">${entry.value.getDateFormat()}</div></td>
                            </tr>
                        </c:forEach>
                    </table>
                    
                    <!--paging-->
                    <div class="paging">
                        <c:forEach begin="1" end="${endPage}" var="i">
                            <a class="page-number" href="manageQuiz?indexPage=${i}">${i}</a>
                        </c:forEach>
                    </div>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>
    </body>
</html>
