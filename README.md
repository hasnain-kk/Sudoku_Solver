<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sudoku Solver</title>
</head>
<body>
	<h1><span style="font-size:2em;">🧩</span> Sudoku Solver <span style="font-size:2em;">🧩</span></h1>
	<p>This is a Java program that solves a given Sudoku puzzle using backtracking algorithm. It has a simple command-line interface and can solve any valid Sudoku puzzle within seconds.</p>
	<h2><span style="font-size:1.5em;">🚀</span> Getting Started</h2>
	<ol>
		<li>Clone the repository using the following command:</li>
	</ol>
	<code>git clone https://github.com/hasnain-kk/sudoku_solver.git</code>
	<ol start="2">
		<li>Open the project in your favorite Java IDE.</li>
		<li>Compile and run the SudokuSolver.java file.</li>
		<li>Enter the Sudoku puzzle row by row. Use 0 or any negative number to represent empty cells.</li>
		<li>Wait for the program to solve the puzzle.</li>
		<li>The solution will be displayed on the console.</li>
	</ol>
	<h2><span style="font-size:1.5em;">📝</span> How It Works</h2>
	<p>The Sudoku Solver uses a backtracking algorithm to solve the puzzle. It tries different numbers for each empty cell until a solution is found. If the number is not valid for the current cell, it backtracks to the previous cell and tries a different number.</p>
	<h3><span style="font-size:1.2em;">🔍</span> Algorithm Overview</h3>
	<p>The algorithm used in this program can be summarized in the following steps:</p>
	<ol>
		<li>Find the first empty cell in the grid.</li>
		<li>Try all numbers from 1 to 9 in the cell.</li>
		<li>If a number is valid for the cell, move to the next empty cell and repeat step 2.</li>
		<li>If all numbers have been tried and no number is valid for the cell, backtrack to the previous cell and try a different number.</li>
		<li>Repeat steps 2-4 until a solution is found or all possible combinations have been tried.</li>
	</ol>
	<h2><span style="font-size:1.5em;">🤖</span> Technical Details</h2>
	<p>The Sudoku Solver is written in Java and uses a simple command-line interface. It uses a backtracking algorithm to solve the puzzle and can solve any valid Sudoku puzzle within seconds.</p>
	<h2><span style="font-size:1.5em;">👨‍💻</span> Contribution Guidelines</h2>
	<p>If you find any bugs or issues with the program, feel free to open an issue or submit a pull request. Any contributions are welcome!</p>
	<h2><span style="font-size:1.5em;">📜</span> License</h2>
	<p>This project is licensed under the MIT License - see the LICENSE file for details.</p>
</body>
</html>
