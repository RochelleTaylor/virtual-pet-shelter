Virtual Pet Shelter





It's time to share that with the community! Time to volunteer!


Details

We're going to create an application that simulates you taking care of the pets in a shelter.

Include a game loop in this project, too. It should query the user, then call the appropriate method(s) on VirtualPetShelter and/or VirtualPet.

Create the following classes:


 VirtualPet: You can start with your class from last week's assignment or create another.
 
 include instance variables representing:
[*] name

[*] description

[*]include a constructor that accepts a name and description only

[*]include a constructor that, in addition to name and description, accepts starting values for the pet's attributes (hunger, boredom, etc)
 
 
 VirtualPetShelter: Homeless virtual pets need a place to stay.
 
[*] include appropriate instance variable(s) to store the pets who reside at the shelter

 include methods that:
 
[*] return a Collection of all of the pets in the shelter

[*] return a specific VirtualPet given its name

[*]allow intake of a homeless pet

[*] allow adoption of a homeless pet

[*] feed all of the pets in the shelter

[*] water all of the pets in the shelter

[*] plays (or performs some other interaction(s)) with an individual pet in the shelter

[*] include a tick method that calls the tick method for each of the pets in the shelter, updating their needs
 
 VirtualPetShelterApp: This class will house your main method, and be responsible for reading user input and writing output to the console.


[*] implements a game loop.


[*]asks for user input.


[*]writes output to the console.


[*]calls VirtualPetShelter's tick method after each interaction

Available user interface actions should include (at minimum)…

[*] feeding all the pets

[*] watering all the pets

[*] playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one

[*] allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one

[*] allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description

