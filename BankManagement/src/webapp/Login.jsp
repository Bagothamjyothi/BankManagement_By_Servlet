<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f0f2f5;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .login-container {
        background-color: white;
        padding: 30px 40px;
        border-radius: 10px;
        box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
        width: 300px;
        text-align: center;
    }
    h1 {
        margin-bottom: 20px;
        color: #333;
    }
    input[type="email"],
    input[type="password"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 5px;
        font-size: 14px;
    }
    input[type="submit"] {
        width: 100%;
        padding: 10px;
        background-color: #007BFF;
        border: none;
        color: white;
        font-size: 16px;
        border-radius: 5px;
        cursor: pointer;
    }
    input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>

<div class="logincontainer">
    <h1>Login Page</h1>
    <form action="login" method="post">
        <input type="email" name="email" placeholder="Enter Email" required ><br>
        <input type="password" name="password" placeholder="Enter Password" required minlength="5"><br>
        <input type="submit" value="Login">
    </form>
    <%if(request.getAttribute("loginerror")!=null) {%>
<p style="color:red"><%=request.getAttribute("loginerror") %></p>
<%} %>

</div>


</body>
</html>