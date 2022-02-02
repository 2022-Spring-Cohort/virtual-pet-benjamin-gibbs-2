package virtual_pet;

public class Tressym extends Mammal{
private String type;

    public Tressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "tressym";
    }

//    @Override
//    public String toString() {
//        return "Tressym{" +
//                "name='" + name + '\'' +
//                "classification='" + classification + '\'' +
//                ", type='" + type + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }
}


