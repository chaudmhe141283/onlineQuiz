<%-- 
    Document   : TakeQuizStep2
    Created on : May 25, 2021, 12:05:14 AM
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
                    <div class="ml-2 mt-4">
                        Welcome <label class="font-blue">${sessionScope.user.user}</label>
                    </div>
                    <div class="time-remaining ml-2 mb-4 font-color-general">
                        Time Remaining:<label class="font-red"> <span id="countdown"></span>  </label>
                    </div>
                    <div class="ml-2 font-color-general">
                        ${sessionScope.lastQuestion.question}
                    </div>
                    <form class="mb-10" action="QuizControl" method="get">
                        <input class="ml-2" type="checkbox" name="answer" value="option1">
                        <label class="font-color-general"> ${sessionScope.lastQuestion.option1} </label><br/>
                        <input class="ml-2" type="checkbox" name="answer" value="option2">
                        <label class="font-color-general"> ${sessionScope.lastQuestion.option2} </label><br/>
                        <input class="ml-2" type="checkbox" name="answer" value="option3">
                        <label class="font-color-general"> ${sessionScope.lastQuestion.option3} </label><br/>
                        <input class="ml-2" type="checkbox" name="answer" value="option4">
                        <label class="font-color-general"> ${sessionScope.lastQuestion.option4} </label><br/>
                        <input class="btn-next" type="submit" value="Next">
                    </form>
                </div>
            </div>
            <div class="footer">

            </div>
        </div>

    </body>
    <script>

        <% HttpSession ses = request.getSession(); %>

        function countdownTimer() {
            var time = '<%=ses.getAttribute("time")%>';
            const totalTime = +new Date(time) - +new Date();
            let remaining = "Time's up!";

            var minutes = Math.floor((totalTime / 1000 / 60) % 60);
            if (minutes < 10)
                minutes = '0' + minutes;
            
            var seconds = Math.floor((totalTime / 1000) % 60);
            if (seconds < 10)
                seconds = '0' + seconds;
            
            if (totalTime > 0) {
                const parts = {
                    minutes: minutes,
                    seconds: seconds
                };
                
                //match all values in map to a string
                remaining = Object.keys(parts)
                        .map(i => {
                            if (!parts[i])
                                return;
                            return '' + parts[i];
                        })
                        .join(" : ");
            }

            document.getElementById("countdown").innerHTML = remaining;
        }

        countdownTimer();
        setInterval(countdownTimer, 1000);
    </script>
</html>
