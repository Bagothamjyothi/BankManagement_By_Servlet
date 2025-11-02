<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Account Creation</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f7f7f7;
    }
    table {
        background-color: white;
        border-radius: 10px;
        padding: 20px;
        box-shadow: 0px 0px 10px rgba(0,0,0,0.1);
    }
    td {
        padding: 8px 12px;
    }
    input[type="text"],
    input[type="password"],
    input[type="email"],
    input[type="tel"] {
        width: 200px;
        padding: 6px;
        border: 1px solid #ccc;
        border-radius: 5px;
    }
    button {
        background-color: #007BFF;
        color: white;
        border: none;
        padding: 8px 16px;
        border-radius: 5px;
        cursor: pointer;
    }
    button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
 <form action="acreation">
        <center>
        <h2>Account Creation Form</h2>
        <table>
            <tr>
                <td>Customer Name:</td>
                <td><input type="text" placeholder="Enter Name" required name="customername"></td>
            </tr>
            <tr>
                <td>Account Number:</td>
                <td><input type="text" placeholder="Enter Account Number" required  name="accountno" minlength="12" ></td>
            </tr>
            <tr>
                <td>Branch:</td>
                <td><input type="text" placeholder="Enter Branch" required  name="branch"></td>
            </tr>
            <tr>
                <td>Phone No:</td>
                <td><input type="tel" placeholder="Enter Phone No" required name="phoneno" minlength="10"></td>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="email" placeholder="Enter Email" required name="email"></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type="password" placeholder="Enter Password" required name="password" minlength="5"></td>
            </tr>
           
            <tr>
                <td>Gender:</td>
                <td>
                    <input type="radio" id="male" name="gender"  value="male" >
                    <label for="male">Male</label>

                    <input type="radio" id="female" name="gender" value="female" >
                    <label for="female">Female</label>

                    <input type="radio" id="other" name="gender"  value="other" >
                    <label for="other">Other</label>
                </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <button type="submit">Submit</button>
                </td>
            </tr>
        </table>
        
        <%if(request.getAttribute("exist")!=null){ %>
        <p style="color:red"><%=request.getAttribute("exist") %>
        <% }%>
        </center>
    </form>
</body>
</html>