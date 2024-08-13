
@tag
Feature: Booking Hotel from MakeMyTrip for Banglore and Pune Location
 
 
 

  @tag1
  Scenario Outline: Booking Hotel at Pune Location
    Given Book the hotel at Pune location <location>
    When  Giving Details firstname <fname> , lastname <lname> , emailId <emailId> and mobilenumber <mobileNo>
    Then Verifying details with message "Details are correct you can move further"

    Examples: 
      | location  | fname    | lname 		| emailId    					  | mobileNo   	|	
      | Pune      | Abhilash | Mahajan	| amahajan220@gmail.com | 7020383722	|
      
 @tag2
  Scenario Outline: Opening Naurki url
    Given Opens Naukri url
 
   