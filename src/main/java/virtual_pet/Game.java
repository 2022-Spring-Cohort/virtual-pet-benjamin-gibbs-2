package virtual_pet;

import java.util.Scanner;

public class Game {

        PetShelter myShelter;
//        AdoptionShelter myAdoptionShelter;

        public static void main(String[] args) {
                Game myMain = new Game();
                myMain.petTestMethod();
        }

        public void petTestMethod() {
                myShelter = new PetShelter();


                System.out.println("Hello and welcome to the Pet Shelter! ");
                boolean gamePlay = true;
                while (gamePlay) {
                        System.out.println(
                                "\nWhat would you like to do today?" +
                                        "\n" +
                                        "\n1: See a list of all the pets in the Shelter" +
                                        "\n2: Admit a stray pet into the Shelter" +
                                        "\n3: ADOPT a pet from the Shelter" +
                                        "\n4: Interact with a specific pet" +
                                        "\n5: Interact with ALL of the pets" +
                                        "\n0: Quit game.");
                        Scanner userInPick = new Scanner(System.in);
                        String userInteractionPick = userInPick.nextLine();

                        switch (userInteractionPick) {
                                case "1":
                                        System.out.println("Here are the names of all the pets in the Shelter:");
                                        for (Animal currentPet : myShelter.getPetNames()) {
                                                System.out.println(currentPet.getName() + ": is a " + currentPet.getType() + " of the type: " + currentPet.getClassification());
                                        }
                                        break;
                                case "2":
                                        System.out.println("how many pets are we taking into the shelter today?" +
                                                "\nPlease keep in mind we have very limited space at the moment.");
                                        Scanner petIntoShelterNum = new Scanner(System.in);
                                        String petIntakeNum = petIntoShelterNum.nextLine();
                                        int petIntakeNumber = Integer.parseInt(petIntakeNum);
                                        if (petIntakeNumber >= 4) {
                                                System.out.println("Sorry, we just don't have enough room for all those pets.");
                                                break;
                                        }
                                        while (petIntakeNumber > 0) {
                                                System.out.println("What SPECIES of pet we are admitting to the Shelter?" +
                                                        "\n1: Llama" +
                                                        "\n2: Tressym");
                                                Scanner usIn2 = new Scanner(System.in);
                                                String userPetSpecies = usIn2.nextLine();

                                                System.out.println("What TYPE of pet we are admitting to the Shelter?" +
                                                        "\n1: Mammal" +
                                                        "\n2: Metallic");
                                                Scanner usIn3 = new Scanner(System.in);
                                                String userPetClassification = usIn3.nextLine();

                                                System.out.println("What is the pet's name?");
                                                Scanner userPetNameInput = new Scanner(System.in);
                                                String userPetName = userPetNameInput.nextLine();

                                                System.out.println("What is " + userPetName + "'s age?");
                                                Scanner userPetAgeInput = new Scanner(System.in);
                                                String userAge = userPetAgeInput.nextLine();
                                                int userPetAge = Integer.parseInt(userAge);

                                                System.out.println("What pronoun will " + userPetName + " use?" +
                                                        "\nPlease chose:" + "\nShe" + "\nHe" + "\nOther");
                                                Scanner userPetPronounInput = new Scanner(System.in);
                                                String userPetPronoun = userPetPronounInput.nextLine();
                                                switch (userPetSpecies) {
                                                        case "1":
                                                                switch (userPetClassification) {
                                                                        case "1":
                                                                                Animal newLlamaPet = new Llama(userPetName, userPetAge, userPetPronoun);
                                                                                myShelter.addPetToShelter(newLlamaPet);
                                                                                break;
                                                                        case "2":
                                                                                Animal newMetallicLlamaPet = new MetallicLlama(userPetName, userPetAge, userPetPronoun);
                                                                                myShelter.addPetToShelter(newMetallicLlamaPet);
                                                                                break;
                                                                }
                                                                System.out.println(Animal.llamaASCI());
                                                                break;
                                                        case "2":
                                                                switch (userPetClassification) {
                                                                        case "1":
                                                                                Animal newTressymPet = new Tressym(userPetName, userPetAge, userPetPronoun);
                                                                                myShelter.addPetToShelter(newTressymPet);
                                                                                break;
                                                                        case "2":
                                                                                Animal newMetallicTressymPet = new MetallicTressym(userPetName, userPetAge, userPetPronoun);
                                                                                myShelter.addPetToShelter(newMetallicTressymPet);
                                                                                break;
                                                                }
                                                                System.out.println(Animal.tressymASCI());
                                                                break;
                                                }
                                                System.out.println("\n" + userPetName + " has been admitted to the Shelter.\n");
                                                petIntakeNumber--;
                                        }
                                        break;
                                case "3":
//                                        AdoptionShelter currentAnimaAdopted = new AdoptionShelter();
                                        System.out.println("Which pet would you like to ADOPT today?");
                                        myShelter.getListNames();
                                        Scanner adopName = new Scanner(System.in);
                                        String adoptedAnimal = adopName.nextLine();
                                        myShelter.adoptPet(adoptedAnimal);

                                        break;
                                case "4":
                                        System.out.println("Which pet would you like to interact with today?");
                                        myShelter.getListNames();
                                        Scanner intSing = new Scanner(System.in);
                                        String interactSingly = intSing.nextLine().trim();
                                        Animal chosenPet = null;
                                        for (Animal selectedPet : myShelter.getPetNames()) {
                                                if (selectedPet.getName().equalsIgnoreCase(interactSingly)) {
                                                        chosenPet = (Animal) selectedPet;
                                                        if (chosenPet != null) {
                                                                System.out.println("What would you like to do with " + selectedPet.getName() + " today?" +
                                                                        "\n1: PLAY" +
                                                                        "\n2: FEED" +
                                                                        "\n3: WATER" +
                                                                        "\n4: CLEAN" +
                                                                        "\n5: OIL" +
                                                                        "\n6: CHARGE" +
                                                                        "\n7: MAINTENANCE" +
                                                                        "\n8: WALK" +
                                                                        "\n9: STATUS");
                                                                Scanner petIntact = new Scanner(System.in);
                                                                String petInteract = petIntact.nextLine();
                                                                switch (petInteract) {
                                                                        case "1": // PLAY
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        currentPet.play();
                                                                                                        System.out.println(currentPet.singlePlayMessage());
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        currentPet.play();
                                                                                                        System.out.println(currentPet.singlePlayMessage());
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;

                                                                        case "2": // FEED
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        ((Mammal) currentPet).feed();
                                                                                                        System.out.println(currentPet.allFeedMessage());
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        System.out.println(currentPet.getName() + " is a " + currentPet.getClassification() + " pet and doesn't need to be feed.");
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;

                                                                        case "3": // WATER
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        ((Mammal) currentPet).water();
                                                                                                        System.out.println(currentPet.allWaterMessage());
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        System.out.println(currentPet.getName() + " is a " + currentPet.getClassification() + " pet and doesn't need water.");
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;

                                                                        case "4": // CLEAN CAGE/BOX
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        ((Mammal) currentPet).clean();
                                                                                                        System.out.println(currentPet.getName() + "'s Litterbox has been cleaned.");
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        System.out.println(currentPet.getName() + " is a " + currentPet.getClassification() + " pet and doesn't use a Litterbox.");
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;
                                                                        case "5": // OIL
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        ((Metallic) currentPet).oil();
                                                                                                        System.out.println(currentPet.getName() + " has been well oiled.");
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        System.out.println(currentPet.getName() + " is a " + currentPet.getClassification() + " pet and doesn't like to be " + "...oiled.");
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;
                                                                        case "6": // CHARGE
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        ((Metallic) currentPet).charge();
                                                                                                        System.out.println(currentPet.getName() + " has been fully charged.");
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        System.out.println(currentPet.getName() + " is a " + currentPet.getClassification() + " pet and can't be charged");
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;

                                                                        case "7": // MAINTENANCE
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        if (currentPet instanceof Metallic) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        ((Metallic) currentPet).maintenance();
                                                                                                        System.out.println(currentPet.getName() + " has been well maintained.");
                                                                                                }
                                                                                        }
                                                                                        if (currentPet instanceof Mammal) {
                                                                                                if (interactSingly.equalsIgnoreCase(currentPet.getName())) {
                                                                                                        System.out.println(currentPet.getName() + " is a " + currentPet.getClassification() + " pet and can't be 'maintained'.");
                                                                                                }
                                                                                        }
                                                                                }
                                                                                break;
                                                                        case "8":
                                                                                break;
                                                                        case "9": // STATUS
                                                                                System.out.println(Animal.getHeader());
                                                                                for (Animal currentPet : myShelter.getPetNames()) {
                                                                                        System.out.println(myShelter.petStatusBar(selectedPet.getName()));
                                                                                        break;
                                                                                }
                                                                }
                                                        }
                                                        else{
                                                                        System.out.println("I'm sorry, we don't appear to have any animal in our shelter by that name...");
                                                                }


                                                        }





                                        }
break;
                                case "5": //INTERACT WITH ALL THE ANIMALS
                                        System.out.println("What would you like to do with ALL the pets today?" +
                                                "\n1: PLAY" +
                                                "\n2: FEED" +
                                                "\n3: WATER" +
                                                "\n4: CLEAN" +
                                                "\n5: OIL" +
                                                "\n6: CHARGE" +
                                                "\n7: MAINTENANCE" +
                                                "\n8: STATUS");
                                        Scanner allPetIntact = new Scanner(System.in);
                                        String allPetInteract = allPetIntact.nextLine();

                                        switch (allPetInteract) {
                                                case "1":
                                                        myShelter.allPlay();
                                                        System.out.println("all pets have been played with.");
                                                        break;
                                                case "2":
                                                        myShelter.allFeed();
                                                        System.out.println("all pets have been played with.");
                                                        break;
                                                case "3":
                                                        myShelter.allWater();
                                                        System.out.println("all pets have been played with.");
                                                        break;
                                                case "4":
                                                        myShelter.allClean();
                                                        System.out.println("all pets have been played with.");
                                                        break;
                                                case "5":
                                                        myShelter.allOil();
                                                        System.out.println("all Metallic pets have been fully oiled.");
                                                        break;
                                                case "6":
                                                        myShelter.allCharge();
                                                        System.out.println("all Metallic pets have been fully charged.");
                                                        break;
                                                case "7":
                                                        myShelter.allMaintenance();
                                                        System.out.println("all Metallic pets have been played maintained.");
                                                        break;
                                                case "8":
                                                        System.out.println(Animal.getHeader());
                                                        for (Animal currentPet : myShelter.getPetNames()) {
                                                                System.out.println(myShelter.petStatusBar(currentPet.getName()));
                                                        }
                                                        break;
                                        }
                                        break;

                                case "0":
                                        gamePlay = false;
                                        System.out.println("\nYou are out of time for today. " +
                                                "We hope to see you again tomorrow!");
                                        return;
                        }
                        myShelter.mammalTick();
                        myShelter.robotTick();
                }
        }
}
//                                        }
//
//                        }
//                }
//        }
//}
//
//
