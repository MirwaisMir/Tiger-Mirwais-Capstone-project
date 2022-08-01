@capstone @retailpage
Feature: Retail Page

Background:
Given User is on Retail website
And User click  on MyAccount
When  User click on Login 
And User enter userName 'userName'  and pasword  'password'
And User click on Login button
Then User should be logged in to MyAccount dashboard

Scenario: Register as an Affiliate user with Cheque Payment Method
When User click on Register for an Affiliate Account 'Register for an Affiliate Account' link
And User fill affiliate form with below 
|company|website|taxID|paymentMethod|ChequePayeeName|
| AhmadBusiness|WWW.AhmadBuniess.com|55678|Cheque|Ahmad|  
And User check on About us check box 
And User click on Continue button 
Then User should see a success message

Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User  click on Edit your affiliate informationlink 'Edit your affiliate informationlink' 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|WellsFargo|234|22191|checkingAccount|1234567891123678|
And User click on Continue button 
Then User should see a success message  
@laststep
Scenario: Edit your account Information 
When User click on Edit your account information 'Edit your account information' link
And User modify below information
|firstname|lastName|email|telephone|
| Mirwais | Mir |Mirwais15.test@gmail.com|79876543|
And User click on continue button 
Then User should see a message 'Success: Your account has been successfully updated.'

