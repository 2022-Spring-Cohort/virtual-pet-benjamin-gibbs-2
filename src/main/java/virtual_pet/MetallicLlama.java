package virtual_pet;

public class MetallicLlama extends Metallic {
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
    public String toString() {
        return "MetallicLlama{" +
                "name='" + name + '\'' +
                ", oilLevel=" + oilLevel +
                ", repairLevel=" + repairLevel +
                ", classification='" + classification + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
