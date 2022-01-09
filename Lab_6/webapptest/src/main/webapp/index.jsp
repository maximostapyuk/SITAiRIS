<%@ page import="org.w3c.dom.Document"%>
<%@ page import="org.w3c.dom.NodeList"%>
<%@ page import="org.w3c.dom.Element"%>
<%@ page import="javax.xml.parsers.DocumentBuilder"%>
<%@ page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@ page import="java.io.IOException"%>
<%@ page import="org.xml.sax.SAXException"%>
<%@ page import="javax.xml.parsers.ParserConfigurationException"%>
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
        out.println(string+"<br>");
}
%>
</body>
</html>
