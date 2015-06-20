package com.sam.BERI.fee.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.BERI.fee.Dto.RegDTo;
import com.sam.BERI.fee.Dto.TransferDto;
import com.sam.BERI.fee.dao.UserDao;
import com.sam.BERI.fee.service.UserService;

public class TransferController extends HttpServlet {
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String raccno=req.getParameter("acc");
		String amount=req.getParameter("amt");
		String remark=req.getParameter("rm");
		String transType=req.getParameter("transtype");
		int ramont=Integer.parseInt(amount);
		
		
	     RequestDispatcher rd=null;
	     HttpSession session=req.getSession(false);
	     if(session!=null){
	    	 session.setAttribute("tamt", ramont);
	    	 session.setAttribute("recacno",raccno);
	    	 String sacntno=(String)session.getAttribute("acno1");
	 		
	    	 TransferDto tdto=new TransferDto();
	    	 tdto.setRacno(raccno);
	    	 tdto.settAmt(ramont);
	    	 tdto.setSacno(sacntno);
	    	 tdto.setRemark(remark);
	    	 DateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
	    	 Date date=new Date();
	    	 String rdate=dateFormat.format(date);
	    	 tdto.setDate(rdate);
	    	 DateFormat timeFormat=new SimpleDateFormat("HH:mm:ss");
				Date time=new Date();
				String rtime=timeFormat.format(time);
				tdto.setTime(rtime);
				tdto.setTransType(transType);
	    	 rd=req.getRequestDispatcher("viewtrans.jsp");	
		        rd.forward(req, resp);
	    	UserService us=new UserService();
	    	try {
				us.updateUser(tdto);
			} catch (SQLException e) {
				e.printStackTrace();
			}
	    	
	      
	    	
	    	 
	    	 
	     }
	    	 
	    	}
	}
