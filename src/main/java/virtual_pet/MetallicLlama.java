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
        oilLevel = Math.max(0, oilLevel - 10);
        maintenanceLevel = Math.max(0, maintenanceLevel - 10);
        chargeLevel = Math.max(0, chargeLevel - 20);
    }
}
