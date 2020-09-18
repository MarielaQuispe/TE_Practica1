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
@WebServlet(name = "Cambio", urlPatterns = {"/Cambio"})
public class Cambio extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
               
         response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Cambio</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Cambio de divisas </h1>");
        out.println("<form action'' method='post'  >");
        out.println("Cantidad a convertir:");
        out.println("<input type='text ' name ='nom' id='idcan'>");
        out.println("<br><br>");
        out.println("Cambiar a:");
        out.println("<input type='submit' name='btn1' value='Dolares'>");
        out.println("<input type='submit' name='btn2' value='Bolivianos'>");
          out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        
            
        } 
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      float d=(float) 6.91;
         response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Edad</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Camvio de divisas </h1>");
        String num1=request.getParameter("nom");
        String bt1=request.getParameter("btn1");
        String bt2=request.getParameter("btn2");
        if(bt1!=null){
         float res=Float.parseFloat(num1)/d;
         out.println("el cambio de "+num1+" bolivianos a dolares sera de: "+res);
        }else if(bt2!=null){
           float res=Float.parseFloat(num1)*d;
         out.println("el cambio de "+num1+" dolares a bolivianos sera de: "+res);   
        }
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        }

}
