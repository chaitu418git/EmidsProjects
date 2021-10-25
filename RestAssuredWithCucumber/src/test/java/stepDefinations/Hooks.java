package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {
@Before("@DeletePlace")
public void beforeScenario() throws IOException
{
	
	StepDefination sd=new StepDefination();
	if(sd.placeid==null)
	{
	sd.add_place_api_request_with(10,"testupdate","9877789012", "test address","test.com","telugu") ;
	
	sd.user_submit_the_http_request("AddPlaceAPI","POST");
	sd.verify_displays_matches_with_db_reesult("test");
	}
}
}
