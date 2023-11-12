//Tommy Hudson MontyHall program
package e6point23;

import java.util.Random;
//Class to test the Monty Hall Paradox 1000 times.
public class MontyHall
{
    public static void main(String[] args)
    {
    	//Variables to represent the door with the car behind it, the door with the goat behind it, and the door that the player has chosen.
        int carDoor, playerDoor, goatDoor;
        //Variables to keep counts of if the player wins by sticking with their chosen door or switching it after seeing the goat.
        int switchWin, stayWin;
        //Create random number generator.
        Random rand = new Random();

        switchWin = 0;
        stayWin = 0;
        //For-loop set to run for 1000 iterations.
        for(int i = 0; i < 1000; i++)
        {
        	//Randomly choose the door that holds the car.
            carDoor = rand.nextInt(3)+1;
            //Randomly choose the door that the player chooses.
            playerDoor = rand.nextInt(3)+1;
            //Randomly choose a door for the goat that is not the same as the player.
            goatDoor = rand.nextInt(3)+1;
            //While-loop to insure that the goat door is not the same as the player door.
            while (goatDoor == playerDoor)
            {
            goatDoor = rand.nextInt(3)+1;
            }
            //Player wins by staying with their first choice.
            if (carDoor == playerDoor)
            {
                stayWin++;
            }
            //Player wins by switching their door.
            else
            {
                switchWin++;
            }
        }
        //Print the results of the counts.
        System.out.println("The player would win " + switchWin + " by switching doors.");
        System.out.println("The player would win " + stayWin + " by not switching doors.");

    }
}
