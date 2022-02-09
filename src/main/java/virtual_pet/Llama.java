package virtual_pet;

public class Llama extends Mammal implements Walkable {
    private String type;

    public Llama(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "organic llama";
    }

@Override
public void walk() {
        Mammal.hungerLevel -= 20;
        Animal.boredomLevel += 40;
        Mammal.thirstLevel -= 20;
        Mammal.wasteLevel -= 20;
}

@Override
    public String getType() {
        return type;
    }


}

