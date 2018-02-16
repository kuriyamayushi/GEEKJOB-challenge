
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
import static returnPackage.return4.ID;
import java.util.ArrayList;

/**
 *
 * @author guest1Day
 */
public class return5 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    public static String[] ID(String x) {
        //ArrayList<String> data5 = new ArrayList<String>();

        String[] data1 = {"1", "栗山", "1991/05/30", "和歌山"};
        String[] data2 = {"2", "内藤", null, "愛知"};
        String[] data3 = {"3", "森田", "1986/06/20", "滋賀"};

        //data5.add(data1.toString());
       // data5.add(data2.toString());
        //data5.add(data3.toString());
        
        
       
       // String[] data4 = new String[1];
        if ( x.equals ("1")) {
            return  data1;

        } else if ( x.equals("2")) {
            return  data2;

        } else if (x.equals("3")){
            return  data3;

        }else
        return null;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
             Integer limit = 2;
           
            //Integer limit = 2;
            
            int j = 0;
            for ( j =1 ; j<=limit ; j++){
                String[] data5 =ID(Integer.toString(j));
                
                
             int z = 0;   
            for (z=1 ; z<data5.length ;z++){
               
              if(data5[z] == null){
                  continue;
              }  
                
                out.print(data5[z]);
            } 
                
             //if (data5[j].equals  ID(data1[j];
            //ArrayList<String>の要素を取得して、（内側）配列に入れてあげる。
            
            //（内側）配列の各要素をループで一つ一つ取得してあげる
            
            }
            /*for (int j = 1; j < 2; j++) {
                if j
                        == out.print(kekka(j));
                //int []  = new int[1];

            }

            String[] kekka1 = ID("1");

            for (int i = 1; i < kekka1.length; i++) {
                if (kekka1[i] == null) {
                    continue;

                } else {
                    out.print(kekka1[i]);
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

            }*/
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
