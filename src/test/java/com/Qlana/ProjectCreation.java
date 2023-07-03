package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.EcdcProjectPage;

public class ProjectCreation extends BaseClass {
	@Test
	public void projectCreate() throws Throwable
	{
		EcdcProjectPage ecdc=new EcdcProjectPage(driver);
		ecdc.createProject();
	}
	

}
