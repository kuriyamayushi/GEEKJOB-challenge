package jums;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author hayashi-s
 */
public class UpdateResult extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession();

        //ArrayList<UserDataDTO>  a = (ArrayList<UserDataDTO>)session.getAttribute("resultData");
        UserDataDTO  a = (UserDataDTO) session.getAttribute("resultData");
        //UserDataDTO b = a.get(0);
        int id = a.getUserID();
        UserDataBeans changeData = new UserDataBeans();

        changeData.setName(request.getParameter("name"));
        changeData.setYear(request.getParameter("year"));
        changeData.setMonth(request.getParameter("month"));
        changeData.setDay(request.getParameter("day"));
        changeData.setType(request.getParameter("type"));
        changeData.setTell(request.getParameter("tell"));
        //changeData.setuserID(request.getParameter("comment"));
       //changeData.getuserID(id);
        
        UserDataDTO CD = new UserDataDTO();
        CD.setUserID(id);
        
        changeData.UD2DTOMapping(CD);
        // ArrayList<UserDataDTO> ChangeData =
         UserDataDAO.getInstance().update(CD);

        session.setAttribute("ChangeData", changeData);

        UserDataDAO.getInstance().update(CD);

        System.out.println("Session updated!!");

        request.getRequestDispatcher("/updateresult.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateResult.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateResult.class.getName()).log(Level.SEVERE, null, ex);
        }
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
