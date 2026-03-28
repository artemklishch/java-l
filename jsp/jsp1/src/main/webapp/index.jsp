<%@ page import="org.example.jsp1.FunUtils" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World" %> from <%= new java.util.Date() %>></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<br/>

<%--Expressions--%>
<p><%= "Hello world".toUpperCase() %>
</p>
<p>65 is less than 69? <%= 65 < 69 %>
</p>
<%--================--%>
<br/>

<%--Scrptlets--%>
<%
    for (int i = 0; i < 5; i++) {
        out.println("<br/>I love Java: " + i);
    }
%>
<%--==========--%>
<br/>

<%--Declarations--%>
<h5><%= makeItLower("HELLO WORLD") %>
</h5>
<%!
    String makeItLower(String value) {
        return value.toLowerCase();
    }
%>
<%--=======--%>
<br/>

<%--Java class from JSP--%>
<p>Let's have some fun: <%= FunUtils.makeItLower("HELLO HELLO HELLO") %>
</p>
<%--===========--%>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
</body>
</html>