package virtual_pet;

public abstract class Animal {
    protected String name;
    private int age;
    protected static int boredomLevel;
    protected static int happinessLevel;
    private String pronouns;
    private String pronoun2;
    private String classification;


    public Animal(String name, int age, String pronouns) {
        this.name = name;
        this.age = age;

        this.boredomLevel = 5;

        this.happinessLevel = 7;
        this.pronouns = pronouns;
        this.pronoun2 = pronoun2;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getBoredomLevel() {
        return boredomLevel;
    }

    public static int getHappinessLevel() {
        return happinessLevel;
    }

    public String getClassification() {
        return classification;
    }

    public String getPronouns() {
        if (pronouns.equalsIgnoreCase("she")) {
            return "she";
        }
        else if (pronouns.equalsIgnoreCase("he")) {
            return "he";
        }
        else {
            return "They";
        }
    }

    public String getPronoun2() {

        if (pronouns.equalsIgnoreCase("she")) {
            return "her";
        }
        else if (pronouns.equalsIgnoreCase("he")) {
            return "his";
        }
        else {
            return "their";
        }
    }

    public abstract void play();

    public String allFeedMessage() {
        return getName() + " has been feed.";
    }

    public String allWaterMessage() {
        return getName() + " has been watered.";
    }

    public String singlePlayMessage() {
        return getName() + " has been played with.";
    }

    public String allPlayMessage() {
        return "all pets have been played with.";
    }



    public abstract String getType();

    public static String getHeader() {
        String statusHeader = "| Name       | Type              | Boredom | Hunger     | Thirst | Oil | Charge | Maintance |\n" +
                "| ---------- | ----------------- | ------- | ---------- | -------| --- | ------ | --------- |\n";
        return statusHeader;
    }

    public static String llamaASCI() {
        String llamaArt = " // \n" +
                "<'1 \n" +
                " 11 \n" +
                " llama~ \n" +
                " || || \n" +
                " '' '' ";
        return llamaArt;
    }

    public static String tressymASCI() {
        String tressymArt =
                "   |\\---/|\n"+
                        "   | ,_, |\n"+
                        "    \\_`_/-..----.\n"+
                        " ___/ `   ' ,\"\"+ \\    \n"+
                        "(__...'   __\\    |`.___.';\n"+
                        "  (_,...'(_,.`__)/'.....+";
        return tressymArt;
}


}