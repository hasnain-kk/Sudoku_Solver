/*  
@Author: Hasnain KK
@Date: 18/March/2023
@Time: 11:52 AM
@Project: Sudoku Solver
@Subject: DSA
@Teacher: Miss. Shamshad Naveed 
*/

/**

This class is a Sudoku Solver that allows the user to input a Sudoku puzzle and find its solution.
It takes input from the user in the form of a 9x9 grid, where the user can enter numbers from 1-9
for the pre-filled cells of the Sudoku puzzle and 0 or any negative number for empty cells.
The solver then solves the puzzle using a recursive backtracking algorithm and displays the solution if found.
*/
import java.util.Scanner;

public class SudokuSolver {

        // The size of the Sudoku grid (9x9)
        private static final int GRID_SIZE = 9;
        // The size of each sub-grid (3x3)
        private static final int SUBGRID_SIZE = 3;

        private int[][] grid;

        // Constructor that takes the initial Sudoku grid as input
        public SudokuSolver(int[][] grid) {
                this.grid = grid;
        }

        // Solve the Sudoku puzzle using a backtracking algorithm
        public boolean solve() {
                // Find the next empty cell in the grid
                int row = 0;
                int col = 0;
                boolean found = false;
                for (int i = 0; i < GRID_SIZE; i++) {
                        for (int j = 0; j < GRID_SIZE; j++) {
                                if (grid[i][j] == 0) {
                                        row = i;
                                        col = j;
                                        found = true;
                                        break;
                                }
                        }
                        if (found) {
                                break;
                        }
                }

                // If there are no more empty cells, the puzzle is solved
                if (!found) {
                        return true;
                }

                // Try each number from 1 to 9 in the current cell
                for (int num = 1; num <= GRID_SIZE; num++) {
                        if (isValid(num, row, col)) {
                                // If the number is valid in the current cell, fill it in
                                grid[row][col] = num;

                                // Recursively solve the rest of the puzzle
                                if (solve()) {
                                        return true;
                                }

                                // If the puzzle cannot be solved with the current number, backtrack
                                grid[row][col] = 0;
                        }
                }

                // If no number works, backtrack to the previous cell
                return false;
        }

        // Check if a given number is valid in a given cell
        private boolean isValid(int num, int row, int col) {
                // Check if the number is already in the same row or column
                for (int i = 0; i < GRID_SIZE; i++) {
                        if (grid[row][i] == num || grid[i][col] == num) {
                                return false;
                        }
                }

                // Check if the number is already in the same sub-grid
                int subgridRow = row / SUBGRID_SIZE * SUBGRID_SIZE;
                int subgridCol = col / SUBGRID_SIZE * SUBGRID_SIZE;
                for (int i = subgridRow; i < subgridRow + SUBGRID_SIZE; i++) {
                        for (int j = subgridCol; j < subgridCol + SUBGRID_SIZE; j++) {
                                if (grid[i][j] == num) {
                                        return false;
                                }
                        }
                }

                return true;
        }

        // Print the current Sudoku grid
        public void printGrid() {
                for (int i = 0; i < GRID_SIZE; i++) {
                        if (i % 3 == 0 && i != 0) {
                                System.out.println("------+-------+------");
                        }
                        for (int j = 0; j < GRID_SIZE; j++) {
                                if (j % 3 == 0 && j != 0) {
                                        System.out.print("| ");
                                }
                                System.out.print(grid[i][j] + " ");
                        }
                        System.out.println();
                }
        }

        // Method that reads the Sudoku puzzle from input
        public static int[][] readInput() {
                Scanner scanner = new Scanner(System.in);
                int[][] grid = new int[9][9];
                System.out.println(
                                "Enter the Sudoku grid, row by row. Use 0 or any negative number to represent empty cells.");
                for (int i = 0; i < 9; i++) {
                        System.out.println("Row " + (i + 1) + ": ");
                        for (int j = 0; j < 9; j++) {
                                grid[i][j] = scanner.nextInt();
                        }
                        if (i < 8) {
                                System.out.println("Now enter the next line:");
                        }
                }
                scanner.close();
                return grid;
        }

        public static void main(String[] args) {
                System.out.println("Enter a Sudoku puzzle:");
                Scanner input = new Scanner(System.in);
                int[][] grid = readInput(); // Fix: assign the return value of readInput() to grid
                // Read the puzzle from input
                SudokuSolver solver = new SudokuSolver(grid);
                if (solver.solve()) {
                        System.out.println("Solution:");
                        solver.printGrid();
                } else {
                        System.out.println("No solution found.");
                }
                input.close();

        }

}
