package com.sam.BERI.fee.service;

import java.sql.SQLException;
import java.util.*;

import com.sam.BERI.fee.Dto.RegDTo;
import com.sam.BERI.fee.Dto.TransferDto;
import com.sam.BERI.fee.dao.UserDao;


public class UserService {
	public static String userReg(RegDTo regdto) throws SQLException{
	//generating unique account no	
	Random rnum=new Random();
	int r=rnum.nextInt(1000)*3;
	String ss="BERI"+r;
	System.out.println(ss);
	regdto.setAccountNo(ss);
	
	UserDao ud=new UserDao();
	//calling UserDao save method by using reference variable and return the acno in ss
	 ss=ud.save(regdto);
		
		return ss;
		}
	
	public RegDTo userLogin(String accno, String pass) throws SQLException {
		UserDao dao=new UserDao();
		//calling UserDao userLogin method by using reference variable and return the acno and pass in dto reference variable
		RegDTo dto=dao.userLogin(accno,pass);

		return dto;

	}

	public int viewBalance(String accno) throws SQLException {
		UserDao ud=new UserDao();
		int bal=ud.viewBalance(accno);
		return bal;
	}
	public String updateUser(TransferDto tdto) throws SQLException{
		UserDao ud=new UserDao();
		
		Random tid=new Random();
		
		int r=tid.nextInt(1000)*3;
		String tID="Tid"+r;
		tdto.setTid(tID);
		ud.updateUser(tdto);
		return tID;
	}

	public ArrayList<TransferDto> miniStatement(String sDate, String lDate,String sacntno) throws SQLException {
       UserDao ud=new UserDao();
      ArrayList<TransferDto> list= ud.miniStatement(sDate,lDate,sacntno);
       return list;
	}


}

