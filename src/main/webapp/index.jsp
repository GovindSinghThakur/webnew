<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  
    pageEncoding="ISO-8859-1"%>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Login Application</title>  
</head>  
<body>  
        <form action=LoginServlet>
            <table border=1>
                <tr>
                    <th colspan="2">Login Form</th>
                </tr>
                <tr>
                    <td>Enter your UserId:</td>
                    <td><input type=text name=username></td>
                </tr>
                <tr>
                    <td>Enter your Password:</td>
                    <td><input type=password name=password></td>
                </tr>
                <tr>
                    <td><input type=submit value=submit name="submit"></td>
                    <td><input type=reset value=refresh name="refresh"></td>
                </tr>
            </table>
        </form>
</body>  
</html>  