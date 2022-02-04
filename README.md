# Required Tasks
## VirtualPet class
- [ ] You will need to create a VirtualPet class.
- [ ] Create at least three instance variables (aka attributes aka properties aka fields).
- [ ] Create at least three methods (messages you send to your pet).
- [ ] Create a tick() method that represents the passage of time.
## VirtualPetApp class
- [ ] Create a main method.
- [ ] implements a game loop.
- [ ] asks for user input.
- [ ] writes output to the console.


## Stretch Tasks
- [ ] Give the pet the ability to take care of some of its own needs.

Pets are not robots - they usually have some sort of self-determination! When tick() is called, you might want to have your pet take a look at its needs and address one, prioritizing whichever need is highest. You could also make your pet uncooperative - when the user tries to feed the pet, for example, you might make the pet refuse to eat if it is bored. Remember how we created an instance of the Random class to create a random number generator? You might want to incorporate that.

- [ ] Create a visual representation of your pet.

Rather than using numbers to convey your pet’s status, you could have some sort of visual representation of the pet. I.e., instead of printing hunger: 50, you could use smileys or ASCII art to show hunger when hunger >= 50.


## Iteration 2
Need to add shelter - array lists
Our pets are housed in a shelter and cared for by you. You can interact with one pet at a time, or all pets. They can be adopted.
- [ ]    Ability for players to admit pets into the shelter or adopt them
- [ ]    Ability for players to see a list of all pets in the shelter
- [ ]    Ability for players to see the current status of ONE pet: such as hunger, boredom, and health
- [ ]    Ability for players to see the current status of ALL PETS AT ONCE, such as hunger, boredom, and health


        - break Status call into individual Status calls (still keep MasterStatus) - make way to arrange information in a readable format.
- [ ]    Ability for players to choose to interact with ONE PET, such as feed, play, and take to doctor
- [ ]    Ability for players to choose to interact with ALL PETS, such as feed, play, and take to doctor

# MOVE MENUS AND INTERACTION CHOICES TO METHODS AND OUT OF MAIN!!
#Sprint 2
Deliverables

All prior functionality, plus:

- [ ]    Don't forget to add tests!
- [ ]    Useful player instructions in the form of a README.md file
- [ ]    Create a VirtualPetShelter class that will be used to manage multiple pets
- [ ]    Ability to intake many pets into the VirtualPetShelter
- [ ]    Ability for players to see a list of all pets in the shelter, for example with name and the attributes of your Virtual Pets
- [ ]    Ability for players to interact with one pet or multiple pets, such as feed, play, and water/drink.
- [ ]    Ability for players to see the current status of all pets in a table (see example below for inspiration)

| Name     | Boredom | Hunger | Thirst |

| -------- | ------ | ------- | ------ |

| Fido     | 43     | 22      | 43     |

| Fluffles | 63     | 34      | 56     |
#Sprint 3
Deliverables

- [ ]    Support for 4 types of pets: Organic Cats, Organic Dogs, Robotic Cats, Robotic Dogs.
- [ ]    Robots require oil and maintenance.
- [ ]    Organic cats and dogs require cage & litter box cleaning.
- [ ]    Allow users to take dogs on walks.
- [ ]    Walking organic pets decreases the rate at which they soil their cages/litter boxes.
- [ ]    Walking robotic pets increases their need for oil and maintenance.