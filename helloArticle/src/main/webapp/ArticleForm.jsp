<%-- 
    Document   : ArticleForm
    Created on : 23 févr. 2023, 14:20:56
    Author     : dell
--%>

<%@page import="Models.Article"%>
<%@page import="Services.articleImp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! 
int id;
String type;
articleImp imp;
String des;
int qte;
double prix;
Article a;
String action;
%>
<%
imp=new articleImp();
type =request.getParameter("type");
imp=new articleImp();
if(type!=null&&type.equalsIgnoreCase("edit")){
id=Integer.parseInt(request.getParameter("id"));
a=imp.getArticleById(id);
des=a.getDesignation();
prix=a.getPrix();
qte=a.getQte();
action="update";

    }
    else
    {
    action="add";

    des="";
    prix=0;
    qte=0;
    id=0;
    }


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <form action="TraitmantServlet?action=<%=action%>" method="post"> 
                     <input type="hidden" value="<%=id%>" name="id">
   
    <table>
        
        <tr>
            <td>designation</td>
            <td><input type="text" name="designation" placeholder="designation" value="<%=des%>"></td>

        </tr>
        <tr>
            <td>prix</td>
            <td><input type="text" name="prix" placeholder="prix"  value="<%=prix%>"></td>

        </tr>
        <tr>
            <td>qte</td>
            <td><input type="text" name="qte" placeholder="qte" value="<%=qte%>"></td>

        </tr>
        <tr>
            <td><input type="reset" value="reset"></td>
            <td><input type="submit" value="submit"></td>

        </tr>
    </table>
</form>
    </body>
</html>
