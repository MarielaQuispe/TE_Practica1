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
@WebServlet(name = "Matriz", urlPatterns = {"/Matriz"})
public class Matriz extends HttpServlet {

 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Matriz</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido</h1>");
        out.println("<form action'' method= 'post' >");
        out.println("tamaño de Matriz");
        out.println("<input type='text' name ='tama' id='tamaño'>");
         out.println("<input type='submit' value='Procesar'>");
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
        out.println("<title>Matriz</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Bienvenido !!!!</h1>");
        String tam= request.getParameter("tama");
        int t=Integer.parseInt(tam);
        int valor=0,a=1;
        int mat[][]=new int[t][t]; 
        for (int j = 1; j<=t; j++) {
        for (int i = a; i <=t; i++) {
            mat[a][i]=valor;
            valor++;
        }for (int i = a+1; i <=t; i++) {
             mat[a][i] =valor;
            valor++;
            }
        for (int i = t; i>=a-1; i--) {
            mat[t][i]=valor;
            valor++;
        }
        for (int i = t-1; i>=a+1; i--) {
            mat[i][a]=valor;
            valor++;
        }
        a++;t--;
            
        } 
        for (int i = 1; i <= mat.length; i++) {
            for (int j = 1; j <= mat.length; j++) {
               out.print(mat[i][j]+" / "); 
            }
            
        }
        
        out.println("</body>");
        out.println("</html>");
    }


}
