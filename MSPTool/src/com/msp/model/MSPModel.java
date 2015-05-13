package com.msp.model;

import java.util.ArrayList;
import java.util.Map;

import com.msp.bo.MSPAttributes;
import com.msp.dao.MSPDao;

/**
 * MSPModel.java
 * 
 * Includes various methods which interacts with both the controller and  DAO
 * Responsible for sending requests to DAO Layer and response to Controller Layer
 * 
 * @author Arun.Verma
 *
 */
public class MSPModel {
	
	public static String loginUser(String userName, String password)
	{
		return MSPDao.loginUser(userName, password);
	}
	public static ArrayList<MSPAttributes> getAccruals()
	{
		return MSPDao.getAccruals();
	}
	
	public static Map<String, Object[]> getExcel()
	{
		return MSPDao.getExcel();
	}
	
}
