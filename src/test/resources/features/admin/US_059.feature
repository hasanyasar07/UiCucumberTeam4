@us_059
Feature: US_059 As an administrator, I want to have a Pending Withdrawals page to manage pending withdrawals requests

  Scenario: TC_01 I want to have a Pending Withdrawals page to manage pending withdrawals requests

    * The user goes to the given "adminUrl" and login in to the adminpage with the given "hasanyasarUsername" and "adminPassword" information
    * In the admin panel, it is confirmed that the Pending Withdrawals page under the title of the Menu on the Side bar is confirmed
    * On the page, the Pending Withdrawals list should be displayed, the list is confirmed that Gateway, Initiated, User , Amount , Conversion , Status, Action and the information below is confirmed
    * In order to reach and reject reject the selected payment process selected from the list, click the Details button under the Action title and the User Withdraw Information title is displayed
    * For the payment process on the Details page, clicking the Approve button is opened in the window that opens Textbox a random, a sentence is entered and clicked on the submit button and confirmed that  the Withdrowal approved successfully alert appears
    * It is confirmed that on the Pending withdrwals table, it can be searched with Username Transaction No and Start Date  End Date information
    * Close the page

