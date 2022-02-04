package virtual_pet;

import java.util.ArrayList;

public class AdoptionShelter {

    private ArrayList<Animal> petsInAdoptionShelter;

//    public AdoptionShelter(){
//        petsInAdoptionShelter currentAdopted = new ArrayList<Animal>();
//        Animal testllama1 = new Llama("Llama Adopt 1", 2, "she");
//        petsInAdoptionShelter.add(new Llama("Llama Adopt 2", 2, "she"));
//        petsInAdoptionShelter.add(new Llama("Llama Adopt 3", 2, "she"));
//        petsInAdoptionShelter.add(new Llama("Llama Adopt 4", 2, "she"));
//       currentAdopted.addAnimal(testllama1);
//    }

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
        Metallic.maintenanceLevel -= 1;
        Animal.boredomLevel += 1;
    }
    //    public void getAdoptedListStatus() {
//        for( Animal currentAnimals : petsInAdoptionShelter)
//            System.out.println(currentAnimals.getStatus);
//    }



}
