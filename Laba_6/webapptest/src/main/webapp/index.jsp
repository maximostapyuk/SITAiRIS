<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="library.SAX" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Библиотека</title>
</head>
<body>

<% SAX.readInfo();
    for (int i=0;i<SAX.books.size();i++){
        String string=new String(SAX.books.get(i).toString());
        out.write();
    }
%>
</body>
</html>