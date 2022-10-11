package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Photon_Testing\\MVCTest2\\feature\\MyOutLine.Feature",
glue = { "StepDefination" }
)

public class OutLineRunner {

}
