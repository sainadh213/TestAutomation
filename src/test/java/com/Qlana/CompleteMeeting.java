package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.QlanaContactPage;
import com.ObjectRepository.QlanaMeetingPage;

public class CompleteMeeting extends BaseClass {
	@Test
	public void completeMeeting() throws Throwable
	{
		QlanaContactPage qcp=new QlanaContactPage(driver);
		QlanaMeetingPage qmp=new QlanaMeetingPage(driver);
		qmp.createMeeting(qmp.getProjectIcon());
		//qmp.completeMeeting();
		//qmp.cancelMeeting();
	}

}
