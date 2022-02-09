package virtual_pet;

public class MetallicTressym extends Metallic implements Flying {
    private String type;

    public MetallicTressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "metallic tressym";
    }

    @Override
    public String getType() {
        return type;
    }
    @Override
    public void fly() {
        Metallic.oilLevel -=10;
        Metallic.maintenanceLevel -=10;
        Metallic.chargeLevel -=20;
    }
}
