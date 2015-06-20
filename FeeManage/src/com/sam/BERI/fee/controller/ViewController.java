package com.sam.BERI.fee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.BERI.fee.service.UserService;

public class ViewController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UserService us=new UserService();
		HttpSession session =req.getSession(false);
		RequestDispatcher rd=null;
		if(session!=null){
			String accno=(String)session.getAttribute("acno1");
			int bal;
			try{
				bal=us.viewBalance(accno);
				req.setAttribute("balance", bal);
				session.setAttribute("userBalance",bal);
				rd=req.getRequestDispatcher("viewBalance.jsp");
			}
			catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
		rd.forward(req, resp);

		}
		
		
		
		
		
		
	}