package virtual_pet;

import java.util.ArrayList;

public class PetShelter {
    private ArrayList<Animal> petShelter;

    public PetShelter() {
        petShelter = new ArrayList<Animal>();

        petShelter.add(new Llama("Aui", 18, "She"));
        petShelter.add(new Llama("Layla", 44, "She"));
        petShelter.add(new Llama("Jahi", 23, "He"));
        petShelter.add(new Llama("Pili", 55, "Other"));

        petShelter.add(new Tressym("Shukura", 71, "She"));
        petShelter.add(new Tressym("Anqt", 90, "She"));
        petShelter.add(new Tressym("Kakau", 1, "He"));
        petShelter.add(new Tressym("Zalika", 22, "Other"));


        petShelter.add(new MetallicLlama("Rehema", 16, "She"));
        petShelter.add(new MetallicLlama("Maine", 35, "She"));
        petShelter.add(new MetallicLlama("Mahu", 78, "He"));
        petShelter.add(new MetallicLlama("Aua", 99, "Other"));

        petShelter.add(new MetallicTressym("Iseret", 62, "She"));
        petShelter.add(new MetallicTressym("Hatshepsut", 36, "She"));
        petShelter.add(new MetallicTressym("Tabari", 89, "He"));
        petShelter.add(new MetallicTressym("Khepri", 50, "Other"));
    }

    public void addPetToShelter(Animal animal) {
        petShelter.add(animal);
    }

    public void adoptPet(String petName) {
        Animal petToAdopt = findPetByName(petName);
        if (petShelter.contains(petToAdopt)) {
            petShelter.remove(petToAdopt);
            System.out.println(petToAdopt.getName() + " is so happy to have been adopted and " +
                    petToAdopt.getPronouns() + " can't wait to see " +
                    petToAdopt.getPronoun2() + " new home!");
        }
        else {
            System.out.println("\nWe don't seem to have any pet by that name..." +
                    "\nMaybe you should have another look.");
        }
    }

    public ArrayList<Animal> getPetNames() {
        return petShelter;
    }

    public Animal findPetByName(String petName) {
        int petIndex = -1;
        for(Animal pet : petShelter) {
            if (pet.getName().equalsIgnoreCase(petName)) {
                petIndex = petShelter.indexOf(pet);
            }
        }
        if(petIndex > -1) {
            return petShelter.get(petIndex);
        } else {
            return null;
        }
    }
















    public void getListNames() {
        for( Animal currentAnimals : petShelter)
            System.out.println(currentAnimals.getName());
    }

    public void allPlay() {
        for (Animal petsToPlay : petShelter) {
            if (petsToPlay instanceof Mammal) {
                ((Mammal) petsToPlay).play();
            //    ((Mammal) petsToPlay).allPlayMessage();
               // System.out.println(((Mammal) petsToPlay).status());
            }
            else if (petsToPlay instanceof Metallic) {
                ((Metallic) petsToPlay).play();
             //   System.out.println(((Metallic) petsToPlay).metallicPlayMessage());
            }
        }
    }




    public void allFeed() {
        for( Animal petsToFeed : petShelter)
            if (petsToFeed instanceof Mammal) {
                ((Mammal) petsToFeed).feed();
                System.out.println(petsToFeed.allFeedMessage());
            }
    }

    public void allWater() {
        for( Animal petsToWater : petShelter)
            if (petsToWater instanceof Mammal) {
                ((Mammal) petsToWater).water();
                System.out.println(petsToWater.allWaterMessage());
            }
    }

    public void allClean() {
        for( Animal petsToClean : petShelter)
            if (petsToClean instanceof Mammal) {
                ((Mammal) petsToClean).clean();
//                System.out.println(petsToClean.allCleanMessage());
            }
    }

    public void cleanCage(String cleanPet) {
        for (Animal petClean : petShelter)
            if (petClean instanceof Mammal) {
                ((Mammal) petClean).wasteLevel -= 10;
            }
    }


    public void allOil() {
        for (Animal petsToOil : petShelter)
            if (petsToOil instanceof Metallic) {
                ((Metallic) petsToOil).oil();
//                System.out.println(petsToOil.allOilMessage);
            }
    }

    public void allCharge() {
        for (Animal petsToCharge : petShelter)
            if (petsToCharge instanceof Metallic) {
                ((Metallic) petsToCharge).charge();
//                System.out.println(petsToCharge.allChargeMessage);
            }
    }

    public void allMaintenance() {
        for (Animal petsToMaintenance : petShelter)
            if (petsToMaintenance instanceof Metallic) {
                ((Metallic) petsToMaintenance).maintenance();
                System.out.println(((Metallic) petsToMaintenance).allMaintenanceMessage());
            }
    }

//    public void allStatus() {
//        for( Animal currentAnimals : petShelter)
//            currentAnimals.getStatus();
//    }


    public void mammalTick() {
        Mammal.hungerLevel -= 1;
        Mammal.thirstLevel -= 1;
        Animal.boredomLevel += 1;
        Mammal.wasteLevel += 10;
    }
    public void robotTick() {
        Metallic.oilLevel -= 1;
        Metallic.maintenanceLevel -= 1;
        Metallic.chargeLevel -=20;
        Animal.boredomLevel += 1;
    }





    // THIS ENABLES THE NAMES OF EACH ANIMAL IN THE SHELTER TO BE PRINTED OUT
    // MUST BE USED IN MAIN METHOD AND AS FOLLOWS:
    // System.out.println("Pets in shelter");
    // currentAnimalsInShelter.getListNames();

    String petStatusBar(String name) {
        String petStatusString = "";
        Animal pet = findPetByName(name);
        if (pet instanceof Mammal) {
            petStatusString += String.format("| %-10s | %-16s | %-7s | %-11s | %-6s | %-6s | %-3s | %-3s |\n",
                    pet.getName(), pet.getType(), Animal.getBoredomLevel(), ((Mammal) pet).getHungerLevel(), ((Mammal) pet).getThirstLevel(), "N/A", "N/A", "N/A");
        }
        else if (pet instanceof Metallic) {
            petStatusString += String.format("| %-10s | %-16s | %-7s | %-11s | %-6s | %-6s | %-3s | %-3s |\n",
                    pet.getName(), pet.getType(), ((Animal) pet).getBoredomLevel(), "N/A", "N/A", ((Metallic) pet).getOilLevel(), ((Metallic) pet).getChargeLevel(), ((Metallic) pet).getMaintenanceLevel());
        }
        return petStatusString;

    }

}







