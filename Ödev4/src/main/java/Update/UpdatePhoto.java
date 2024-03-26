package Update;

import java.io.IOException;
import java.nio.file.Paths;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;


@MultipartConfig(
  fileSizeThreshold = 1024 * 1024 * 1, // 1 MB
  maxFileSize = 1024 * 1024 * 10,      // 10 MB
  maxRequestSize = 1024 * 1024 * 100   // 100 MB
)
public class UpdatePhoto extends HttpServlet {

  public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	  Part filePart = request.getPart("file");
	    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString();
	    String desktopPath = System.getProperty("user.home") + "\\Desktop\\";

	    filePart.write(desktopPath + fileName);
    response.getWriter().print("Resim Basariyla Masaustune Yuklendi.");
  }

}
