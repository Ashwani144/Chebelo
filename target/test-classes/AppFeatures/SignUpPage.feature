Feature: SignUp Feature Test 

Background: 
Given user on the homepage  
And user follows "Sign Up" 

Scenario: Create a New account
When user fills Full Name with "Mohan Lal"
When user fills Email with "Mohanlal1@yopmail.com"
When user fills PhoneNumber with "8587886525"
When user fills password with "Pass@1234"
When user fills confirm password with "Pass@1234"
#And user enters the following details 
#| Email | mohanlal1@yopmail.com | 
#| PhoneNumber | 8587886552 |
#| Password | Pass@1234 | 
#| Confirm Password | Pass@1234 | 
And user clicks on checkBox of Term and condition
And user clicks SignUP button
Then User get THANK YOU Message with OK button


















#Feature: SignUp Page Feature
#
#Scenario: SignUp with correct valid input 
#Given user is on signup page
#When user enters fullName "Mohan Lal"
#And user enters emailAdd "moahnlal11@yopmail.com"
#And user enters phoneNumber "8587886985"
#And user enters password1st "Pass@123"
#And user enters confirm password "Pass@123"
#And user clicks on checkbox of term and condition
#And user clicks on signup button
