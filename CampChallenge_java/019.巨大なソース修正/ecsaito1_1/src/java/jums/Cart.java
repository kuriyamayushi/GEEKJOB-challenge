/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author teruhisashibuya
 */
@WebServlet("/Cart")
public class Cart extends HttpServlet {

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
        
        HttpSession hs = request.getSession();
        UserDataBeans userInfo = (UserDataBeans)hs.getAttribute("userInfo");
        
        if (userInfo == null){
          //ログインしていないのでログイン画面へ
          String Cart_EM = "カート画面への移動はログインが必要です";
          hs.setAttribute("Cart_EM", Cart_EM);
          RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
          dispatcher.forward(request,response);
          
        }else{
          //ログインしているのでそのままcart.jspへフォワード 
          RequestDispatcher dispatcher = request.getRequestDispatcher("cart.jsp");
          dispatcher.forward(request,response);
          
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
        //processRequest(request, response);
        
        //「カート画面へ」のリンクをクリックした時の処理
        //1.ログインしているか否かを判断
        request.setCharacterEncoding("UTF-8");
        HttpSession hs = request.getSession();
        UserDataDTO userInfo = (UserDataDTO)hs.getAttribute("userInfo");
        request.getParameter("removeInstance");
        
        if (userInfo == null){
          //ログインしていないのでログイン画面へ
          String Cart_EM = "カート画面への移動はログインが必要です";
          hs.setAttribute("Cart_EM", Cart_EM);
          RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
          dispatcher.forward(request,response);
          
        }else{
            
          if (request.getParameter("removeInstance") != null){
            String SuserID = String.valueOf(hs.getAttribute("userID"));
            ArrayList<SearchResultBeans> UserCart = (ArrayList<SearchResultBeans>)hs.getAttribute(SuserID+"UserCart");
            int instanceID = Integer.parseInt(request.getParameter("removeInstance"));
            UserCart.remove(instanceID);
            hs.setAttribute(SuserID+"UserCart", UserCart);
          }
                  
          //ログインしているのでそのままcart.jspへフォワード 
          RequestDispatcher dispatcher = request.getRequestDispatcher("/cart.jsp");
          dispatcher.forward(request,response);
          
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
        //processRequest(request, response);
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