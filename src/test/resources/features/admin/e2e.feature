@e2e
Feature: As a user apply  a deposit

  Scenario: Take a deposit

    * kullanici verilen "userUrl" gider
    * kullanici verilen "hilalciftciUsername" ve "userPassword" bilgileri ile userpage de login olur
    * click deposit button.
    * select getawey
    * The amount is entered between the given max and min values.
    * click the submit.
    * Click the pay now button;
    * Closes the page

    * Navigate to "adminUrl"
    * the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    * Click Manage Users link on the DashboardPage
    * Clicks on Active Users link.
    * Click on the Details button
    * Click on the view all icon
    * Click the details button for any user.
    * Click on the Details button
    * Click  all deposit button
    * Click the Pending Deposits Heading
    * Click on the spesific user Details button
    * Click on the Approve button
    * On the page that appears click on the Yes button
    * Verify that Deposit request approved successfully is appeared
    * Closes the page
