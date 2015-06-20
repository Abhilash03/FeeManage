package com.sam.BERI.fee.controller;

import java.io.IOException;
import java.sql.*;
import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sam.BERI.fee.Dto.RegDTo;
import com.sam.BERI.fee.service.UserService;


public class RegController extends GenericServlet {
	
	 
		

	@Override
	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		//fetching the UI data using getParameter
		String fname=req.getParameter("fn");
		String lname=req.getParameter("ln");
		String add=req.getParameter("ad");
		String pno=req.getParameter("pn");
		String gender=req.getParameter("sex");
		String dob=req.getParameter("dt");
		String Iid=req.getParameter("id");
		int Initialid=Integer.parseInt(Iid);
		String actype=req.getParameter("at");
		String password=req.getParameter("ps");
		String cpass=req.getParameter("cp");
		
		RegDTo dto = new RegDTo();
		
		//Setting the value using dto object reference
		dto.setFirstName(fname);
		dto.setLastName(lname);
		dto.setAddress(add);
		dto.setPhoneno(pno);
		dto.setGender(gender);
		dto.setDob(dob);
        dto.setAcType(actype);
        dto.setIniDeposite(Initialid);
        dto.setPassword(password);
        dto.setConfirmPass(cpass);
        
        
        //getting the account no by using userserivce
        String accno=null;
        try{
        	accno=UserService.userReg(dto);
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        //Forwarding the request to the account.jsp
        RequestDispatcher rd=null;
    	if(accno!=null)
    	{
    		//setting programetic data by using setAttribute    		
    	    req.setAttribute("acc", accno);
    	   rd=req.getRequestDispatcher("account.jsp");
    	
    	}
    	else{
    		req.setAttribute("err","Please Enter the value");
    		rd=req.getRequestDispatcher("Registration.jsp");
    	}
    	
    	rd.forward(req, res);
    	
    	}
	}

