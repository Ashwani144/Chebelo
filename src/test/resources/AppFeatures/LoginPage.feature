Feature: SignIn page feature


Scenario: Login with correct credentails 
Given user is on login page
When user enters email "ashwani.pandey@mail.vinove.com"
And user enters password "Pass@123"
#And user clicks on ecaptcha button
And user clicks on Login button
Then user gets the title of the page
And page title should be "Workstatus"


Scenario: Login with Incorrect credentails 
Given user is on login page
When user enters email "ashwani.pandey1@mail.vinove.com"
And user enters password "Pass@321"
And user clicks on Login button
When user get the alert message pop up
Then user gets the PopupAlert message should be "Entered login details doesnt match with our records - please try again."
And user click on OK button
Then user returns back on login page


Scenario: Forgot password link
Given user is on login page
Then forgot your password link should be displayed


Scenario: Forgot password functionality
Given user is on login page
When user click to forgot passoword button
And user enters email of registered ID "pawan1@yopmail.com"
And user click to Send Reset link

@smoke
Scenario: Forgot password functionality with Incorrect emailID
Given user is on login page
When user click to forgot passoword button
And user enters email of registered ID "pawan1@yopmail.com"
And user click to Send Reset link
Then user get the alert message pop up with Incorrect emailId
And user alert message should be "Email not found."








#Feature: Login Action 
    #Description: This feature will test a LogIn and LogOut functionality
#
#
#Scenario Outline: Login with valid and Invalid Credentials 
#
    #Given User is on Home Page 
    #When User navigate to Login Page
    #Then User enters "<username>" and "<password>" 
    #And Keeping case as Valid
    #Then User should get logged in
    #And Message displayed Login Successfully
    #Then User enters "<username>" and "<password>" 
    #And Keeping case as InValid
    #Then user will be asked to go back to login page
    #And Provide correct credentials
#
#Examples: 
        #|username|password|Case|
        #|abc@gmail.com|12345|Valid|
        #|abc1@gmail.com|dfsd2|InValid|
#
#
#Scenario: Successful logout from application 
#
    #When user logs out from application 
    #Then Message displayed Logout successfully 
    #And Browser quit by driver