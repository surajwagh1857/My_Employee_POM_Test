package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class NewOutLineRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "D:\\Photon_Testing\\MVCTest2\\feature\\NewOutLine.Feature",
	glue = { "StepDefination" }
	)

	public class OutLineRunner {

	}

}
