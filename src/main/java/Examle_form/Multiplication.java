package Examle_form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mul")
public class Multiplication extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("name");
		long num1=Long.parseLong(req.getParameter("num1"));
		long num2=Long.parseLong(req.getParameter("num2"));
		long n=num1*num2;
		resp.getWriter().print("Multiplication "+name+" = "+n);
	}
}
