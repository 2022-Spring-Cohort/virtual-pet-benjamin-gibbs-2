package virtual_pet;
import java.util.Scanner;
import java.time.Clock;
import java.time.Duration;
import jdk.swing.interop.SwingInterOpUtils;

import javax.lang.model.element.NestingKind;

public class VirtualPetApplication {

//    private VirtualPet test1 = new VirtualPet("Sammy", 10, "mine own");
//    private MetalLlama metalLlama1 = new MetalLlama()

    public static void main(String[] args) {

        VirtualPetApplication myMain = new VirtualPetApplication();
        myMain.virtualPetTestMethod();

}
    public void virtualPetTestMethod() {
        System.out.println("Lets make a new pet today!" + "\nWhat is the pet's name?");
        Scanner userPetNameInput = new Scanner(System.in);
        String userPetName = userPetNameInput.nextLine();
//        System.out.println(userPetName);

        System.out.println("what is the pet's age?");
        Scanner userPetAgeInput = new Scanner(System.in);
        String userAge = userPetNameInput.nextLine();
//        System.out.println(userPetAge);
        int userPetAge = Integer.parseInt(userAge);

        System.out.println("What pronoun will your pet use?" + "\nPlease chose:" + "\nShe" + "\nHe" + "\nOther");
        Scanner userPetPronounInput = new Scanner(System.in);
        String userPetPronoun = userPetPronounInput.nextLine();
//        System.out.println(userPetPronoun);
        VirtualPet userPet = new VirtualPet(userPetName, userPetAge, userPetPronoun);
        System.out.println(userPet.greeting());
        System.out.println();
        System.out.println("\nNow that you are visiting me, what should we do?");

        int interActionCount = 4;
        while (interActionCount > 0) {
            System.out.println("Remember, you only have time for " + interActionCount + " more activities today!" +
                    "\n" +
                    "\nPlease enter the number of the activity you would like to do from the following list:" +
                    "\n1: PLAY with " + userPet.getName() +
                    "\n2: FEED " + userPet.getName() +
                    "\n3: CUDDLE with " + userPet.getName() +
                    "\n4: Give WATER to " + userPet.getName() +
                    "\n5: CLEAN out the litter box for " + userPet.getName() +
                    "\n6: Take " + userPet.getName() + " to go POTTY" +
                    "\n7: Get " + userPet.getName() + "'s STATUS" +
                    "\n8: Say goodbye to " + userPet.getName() + " for today.");

            Scanner userActivityInput = new Scanner(System.in);
            String userActivityPick = userActivityInput.nextLine();

            switch (userActivityPick) {
                case "1":
                    userPet.play();
                    System.out.println(userPet.playMessage());
                    break;
                case "2":
                    userPet.feed();
                    System.out.println(userPet.feedMessage());
                    break;
                case "3":
                    userPet.cuddle();
                    System.out.println(userPet.cuddleMessage());
                    break;
                case "4":
                    userPet.giveWater();
                    System.out.println(userPet.giveWaterMessage());
                    break;
                case "5":
                    userPet.cleanWaste();
                    System.out.println(userPet.cleanWasteMessage());
                    break;
                case "6":
                    userPet.goPotty();
                    System.out.println(userPet.goPottyMessage());
                    break;
                case "7":
                    System.out.println(userPet.status());
                    break;
                case "8":
                    System.out.println("Goodbye Hooman." +
                            " I'll see you tomorrow!");
                    return;

            }
            userPet.tick();
            interActionCount--;
        }
        System.out.println("\nYou are out of time for today. " +
                userPet.getName() + " hopes to see you again tomorrow!");
    }
}
