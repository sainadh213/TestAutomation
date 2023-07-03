package Tasks;

import org.testng.annotations.Test;

import com.GenericLibrary.BaseClass;
import com.GenericLibrary.Constants;
import com.ObjectRepository.EcdcProjectDeskTopAnalysisSubsections;
import com.ObjectRepository.QlanaLoginPage;

public class RadioBtns extends BaseClass {
	@Test
	public void radioBtn() throws Throwable
	{
		QlanaLoginPage qlp=new QlanaLoginPage(driver);
		qlp.loginToQlana();
		EcdcProjectDeskTopAnalysisSubsections pda=new EcdcProjectDeskTopAnalysisSubsections(driver);
		//pda.preApprovalChecklist(Constants.data);
		//pda.basicInfo();
		//pda.facilityInfo();
		//pda.preApprovalDoc();
		//pda.submissionReports();
		//pda.financialModel();
		//pda.deskTopAnalysis("great test");
		pda.submissionReports();
	}

}
