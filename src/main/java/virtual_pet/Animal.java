package virtual_pet;

public abstract class Animal {
    protected String name;
    private int age;
    private String type;
    private String species;
    protected static int boredomLevel;
    private int wasteLevel;
    private int sicknessLevel;  //REMOVE THIS LINE ...
    private static int cuddleLevel; //...AND THIS LINE...?
    private static int happinessLevel;
    private String pronouns;
    private String pronoun2;
//    private String = type;  this should be ORGANIC/METAL
//      private String = species; this should be LLAMA, TRESSYM, ??

    public Animal(String name, int age, String pronouns) {
        this.name = name;
        this.age = age;
    //    this.type = type;
        this.boredomLevel = (int) Math.floor(Math.random() * (70 - 30) + 30);
        this.wasteLevel = 5;
        this.sicknessLevel = 5;
        this.cuddleLevel = 5;
        this.happinessLevel = 5;
        this.pronouns = pronouns;
        this.pronoun2 = pronoun2;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public String getSpecies() {
        return species;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public int getWasteLevel() {
        return wasteLevel;
    }

    public int getSicknessLevel() {
        return sicknessLevel;
    }

    public int getCuddleLevel() {
        return cuddleLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public String getPronouns() {
        if (pronouns.equalsIgnoreCase("she")) {
            return "she";
        }
        else if (pronouns.equalsIgnoreCase("he")) {
            return "he";
        }
        else {
            return "They";
        }
    }

    public String getPronoun2() {

        if (pronouns.equalsIgnoreCase("she")) {
            return "her";
        }
        else if (pronouns.equalsIgnoreCase("he")) {
            return "his";
        }
        else {
            return "their";
        }
    }


    public void play() {
        Mammal.hungerLevel -= 2;
        Animal.boredomLevel += 4;
        Mammal.thirstLevel  -= 2;
        Animal.happinessLevel += 3;
    }

    public String playMessage(){
        return "You have played with " + getName() + "!" +
                "\n" + getPronoun2() + " " +
                "Hunger Level is now: " + Mammal.hungerLevel +
                "\n" + getPronoun2() + " " +
                "Thirst Level is now: " + Mammal.thirstLevel +
                "\n" + getPronoun2() + " " +
                "Boredom Level is now: " + Animal.boredomLevel +
                "\n" + getPronoun2() + " " +
                "Happiness Level is now: " + Animal.happinessLevel;
    }

    public String allPlayMessage() {
        return getName() + " has been played with.";
    }

    public void feed() {
        Mammal.hungerLevel += 3;
        Mammal.thirstLevel -= 1;
        Animal.boredomLevel += 2;
        Animal.happinessLevel += 1;
    }

    public String feedMessage(){
        return "You have feed " + getName() + "!" +
                "\n" + getPronoun2() + " " +
                "Hunger Level is now: " + Mammal.hungerLevel +
                "\n" + getPronoun2() + " " +
                "Thirst Level is now: " + Mammal.thirstLevel +
                "\n" + getPronoun2() + " " +
                "Boredom Level is now: " + Animal.boredomLevel +
                "\n" + getPronoun2() + " " +
                "Happiness Level is now: " + Animal.happinessLevel;
    }

    public String allFeedMessage() {
        return getName() + " has been feed.";
    }


    public void water() {
        Mammal.thirstLevel += 4;
        Animal.happinessLevel += 1;
    }

    public String waterMessage(){
        return "You have given water to " + getName() + "!" +
                "\n" + getPronoun2() + " " +
                "Thirst Level is now: " + Mammal.thirstLevel +
                "\n" + getPronoun2() + " " +
                "Happiness Level is now: " + Animal.happinessLevel;
    }

    public String allWaterMessage() {
        return getName() + " has been watered.";
    }


    public void cuddle() {
        Animal.boredomLevel += 4;
        Animal.happinessLevel += 4;
        Animal.cuddleLevel += 7;
    }

    public String cuddleMessage(){
        return "You have cuddled with " + getName() + "!" +
                "\n" + getPronoun2() + " " +
                "Boredom Level is now: " + Animal.boredomLevel +
                "\n" + getPronoun2() + " " +
                "Happiness Level is now: " + Animal.happinessLevel +
                "\n" + getPronoun2() + " " +
                "Cuddle Level is now: " + Animal.cuddleLevel;
    }

public String status() {
    return getName() + "'s current status is:" +
            "\nHappiness: " + Animal.happinessLevel +
            "\nBoredom: " + Animal.boredomLevel +
            "\nHunger: " + Mammal.hungerLevel +
            "\nThirst: " + Mammal.thirstLevel +
            "\nCuddle: " + Animal.cuddleLevel;
}

    public String allCuddleMessage() {
        return getName() + " has been cuddled.";
    }
}

