<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://use.fontawesome.com/releases/v5.12.1/css/all.css"
	integrity="sha384-v8BU367qNbs/aIZIxuivaU55N5GPF89WBerHoGA4QTcbUjYiLQtKdrfXnqAcXyTv"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="http://code.jquery.com/ui/1.8.18/themes/base/jquery-ui.css"
	type="text/css" />
<link rel="stylesheet" href="resources/css/style.css">

<script src="js/main.js"></script>
<title>Calendar</title>
</head>
<body>

	<header>
		<h1 align="center">
			<i class="far fa-calendar-check"></i> <span>캘린더</span>
		</h1>
		<hr>


		<div class="calendar_title ">
			<span>
				<button class="prev">&#60;</button>
				<span class="current-year-month"></span>
				<button class="next">&#62;</button>
			</span>
			<span id="right">
				<select name="slectedStudio">
					<option value="201">스튜디오201</option>
					<option value="203">스튜디오203</option>
				</select>
			</span>

		</div>
		<hr>

	</header>

	<section class="content-right">

		<div class="main"></div>

	</section>
</body>
</html>