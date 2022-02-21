package virtual_pet;

public class Tressym extends Mammal implements Flying {
private String type;

    public Tressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "organic tressym";
    }

    @Override
    public void fly() {
        hungerLevel = Math.max(0, hungerLevel - 20);
        boredomLevel = Math.max(100, boredomLevel + 40);
        thirstLevel = Math.max(0, thirstLevel - 20);
        wasteLevel = Math.max(0, wasteLevel - 20);
    }


    @Override
    public String toString() {
        return name;
    }


    public String getType() {
        return type;
    }
}


