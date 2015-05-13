package com.msp.test;

import java.sql.Connection;

import org.hibernate.Session;

import com.msp.utils.ConnectionUtils;
import com.msp.utils.HibernateUtils;

/**
 * 
 * @author Arun.Verma
 *
 */
public class Test {
	public static void main(String[] args) {
		
		Connection con= ConnectionUtils.getInstance().getConnection();
		System.out.println("connection is: "+con);
		
		
		HibernateUtils utils= HibernateUtils.getInstance();
		Session session= utils.getSession();
		
		System.out.println("Session is: "+session);
		
	}

}
