package virtual_pet;



public class VirtualPet {
    private String name;
    private int age;
    private int hunger;     //how hungry is pet: ++ is MORE hungry, -- is LESS hungry
    private int thirst;     //how thirsty is pet: ++ is MORE thirsty, -- is LESS thirsty
    private int boredom;    //how bored is pet: ++ is MORE bored, -- is LESS bored
    private int waste;      //how much waste has accumulated: ++ is MORE waste, -- is LESS waste
    private int sickness;   //how sick is pet: ++ is MORE sick, -- is LESS sick
    private int cuddles;    //how much cuddles pet has: ++ has MORE cuddlez, -- has LESS cuddlez (cuddlez will effect happniess)
    private int happiness;  //how happy the pet is: ++ is MORE happy, -- is LESS happy (combination of all previous states - 0 to 100 scale?)
    private String pronouns; // the pronouns the pet will be using
    private String type;    //type of animal
    private String pronoun2;    //to grammatically modify chosen pronouns

        //CONSTRUCTOR  //

    public VirtualPet(String name, int age, String pronouns) {
        this.name = name;
        this.age = age;
        this.hunger = 5;
        this.thirst = 5;
        this.boredom = 5;
        this.waste = 5;
        this.sickness = 5;
        this.cuddles = 5;
        this.happiness = 50;
        this.pronouns = pronouns; // " she " -or- " he " -or- " OTHER (OTHER BECOMES THEY) "
        this.type = "Llama";
        this.pronoun2 = pronoun2; // this is to change the conjugation of the animal's pronouns for grammatical correctness
    }

        // GETTERS  //

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getWaste() {
        return waste;
    }

    public int getSickness() {
        return sickness;
    }

    public int getCuddles() {
        return cuddles;
    }

    public int getHappiness() {
        return happiness;
    }

    public String getPronouns() {
        if(pronouns.equalsIgnoreCase("she")){
            return "she";
        }
        else if(pronouns.equalsIgnoreCase("he")){
            return "he";
        }
        else {
            return "They";
        }
    }

    public String getType() {
        return type;
    }

    public String getPronoun2() {
        if(pronouns.equalsIgnoreCase("she")){
            return "her";
        }
        else if(pronouns.equalsIgnoreCase("he")){
            return "his";
        }
        else
            return "their";
    }

            // SETTERS  //

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }

    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public void setSickness(int sickness) {
        this.sickness = sickness;
    }

    public void setCuddles(int cuddles) {
        this.cuddles = cuddles;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }

    public void setPronouns(String pronouns) {
        this.pronouns = pronouns;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPronoun2(String pronoun2) {
        this.pronoun2 = pronoun2;
    }


        // INTERACTION METHODS AND THEIR ASSOCIATED MESSAGES  //
    public void tick(){
        hunger += 1;
        thirst += 1;
        boredom -= 1;
    }

    public void play() {
        hunger += 5;
        thirst += 3;
        boredom -= 6;
        sickness -= 8;
    }

    public String playMessage(){
        return "You have played with " + getName() + "!" +
                "\n" + getPronoun2() + " levels are now: " +
                "\nHunger Level: " + getHunger() +
                "\nThirst Level: " + getThirst() +
                "\nBordom Level: " + getBoredom();
    }


    public void feed() {
        hunger -= 3;
        thirst += 1;
        sickness -= 2;
    }

    public String feedMessage(){
        return "you have fed " + getName() + "!";
    }


    public void giveWater() {
        thirst -= 3;
        waste += 1;
        sickness -= 3;
    }

    public String giveWaterMessage(){
        return "You have chosen to give " + getName() + " some water." +
                "\nWatering in progress...." +
                "\nYou have watered " + getName() + "!" +
                "\n" + getName() + "'s THIRST level is now " + thirst; // UPDATE THIS TO SAY "SAMMY IS NOW LESS THIRSTY THEN HE WAS
    }

    public void cleanWaste() {
        waste -= 3;
        happiness += 2;
        sickness -= 5;
    }

    public String cleanWasteMessage(){
        return "you have cleaned up after " + getName() + "!";
    }

    public void cuddle() {
        boredom -= 4;
        happiness += 5;
        cuddles += 8;
        sickness -= 3;
    }

    public String cuddleMessage(){
        return "you have cuddled with " + getName() + "!";
    }

    public void goPotty() {
        waste -= 5;
        happiness += 2;
    }

    public String goPottyMessage(){
        return "You have taken " + getName() + " to go potty!";
    }

            // ASCII ART
    public String asciiTressy =
            "   |\\---/|\n" +
            "   | ,_, |\n" +
            "    \\_`_/-..----.\n" +
            " ___/ `   ' ,\"\"+ \\    \n" +
            "(__...'   __\\    |`.___.';\n" +
            "  (_,...'(_,.`__)/'.....+";

    public String asciiLlama =
            " // \n" +
            "<'1 \n" +
            " 11 \n" +
            " llama~ \n" +
            " || || \n" +
            " '' '' ";

        // STATUS AND GREETING  //
    public String status(){
        return name + "'s current status is as follows:" +
                "\nHunger: " + getHunger() +
                "\nThirst: " + getThirst() +
                "\nBoredom: " + getBoredom() +
                "\nWaste: " + getWaste() +
                "\nSickness: " + getSickness() +
                "\nCuddles: " + getCuddles() +
                "\nHappiness: " + getHappiness();
    }
    public String greeting() {
        return "Hello! My name is " + name + "." +
                "\nI am a " + age + " year old " + type +
                ", and my pronouns are " + getPronouns() + "." +
                "\n" + asciiLlama;
    }
}