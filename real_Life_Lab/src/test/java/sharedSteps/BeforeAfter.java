package sharedSteps;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends tool10{
	
@Before
public void setUp(Scenario scenario) throws IOException {
	Driver10.init();
}

@After
public void tearDown() {
	driver.quit();
}
}
