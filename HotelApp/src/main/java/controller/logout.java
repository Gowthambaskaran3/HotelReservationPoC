package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class logout extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession();
		String uname = (String) session.getAttribute("username");
		System.out.println(uname);
		session.removeAttribute("username");
		session.removeAttribute("password");
		session.invalidate();
		out.print("You are successfully logged out!");
		out.close();
		}
	}
