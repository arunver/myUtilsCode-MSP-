package com.msp.exception;

/**
 * 
 * @author Arun.Verma
 *
 */
public class GeneralException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int errorCode;
	private String errorMessage;
	
	public GeneralException()
	{
		this.errorCode=0;
		this.errorMessage="Unknown Exception";
	}
	
	public GeneralException(int errorCode, String errorMessage)
	{
		this.errorCode= errorCode;
		this.errorMessage= errorMessage;
	}

}
