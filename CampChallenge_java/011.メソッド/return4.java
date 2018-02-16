/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnPackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author guest1Day
 */
public class return4 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet responserse
     * @throws ServletException if a vlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String[] ID(String x) {

        String[] data1 = {"1", "栗山", "1991/05/30", "和歌山"};
        String[] data2 = {"2", "内藤", null, "愛知"};
        String[] data3 = {"3", "森田", "1986/06/20", "滋賀"};
        
        String[] data4 = new String[1];
        if (x == "1") {
            data4 = data1;

        } else if (x == "2") {
            data4 = data2;

        } else if (x == "3") {
            data4 = data3;

        }
        return data4;
    }
    //int i = 0;
    //for (i = 1; i < data1.length; i++) {
    //}

    //for (i = 1; i < data2.length; i++) {
    // if (i == 2) {
    //continue;
    //}
    // }
    // for (i = 1; i < data3.length; i++) {
    // }
    // return (data1[i] + data2[i] + data3[i]);
    //}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int i = 0;
            
            
            
            
            
            
            
            String[] kekka = ID("1");

            for (i = 1; i < kekka.length; i++) {
                if (kekka[i] == null) {
                    continue;

                } else {
                    out.print(kekka[i]);
                }
            }
            
            String[] kekka2 = ID("2");

            
            for (i = 1; i < kekka2.length; i++) {
                if (kekka2[i] == null) {
                    continue;

                } else {
                    out.print(kekka2[i]);
                }
            }
            
            String[] kekka3 = ID("3");

            for (i = 1; i < kekka3.length; i++) {
                if (kekka3[i] == null) {
                    continue;

                } else {
                    out.print(kekka3[i]);
                }
            }
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
        processRequest(request, response);
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
        processRequest(request, response);
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
