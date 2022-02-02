//package virtual_pet;
//
//import javax.swing.plaf.ColorUIResource;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class AnimalInheritanceMain {
//    public static void main(String[] args) {
////                Animal tressym1 = new Tressym("George", 23, "nonbinary");
////                Animal tressym2 = new Tressym("Bruce", 43, "she");
////                Animal llama1 = new Llama("Tiger", 99, "hE");
////                Animal llama2 = new Llama("Sammy", 44, "butterfly");
////                              ArrayList<Animal> animals = new ArrayList<>();
////                animals.add(tressym1);
////                animals.add(tressym2);
////                animals.add(llama1);
////                animals.add(llama2);
////                animals.add(new Llama("Jahi", 23, "he"));
////                animals.add(new Tressym("Kakau", 01, "he"));
////                animals.add(new Llama("Aui", 18, "she"));
////                          animals.add(new Tressym("Zalika", 22, "other"));
//
//
//        // CREATING A SHELTER FOR A NEW GAME - HARD CODED PETS AND USER ADD PETS
//        // USERS CAN ADD A CHOSEN NUMBER OF PETS AND CHOOSE THEIR NAME
//        // ADD SWITCH/CASE FOR ANIMAL TYPE OPTIONS
//        PetShelter currentAnimalsInShelter = new PetShelter();
////                Animal myTressym = new Tressym("test1", 92, "she");
////                Animal myLlama = new Llama("test2", 100, "other");
////                Animal myAnimal = new Llama("Test3", 23, "she");
////                Animal myTest = new MetallicLlama("test4", 190, "other");
////                Animal myMetTres = new MetallicTressym("shiny boy", 1984, "hef");
////                currentAnimalsInShelter.addAnimal(tressym1);
////                currentAnimalsInShelter.addAnimal(llama2);
////                currentAnimalsInShelter.addAnimal(myTressym);
////                currentAnimalsInShelter.addAnimal(myLlama);
////                currentAnimalsInShelter.addAnimal(myAnimal);
////                currentAnimalsInShelter.addAnimal(myTest);
////                currentAnimalsInShelter.addAnimal(myMetTres);
//        currentAnimalsInShelter.addAnimal(new Llama("Jahi", 23, "he"));
//        currentAnimalsInShelter.addAnimal(new Tressym("Kakau", 01, "he"));
//        currentAnimalsInShelter.addAnimal(new Llama("Aui", 18, "she"));
//        currentAnimalsInShelter.addAnimal(new Tressym("Zalika", 22, "other"));
//
//        // to implement:
//        // [ ] make master list and/or sublists for options for all the following:
//        // [ ] implement LOOPS for the lists / sublists
//        // [X] adding pets to shelter
//        // [x] adopting pets (add pet to ADOPTED and remove from SHELTER)
//        // [ ] returning pets (add pet to SHELTER and remove from ADOPTED)
//        // [ ] removing SHELTER and/or ADOPTED pets from lists by:
//        // [ ] RETURN TO WILD
//        // [ ] PET DIED
//        // [ ] pet FUNERAL array
//        // [ ] pet TOWILD array
//
//
//        // THIS ALLOWS THE USER TO CHOSE HOW MANY PETS
//        // WILL BE TAKEN INTO THE SHELTER
//        // ENTERING 0 (ZERO) WILL EXIT THE LOOP
//        System.out.println("how many pets are we taking into the shelter today?");
//        Scanner petIntoShelterNum = new Scanner(System.in);
//        String petIntakeNum = petIntoShelterNum.nextLine();
//        int petIntakeNumber = Integer.parseInt(petIntakeNum);
//
//        // ADDED AN IF/BREAK SO IF 0 (ZERO) IS ENTERED THE REST
//        // OF THE PROGRAM WILL CONTINUE RUNNING
//        while (petIntakeNumber > 0) {
//            System.out.println("We have " + petIntakeNumber + " more pets to add today."
//                    + "\nWhat is the pet's name?");
//            Scanner userPetNameInput = new Scanner(System.in);
//            String userPetName = userPetNameInput.nextLine();
////        System.out.println(userPetName);
//
//
//            //      FIND WAY TO GET PET TYPE INTO THIS LOOP TO
//            //      CREATE THE CORRECT TYPE OF ANIMAL AND NOT HARDCODE THE TYPE
//            //      USE A SWITCH/CASE SOMEWHERE? WITHIN ANIMAL CLASS?
////                              call ADD METHOD in this loop using SPECIES and TYPE loops
////                        System.out.println("what is the pet's TYPE?");
////                        Scanner userPetTypeInput = new Scanner(System.in);
////                        String userPetType = userPetTypeInput.nextLine();
//
//            System.out.println("What TYPE of pet are we adding?" +
//                    "\n1: Organic");
//            //+ "\n2: Metalic");
//            Scanner usIn = new Scanner(System.in);
//            String userPetType = usIn.nextLine();
////
//            System.out.println("What is the SPECIES of the pet we are adding to the Shelter?" +
//                    "\n1: Llama" +
//                    "\n2: Tressym");
//            Scanner usIn2 = new Scanner(System.in);
//            String userPetSpecies = usIn2.nextLine();
//
//
//            System.out.println("what is the pet's age?");
//            Scanner userPetAgeInput = new Scanner(System.in);
//            String userAge = userPetAgeInput.nextLine();
////        System.out.println(userPetAge);
//            int userPetAge = Integer.parseInt(userAge);
//
//            System.out.println("What pronoun will your pet use?" +
//                    "\nPlease chose:" + "\nShe" + "\nHe" + "\nOther");
//            Scanner userPetPronounInput = new Scanner(System.in);
//            String userPetPronoun = userPetPronounInput.nextLine();
//            System.out.println(userPetPronoun);
//
//
//            switch (userPetType) {
//                case "1":
//                    switch (userPetSpecies) {
//                        case "1":
//                            Animal newLlamaPet = new Llama(userPetName, userPetAge, userPetPronoun);
//                            currentAnimalsInShelter.addAnimal(newLlamaPet);
//                            break;
//                        case "2":
//                            Animal newTressymPet = new Tressym(userPetName, userPetAge, userPetPronoun);
//                            currentAnimalsInShelter.addAnimal(newTressymPet);
//                            break;
//                    }
//                    break;
////                                case "2":
////                                        switch (userPetSpecies) {
////                                                case "1":
////                                                        Animal newMetalicllamaPet = new MetallicLlama(userPetName, userPetAge, userPetPronoun);
////                                                        currentAnimalsInShelter.addAnimal(newMetalicllamaPet);
////                                                        break;
////                                                case "2":
////                                                        Animal newMetalicTressymPet = new MetallicTressym(userPetName, userPetAge, userPetPronoun);
////                                                        currentAnimalsInShelter.addAnimal(newMetalicTressymPet);
////                                                        break;
////                                        }
//            }
//            petIntakeNumber --;
//            if (petIntakeNumber == 0)
//                break;
//        }
//
//
//// play feed give water
//
////              // THIS PRINTS OUT A LIST OF THE NAMES OF
////              EACH ANIMAL IN THE PET SHELTER
//        System.out.println("Pets in shelter");
//        currentAnimalsInShelter.getListNames();
//        System.out.println("\nPet Status:");
//        currentAnimalsInShelter.getStauts();
//        System.out.println("-----------------\n" +
//                "| 1  2  3  4  5 |\n" +
//                "-----------------\n");
//// THIS MOVES ADOPTED PETS INTO THE ADOPTED PET SHELTER ARRAYLIST
//// IN THE ADOPTIONSHELTER CLASS
////                currentAnimalsInShelter.indexOf("Sammy");
////
////                System.out.printf("Would you like to ADOPT a pet?" +
////                        "\nNote: this will REMOVE the pet from the SHELTER." +
////                        "\n1: YES" +
////                        "\n2: NO");
////
////                AdoptionShelter currentAnimaAdopted = new AdoptionShelter();
////                currentAnimaAdopted.adoptPet(llama2);
////                System.out.println("\n" +currentAnimaAdopted.toString());
////
////
//////      THIS REMOVES THE ADOPTED ANIMAL FROM THE ANIMAL IN SHELTER ARRAYLIST
//////      IN THE PETSHELTER CLASS
////                currentAnimalsInShelter.removeAnimal(llama2);
////                System.out.println("\n" + currentAnimalsInShelter.toString());
////                System.out.println("\n" +currentAnimaAdopted.toString());
//
//
//    }
//}
//
//
//
//
//
//
//
