Feature: Dashboard Page Feature

Background:
Given user has already logged in to application
|email|password|
|ashwani.pandey@mail.vinove.com|Pass@123|

Scenario: Dashboard page title
Given user is on Dashboard page
When user gets the title of the page
Then page title should  be "Workstatus"

Scenario: Dashboard section with other sub section
Given user is on Dashboard page
Then user gets Dashboard section
|WEEKLY ACTIVITY|
|WORKED THIS WEEK|
|EARNED THIS WEEK|
|PROJECT WORKED|
|TOTAL ACTIVITY TODAY|
|TOTAL WORKED TODAY|
|RECENT ACTIVITY|
|RECENT PROJECTS|
|RECENT TIMESHEETS|
|RECENT TODO'S|
|ACTIVITY GRAPH|
And dashboard section count should be 11
