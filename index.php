<?php
	session_start();
	$counter_name = "countlog.txt";

	if (!file_exists($counter_name)) {
	  $f = fopen($counter_name, "w");
	  fwrite($f,"0");
	  fclose($f);
	}

	$f = fopen($counter_name,"r");
	$counterVal = fread($f, filesize($counter_name));
	fclose($f);

	if(!isset($_SESSION['hasVisited'])){
	  $_SESSION['hasVisited']="yes";
	  $counterVal++;
	  $f = fopen($counter_name, "w");
	  fwrite($f, $counterVal);
	  fclose($f); 
	}
?>

<html>
<head>
<title>COMP 248 Extra Material</title>
</head>

<style>
	body {
		color: #bdae9d;
		font-family: Calibri, Candara, Segoe, "Segoe UI", Optima, Arial, sans-serif;
		background-color: #2a211c;
	}
	a:link {
		color: #37a8ed;
	}
	a:visited {
		color: #0e679c;
	}
	h1 {
		font-size: 250%;
		margin-bottom: 0px;
	}
	#header {
		position: absolute;
		color: red;
	}
	#new {
		color: #80ff80;
		font-size: 75%;
		padding-left: 2em;
	}
	#cs {
		color: yellow;
		font-size: 75%;
		padding-left: 2em;
	}
	#notCovered {
		color: red;
		font-size: 75%;
		padding-left: 2em;
	}
	#leftCol {
		position: absolute;
	}
	#midCol {
		padding-left: 650px;
		position: absolute;
	}
	#rightCol {
		padding-left: 1000px;
		position: absolute;
	}
</style>

<body>
	<h1>COMP 248 Extra Material</h1>
	<span style="color:red">The 2 review sections will take place on June 19th and 20th starting at 16:45 in room H907. I will review the sample tests and answer all your questions for the final. See you there!</a></span>
	<div id="midCol">
		<h2>Exercises</h2>
		<h3>Control Flow</h3>
		<a href="fizz_buzz.txt">Fizz-Buzz Problem</a>
		</br>
		<a href="order.txt">Order Problem</a>
		<h3>Loops</h3>
		<a href="number_pyramid.txt">Number Pyramid Problem</a>
		</br>
		<a href="high_and_low.txt">High and Low Problem</a>
		<h3>Arrays</h3>
		<a href="missing_number.txt">Missing Number Problem</a>
		</br>
		<a href="intersections.txt">Intersection Problem</a>
		
		<h2>Exercises Solutions</h2>
		<h3>Control Flow</h3>
		<a href="FizzBuzz.java">Fizz-Buzz Solution</a>
		</br>
		<a href="Order.java">Order Solution</a>
		<h3>Loops</h3>
		<a href="NumberPyramid.java">Number Pyramid Solution</a>
		</br>
		<a href="HighAndLow.java">High and Low Solution</a>
		<h3>Arrays</h3>
		<a href="MissingNumber.java">Missing Number Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		Intersection Solution <span id="cs">&ltComing Soon&gt</span>
	</div>
	
	<div id="rightCol">
		<h2>
			<?php
				echo "Visits: $counterVal";
			?>
		</h2>
	</div>
	
	<div id="leftCol">
		<h2>Theory</h2>
		<a href="switch_waterfall.txt">Switch Statement Waterfall Example</a> (also known as "Fallthrough")
		</br>
		<a href="else_if.txt">Else-If Statement Example</a>
		</br>
		<a href="Student.java">Student Class Example</a> (and its <a href="StudentDriver.java">StudentDriver</a>)
		
		<h2>Guides</h2>
		<a href="Concordia_Files_Access.pdf">Accessing Concordia Files From Home</a>
		
		<h2>Sample Tests Solutions <span id="new"></h2>
		<a href="Sample_Test_1.pdf">Sample Test 1 Solution</a>
		</br>
		<a href="Sample_Test_2.java">Sample Test 2 Solution</a>
		</br>
		<a href="Sample_Test_3.pdf">Sample Test 3 Solution</a>
		</br>
		<a href="Sample_Test_4.pdf">Sample Test 4 Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		<a href="Sample_Final_2005.pdf">Sample Final 2005 Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		<a href="Sample_Final_2012.pdf">Sample Final 2012 Solution</a> <span id="new">&ltNew&gt</span>
		
		<h2>Problem Solutions</h2>
		<a href="NumberPattern.java">Tutorial 5 - Question 1 Solution</a>
		</br>
		</br>
		<a href="PT1_Question_1.java">Practical Test 1 - Question 1 Solution</a>
		</br>
		<a href="PT1_Question_2.java">Practical Test 1 - Question 2 Solution</a>
		</br>
		</br>
		<a href="PT2_Question_1.java">Practical Test 2 - Question 1 Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		<a href="PT2_Question_2.java">Practical Test 2 - Question 2 Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		<a href="PT2_Question_3.java">Practical Test 2 - Question 3 Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		<a href="PT2_Question_4.java">Practical Test 2 - Question 4 Solution</a> <span id="new">&ltNew&gt</span>
		</br>
		<a href="PT2_Question_5.java">Practical Test 2 - Question 5 Solution</a> <span id="new">&ltNew&gt</span>
		
		<h2>Additional Assignment Tasks</h2>
		<h5 style="color:red">Please do not submit or study any of this. It is only there for those who want to practice extra material.</h5>
		<a href="Assignment_1_Additional_Task.pdf">Assignment 1 Try-Catch Block Task</a> (Link to help: <a href="https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html">Oracle Tutorial on Try-Catch Blocks</a>)
		<h2>Additional Assignment Tasks Solutions</h2>
		<a href="Assignment_1.java">Assignment 1 Try-Catch Block Solution</a>
	</div>
</body>
</html>

<!-- <span id="cs">&ltComing Soon&gt</span> -->
<!-- <span id="new">&ltNew&gt</span> -->