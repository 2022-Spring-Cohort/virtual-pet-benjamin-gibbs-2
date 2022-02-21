package virtual_pet;

public abstract class Mammal extends Animal {
    protected int hungerLevel;
    protected int thirstLevel;
    protected int wasteLevel;
    protected String classification;


    public Mammal(String name, int age, String pronouns) {
        super(name, age, pronouns);
        hungerLevel = randomNum(5, 100);
        thirstLevel = randomNum(5, 100);
        wasteLevel = randomNum(5, 100);
        this.classification = "Mammal";
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public int getWasteLevel() {
        return wasteLevel;
    }

    @Override
    public String getClassification() {
        return classification;
    }

    @Override
    public void play() {
        hungerLevel = Math.max(0, hungerLevel - 20);
        boredomLevel = Math.min(100, boredomLevel + 40);
        thirstLevel = Math.max(0, thirstLevel - 20);
        happinessLevel = Math.min(100, happinessLevel + 30);
    }

    public String allPlayMessage() {
        return "All pets have been played with.";
    }

    public void feed() {
        hungerLevel = Math.min(100, hungerLevel + 30);
        thirstLevel = Math.max(0, thirstLevel - 10);
        boredomLevel = Math.min(100, boredomLevel + 20);
        happinessLevel = Math.min(100, happinessLevel + 10);
    }

    public void water() {
        thirstLevel = Math.min(100, thirstLevel + 40);
        happinessLevel = Math.min(100, happinessLevel + 25);
    }

    public void clean() {
        wasteLevel = Math.max(0, wasteLevel - 20);
        happinessLevel = Math.min(100, happinessLevel + 20);
    }

    public void tick() {
        hungerLevel = Math.max(0, hungerLevel - 1);
        thirstLevel = Math.max(0, thirstLevel - 1);
        boredomLevel = Math.min(100, boredomLevel + 1);
        wasteLevel = Math.min(100, wasteLevel + 10);
    }

}











