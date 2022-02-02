package virtual_pet;

import java.util.ArrayList;

public class AdoptionShelter {
    ArrayList<Animal> petsInAdoptionShelter;

    public AdoptionShelter() { this.petsInAdoptionShelter = new ArrayList<>(); }

    public void adoptPet(Animal animal) {
        petsInAdoptionShelter.add(animal);
    }

    @Override
    public String toString() {
        return "AdoptionShelter{" +
                "petsInAdoptionShelter=" + petsInAdoptionShelter +
                '}';
    }

    public void getAdoptedListNames() {
        for (Animal currentAnimals : petsInAdoptionShelter)
            System.out.println(currentAnimals.getName());
    }

    public void adoptedMammalTick() {
        Mammal.hungerLevel -= 1;
        Mammal.thirstLevel -= 1;
        Animal.boredomLevel -= 1;
    }
    public void adoptedRobotTick(){
        Metallic.oilLevel -= 1;
        Metallic.repairLevel -= 1;
        Animal.boredomLevel += 1;
    }
    //    public void getAdoptedListStatus() {
//        for( Animal currentAnimals : petsInAdoptionShelter)
//            System.out.println(currentAnimals.getStatus);
//    }



}
