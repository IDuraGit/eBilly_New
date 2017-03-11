/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.*;

import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {
        PrintWriter out = res.getWriter();

        MusicPlay musicPlay=new MusicPlay();
        
        
        
        
        musicPlay.music("audio.wav");
        
        musicPlay.music("carlos.wav");
        
      
        
        
        

    out.println("<html>");
    out.println("<head>");
    out.println("<title>Hola</title>");
    out.println("</head>");
    out.println("<body bgcolor=\"white\">");
    
     out.println("<a href=\"page2.html\">");
     out.println("Go to code");
     out.println("</a>");
    
    out.println("</body>");
    out.println("</html>");
        
        
       
        out.close();
    }
}
