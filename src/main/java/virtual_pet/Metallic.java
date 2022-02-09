package virtual_pet;

public abstract class Metallic extends Animal {
    protected static int oilLevel;
    protected static int maintenanceLevel;
    protected static int chargeLevel;
    protected String classification;

    public Metallic(String name, int age, String pronouns) {
        super(name, age, pronouns);
        Metallic.oilLevel = 90;
        Metallic.maintenanceLevel = 50;
        this.classification = "Metallic";
        Metallic.chargeLevel = 100;
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public String getClassification() {
        return classification;
    }

    public static int getChargeLevel() {
        return chargeLevel;
    }

    @Override
    public void play() {
        Metallic.oilLevel -= 10;
        Metallic.maintenanceLevel -= 10;
        Metallic.chargeLevel -= 20;
        Animal.happinessLevel += 10;
        Animal.boredomLevel -= 10;
    }

    public void oil() {
        Metallic.oilLevel += 10;
        Metallic.maintenanceLevel += 20;
    }

    public void maintenance() {
        Metallic.maintenanceLevel += 20;
    }

    public void charge() {
        Metallic.chargeLevel += 100;
    }


    public String allMaintenanceMessage() {
        return getName() + " has been Maintenanced" +
                "\nLevel is now: " + Metallic.maintenanceLevel;
    }
}


