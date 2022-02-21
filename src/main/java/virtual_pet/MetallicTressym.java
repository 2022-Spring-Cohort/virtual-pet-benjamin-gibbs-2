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
        oilLevel = Math.max(0, oilLevel - 10);
        maintenanceLevel = Math.max(0, maintenanceLevel - 10);
        chargeLevel = Math.max(0, chargeLevel - 20);
    }
}
