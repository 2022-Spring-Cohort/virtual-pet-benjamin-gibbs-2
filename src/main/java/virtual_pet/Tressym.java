package virtual_pet;

public class Tressym extends Mammal implements Flying {
private String type;

    public Tressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "organic tressym";
    }

    @Override
    public void fly() {
        Mammal.hungerLevel -= 20;
        Animal.boredomLevel += 40;
        Mammal.thirstLevel -= 20;
        Mammal.wasteLevel -= 20;
    }


    @Override
    public String toString() {
        return name;
    }


    public String getType() {
        return type;
    }
}


