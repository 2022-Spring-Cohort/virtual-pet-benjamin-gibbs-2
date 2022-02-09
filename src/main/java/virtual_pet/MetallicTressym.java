package virtual_pet;

public class MetallicTressym extends Metallic{
    private String type;

    public MetallicTressym(String name, int age, String pronouns) {
        super(name, age, pronouns);
        this.type = "metallic tressym";
    }

    @Override
    public String getType() {
        return type;
    }

}
