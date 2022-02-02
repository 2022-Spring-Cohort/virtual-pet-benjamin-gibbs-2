package virtual_pet;

public abstract class Mammal extends Animal {
    protected static int hungerLevel;
    protected static int thirstLevel;
    protected String classification;

    public Mammal(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.hungerLevel = 5;
        this.thirstLevel = 5;
        this.classification = "Organic";

    }

    public String getClassification() {
        return classification;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }



}








