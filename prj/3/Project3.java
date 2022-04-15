import java.util.Scanner;

public class Project3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int houseNumber = 0; // deterimines house number for output.

        while (true) { // Runs program until user input for dimensions are invalid for house

            houseNumber++;

            System.out.print("Enter width and then length of the house diagram:  ");
            // User input for W and L
            int width = input.nextInt();
            int length = input.nextInt();

            if (length < 3 || width < 3) { // Programs ends if the dimensions are 0 0 or invalid dimensions for house
                break;
            }

            // User input to build 2x2 matrix.
            String[][] house = new String[length][width]; // House 2x2 matrix is built based on width and length.

            // user input of house diagram onto matrix
            for (int i = 0; i < length; i++) {
                System.out.println("Enter part of house diagram layer # " + i); // House is built based on layers from
                                                                                // top to bottom
                String user_line = input.next();
                for (int j = 0; j < width; j++) {
                    house[i][j] = user_line.charAt(j) + ""; // each char of the String is converted from 'char' -->
                                                            // String.

                }
            }

            // Loop used to find matrix location of "*" , the entry location
            for (int entryrow = 0; entryrow < length; entryrow++) {
                System.out.println("");
                for (int entrycol = 0; entrycol < width; entrycol++) {
                    if (house[entryrow][entrycol].equals("*")) { // if string method "stringname.equals " is true, the
                                                                 // entrylocation stringname[row][column] is found
                        System.out.println("HOUSE " + houseNumber);
                        findExit(house, entryrow, entrycol, length, width); // Void method must be run in for-loop since
                                                                            // variables entrycol,entryrow are within
                                                                            // the scope
                        break; // Programs terminates after the break.
                    }

                }
            }

        }
        input.close();
    }

    public static void findExit(String[][] house, int entryrow, int entrycol, int length, int width) {

        char direction; // char direction used to access switch statements.

        // determine move point based on entry position
        if (entryrow == 0) { // Top layer -- goes down
            direction = 'D'; // down
        } else if (entryrow == length - 1) { // Bottom layer -- goes up
            direction = 'U'; // up

        } else if (entrycol == 0) { // left layer
            direction = 'R'; // right

        } else { // right layer
            direction = 'L'; // left

        }

        boolean exitPlaced = true;

        while (exitPlaced) { // terminates when exit is found and replaces "x" in house matrix

            switch (direction) {
                case 'U':
                    --entryrow; // the ([row][]) goes upwards.
                    break;
                case 'D': // the ([row][]) goes downwards.
                    ++entryrow;
                    break;
                case 'L':
                    --entrycol; // the ([][column]) goes left.
                    break;
                case 'R':
                    ++entrycol; // the ([][column]) goes right.
                    break;
            }

            String locationCheck = house[entryrow][entrycol]; // the updateing location based on entrycol and entryrow

            if (locationCheck.equals("x")) { // if the changed location hits any of the walls; exit has been located
                String replaceExit = locationCheck.replace("x", "&"); // replace with "&"; the exit
                house[entryrow][entrycol] = replaceExit;
                exitPlaced = false; // the loop ends
            } else if (locationCheck.equals("/")) { // based on direction when it hits "/"
                if (direction == 'U') {
                    direction = 'R';
                    continue;
                }
                if (direction == 'D') {
                    direction = 'L';
                    continue;
                }
                if (direction == 'L') {
                    direction = 'D';
                    continue;
                }
                if (direction == 'R') {
                    direction = 'U';
                    continue;

                }
            } else if (locationCheck.equals("\\")) { // based on direction when it hits "\"
                if (direction == 'U') {
                    direction = 'L';
                    continue;
                }
                if (direction == 'D') {
                    direction = 'R';
                    continue;
                }
                if (direction == 'L') {
                    direction = 'U';
                    continue;
                }
                if (direction == 'R') {
                    direction = 'D';
                    continue;
                }
            }
        }

        // print house with exit
        for (int k = 0; k < length; k++) {
            System.out.println(" ");
            for (int l = 0; l < width; l++) {
                System.out.print(house[k][l]);
            }
        }

    }
}