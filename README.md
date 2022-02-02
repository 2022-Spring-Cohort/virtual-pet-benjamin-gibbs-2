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

