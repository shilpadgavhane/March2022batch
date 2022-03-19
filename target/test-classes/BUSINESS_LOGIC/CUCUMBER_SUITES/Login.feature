Feature: Login functionality

Background:User is successfully LaunchedApplication
Given user opens "Chrome"browser with exe as "B:\\NewMarch2022FlipkartFinal\\Flipkart\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
Given user opens URL as "https://flipkart.com"

@SmokeTest
Scenario: Login Functionality with valid Credentials
When user click on cancel login Window
When user move to on login
When user click on MyProfile
When user enter username as "9850948689"
When user enter password as "shilpa"
When user click on login button
Then Application shows user logged successfully