package malli.gae.clockapp;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Clock_appServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
		Date date = new Date();
		String time = dateFormat.format(date);
		//System.out.println(time);
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello");
		resp.getWriter().println("Current time is "+time);
		
	}
}
