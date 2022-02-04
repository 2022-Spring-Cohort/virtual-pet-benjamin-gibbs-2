package virtual_pet;

public class Llama extends Mammal {
    private String type;

    public Llama(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "llama";
    }

    @Override
    public String toString() {
        return "Llama{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return type;
    }

//    @Override
//public void walking(int speed) {
//        System.out.println("Llamas walk at " + speed + " miles per hour!S");
//    }
}

