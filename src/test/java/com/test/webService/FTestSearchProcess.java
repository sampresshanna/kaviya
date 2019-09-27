package com.test.webService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fedex.AppConfig;
import com.fedex.Endpoint.AccountEndpoint;
import com.fedex.testservice.AccountDetails;
import com.fedex.testservice.GetAccountRequest;
import com.fedex.testservice.GetAccountResponse;

@ContextConfiguration(classes = { AppConfig.class })
@RunWith(SpringJUnit4ClassRunner.class)
public class FTestSearchProcess extends AccountEndpoint {

	@Test
	public void testWebserviceSearch() {
		GetAccountRequest request = new GetAccountRequest();

		GetAccountResponse response = new GetAccountResponse();

		request.setObjId(201);

		System.out.println("Setting Object Id============>"
				+ request.getObjId());

		AccountDetails accountDetails = new AccountDetails();

		accountDetails.setObjId(request.getObjId());
		accountDetails.setEffectiveTimestamp("2014-12-21 11.21.26");
		accountDetails.setExternalId("2639875526");
		accountDetails.setTypeCode("ACCT.ENT");
		accountDetails.setExpirationTimestamp("2016-12-21 15.30.20");
		accountDetails.setCustomerView("CORE");
		accountDetails.setCustomerViewModelValue("SE");
		accountDetails.setCompanyTypeCode("BILL");
		accountDetails.setCompanyDescription("Afb Fire Dept");
		accountDetails.setPhoneTypeCode("PRI");
		accountDetails.setPhcountryCode("BILL");
		accountDetails.setAreaCode("TOO");
		accountDetails.setPhoneNumber("236987456");
		accountDetails.setExtension("036");
		accountDetails.setAddressTypeCode("PRI");
		accountDetails.setStreetLine1("EAST FACE");
		accountDetails.setStreetLine2("AVE EAST");
		accountDetails.setStreetLine3("300 WEST");
		accountDetails.setCity("NEW YORK");
		accountDetails.setState("US");
		accountDetails.setPostalCode("069326589");
		accountDetails.setAddcountryCode("Us");

		response.setAccountDetails(accountDetails);

		System.out.println("Response==============> "
				+ accountDetails.toString());

	}

}
