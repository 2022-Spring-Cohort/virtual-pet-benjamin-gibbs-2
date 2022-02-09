package virtual_pet;

public abstract class Mammal extends Animal {
    protected static int hungerLevel;
    protected static int thirstLevel;
    protected static int wasteLevel;
    protected String classification;


    public Mammal(String name, int age, String pronouns) {
        super(name, age, pronouns);
        Mammal.hungerLevel = 50;
        Mammal.thirstLevel = 20;
        Mammal.wasteLevel = 40;
        this.classification = "Mammal";
    }

    public static int getHungerLevel() {
        return hungerLevel;
    }

    public static int getThirstLevel() {
        return thirstLevel;
    }

    public static int getWasteLevel() {
        return wasteLevel;
    }

    @Override
    public String getClassification() {
        return classification;
    }

    @Override
    public void play() {
        Mammal.hungerLevel -= 20;
        Animal.boredomLevel += 40;
        Mammal.thirstLevel -= 20;
        Animal.happinessLevel += 30;
    }

    public String allPlayMessage() {
        return "All pets have been played with.";
    }

    public void feed() {
        Mammal.hungerLevel += 30;
        Mammal.thirstLevel -= 10;
        Animal.boredomLevel += 20;
        Animal.happinessLevel += 10;
    }

    public void water() {
        Mammal.thirstLevel += 40;
        Animal.happinessLevel += 25;
    }

    public void clean() {
        Mammal.wasteLevel -= 20;
        Animal.happinessLevel += 20;
    }


}











