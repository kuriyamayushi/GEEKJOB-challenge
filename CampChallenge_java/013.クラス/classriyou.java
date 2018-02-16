/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

class Country extends City {

    //public String name = "";

    //public int zinkou = 0;

public void Cut(){
this.name = "";
this.zinkou = 0;
}

//pw.print(Cut);
}
//クラス宣言
class City{
//クラスに持たしたい情報
    public String name = "a";
    public int zinkou = 0;

    //int i = 0;
    public void setInformation(String a, int i) {
//メソッドの中｛｝内まで受け取った情報が反映されるため｛｝外に持ち出す場合はthisを
//用いて宣言する。
        this.name = a;
        this.zinkou = i;
        //public static void main(String(n) , int(i));
    }
     public void printInformataion(PrintWriter pw) {
     pw.print("栗山シティの"+this.name+"さんの人口は" + this.zinkou+"人です。");
    }
    
    /* void printInformataion2(PrintWriter pw) {
     pw.print("栗山シティの"+this.name+"さんの人口は" + this.zinkou+"人です。");
    }*/


}

/**
 *
 * @author guest1Day
 */
public class classriyou extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
//プログラミングでは抽象的なものに名前をつける必要あり
//
   //        City kuriyama = new City();
           Country nippon = new Country();
            //name.setmain(out, "本田", 100000);
            //呼び出すときは主語+述語のように例）kuriyamaのprintInforを（）をいれて呼び出す
           
            nippon.setInformation("本田",10000);
            nippon.printInformataion(out);
            
            //kuriyama.printInformation2(out);
            nippon.Cut();
            nippon.printInformataion(out);
            
            
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
