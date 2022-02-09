package virtual_pet;

public class MetallicLlama extends Metallic implements Walkable{
    private String type;

    public MetallicLlama(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "Metallic llama";
    }

    @Override
    public String getType() {
        return type;
    }


    @Override
    public void walk() {
        Metallic.oilLevel -=10;
        Metallic.maintenanceLevel -=10;
        Metallic.chargeLevel -=20;
    }
}
