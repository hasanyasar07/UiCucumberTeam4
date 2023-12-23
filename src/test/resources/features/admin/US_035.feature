
  Feature: US_35 As an administrator, I want to have summary Boards on the dashboard page
            that will facilitate in-site access.

    @us_35
  Scenario: TC_01 'Total Users', 'Active Users', 'Email Unverified Users', 'Mobile Unverified Users' headings on the
            homepage should be viewable and should redirect to the relevant page when clicked.
    * Launch browser
    * Navigate to "adminUrl"
    * the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    * Verify that Admin homepage is visible successfully
    * Verify summary board titles: Total Users, Active Users, Email Unverified Users, Mobile Unverified Users,
    * Verify summary board titles: Running Loan, Pending Loan, Due Loan, Paid Loan, Total Deposited, Pending Deposits,
    * Verify summary board titles: Rejected Deposits, Deposited Charge, Total Withdrawn, Pending Withdrawals, Rejected Withdrawals, Withdrawal Charge.
    * Click View All buttons next to each title and verify redirection.
    * Verify the display of charts: Monthly Deposit & Withdraw Report (Last 12 Month) and Transactions Report (Last 30 Days).
    * Verify the display of login charts: Login By Browser (Last 30 days), Login By OS (Last 30 days), Login By Country (Last 30 days).
    * Close the page

    Scenario: TC_02 To confirm that the admin can log in and navigate to the homepage successfully.
      * Launch browser
      * Navigate to "adminUrl"
      * the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
      *  Verify that Admin homepage is visible successfully
      * Confirm that the Admin Homepage is visible with all features accessible.

      * Close the page
















