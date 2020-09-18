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
@WebServlet(name = "Edad", urlPatterns = {"/Edad"})
public class Edad extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title> Edad</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Formulario Para Saber Edad Actual </h1>");
        out.println("<form action'' method= 'post' >");
        out.println("Nombre: ");
        out.println("<input type='text ' name ='nom'>");
        out.println("<br><br>");
        out.println("Año de nacimiento: ");
        out.println("<input type='text' name ='ed'>");
         out.println("<br>");
        out.println("<input type='submit'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
      
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
         String num1 =request.getParameter("nom");
        String  num2 =request.getParameter("ed");
        int res1 = 2020-Integer.parseInt(num2);
        
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Saludo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1> Su Edada Actuak</h1>");
        out.println("<p>Usted "+ num1+ " tiene la edad de " + res1+"</p>");
        out.println("</body>");
        out.println("</html>");
    }


}
