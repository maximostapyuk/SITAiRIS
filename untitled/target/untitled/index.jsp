<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="library.SAX" %>


<html>
<body>
<table border="1px solid black">
    <thead>
    <tr>
        <th>Название</th>
        <th>Автор</th>
        <th>Дата написания</th>
        <th>Код</th>
        <th>Стоимость</th>
    </tr>

    </thead>
<%
    SAX sax=new SAX();
    sax.readInfo();
    for (int i = 0; i < sax.getLibrary().size(); i++) {
%>
<tbody>
<tr>
    <td>
        <%=sax.getLibrary().get(i).getTitle()%>
    </td>
    <td>
        <%=sax.getLibrary().get(i).getAuthor()%>
    </td>
    <td>
        <%=sax.getLibrary().get(i).getDate()%>
    </td>
    <td>
        <%=sax.getLibrary().get(i).getCode()%>
    </td>
    <td>
        <%=sax.getLibrary().get(i).getCost()%>
    </td>
</tr>
<%
    }
%>
</tbody>
</table>

</body>
</html>
