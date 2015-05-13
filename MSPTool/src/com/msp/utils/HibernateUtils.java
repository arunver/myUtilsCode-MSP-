package com.msp.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


/**
 * 
 * @author Arun.Verma
 *
 */
public class HibernateUtils {
	
	private static HibernateUtils hibernateUtils= new HibernateUtils();
	private static SessionFactory factory=new AnnotationConfiguration().configure().buildSessionFactory(); ;
	
	private HibernateUtils()
	{
		if(factory==null)
			factory= new AnnotationConfiguration().configure().buildSessionFactory();
		
	}
	
	public static HibernateUtils getInstance()
	{
		if(hibernateUtils==null)
		{
			
			hibernateUtils= new HibernateUtils();
			
		}
		return hibernateUtils;
	}
	
	public Session getSession()
	{
		Session session= factory.openSession();
		return session;
	}
}
