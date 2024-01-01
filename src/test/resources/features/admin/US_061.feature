@us_061
Feature: US_060 As an administrator (admin), I want to have an Approved Withdrawals page so that I can view the withdrawals accepted by the admin

  Scenario: TC_01 I want to have an Approved Withdrawals page so that I can view the withdrawals accepted by the admin

    * The user goes to the given "adminUrl" and login in to the adminpage with the given "hasanyasarUsername" and "adminPassword" information
    * In the admin panel, it is confirmed that the Rejected Withdrawals page can be accessed under the title of the Menu on the Side Bar
    * On the page, the list of Rejected Withdrawals should be displayed, the list Gateway, Initiated, User , Amount , Conversion , Status, Action headlines and below information is confirmed that the information below is visible
    * In order to reach the details of the accepted payment process selected from the list, it is confirmed that the Details page is accessible under the Action title
    * It is confirmed that on the Pending withdrwals table, it can be searched with Username Transaction No and Start Date  End Date information
    * Close the page