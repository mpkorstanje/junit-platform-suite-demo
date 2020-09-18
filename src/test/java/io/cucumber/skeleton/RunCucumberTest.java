package io.cucumber.skeleton;

import com.github.mpkorstanje.junit.platform.suite.Configuration;
import com.github.mpkorstanje.junit.platform.suite.SelectClasspathResource;
import com.github.mpkorstanje.junit.platform.suite.Suite;
import org.junit.platform.suite.api.IncludeEngines;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("io/cucumber/skeleton")
@Configuration(key = GLUE_PROPERTY_NAME, value = "io.cucumber.skeleton")
public class RunCucumberTest {

}



