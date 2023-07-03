package com.Qlana;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.EcdcProjectWorkflow;

@Listeners(com.GenericLibrary.MyListeners.class)
public class ProjectWorkflow extends BaseClass{
	@Test
	public void projectWorkflow() throws Throwable
	{
		EcdcProjectWorkflow epw=new EcdcProjectWorkflow(driver);
		epw.projectWorkflow("Project@0003");
	}

}
