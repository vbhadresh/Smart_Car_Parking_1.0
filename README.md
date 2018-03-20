# Smart_Car_Parking_1.0
FEATURES PROVIDED IN SMART CAR PARKING
1.	Login Page – First Time User(REGISTER); Existing Users (SIGN IN)
2.	If Existing Users (User Name & Password- fields must be filled)
3.	After logging in, Welcome Page has the buttons: ADD, Manage, Booking History and Book a slot.
3.1.	ADD will go to step 6.
3.2.	Manage will go to edit the user profile with car details. Step 7.
3.3.	Booking History will be show the users previous bookings done through this application.
3.4.	Book a Slot button
3.4.1.	If disabled, display with field Validation showing *Add car details to book a slot.
3.4.2.	If enabled and clicked, then got to step 8.
4.	If new User is registered (User Name, password, re-enter password, Email- fields must be filled)
4.1.	Use as a Parking Place provider / Parking Place User?
5.	If Parking Place User, then go to Welcome Page Step 3. 
6.	Add your car details or Add car details of your Friend;
6.1.	If Add YOUR car details-> (enter->  Car Number; Car Model)
6.2.	If Add FRIEND car details-> (enter ->Name; Car Number; Car Model)
7.	Manage your booking; Do you like to add another car details (YES; NO)
7.1.	If YES, loop to 6;
7.2.	If NO, go to Step 3.
8.	Select a category to book a slot (Drop down menu)
8.1.	Drop down values of Category to book a slot: Public Place, Hospital, Apartment, Mall
8.2.	After selecting from the drop down, places registered inside the category are displayed. All are arranged as radio buttons.
8.3.	On selecting the RADIO Button and clicking OK, we should fill the below fields.
9.	Fields to Enter the date / Select the Date (Format specified)
10.	Fields to Enter the Time / Select the time- Start and End time (Duration Calculated)
11.	Next page – Shows the calculated duration falls in the particularly categorized duration interval and shows charges for that amount respectively. Do you like to proceed with the payment?
11.1.	If YES, payment successful. Booking confirmed. Thank you. 
11.2.	If NO, redirect to 3.3
12.	If Parking Place provider, choose place from the drop down to register (4.4)
12.1.	Enter the Place Name in the Textbox below.
12.2.	Enter the Parking tariff details.
