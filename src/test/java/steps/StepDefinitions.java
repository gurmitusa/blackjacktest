package steps;

import blackjack.BlackJackApp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    int cardOne;
    int cardTwo;
    int cardSum;

    @Given("a two cards with total as twentyone")
    public void a_two_cards_with_total_as_twentyone() {
        cardOne = 10;
        cardTwo = 11;

    }

    @When("card total is twentyone")
    public void card_total_is_twentyone() {
        cardSum = BlackJackApp.evaluateBlackJack(cardOne, cardTwo);
    }

    @Then("the scenario outcome is BlackJack as sum is twentyone")
    public void the_scenario_outcome_is_black_jack_as_sum_is_twentyone() {
        Assert.assertTrue("***Error: BlackJack validation failed : Expected = 21 but actual =" + cardSum, cardSum == 21);
    }

}


