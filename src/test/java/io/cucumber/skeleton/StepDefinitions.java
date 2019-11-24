package io.cucumber.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static java.util.concurrent.TimeUnit.HOURS;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StepDefinitions {
    private Belly belly;

    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("I wait {int} hour(s)")
    public void I_wait_hours(int hours) {
        belly.timePasses(hours, HOURS);
    }


    @Then("my belly should growl")
    public void my_belly_should_growl() {
        assertThat(belly.getStatus(), is("Growling!"));
    }
}
