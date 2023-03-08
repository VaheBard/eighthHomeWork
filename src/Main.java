import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] field = new int[5][5];
        int[][] agents = {{1, 4}, {0, 1}, {4, 2}, {4, 3}, {4, 3}, {0, 1}, {0, 2}, {4, 3}};

        printField(pandemicMap(field, agents));
    }

    private static void printField(int[][] fieldToPrint) {
        for (int i = 0; i < fieldToPrint.length; i++) {
            for (int j = 0; j < fieldToPrint.length; j++) {
                System.out.print(fieldToPrint[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] pandemicMap(int[][] emptyField, int[][] agentsCoordinate) {
        for (int[] agent : agentsCoordinate) {
            if (emptyField[agent[0]][agent[1]] == 0) {
                emptyField[agent[0]][agent[1]] = 1;
            } else {
                emptyField[agent[0]][agent[1]] *= 2;
            }
        }

        return emptyField;
    }
}
