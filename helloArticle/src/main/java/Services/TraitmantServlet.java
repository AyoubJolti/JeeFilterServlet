/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Services;

import Models.Article;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dell
 */
@WebServlet("/TraitmantServlet")
public class TraitmantServlet extends HttpServlet {

    String action = "Lister";
    double prix;
    int qte;
    String designation;
    PrintWriter out;
    int id;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TraitmantServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TraitmantServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("action") != null) {
            action = request.getParameter("action");
        } else {
            action = "Lister";
        }
        System.out.println(" hello =" + request.getParameter("action"));
        out = response.getWriter();
        //out.print(request.getParameter("action"));

        articleImp imp = new articleImp();
        List<Article> lst = imp.getAllArticle();

        switch (action) {
            case "hello":
                System.out.println("logout");
                break;
            case "Login":
                out.print("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
                System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
                
                break;
            case "LoginForm":
                request.getRequestDispatcher("LoginForm.jsp").forward(request, response);

                break;

            case "Lister":
                request.setAttribute("lst", imp.getAllArticle());
                request.getRequestDispatcher("ListerArticle.jsp").forward(request, response);
                break;
            case "add":
                System.out.println("add e");
                prix = Double.parseDouble(request.getParameter("prix"));
                qte = Integer.parseInt(request.getParameter("qte"));
                designation = request.getParameter("designation");
                imp.addArticle(new Article(0, designation, prix, qte));
                request.setAttribute("lst", imp.getAllArticle());
                action = "lister";
                request.getRequestDispatcher("ListerArticle.jsp?action=lister").forward(request, response);
                break;
            case "new":

                request.getRequestDispatcher("ArticleForm.jsp?type=add").forward(request, response);

                break;
            case "del":
                id = Integer.parseInt(request.getParameter("id"));
                imp.deleteArticle(id);
                request.setAttribute("lst", imp.getAllArticle());

                request.getRequestDispatcher("ListerArticle.jsp").forward(request, response);

                out.print("hello");
                break;
            case "edit":
                id = Integer.parseInt(request.getParameter("id"));
                request.getRequestDispatcher("ArticleForm.jsp?type=edit&id=" + id).forward(request, response);

                break;
            case "update":
                id = Integer.parseInt(request.getParameter("id"));
                prix = Double.parseDouble(request.getParameter("prix"));
                qte = Integer.parseInt(request.getParameter("qte"));
                designation = request.getParameter("designation");
                imp.updateArticle(new Article(id, designation, prix, qte));
                request.setAttribute("lst", imp.getAllArticle());
                request.getRequestDispatcher("ListerArticle.jsp").forward(request, response);
                break;

            default:
                request.setAttribute("lst", imp.getAllArticle());
                request.getRequestDispatcher("LoginForm.jsp").forward(request, response);

                break;

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
