package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.QlanaContactPage;

public class CreateContact extends BaseClass{
	@Test
	public void cretaeContact() throws Throwable
	{
		QlanaContactPage qcp=new QlanaContactPage(driver);
		qcp.createContact();
	}

}
