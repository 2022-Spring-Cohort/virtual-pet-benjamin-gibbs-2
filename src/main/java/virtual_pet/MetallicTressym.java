package virtual_pet;

public class MetallicTressym extends Metallic{
    private String type;

    public MetallicTressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "Metallic tressym";
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "MetallicTressym{" +
                "name='" + name + '\'' +
                ", oilLevel=" + oilLevel +
                ", maintenanceLevel=" + maintenanceLevel +
                ", classification='" + classification + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
