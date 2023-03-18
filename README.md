#🧩 Sudoku Solver 🧩

This is a Java program that solves a given Sudoku puzzle using backtracking algorithm. It has a simple command-line interface and can solve any valid Sudoku puzzle within seconds.

🚀 Getting Started

To use the Sudoku Solver, follow these steps:

Clone the repository using the following command:

git clone https://github.com/hasnain-kk/sudoku_solver.git
Open the project in your favorite Java IDE.

Compile and run the SudokuSolver.java file.

Enter the Sudoku puzzle row by row. Use 0 or any negative number to represent empty cells.

Wait for the program to solve the puzzle.

The solution will be displayed on the console.

📝 How It Works

The Sudoku Solver uses a backtracking algorithm to solve the puzzle. It tries different numbers for each empty cell until a solution is found. If the number is not valid for the current cell, it backtracks to the previous cell and tries a different number.

🔍 Algorithm Overview

The algorithm used in this program can be summarized in the following steps:

Find the first empty cell in the grid.

Try all numbers from 1 to 9 in the cell.

If a number is valid for the cell, move to the next empty cell and repeat step 2.

If all numbers have been tried and no number is valid for the cell, backtrack to the previous cell and try a different number.

Repeat steps 2-4 until a solution is found or all possible combinations have been tried.

🤖 Technical Details

The Sudoku Solver is written in Java and uses a simple command-line interface. It uses a backtracking algorithm to solve the puzzle and can solve any valid Sudoku puzzle within seconds.

👨‍💻 Contribution Guidelines

If you find any bugs or issues with the program, feel free to open an issue or submit a pull request. Any contributions are welcome!

📜 License

This project is licensed under the MIT License - see the LICENSE file for details.
