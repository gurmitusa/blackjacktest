Feature: Evaluate 2 cards of a player

  Scenario: card total twentyone
    Given a two cards with total as twentyone
    When card total is twentyone
    Then the scenario outcome is BlackJack as sum is twentyone
