Feature: US003 Visitor sees the names of reference companies on the Loantech Expert home page

  @test01
  Scenario: TC01 The visitor should be able to access a slider consisting of partner company logos on the Loantech Expert Homepage.

    Given visitor goes to Loantech Expert Homepage
    And tests that a slider of company logos is visible on the homepage.
    And Tests whether logos flowing in the slider (Sun Basket, Peloton, BerkShire Hathaway, Emergent biosolutions*, Solar Edge energy architects, Covenant Transport services, Exxon Mobile, P&G, CVS Health, EverNote) are visible.
    Then closes the page