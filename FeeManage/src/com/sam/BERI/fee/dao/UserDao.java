package com.sam.BERI.fee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.sam.BERI.fee.Dto.RegDTo;
import com.sam.BERI.fee.Dto.TransferDto;
import com.sam.BERI.fee.utility.Singleton;

public class UserDao {
	
	PreparedStatement pstmt=null;
	public String save(RegDTo r) throws SQLException{
		Singleton s=Singleton.getSingleton();
		
		Connection con=s.getConnection();
		String insertQry="insert into feemanage.user values(?,?,?,?,?,?,?,?,?,?,?)";
		
			pstmt=con.prepareStatement(insertQry);
			pstmt.setString(1, r.getFirstName());
			pstmt.setString(2, r.getLastName());
			pstmt.setString(3, r.getAddress());
			pstmt.setString(4,r.getPhoneno());
			pstmt.setString(5, r.getGender());
			pstmt.setString(6,r.getDob());
			pstmt.setInt(7,r.getIniDeposite());
			pstmt.setString(8,r.getPassword());
			pstmt.setString(9, r.getConfirmPass());
			pstmt.setString(10, r.getAcType());
			pstmt.setString(11, r.getAccountNo());
			int num=pstmt.executeUpdate();
			String accno;
			if(num==0){
				accno=null;
			}
			else{
				accno=r.getAccountNo();
			}
			return accno;
		
		
	}
	
	public RegDTo userLogin(String accno, String pass) throws SQLException {
		String qry="select * from feemanage.user where accontNo=? and password=?";
		RegDTo dto=null;
        Singleton s=Singleton.getSingleton();
		Connection con=s.getConnection();
		PreparedStatement pstmt1=con.prepareStatement(qry);
		pstmt1.setString(1, accno);
		pstmt1.setString(2, pass);
		ResultSet rs=pstmt1.executeQuery();
		if(rs.next()){
			
			String fn=rs.getString("firstname");
			String ln=rs.getString("lastname");
			String acno=rs.getString("accontNo");
			dto=new RegDTo();
			dto.setFirstName(fn);
			dto.setLastName(ln);
			dto.setAccountNo(acno);
		}
		
		return dto;
	}

	public int viewBalance(String accno) throws SQLException {
		String qry="select initialdeposite from feemanage.user where accontNo=?";
		int bal=0;
		Singleton st=Singleton.getSingleton();
		Connection con=st.getConnection();
		PreparedStatement pstmt=con.prepareStatement(qry);
		pstmt.setString(1, accno);
		ResultSet rs= pstmt.executeQuery();
		 if(rs.next())
		 {
				
					bal =rs.getInt("initialdeposite");
		} 
		
		else{

		}

		return bal;
	}
	public TransferDto updateUser(TransferDto t) throws SQLException{
		
		String qry="update feemanage.user set initialdeposite=initialdeposite-? where accontNo=?";
		String qry1="update feemanage.user set initialdeposite=initialdeposite+? where accontNo=?";
		String insertQry="insert into feemanage.trans values(?,?,?,?,?,?,?)";
		Singleton st=Singleton.getSingleton();
		Connection con=st.getConnection();
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		//con.setAutoCommit(false);
		try{
			//TransferDto t=new TransferDto();
			pstmt1=con.prepareStatement(qry);
			pstmt1.setInt(1, t.gettAmt());
			pstmt1.setString(2,t.getSacno());
			pstmt1.executeUpdate();
			pstmt2=con.prepareStatement(qry1);
			pstmt2.setInt(1, t.gettAmt());
			pstmt2.setString(2, t.getRacno());
			pstmt2.executeUpdate();	
			//con.commit();
			PreparedStatement pstmt3=con.prepareStatement(insertQry);
			pstmt3.setString(1, t.getTid());
			pstmt3.setString(2,t.getRacno());
			pstmt3.setString(3,t.getRemark());
			pstmt3.setInt(4, t.gettAmt());
			pstmt3.setString(5, t.getTransType());
			pstmt3.setString(6,t.getDate());
			pstmt3.setString(7, t.getTime());
			pstmt3.executeUpdate();
			
			
		   pstmt3.setString(1, t.getTid());
		   pstmt3.setString(2, t.getSacno());
		   pstmt3.setString(3,t.getRemark());
		   pstmt3.setInt(4, t.gettAmt());
		   pstmt3.setString(5,"Debit");
		   pstmt3.setString(6,t.getDate());
		   pstmt3.setString(7, t.getTime());
		   pstmt3.executeUpdate();
		   
			
			
			
			
		}
		catch(SQLException e){
			e.printStackTrace();
			/*try{
				//con.rollback();
			}
			catch(SQLException e1){
				e1.printStackTrace();
			}*/
		}
		
		return t;
	}

	public ArrayList<TransferDto> miniStatement(String sDate, String lDate,String sacntno) throws SQLException {
		String selQry="select * from feemanage.trans where accountNO=? and date between ? and ?";
		Singleton st=Singleton.getSingleton();
		Connection con=st.getConnection();
		PreparedStatement pstmt=con.prepareStatement(selQry);
		pstmt.setString(1, sacntno);
		pstmt.setString(2, sDate);
		pstmt.setString(3, lDate);
		ResultSet rs=pstmt.executeQuery();
		
		
		ArrayList<TransferDto> list=new ArrayList<TransferDto>();
		
        while(rs.next()){
        	TransferDto tdto=new TransferDto();
        	tdto.setTid(rs.getString(1));
        	tdto.setSacno(rs.getString(2));
        	tdto.setRemark(rs.getString(3));
        	tdto.settAmt(rs.getInt(4));
        	tdto.setTransType(rs.getString(5));
        	tdto.setDate(rs.getString(6));
        	tdto.setTime(rs.getString(7));
        	list.add(tdto);
        	
        }
        return list;
	}

	

	
}

