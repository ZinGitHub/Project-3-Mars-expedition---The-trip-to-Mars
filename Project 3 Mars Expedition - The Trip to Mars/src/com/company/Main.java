// Zinedin Bautista
// I estimate this project to be made in 25 minutes.
// Project took me about 30 minutes.

package com.company;

import java.util.ArrayList;
import java.util.Scanner;

// 4 pounds of food = 1 box per week.
// Each crew member has 12 boxes of food.
// 12 * 4 = 48 pounds of food.

public class Main
{
    public static void main(String[] args)
    {
        // Obtain user input on crew names.
        Scanner crewName = new Scanner(System.in);

        // Int variable that will restrict the amount of captains to one only.
        int captain_name_number = 1;

        //An ArrayList for crew names.
        ArrayList<String> arrayOfCrewName = new ArrayList<String>();

        // 2D array for the amount of food boxes.
        // 5 = crew size.
        // 12 = weeks in Mars exploration.
        int foodBoxes[][] = new int[5][12];

        // For loop for the length of the food box array.
        for (int i = 0; i < foodBoxes.length; i++)
        {
            // For loop specifically for the i value in the length of the food box array.
            for (int j = 0; j < foodBoxes[i].length ; j++)
            {
                // Total amount of food in pounds.
                // 2D array.
                foodBoxes[i][j] = 48;
            }
        }

        // Introduction.
        System.out.println("*** Welcome back captain ***\n");
        System.out.println("* This program's purpose is to: *\n");
        System.out.println("\t* Report on the crew members and the size. *");
        System.out.println("\t* Report on the food storage. *\n");
        System.out.println("-------------------------------------------------");

        // Ask user for crew size.
        System.out.println("How many are in the crew (INCLUDING CAPTAIN): ");
        int numOfCrewMembers = Integer.parseInt(crewName.nextLine());

        // String array of crew member names in correlation to number of crew members.
        String arrayOfNames[] = new String[numOfCrewMembers];

        // If statement to have reassurance that the crew size can only be less than five.
        if(arrayOfNames.length == 5)
        {
            // For loop to ask for crew member names four times.
            for (int i = 0; i < 4; i++)
            {
                // While loop for the reassurance that the user can only input one captain name.
                while(captain_name_number > 0)
                {
                    // Ask user for captain name.
                    System.out.println("Enter captain name: ");
                    arrayOfCrewName.add(crewName.next());
                    captain_name_number--;
                }
                // Ask user for crew member names.
                System.out.print("Enter your name crew member " + (i+1) + " : ");
                arrayOfCrewName.add(crewName.next());
                arrayOfNames[i] = crewName.nextLine();
            }

            // Display captain name and crew members.
            System.out.print("Captain name: " + arrayOfCrewName.get(0) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(1) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(2) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(3) + "\n");
            System.out.print("Crew member: " + arrayOfCrewName.get(4) + "\n");

            // Display the size of the crew.
            System.out.println("\nTotal crew size: " + arrayOfCrewName.size() + "\n");

            // For loop to display the crew member in association to the week number and the amount of food.
            for (int i = 0; i < numOfCrewMembers; i++)
            {
                // Food storage decline.
                // 2D array.
                foodBoxes[i][0] -= 2;
                foodBoxes[i][1] -= 6;
                foodBoxes[i][2] -= 10;
                foodBoxes[i][3] -= 14;
                foodBoxes[i][4] -= 18;
                foodBoxes[i][5] -= 22;
                foodBoxes[i][6] -= 26;
                foodBoxes[i][7] -= 30;
                foodBoxes[i][8] -= 34;
                foodBoxes[i][9] -= 38;
                foodBoxes[i][10] -= 42;
                foodBoxes[i][11] -= 46;

                // Display the name of each crew member (including captain).
                System.out.println(arrayOfCrewName.get(i) + ":");

                // For loop to keep displaying the amount of weeks and food depending on foodBoxes[i].length.
                for (int j = 0; j < foodBoxes[i].length; j++)
                {
                    // Display the week number and the amount of food in pounds available.
                    System.out.println("\tWeek " + (j+1) + " Food: " + foodBoxes[i][j]);
                }
                System.out.println();
            }

            // Conclusion
            System.out.println("* Status report complete. *");
            System.out.println("* Have a nice day. *");
        }
        else // Else statement if user states that there more or less than five total crew members.
        {
            // Warning notification.
            System.out.println("* There should only be five crew members in total. *");
            System.out.println("* Please recount how many crew members there are, else stay on high-alert. *");
        }

    }
}
