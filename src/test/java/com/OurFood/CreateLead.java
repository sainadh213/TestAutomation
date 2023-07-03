package com.OurFood;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.OurfoodLeadsPage;

public class CreateLead extends BaseClass {
@Test
public void createLead() throws Throwable
{
	OurfoodLeadsPage olp=new OurfoodLeadsPage(driver);
	olp.createLead();
	}
}
