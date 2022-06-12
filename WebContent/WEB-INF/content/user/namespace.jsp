<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>namespace test</title>
</head>
<body bgcolor="blue">
<h1>NameSpace Test</h1>


<s:form action="/product/getDetails">
    <s:submit value="get product details"/>
</s:form>

<s:form action="/user/getDetails">
    <s:submit value="get user details"/>
</s:form>
</body>
</html>