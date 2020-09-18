/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Genoveva
 */
@WebServlet(name = "Operadores", urlPatterns = {"/Operadores"})
public class Operadores extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Operadores </title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Operadores</h1>");
        out.println("<form action'' method= 'post' >");
        out.println("Numero 1:");
        out.println("<input type='text' name ='num1' id='idnum1' >");
         out.println("Numero 2:");
        out.println("<input type='text' name ='num2' id='idnum2' >"+"<br>");
        out.println("<input type='submit' name='bot1' value='Sumar'>");
        out.println("<input type='submit' name='bot2' value='Restar'>");
        out.println("<input type='submit' name='bot3' value='Multiplicar'>");
        out.println("<input type='submit' name='bot4' value='Division'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Operadores</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido !!!!</h1>");
        String num1=request.getParameter("num1");
        String num2=request.getParameter("num2");
        String btsum=request.getParameter("bot1");
        String btres=request.getParameter("bot2");
        String btmul=request.getParameter("bot3");
        String btdiv=request.getParameter("bot4");
        if(btsum!=null){
            int res=Integer.parseInt(num1)+Integer.parseInt(num2);
            out.println("la suma de "+num1+" + "+num2+" es:  "+res);
        }else if(btres!=null){
             int res=Integer.parseInt(num1)-Integer.parseInt(num2);
            out.println("la resta de "+num1+" - "+num2+" es:  "+res);
        }else if(btmul!= null){
           int res=Integer.parseInt(num1)*Integer.parseInt(num2);
            out.println("la multiplicacion de "+num1+" * "+num2+" es:  "+res);  
        }else if(btdiv!= null){
           int res=Integer.parseInt(num1)/Integer.parseInt(num2);
            out.println("la division de "+num1+" / "+num2+" es:  "+res);  
        }
        out.println("</body>");
        out.println("</html>");
    }


}
