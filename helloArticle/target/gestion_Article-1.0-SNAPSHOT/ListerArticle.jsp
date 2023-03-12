<%-- 
    Document   : ListerArticle
    Created on : 23 févr. 2023, 14:03:12
    Author     : dell
--%>
<%@page import="java.util.List"%>
<%@page import="Services.*"%>
<%@page import="Models.*"%>


<%@page import="Services.articleImp"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!  List<Article> lst;%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table border="1">
            <tr>
                <td>Id</td>
                <td>designation</td>
                <td>prix</td>
                <td>qte</td>
                <td colspan="2"><a href="TraitmantServlet?action=new">Ajouter Article</a></td>

            </tr>
            <%      lst=(List<Article>)request.getAttribute("lst");

for(Article a:lst) {

            %>
            <tr>
                <td><%= a.getId()%></td>
                <td><%= a.getDesignation()%></td>
                <td><%= a.getPrix()%></td>
                <td><%= a.getQte()%></td>
                <td colspan="2"><a href="TraitmantServlet?action=edit&id=<%=a.getId()%>">Modifier Article</a></td>
                <td colspan="2"><a href="TraitmantServlet?action=del&id=<%= a.getId()%>">Supprimer</a></td>



            </tr>
            <%        }

            %>
            </center>
        </table>    
    <%
        
    %>
        <a href="TraitmantServlet?action=hello">log out </a>

    </body>
</html>
