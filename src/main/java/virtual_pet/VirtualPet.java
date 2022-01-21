package virtual_pet;

public class VirtualPet {
    private final String name;
    private final int age;
    private int hungry;
    private int thirst;
    private int boredom;
    private boolean cuddleQuotient;

    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.hungry = 5;
        this.thirst = 2;
        this.boredom = 5    ;
        this.cuddleQuotient = false;
    }

//    public void tick();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int isHungry() {
        return hungry;
    }

    public int isThirst() {
        return thirst;
    }

    public int isBoredom() {
        return boredom;
    }

    public boolean isCuddleQuotient() {
        return cuddleQuotient;
    }


    public void play() {
        hungry--;
        thirst--;
        boredom++;
        cuddleQuotient = false;}
    public void feed() {hungry++;}
    public void giveWater() {thirst++;}
    public void cuddle() {cuddleQuotient = true;
        boredom++;}

// change booleans to ints 0 to 10 -

    public String greeting(){
        String ageMessage = "";
        if(age >= 5) {
            ageMessage = "OLD cat";
        }
        else {
            ageMessage = "YOUNG cat";
        }
        String hungerMessage ="";
        if(hungry == 0) {
            hungerMessage = "STARVING";
        }
        else if(hungry > 0 && hungry <= 5) {
            hungerMessage = "Very HUNGRY";
        }
        else if(hungry > 5 && hungry <= 9) {
            hungerMessage = "FULL";
        }
        else {
            hungerMessage = "sTUFFEDkITTY";
        }
        String thirstMessage = "";
        if(thirst > 0 && thirst <= 5) {
            thirstMessage = "I am thirsty";
        }
        else if(thirst > 5 && thirst <= 9) {
            thirstMessage = "NOT Thirsty";
        }

        else {
            thirstMessage = "Dripping with water";
        }
        String bordomMessage = "";
        if(boredom > 0 && boredom <= 5) {
            bordomMessage = "am BORED";
        }
        else if(boredom > 5 && boredom < 9){
            bordomMessage = "ENTERTAINED";
        }
        else {
            bordomMessage = "SUPER DUPER entertained";
        }
        String cuddleMessage = "";
        if(cuddleQuotient) {
            cuddleMessage = "I am cuddled";
        }
        else {
            cuddleMessage = "am in MIGHTY NEED of CUDDLES";
        }

        return "Name: " + name + "\nage: " + ageMessage + "\nHunger:"
                + hungerMessage + "\nThirst: " + thirstMessage + "\nBordeom: "
                + bordomMessage + "\nCuddle: " + cuddleMessage;
    }

/*    tick() {
        int tick = 10;
        while (tick > 0) {
            System.out.println("tick" + tick);
            tick--;
        }
    }
*/
}




// ADD TICK METHOD HERE - USE WHILE LOOP IN APPLICATION



