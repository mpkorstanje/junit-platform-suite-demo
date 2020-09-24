package io.cucumber.skeleton;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines({"junit-jupiter", "cucumber"})
@SelectClasses(JupiterTest.class) // This selector is picked up by Jupiter
@SelectClasspathResource("io/cucumber/skeleton") // This selector is picked up by Cucumber
public class RunSuiteTest {

}



