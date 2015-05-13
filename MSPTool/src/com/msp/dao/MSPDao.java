package com.msp.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.msp.bo.MSPAttributes;
import com.msp.bo.MSPUser;
import com.msp.utils.HibernateUtils;

/**
 * MSPDao.java
 * Includes various methods that interacts with the database
 * 
 * @author Arun.Verma
 *
 */
public class MSPDao {

	public static String loginUser(String userName, String password) {
		HibernateUtils utils = HibernateUtils.getInstance();
		Session session = utils.getSession();
		if (session == null) {
			return "failure";
		}
		String SQL_QUERY = "from MSPUser";
		String response = "";

		Query query = session.createQuery(SQL_QUERY);
		List list = query.list();

		Iterator it = list.iterator();

		while (it.hasNext()) {
			MSPUser user = (MSPUser) it.next();
			if (user.getUserName().equals("admin")
					&& user.getPassword().equals("admin")) {
				response = "success";
				break;
			} else {
				response = "failure";
			}
		}

		return response;
	}
	
	public static ArrayList<MSPAttributes> getAccruals()
	{
		HibernateUtils utils = HibernateUtils.getInstance();
		Session session = utils.getSession();
		 ArrayList<MSPAttributes> list=null;
		Transaction tx=null;
		try{
	         tx = session.beginTransaction();
	         list =(ArrayList<MSPAttributes>) session.createQuery("FROM MSPAttributes").list(); 
	         
	         tx.commit();
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		
		return list;
	}
	
	public static Map<String, Object[]> getExcel()
	{
		HibernateUtils utils = HibernateUtils.getInstance();
		Session session = utils.getSession();
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		Transaction tx=null;
		
		try{
			String SQL_QUERY = "from M";
			String response = "";

			Query query = session.createQuery(SQL_QUERY);
			List list = query.list();

			Iterator it = list.iterator();
			data.put("1", new Object[] { "Id", "ResourceId", "Modified", "ResourceName","ResourceType","Role","Rate","ProjectId",
					"ProjectName","ProjectType","AccountManager","TrackName","TrackManager","Amount","CostCenter","VendorName"});
			int count=2;
			while (it.hasNext()) {
				MSPAttributes mspObj= (MSPAttributes) it.next();
				data.put(
						"" + count + "",
						new Object[] {mspObj.getId(),mspObj.getResourceId(),mspObj.getModified(), mspObj.getResourceName(),mspObj.getRole(),
								mspObj.getRate(),mspObj.getProjectId(),mspObj.getProjectName(),mspObj.getProjectType(),mspObj.getAccountManager(),
								mspObj.getTrackName(),mspObj.getTrackManager(),mspObj.getAmount(),mspObj.getCostCenter(),mspObj.getVendorName()});
				count++;
			}
		}
		catch(HibernateException e)
		{
			e.printStackTrace();
		}
		
		return data;
	}

}
