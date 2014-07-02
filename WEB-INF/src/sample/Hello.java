package sample;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException {
    response.setContentType("text/html");
    PrintWriter out = response.getWriter();
    out.println(getHello());
  }

	public String getHello() {
    String var = "CAReward!!";
    String html = 
        "<!DOCTYPE html>"
      + "<html lang=\"en\">"
      + "<head>"
      + "<meta charset=\"UTF-8\">"
      + "<title>Hello " + var + "</title>"
      + "<style>"
      + "body { background-color: orange; }"
      + "</style>"
      + "</head>"
      + "<body>"
      + "<h1>Hello " + var + "!</h1>"
      + "</body>"
      + "</html>";
		return html;
	}
}
