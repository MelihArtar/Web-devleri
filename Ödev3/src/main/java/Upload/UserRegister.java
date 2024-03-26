package Upload;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UserRegister extends HttpServlet {          
	public void doGet( HttpServletRequest req, HttpServletResponse res) throws IOException {

		String i = req.getParameter("ad");
		String j = req.getParameter("soyad");
		String k = req.getParameter("posta");
		String m = req.getParameter("sifre");
		
		PrintWriter out=res.getWriter();
		
		out.println("isminiz:"+i);
		out.println("soyad:"+j);
		out.println("mail:"+k);
		out.println("sifre:"+m);
		
	}
	
}




