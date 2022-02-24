package TextGameMap;

import java.util.Scanner;

public class Map {

    static int[][] map = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 2, 2, 2, 4, 2, 2, 5, 1},
            {1, 3, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 5, 4, 2, 2, 2, 5, 2, 1},
            {1, 2, 3, 3, 0, 5, 5, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 3, 2, 5, 2, 2, 3, 2, 2, 1},
            {1, 4, 4, 2, 2, 2, 2, 2, 2, 1},
            {1, 2, 5, 2, 2, 2, 3, 4, 5, 1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}};

    static int x = map[9][0];
    static int y = map[0][9];
    static int currentPos = map[x][y];

    public static void mapEvents() {
        if (currentPos == 5) {
            currentPos = 6;
            System.out.println("You just kept walking");
        } else if (currentPos == 4) {
            System.out.println("Boss 1 appears");
            //battle starts here
            //if (Boss1.dead()){
            //boss 2 ..etc
            // }

            //if all bossed are dead set current pos to 6;
        } else if (currentPos == 3) {
            System.out.println("You heard a growl in the distance...");
        } else if (currentPos == 2) {
            System.out.println("There is ruble blocking this pathway...find another way");
        } else if (currentPos == 1) {
            System.out.println("There is an erie feeling here...let's keep going");
        }
    }
    public static void checkBounds () {
        if(x < 0) {
            x = 0;
            currentPos = map[x][y];
            System.out.println("There is a dragon in this room...You went back to the previous room ");
        } else if(y < 0) {
            y = 0;
            currentPos = map[x][y];
            System.out.println("There is a broken bridge here...You found a different path");
        } else if (x == 10) {
            x = 9;
            currentPos = map[x][y];
            System.out.println("You tripped on a rock...let's get back to finding out way out");
        } else if (y == 10) {
            y = 9;
            currentPos = map[x][y];
            System.out.println("You were hit with an arrow...You went back to the previous room");
            //subract hitpoint method here
        }
    }

    public static void main(String[] args) {
        currentPos = map[0][0];
        Scanner in = new Scanner(System.in);
        System.out.println("you woke up in a strange place...");
        System.out.println("you see three weapons on the ground, pick a weapon");

        //user picks weapon

        System.out.println("Let's find a way out");

        System.out.println("Select a key");
        String userInput;
        System.out.print("w = up ");
        System.out.print("s = down ");
        System.out.print("d = right ");
        System.out.println("a = left");

        while (currentPos != 6) {
            System.out.println("Where to now?");
            userInput = in.nextLine();
            switch (userInput) {
                case "w":
                    y += 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents();
                    break;
                case "s":
                    y -= 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents();
                    break;
                case "a":
                    x -= 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents();
                    break;
                case "d":
                    x += 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents();
                    break;
                default:
                    System.out.println("You stayed in place!");
            }
        }
    }
}