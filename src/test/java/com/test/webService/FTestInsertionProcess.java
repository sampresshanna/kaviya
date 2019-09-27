package com.test.webService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fedex.AppConfig;
import com.fedex.constants.AccountDao;
import com.fedex.testservice.AccountDetails;
import com.fedex.testservice.AddAccountResponse;

@ContextConfiguration(classes = { AppConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)

public class FTestInsertionProcess{



	@Test
	public void testWebserviceInsert(){
	
		
	{
		
		AccountDao account= new AccountDao();
		
		AddAccountResponse response = new AddAccountResponse();
		
		
		//account number
		account.setEFF_TMSTP("2014-12-21 11.21.26");
		account.setOBJ_ID(201);
		account.setEXTERNAL_ID_NBR("2639875526");
		account.setTYPE_CD("ACCT.ENT");
		account.setEXPR_TMSTP("2016-12-21 15.30.20");

		// Company
		account.setCUST_VIEW_CD("CORE");
		account.setCUST_MODEL_CD("SE");
		account.setCMP_TYPE_CD("BILL");
		account.setNAME_DESC("Afb Fire Dept");

		// Address
		account.setADD_TYPE_CD("PRI");
		account.setADDR_LINE_1_DESC("EAST FACE");
		account.setADDR_LINE_2_DESC("AVE EAST");
		account.setADDR_LINE_3_DESC("300 WEST");
		account.setCITY_NM("NEW YORK");
		account.setSTATE_PROVINCE_NM("US");
		account.setPSTL_CD("069326589");
		account.setCNTRY_CD("Us");

		// phone
		account.setPH_TYPE_CD("PRI");
		account.setTEL_INTL_CD("BILL");
		account.setTEL_AREA_CD("TOO");
		account.setTEL_NBR("236987456");
		account.setTEL_EXT_NBR("036");
		System.out.println("Account Details:=============>" + account.toString());
			
			AccountDetails accountdetail = new AccountDetails();

			accountdetail.setObjId(account.getOBJ_ID());
		
			response.setAccountDetails(accountdetail);
			response.toString();
			System.out.println("Response======> Obj_id: " + response);
			//AssertTrue
			
//			EntityRepo service =  new EntityRepo();
//
//			service.addrequest(request);
//			service.addAddress(request);
//			service.addCompany(request);
//			service.addPhone(request);
//			int id = request.getObjId();
//			Assert.assertNotNull(id);
		
	}
	}

}
