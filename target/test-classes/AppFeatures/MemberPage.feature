Feature: Member Page Feature

Background:
Given user has already logged in to application
|email|password|
|ashwani.pandey@mail.vinove.com|Pass@123|

Scenario: Add Member page functionality
Given user is on Member page
When user click to Invite New Member
And user enter Member EMail Id
And user select the role of this member
And user select the project of this Member
And user click to Save button
Then user get the alert message 
