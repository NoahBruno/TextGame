import Character.Character;
import Character.Robot;
import Character.Reptile;
import Character.Soldier;
import java.util.Scanner;
import java.util.Random;


public class main {
    public static void main(String[] args) {
        Character Bot= new Character();
        Robot Roboto = new Robot();
        Reptile Rex = new Reptile();
        Soldier Lt = new Soldier();
        int random_int = (int)Math.floor(Math.random()*(4-1+1)+1);
        Scanner in = new Scanner(System.in);
        int userInput = 0;
        System.out.println("Player 1 select character");
        System.out.println("1 = Robo Boto");
        System.out.println("2 = Rex");
        System.out.println("3 = Lt. Death");
        userInput = in.nextInt();
        switch (userInput){
            case 1:
                Roboto.setCharacter();
                Roboto.getCharacter();
                break;
            case 2:
                Rex.setCharacter();
                Rex.getCharacter();
                break;
            case 3:
                Lt.setCharacter();
                Lt.getCharacter();
                break;
            default:
                System.out.println("select a choice 1, 2, or 3!");
        }


        System.out.println("Player 2 select character");
        System.out.println("1 = Robo Boto");
        System.out.println("2 = Rex");
        System.out.println("3 = Lt. Death");
        userInput = in.nextInt();
        switch (userInput){
            case 1:
                Roboto.setCharacter();
                Roboto.getCharacter();
                break;
            case 2:
                Rex.setCharacter();
                Rex.getCharacter();
                break;
            case 3:
                Lt.setCharacter();
                Lt.getCharacter();
                break;
            default:
                System.out.println("select a choice 1, 2, or 3!");
        }

        while(Roboto.getHitPoints() != 0 && Rex.getHitPoints() != 0){
            random_int = (int)Math.floor(Math.random()*(4-1+1)+1);
            Roboto.attack(random_int,Rex.getAttack());
            Rex.attack(random_int, Roboto.getAttack());
            Roboto.getCharacter();
            Rex.getCharacter();
            System.out.println(random_int);
        }

        Roboto.getCharacter();
        Rex.getCharacter();
//        Lt.getCharacter();




//        Lt.setCharacter();
//        Lt.getCharacter();
//        Lt.battle(1,4);
//        Lt.getCharacter();



//        Bot.setName("bob");
//        Roboto.setShoes("nike");
//        Roboto.setWeapon("ax");
//        Roboto.setStats(100);

//        System.out.println(Roboto.getName());
//        System.out.println(Roboto.getShoes());
//        System.out.println(Roboto.getWeapon());
    }
}
