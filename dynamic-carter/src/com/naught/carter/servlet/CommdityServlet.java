package com.naught.carter.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.naught.carter.model.Commdity;

public class CommdityServlet extends HttpServlet {

	/**
	 * alen
	 */
	private static final long serialVersionUID = -7968254999624671498L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doGet(req, resp);
		System.out.println("hello world");
		req.setAttribute("commdities", Commdity.commdities);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		super.doPost(req, resp);
	}

	
}
