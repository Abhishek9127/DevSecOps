@test
Feature: Verify that functionality of services

Background:
Given Click on the homepage login button
When Enter the email and password
And Click on login 

Scenario: Verify that services are clickable or not

Given click on the services icon
Then Validate with text on the page

Scenario: Verify that infra_as_code is clickable or not

Given click on the infra button
Then Validate with the infra text

Scenario: Verify that DevOps_Automation is clickable or not

Given click on the devops button
Then Validate with the devops text

Scenario: Verify that Cloud_Management is clickable or not

Given click on the cloud button
Then Validate with the cloud text