package virtual_pet;

import java.util.Locale;
import java.util.Scanner;

public class AnimalInheritanceMain {

        public static void main(String[] args) {
                PetShelter currentAnimalsInShelter = new PetShelter();
                Animal jahi = new Llama("Jahi", 23, "he");
                Animal kakau = new Tressym("Kakau", 01, "he");
                Animal aui = new Llama("Aui", 18, "she");
                Animal zalika = new Tressym("Zalika", 22, "other");
                currentAnimalsInShelter.addAnimal(jahi);
                currentAnimalsInShelter.addAnimal(kakau);
                currentAnimalsInShelter.addAnimal(aui);
                currentAnimalsInShelter.addAnimal(zalika);

                int interActionCount = 2;
                while (interActionCount > 0) {
                        System.out.println("Hello and welcome to the Pet Shelter! " +
                                "\nWhat would you like to do today?" +
                                "\nRemember, you only have time for " + interActionCount + " more activities today!" +
                                "\n1: See a list of all the pets in the Shelter" +
                                "\n2: Admit a stray pet into the Shelter" +
                                "\n3: ADOPT a pet from the Shelter" +
                                "\n4: Interact with a specific pet" +
                                "\n5: Interact with ALL of the pets");
                        Scanner userInPick = new Scanner(System.in);
                        String userInteractionPick = userInPick.nextLine();

                        switch (userInteractionPick) {
                                case "1":
                                        System.out.println("Here are the names of all the pets in the Shelter:");
                                        currentAnimalsInShelter.getListNames();
                                        break;
                                case "2":
                                        System.out.println("how many pets are we taking into the shelter today?" +
                                                "\nPLEASE ONLY ENTER 1 FOR NOW");
                                        Scanner petIntoShelterNum = new Scanner(System.in);
                                        String petIntakeNum = petIntoShelterNum.nextLine();
                                        int petIntakeNumber = Integer.parseInt(petIntakeNum);

                                        if (petIntakeNumber != 1) {
                                                System.out.println("Sorry, it seems you have entered an invalid choice");
                                                break;
                                        }

                                        while (petIntakeNumber > 0) {
                                                System.out.println("What kind of pet we are admitting to the Shelter?" +
                                                        "\n1: Llama" +
                                                        "\n2: Tressym");
                                                Scanner usIn2 = new Scanner(System.in);
                                                String userPetSpecies = usIn2.nextLine();

                                                System.out.println("What is the pet's name?");
                                                Scanner userPetNameInput = new Scanner(System.in);
                                                String userPetName = userPetNameInput.nextLine();

                                                System.out.println("What is the pet's age?");
                                                Scanner userPetAgeInput = new Scanner(System.in);
                                                String userAge = userPetAgeInput.nextLine();
                                                int userPetAge = Integer.parseInt(userAge);

                                                System.out.println("What pronoun will your pet use?" +
                                                        "\nPlease chose:" + "\nShe" + "\nHe" + "\nOther");
                                                Scanner userPetPronounInput = new Scanner(System.in);
                                                String userPetPronoun = userPetPronounInput.nextLine();

                                                switch (userPetSpecies) {
                                                        case "1":
                                                                Animal newLlamaPet = new Llama(userPetName, userPetAge, userPetPronoun);
                                                                currentAnimalsInShelter.addAnimal(newLlamaPet);
                                                                break;
                                                        case "2":
                                                                Animal newTressymPet = new Tressym(userPetName, userPetAge, userPetPronoun);
                                                                currentAnimalsInShelter.addAnimal(newTressymPet);
                                                                break;
                                                }
                                                System.out.println(userPetName + " has been admitted to the Shelter.");
                                                petIntakeNumber--;

                                        }
                                        break;
                                case "3":
                                        AdoptionShelter currentAnimaAdopted = new AdoptionShelter();
                                        System.out.println("Which pet would you like to ADOPT today?");
                                        currentAnimalsInShelter.getListNames();
                                        Scanner adopName = new Scanner(System.in);
                                        String adoptedAnimal = adopName.nextLine();

                                        switch (adoptedAnimal.toLowerCase()) {
                                                case "jahi":
                                                        currentAnimaAdopted.adoptPet(new Llama("Jahi", 23, "he"));
                                                        System.out.println("\nCongrats! You have adopted:");
                                                        currentAnimaAdopted.getAdoptedListNames();
                                                        currentAnimalsInShelter.removeAnimal(jahi);
//                        System.out.println("pets in shelter now");
//                        currentAnimalsInShelter.getListNames();
//                        System.out.println("\nHere are the pets in your ADDOPTED SHELTER");
//                        currentAnimaAdopted.getAdoptedListNames();
                                                        break;
                                                case "kakau":
                                                        currentAnimaAdopted.adoptPet(new Tressym("Kakau", 01, "he"));
                                                        System.out.println("\nCongrats! You have adopted:");
                                                        currentAnimaAdopted.getAdoptedListNames();
                                                        currentAnimalsInShelter.removeAnimal(kakau);
//                        System.out.println("pets in shelter now");
//                        currentAnimalsInShelter.getListNames();
//                        System.out.println("pets in ADDOPTED SHELTER");
//                        currentAnimaAdopted.getAdoptedListNames();
                                                        break;
                                                case "aui":
                                                        currentAnimaAdopted.adoptPet(new Llama("Aui", 18, "she"));
                                                        System.out.println("\nCongrats! You have adopted:");
                                                        currentAnimaAdopted.getAdoptedListNames();
                                                        currentAnimalsInShelter.removeAnimal(aui);
//                        System.out.println("pets in shelter now");
//                        currentAnimalsInShelter.getListNames();
//                        System.out.println("pets in ADDOPTED SHELTER");
//                        currentAnimaAdopted.getAdoptedListNames();
                                                        break;
                                                case "zalika":
                                                        currentAnimaAdopted.adoptPet(new Tressym("Zalika", 22, "other"));
                                                        System.out.println("\nCongrats! You have adopted:");
                                                        currentAnimaAdopted.getAdoptedListNames();
                                                        currentAnimalsInShelter.removeAnimal(zalika);
//                        System.out.println("pets in shelter now");
//                        currentAnimalsInShelter.getListNames();
//                        System.out.println("pets in ADDOPTED SHELTER");
//                        currentAnimaAdopted.getAdoptedListNames();
                                                        break;
                                        }
                                case "4":
                                        System.out.println("Which pet would you like to interact with today?");
                                        currentAnimalsInShelter.getListNames();
                                        Scanner intSing = new Scanner(System.in);
                                        String interactSingly = intSing.nextLine().toLowerCase();

                                        System.out.println("What would you like to do with the pet today?" +
                                                "\n1: PLAY" +
                                                "\n2: FEED" +
                                                "\n3: WATER" +
                                                "\n4: CUDDLE" +
                                                "\n5: STATUS");
                                        Scanner petIntact = new Scanner(System.in);
                                        String petInteract = petIntact.nextLine();

                                        switch (petInteract) {
                                                case "1":
                                                        switch (interactSingly) {
                                                                case "jahi":
                                                                        jahi.play();
                                                                        System.out.println(jahi.playMessage());
                                                                        break;
                                                                case "kakau":
                                                                        kakau.play();
                                                                        System.out.println(kakau.playMessage());
                                                                        break;
                                                                case "aui":
                                                                        aui.play();
                                                                        System.out.println(aui.playMessage());
                                                                        break;
                                                                case "zalika":
                                                                        zalika.play();
                                                                        System.out.println(zalika.playMessage());
                                                                        break;
                                                        }
                                                        break;
                                                case "2":
                                                        switch (interactSingly) {
                                                                case "jahi":
                                                                        jahi.feed();
                                                                        System.out.println(jahi.feedMessage());
                                                                        break;
                                                                case "kakau":
                                                                        kakau.feed();
                                                                        System.out.println(kakau.feedMessage());
                                                                        break;
                                                                case "aui":
                                                                        aui.feed();
                                                                        System.out.println(aui.feedMessage());
                                                                        break;
                                                                case "zalika":
                                                                        zalika.feed();
                                                                        System.out.println(zalika.feedMessage());
                                                                        break;
                                                        }
                                                        break;
                                                case "3":
                                                        switch (interactSingly) {
                                                                case "jahi":
                                                                        jahi.water();
                                                                        System.out.println(jahi.waterMessage());
                                                                        break;
                                                                case "kakau":
                                                                        kakau.water();
                                                                        System.out.println(kakau.waterMessage());
                                                                        break;
                                                                case "aui":
                                                                        aui.water();
                                                                        System.out.println(aui.waterMessage());
                                                                        break;
                                                                case "zalika":
                                                                        zalika.water();
                                                                        System.out.println(zalika.waterMessage());
                                                                        break;
                                                        }
                                                        break;
                                                case "4":
                                                        switch (interactSingly) {
                                                                case "jahi":
                                                                        jahi.cuddle();
                                                                        System.out.println(jahi.cuddleMessage());
                                                                        break;
                                                                case "kakau":
                                                                        kakau.cuddle();
                                                                        System.out.println(kakau.cuddleMessage());
                                                                        break;
                                                                case "aui":
                                                                        aui.cuddle();
                                                                        System.out.println(aui.cuddleMessage());
                                                                        break;
                                                                case "zalika":
                                                                        zalika.cuddle();
                                                                        System.out.println(zalika.cuddleMessage());
                                                                        break;
                                                        }
                                                        break;
                                                case "5":
                                                        switch (interactSingly) {
                                                                case "jahi":
                                                                        jahi.status();
                                                                        System.out.println(jahi.status());
                                                                        break;
                                                                case "kakau":
                                                                        kakau.status();
                                                                        System.out.println(kakau.status());
                                                                        break;
                                                                case "aui":
                                                                        aui.status();
                                                                        System.out.println(aui.status());
                                                                        break;
                                                                case "zalika":
                                                                        zalika.status();
                                                                        System.out.println(zalika.status());
                                                                        break;
                                                        }
                                                        break;
                                        }
                                        break;
                                case "5": //INTERACT WITH ALL THE ANIMALS
                                        System.out.println("What would you like to do with ALL the pets today?" +
                                                "\n1: PLAY" +
                                                "\n2: FEED" +
                                                "\n3: WATER" +
                                                "\n4: CUDDLE" +
                                                "\n5: STATUS");
                                        Scanner allPetIntact = new Scanner(System.in);
                                        String allPetInteract = allPetIntact.nextLine();
                                        switch (allPetInteract) {
                                                case "1":
                                                        currentAnimalsInShelter.allPay();
                                                        break;
                                                case "2":
                                                        currentAnimalsInShelter.allFeed();
                                                        break;
                                                case "3":
                                                        currentAnimalsInShelter.allWater();
                                                        break;
                                                case "4":
                                                        currentAnimalsInShelter.allCuddle();
                                                        break;
                                                case "5":
                                                        currentAnimalsInShelter.getStauts();
                                                        break;
                                        }
                                        break;
                        }

                        currentAnimalsInShelter.mammalTick();
                        currentAnimalsInShelter.robotTick();
                        interActionCount--;
                }



                System.out.println("\nYou are out of time for today. " +
                        "We hope to see you again tomorrow!");
        }

}






















