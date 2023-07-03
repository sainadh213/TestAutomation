package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.QlanaContactPage;
import com.ObjectRepository.QlanaMeetingPage;

public class CreateMeeting extends BaseClass{
	
	@Test
	public void createMeeting() throws Throwable
	{
		QlanaContactPage qcp=new QlanaContactPage(driver);
		QlanaMeetingPage qmp=new QlanaMeetingPage(driver);
		qmp.createMeeting(qcp.getContacticon());
	}

}
