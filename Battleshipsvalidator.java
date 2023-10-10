import java.util.Arrays;

public class Battleshipsvalidator {
    public static boolean fieldValidator(int[][] field) {

        // Set size of board

        final int SIZE = 10;
        int[][] fieldCalculator = new int[SIZE + 2][SIZE + 2];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                fieldCalculator[i + 1][j + 1] = field[i][j];
            }
        }
        // Set size of ships
        int[] ships = {4, 3, 2, 1};
        // Initialize counter of ship length
        int counter = 0;
        // Iter over horizontal ships
        for (int i = 1; i < SIZE + 2; i++) {
            for (int j = 1; j < SIZE + 2; j++) {
                if (fieldCalculator[i][j] == 1) {
                    // Check if corner is occupied
                    if (fieldCalculator[i - 1][j - 1] != 0 || fieldCalculator[i - 1][j + 1] != 0 || fieldCalculator[i + 1][j - 1] != 0 || fieldCalculator[i + 1][j + 1] != 0) {
                        return false;
                    }
                    // Check if ship is horizontal (up and down is free)
                    if (fieldCalculator[i][j + 1] == 1) {
                        // Check if shape is valid
                        if (fieldCalculator[i + 1][j] == 0 && fieldCalculator[i - 1][j] == 0) {
                            counter++;
                        } else {
                            return false;
                        }
                    } else {
                        if (counter > 3) {
                            return false;
                        } else if (fieldCalculator[i + 1][j] == 0 && fieldCalculator[i - 1][j] == 0) {
                            ships[counter]--;
                            counter = 0;
                        }
                    }
                }

            }
        }
        // Iter over vertical ships
        counter = 0;
        for (int i = 1; i < SIZE + 2; i++) {
            for (int j = 1; j < SIZE + 2; j++) {
                if (fieldCalculator[j][i] == 1) {
                    // Check if corner is occupied
                    if (fieldCalculator[j - 1][i - 1] != 0 || fieldCalculator[j - 1][i + 1] != 0 || fieldCalculator[j + 1][i - 1] != 0 || fieldCalculator[j + 1][i + 1] != 0) {
                        return false;
                    }
                    // Check if ship is vertical (left and right is free)
                    if (fieldCalculator[j + 1][i] == 1) {
                        // Check if shape is valid
                        if (fieldCalculator[j][i + 1] == 0 && fieldCalculator[j][i - 1] == 0) {
                            counter++;
                        } else {
                            return false;
                        }
                    } else {
                        if (counter > 3) {
                            return false;
                        } else if (fieldCalculator[j][i + 1] == 0 && fieldCalculator[j][i - 1] == 0) {
                            ships[counter]--;
                            counter = 0;
                        }
                    }
                }

            }
        }

        // Include double calculation of ships
        ships[0] += 4;
        System.out.println(Arrays.deepToString(fieldCalculator));
        System.out.println(Arrays.toString(ships));
        // Check number of ships
        for (int ship : ships) {
            if (ship != 0) {
                return false;
            }
        }
        return true;
    }
}

