<%@page import="Models.Article"%>
<%@page import="Services.articleImp"%>
<%!
    String action;
    double prix;
    int qte;
    String designation;
    articleImp imp;
    int id;

%>
<%
    imp = new articleImp();
    action = request.getParameter("action");

    switch (action) {
        case "add":
            prix = Double.parseDouble(request.getParameter("prix"));
            qte = Integer.parseInt(request.getParameter("qte"));
            designation = request.getParameter("designation");
            imp.addArticle(new Article(0, designation, prix, qte));
            out.println("add");
            response.sendRedirect("ListerArticle.jsp");

            break;
        case "edit":
            id = Integer.parseInt(request.getParameter("id"));
            prix = Double.parseDouble(request.getParameter("prix"));
            qte = Integer.parseInt(request.getParameter("qte"));
            designation = request.getParameter("designation");
            imp.updateArticle(new Article(id,designation,prix,qte));



             response.sendRedirect("ListerArticle.jsp");       
            break;
            case "del":
                        id = Integer.parseInt(request.getParameter("id"));
                        imp.deleteArticle(id);
                         response.sendRedirect("ListerArticle.jsp");       




            break;
        default:
            out.println("hello");
    }

%>