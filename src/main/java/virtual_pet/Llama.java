package virtual_pet;

public class Llama extends Mammal implements Walkable {
    private String type;

    public Llama(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "organic llama";
    }

@Override
public void walk() {
        hungerLevel = Math.max(0, hungerLevel - 20);
        boredomLevel = Math.min(100, boredomLevel + 40);
        thirstLevel = Math.max(0, thirstLevel - 20);
        wasteLevel = Math.max(0, wasteLevel - 20);
}

@Override
    public String getType() {
        return type;
    }


}

