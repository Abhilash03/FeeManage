package com.sam.BERI.fee.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sam.BERI.fee.Dto.RegDTo;
import com.sam.BERI.fee.service.UserService;

public class LoginController extends HttpServlet {
	/*public static void main(String[] args) {
		LoginController nn= new LoginController();
		System.out.println("hello");
	}*/
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String accno=req.getParameter("an");
		String pass=req.getParameter("ps");
		RegDTo r=null;
		UserService us=new UserService();
		try {
			//getting the accno and pass in r of type RegDTo
			r=us.userLogin(accno,pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd=null;
		HttpSession session=null;
        if(r!=null){
        	//we r creating a session object
		session=req.getSession(true);
		//fetching the firstname and lastname by using RegDTo reference
		String nm=r.getFirstName()+" "+r.getLastName();
		//fetching accountno by using RegDTo reference
		String acno=r.getAccountNo();
		//addind firstname,lastname and accountno in the session object by using setAttribute
		session.setAttribute("name", nm);
		session.setAttribute("acno1", acno);
		//forwarding the request to the display.jsp
		rd=req.getRequestDispatcher("display.jsp");
        }
      else
        {
		  req.setAttribute("msg", "Invalid AccountNo");
		  rd=req.getRequestDispatcher("Login.jsp");
       }
       rd.forward(req, resp);


}
}

