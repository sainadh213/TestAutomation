package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.QlanaMeetingPage;

public class CanceelMeeting extends BaseClass {
	@Test
	public void cancelMeeting() throws Throwable
	{
		//QlanaContactPage qcp=new QlanaContactPage(driver);
		QlanaMeetingPage qmp=new QlanaMeetingPage(driver);
		qmp.createMeeting(qmp.getContacticon());
		
		//qmp.cancelMeeting();

	
	
}}