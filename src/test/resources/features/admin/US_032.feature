@us32
Feature: The website must be accessible from the browser with the user (Given URL)

  Scenario: TC_01 Website Accessibility from Given URL in Browser

    Given Launch browser
    Given Navigate to "adminUrl"
    Given the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
    Given  Verify that Admin homepage is visible successfully
    Given  Close the page


    Scenario: TC_02 In the login window on the site login page,
        it must be verified that the Username and Password textBoxes and
        the LOGIN button are visible and functional.
      Given Launch browser
      Given Navigate to "adminUrl"
      Given the user logs in to the admin page with the given "hilalciftciUsername" and "adminPassword" information
      Given  Verify that Admin homepage is visible successfully
      Given click with find coordinate method.






