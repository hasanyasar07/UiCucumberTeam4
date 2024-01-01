@us_018
Feature: US_018 As a registered user, I want to have a page where I can see my Credit plans and get Credit.

  Background: logging in
    * The user goes to the given "userUrl" and login in to the userpage with the given "hasanyasarUsername" and "userPassword" information

  Scenario:  TC_01 Apply for a loan with a random value between $2000 and $5000 on the "Apply for Personal Finance Loan" page

    * It is confirmed that the Take Loan link element is visible
    * When clicking the Take Loan link element, it is confirmed that the Loan Plans is visible
    * On the Loan Plans page,click the Car Loan button and Personal Finance Loan, TAKE minimum $ 2000 Take maximum $ 5000, Per Installment 4percent Installment 20, Days Total Installment 20 and Apply Now button visible and active is confirmed
    * When clicked on the Apply Now button, it is confirmed that it switches to "Apply for Personal Finance Loan" page
    * The Amount Textbox is entered between 2000 and $ 5000, a value is entered and the Confirm button is pressed, press the "Apply" button on the opened page, and "Loan Application submitted sucessFully" is confirmed.
    * Close the page

Scenario:  TC_02 Successful registration on the basic loan 1 page

    * Take Loan link element on the page opened Basic Loan link element is clicked
    * It is confirmed that the Basic Loan 1 and the Apply Now button are visible and active and click on the Apply Now button in Basic Loan 1
    * Amount Textbox is entered between $ 1000 and $ 3000 and a value of random is entered and the Confirm button is pressed, the opened page is the Application Form page, where you are aplying to take loan (beefore confirm) under the title Plan Name, Loan Amount, Total Installment , Per Installment, You'll Need to Pay, Application Fee fields, Loan Card Name and Apply button selected under the Application form title is confirmed
    * When the Apply button is clicking, it is confirmed that the message Loan Application Submitted SuccessFully is displayed
    * It is confirmed that the process on the My Loans page is visible
    * To search for transactions, Search by Loan Number Text Box should be visible and active, it is confirmed that filtering can be made under the title Loan Status
    * The Installments button is visible and active for the process that is running on the My Loans page. When clicking the button, the Loan Installments page is confirmed
    * Loan Number, Loan Amount, Plan, Per Installment, Needs to Pay, Delay Charge values ​​are visible, the list titles of the installment plan list (S.N., Installment Date, Given on, Delay) are visible and values ​​are visible in the list
    * For the transition from My Loans to the Take Loan page, the Take Loan button is visible and confirmed to be active
    * Close the page


  Scenario: TC_03 Successful registration on the car loan 9 page

    * Take Loan link element on the page opened Basic Loan link element is clicked
    * It is confirmed that the Car Loan 9 and the Apply Now button is visible and active and click on the Apply Now button in Car Loan 9
    * Amount Textbox is entered between $ 2000 and $ 5000 and a value of random is entered and the Confirm button is pressed, the opened page is the Application Form page, where you are aplying to take loan (beefore confirm) under the title Plan name, Loan Amount, Total Installment , Per Installment, You'll Need to Pay, Application Fee fields, Loan Card Name and Apply button selected under the Application form title is confirmed
    * When the Apply button is clicking, it is confirmed that the message Loan Application Submitted SuccessFully is displayed
    * It is confirmed that the process on the My Loans page is visible
    * To search for transactions, Search by Loan Number Text Box should be visible and active, it is confirmed that filtering can be made under the title Loan Status
    * The Installments button is visible and active for the process that is running on the My Loans page. When clicking the button, the Loan Installments page is confirmed
    * Loan Number, Loan Amount, Plan, Per Installment, Needs to Pay, Delay Charge values ​​are visible, the list titles of the installment plan list (S.N., Installment Date, Given on, Delay) are visible and values ​​are visible in the list
    * For the transition from My Loans to the Take Loan page, the Take Loan button is visible and confirmed to be active
    * Close the page


    Scenario: TC_04

      * Take Loan link element on the page opened Basic Loan link element is clicked
      * It is confirmed that the Test Loan and the Apply Now button is visible and active and click on the Apply Now button in Test Loan
      * Amount Textbox is entered between $ 3000 and $ 30000 and a value of random is entered and the Confirm button is pressed, the opened page is the Application Form page, where you are aplying to take loan (beefore confirm) under the title Plan name, Loan Amount, Total Installment , Per Installment, You'll Need to Pay, Application Fee fields, Loan Card Name and Apply button selected under the Application form title is confirmed
      * When the Apply button is clicking, it is confirmed that the message Loan Application Submitted SuccessFully is displayed
      * It is confirmed that the process on the My Loans page is visible
      * To search for transactions, Search by Loan Number Text Box should be visible and active, it is confirmed that filtering can be made under the title Loan Status
      * The Installments button is visible and active for the process that is running on the My Loans page. When clicking the button, the Loan Installments page is confirmed
      * Loan Number, Loan Amount, Plan, Per Installment, Needs to Pay, Delay Charge values ​​are visible, the list titles of the installment plan list (S.N., Installment Date, Given on, Delay) are visible and values ​​are visible in the list
      * For the transition from My Loans to the Take Loan page, the Take Loan button is visible and confirmed to be active
      * Close the page

