package virtual_pet;

public class Tressym extends Mammal {
private String type;

    public Tressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "organic tressym";
    }



    @Override
    public String toString() {
        return name;
    }


    public String getType() {
        return type;
    }
}


