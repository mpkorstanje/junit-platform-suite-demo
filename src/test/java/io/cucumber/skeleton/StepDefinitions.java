package io.cucumber.skeleton;

import io.cucumber.java.After;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    private final Dreamer dreamer = new Dreamer();
    private Dreamer.Dream dream;

    @Given("a dream takes {long} {timeUnit}")
    public void aDreamTakesDurationUnit(long amount, TimeUnit unit) {
        dream = new Dreamer.Dream(amount, unit);
    }

    @When("a dreamer experiences the dream")
    public void theDreamerExperiencesTheDream() {
        dreamer.experience(dream);
    }

    @Then("they'll be awake after at most {long} {timeUnit}")
    public void iLlBeDoneInAtLeastDurationUnit(long timeout, TimeUnit unit) throws InterruptedException {
        dreamer.tryToWake(timeout, unit);
    }

    @After
    public void after(){
        dreamer.retire();
    }

    @ParameterType("(second|minute)s?")
    public TimeUnit timeUnit(String timeUnit) {
        timeUnit += "s";
        for (TimeUnit value : TimeUnit.values()) {
            if (value.name().toLowerCase(Locale.US).equals(timeUnit)) {
                return value;
            }
        }
        throw new IllegalArgumentException(timeUnit);
    }
}
