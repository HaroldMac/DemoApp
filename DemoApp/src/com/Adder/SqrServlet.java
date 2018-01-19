package com.Adder;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SqrServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{

		int value = (int)req.getAttribute("sum");
		
		int sqr = value*value;
		

		
		
		PrintWriter out = res.getWriter();
		out.print("The Square is: " + sqr);
	}
}
