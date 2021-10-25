Feature: Application Login

Scenario: Verify the Login Funationality
Given user is on landing page
When user enters username as "test" and password as "1234"
And clicks on Login button
Then user should login into the application
And Home Page should be displayed

Scenario: Verify the Login Funationality
Given user is on landing page
When user enters username as "testnew" and password as "123456"
And clicks on Login button
Then user should login into the application
And Home Page should not be displayed