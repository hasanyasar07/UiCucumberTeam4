@us_12
Feature: I would like to have a page to register as a visitor.

  Scenario: I want to reach the register page with the get started button
    * The Visitor opens Browser and goes "guestUrl"
    * It is confirmed that the Get Started button is visible and active
    * When clicking the Get Started button, it is confirmed that It went to "registerUrl"
    * Close the page

  Scenario: I want to register
    * The Visitor opens Browser and go to "registerUrl"
    * It is confirmed that the registration form is visible
    * In the form, username, email address, country dropdown, mobile number, password, confirm Password Text Boxes are confirmed that visible is
    * Username random 6-character uniq username is entered
    * An e-mail information with Email Text Random @
    * Country menu is chosen a country
    * Telephone TextBox is a maximum of 14-digit random unique a phone number
    * Password TextBox includes a 6-digit password containing at least (a capital letter , a figure, lowercase, character) and hidden and  unhidden in the written password
    * Password determined in Confirm Textbox
    * I Agree with Privacy Policy, Terms of Service, Rapid Policy 'Check Box Click here
    * By clicking the Register button, the user registration form is sent to the user data page to complete the registration
    * It is confirmed that it is visible and active in the Form (Firstname, Lastname, Address, State, Zip, City, Submit, Submit button) opened on the user data page
    * It should be confirmed that the registration process can be completed by completing the compulsory fields in the form (firstname,Lastname,Address Textboxes) as random
    * Close the page


