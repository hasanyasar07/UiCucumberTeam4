Feature: US_011 As a visitor, I would like to subscribe to the company newsletter to be informed about credit plans.

  Background:
    * kullanici verilen "guestUrl" gider

  Scenario: TC_01 In the Home Page Footer section, the mail text box should be visible under the Newsletter heading and e-mails should be sent.

  Given Accessing the homepage as a visitor and the presence of the Newsletter title in the footer section going down on the homepage are tested.
  Then The visibility of the email text box under the visitor Newsletter heading is tested.
  Then Enters e-mail address in the e-mail text box.
  Then Click on the button next to the email text box.
  Then Tests whether it was sent to the e-mail.
  And sayfayi kapatir