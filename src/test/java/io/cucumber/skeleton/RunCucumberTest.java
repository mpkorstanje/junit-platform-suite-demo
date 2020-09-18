package io.cucumber.skeleton;

import com.github.mpkorstanje.junit.platform.suite.Configuration;
import com.github.mpkorstanje.junit.platform.suite.SelectClasspathResource;
import com.github.mpkorstanje.junit.platform.suite.Suite;
import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.EngineFilter;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.suite.api.IncludeEngines;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("io/cucumber/skeleton")
@Configuration(key = GLUE_PROPERTY_NAME, value = "io.cucumber.skeleton")
public class RunCucumberTest {

    public static void main(String[] args) {
        Launcher launcher = LauncherFactory.create();

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .filters(EngineFilter.includeEngines("cucumber"))
                .selectors(DiscoverySelectors.selectClasspathResource("io/cucumber/skeleton"))
                .configurationParameter(GLUE_PROPERTY_NAME, "io.cucumber.skeleton")
                .build();

        launcher.execute(request);
    }
}


