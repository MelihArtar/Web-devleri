package Upload;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/UserRegister")
public class UserRegister extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse response) throws IOException {

        String i = req.getParameter("ad");
        String j = req.getParameter("soyad");
        String k = req.getParameter("posta");
        String m = req.getParameter("sifre");

        PrintWriter out = response.getWriter();

        out.println("isminiz:" + i + "<br>");
        out.println("soyad:" + j + "<br>");
        out.println("mail:" + k + "<br>");
        out.println("sifre:" + m + "<br>");
       
        response.setContentType("text/html");         
        out.println("<html><body>");
        
        
        String userAgent = req.getHeader("User-Agent");
        String tarayiciModeli = "Bilinmiyor";

        if (userAgent != null) {
            if (userAgent.contains("Chrome")) {
                tarayiciModeli = "Google Chrome";
            } else if (userAgent.contains("Firefox")) {
                tarayiciModeli = "Mozilla Firefox";
            } else if (userAgent.contains("Edge")) {
                tarayiciModeli = "Microsoft Edge";
            } else if (userAgent.contains("Safari")) {
                tarayiciModeli = "Apple Safari";
            }
        }
        
        response.getWriter().println("<script>alert('Tarayıcı Modeli: " + tarayiciModeli + "');</script>");

    }

}
