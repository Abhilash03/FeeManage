package com.sam.BERI.fee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.BERI.fee.Dto.TransferDto;
import com.sam.BERI.fee.service.UserService;

public class StatementController extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String sDate=req.getParameter("sd");
		String lDate=req.getParameter("ld");
		RequestDispatcher rd=null;
		HttpSession session=req.getSession(true);
		if(session!=null){
			session.setAttribute("stdat", sDate);
			session.setAttribute("ltdat", lDate);
			String sacntno=(String)session.getAttribute("acno1");
			TransferDto tdto=new TransferDto();
			try{
			tdto.setStartDate(sDate);
			tdto.setLastDate(lDate);
			tdto.setSacno(sacntno);
			UserService us=new UserService();
		    ArrayList<TransferDto> list=us.miniStatement(sDate,lDate,sacntno);
		    
		    if(list!=null){
		    	    req.setAttribute("ls",list);
				    rd=req.getRequestDispatcher("displayStatement.jsp");
				    rd.forward(req, resp);
					
		    		
		    	}
		    }
		    
			catch(SQLException e){
				e.printStackTrace();
			}
			
		}
		
		
	}

}
