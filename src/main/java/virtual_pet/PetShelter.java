package virtual_pet;

import java.util.ArrayList;

public class PetShelter {
    ArrayList<Animal> animalsInPetShelter;

    public PetShelter() {
        this.animalsInPetShelter = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animalsInPetShelter.add(animal);
    }

    public void removeAnimal(Animal animal) {
        animalsInPetShelter.remove(animal);
    }

//    public void showAllStatus() {
//        for (Animal currentAnimal : currentAnimalsInShelter) {
//            System.out.println(currentAnimal.statusMessage);
//        }
//    }

    @Override
    public String toString() {
        return
                "animalsInPetShelter=   " + "\n" + animalsInPetShelter +
                        '}';
    }

    // THIS ENABLES THE NAMES OF EACH ANIMAL IN THE SHELTER TO BE PRINTED OUT
    // MUST BE USED IN MAIN METHOD AND AS FOLLOWS:
    // System.out.println("Pets in shelter");
    // currentAnimalsInShelter.getListNames();
    public void getListNames() {
        for( Animal currentAnimals : animalsInPetShelter)
            System.out.println(currentAnimals.getName());
    }

    public void allPay() {
        for( Animal currentAnimals : animalsInPetShelter)
            System.out.println(currentAnimals.allPlayMessage());;
    }

    public void allFeed() {
        for( Animal currentAnimals : animalsInPetShelter)
            System.out.println(currentAnimals.allFeedMessage());;
    }

    public void allWater() {
        for( Animal currentAnimals : animalsInPetShelter)
            System.out.println(currentAnimals.allWaterMessage());;
    }

    public void allCuddle() {
        for( Animal currentAnimals : animalsInPetShelter)
            System.out.println(currentAnimals.allCuddleMessage());;
    }

    public void getStauts() {
        for( Animal currentAnimals : animalsInPetShelter)
            System.out.println(currentAnimals.getName() + " Happiness: " +
                    currentAnimals.getHappinessLevel() +
                    " Boredom: " + currentAnimals.getBoredomLevel() + "\n");
    }

    public void mammalTick() {
        Mammal.hungerLevel -= 1;
        Mammal.thirstLevel -= 1;
        Animal.boredomLevel += 1;
    }
    public void robotTick() {
        Metallic.oilLevel -= 1;
        Metallic.repairLevel -= 1;
        Animal.boredomLevel += 1;
    }
//    public String indexOf(String Sammy) {
//
//        for (Animal currentAnimals : animalsInPetShelter) {
//        }
//        int numIndex = Integer.parseInt(Sammy);
//        System.out.println(numIndex);
//        return Sammy;
//    }

//    public void playWith() {
//        for (Animal animal : animalsInPetShelter) {
//            Mammal.getHappinessLevel();
//        }
//    }







//    public void playWith(Animal jahi) {
//    }
}






