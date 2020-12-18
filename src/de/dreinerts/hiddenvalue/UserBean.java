package de.dreinerts.hiddenvalue;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public String getStrHiddenValue() {
		return strHiddenValue;
	}

	public void setStrHiddenValue(String strHiddenValue) {
		this.strHiddenValue = strHiddenValue;
	}

	private String strHiddenValue = "Holy crap, I am batman";
	
}
