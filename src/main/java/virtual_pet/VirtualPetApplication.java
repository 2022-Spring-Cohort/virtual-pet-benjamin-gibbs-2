package virtual_pet;
import java.util.Scanner;

import com.sun.tools.javac.Main;

public class VirtualPetApplication {
    private VirtualPet kitty1 = new VirtualPet("KittyONE", 2);
    private VirtualPet kitty2 = new VirtualPet("TWO Kitty",9);
    private OrganicLlama llama1 = new OrganicLlama("Kevin", 9);
    private OrganicTressym tressym1 = new OrganicTressym("Bruce", 12);

    public static void main(String[] args) {





        VirtualPetApplication myMain = new VirtualPetApplication();
        myMain.virtualPetTestMethod();
    }
    public void virtualPetTestMethod() {
        System.out.println("Name: " + kitty1.getName());
        System.out.println("Age: " + kitty1.getAge());
        System.out.println("Hungry: " + kitty1.isHungry());
        System.out.println("Thirsty: " + kitty1.isThirst());
        System.out.println("Boredom: " + kitty1.isBoredom());
        System.out.println("Cuddles: " + kitty1.isCuddleQuotient());
//        System.out.println(kitty1.greeting());
        System.out.println("Llama's name is: " + llama1.getLlamaName());
        System.out.println("Tressym's name is: " + tressym1.getTressymName());
//        kitty1.cuddle();
    //    System.out.println(kitty1.greeting());
      //  System.out.println(kitty2.greeting());
      //  System.out.println(llama1.greeting());
        kitty1.play();
        System.out.println("play");
 //       System.out.println("kitty hungry level " + kitty1.isHungry());
//        kitty1.giveWater();
//        System.out.println("water");
//        System.out.println(kitty1.greeting());

  //      System.out.println("hunger count");
        System.out.println("kitty BOREDOM level " + kitty1.isBoredom());
        kitty1.play();
        System.out.println("play");
        System.out.println("kitty BOREDOM level " + kitty1.isBoredom());
        kitty1.play();
        System.out.println("kitty BOREDOM level " + kitty1.isBoredom());
        kitty1.play();
        System.out.println("kitty BOREDOM level " + kitty1.isBoredom());
        kitty1.play();
        System.out.println("kitty BOREDOM level " + kitty1.isBoredom());
        kitty1.play();
        System.out.println("kitty BOREDOM level " + kitty1.isBoredom());
        kitty1.play();
 //       System.out.println("feed status after 6 feedings");
//        System.out.println(kitty1.greeting());
        System.out.println("kitty THIRST level " + kitty1.isThirst());
/*        int tick = 10;
        while (tick > 0) {
            System.out.println("tick" + tick);
            tick--;
  */      }
    }






