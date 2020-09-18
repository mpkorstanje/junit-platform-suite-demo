package io.cucumber.skeleton;

import com.github.mpkorstanje.junit.platform.suite.SelectClasspathResource;
import com.github.mpkorstanje.junit.platform.suite.Suite;
import org.junit.platform.suite.api.SelectClasses;

@Suite
@SelectClasses(JupiterTest.class) // This selector is picked up by Jupiter
@SelectClasspathResource("io/cucumber/skeleton") // This selector is picked up by Cucumber
public class RunSuiteTest {

}



