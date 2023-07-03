package com.Qlana;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.ObjectRepository.QlanaTaskPage;

public class DeleteTask extends BaseClass {
	@Test
	public void deleteTask() throws Throwable
	{
		QlanaTaskPage qtp=new QlanaTaskPage(driver);
		qtp.createTask(qtp.getProjectIcon());
		//qtp.deleteTask();
		//qtp.completeTask();
	}

}
