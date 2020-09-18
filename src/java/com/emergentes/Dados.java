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
@WebServlet(name = "Dados", urlPatterns = {"/Dados"})
public class Dados extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Juego</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido!!!</h1>");
        out.println("<form action'' method= 'post' >");
       out.println(" Aprete el boton paraempezar a jugar ");
        out.println("<input type='submit'name='bton' value='Jugar'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        int c=0,s=0;
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Saludo</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido !!!!</h1>");
        out.println("<p>Para ganar el juego tiene que ser la suma de 7 o 11</p>");
        String bt=request.getParameter("bton");
      
        if(bt!=null){
            int dad1=(int)(Math.random()*6)+1;
            out.println("<table border-collapse: collapse>");
            out.println("<tr>");
            out.println("El dado uno es: <td> "+dad1+"</td>");
            out.println("</tr>");
            out.println("</table>");
       int dad2=(int)(Math.random()*6)+1;
          out.println("<table border-collapse: collapse>");
            out.println("<tr>");
            out.println("El dado uno es: <td> "+dad2+"</td>");
            out.println("</tr>");
            out.println("</table>");
            
          s=dad1+dad2;
        out.println("<table border-collapse: collapse>");
            out.println("<tr>");
            out.println("La suma es: <td> "+s+"</td>");
            out.println("</tr>");
            out.println("</table>");
           
            if(s==7 ||s==11){
              out.println("<h2>gano el juego!!!</2>");
            }
            else{
                out.println("<br>vuelva atras y intente de nuevo");
            }
            
       
        }
        out.println("</body>");
        out.println("</html>");
    }


}
