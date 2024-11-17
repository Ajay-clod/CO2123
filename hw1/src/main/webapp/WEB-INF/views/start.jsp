<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Menu Management System</title>
	<style>

		body {
			font-family: 'Roboto', sans-serif;
			margin: 0;
			padding: 0;
			background: #add8e6;
			color: #444;
			display: flex;
			align-items: center;
			justify-content: center;
			height: 100vh;
		}

		.container {
			text-align: center;
			background: #fff;
			padding: 20px 30px;
			border-radius: 12px;
			box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
			width: 90%;
			max-width: 400px;
			animation: fadeIn 1s ease-in-out;
		}

		h2 {
			font-size: 1.8rem;
			color: #333;
			margin-bottom: 20px;
			font-family: 'Comic Sans MS', cursive;
		}

		p {
			font-size: 1rem;
			color: #555;
			margin-bottom: 0;
		}

		a {
			display: inline-block;
			margin-top: 20px;
			padding: 12px 20px;
			background-color: #4CAF50;
			color: #fff;
			text-decoration: none;
			border-radius: 8px;
			font-size: 1rem;
			font-weight: bold;
			transition: all 0.3s ease;
			box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
		}

		a:hover {
			background-color: #45a049;
			transform: translateY(-5px);
			box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
		}


		@keyframes fadeIn {
			from {
				opacity: 0;
				transform: translateY(20px);
			}
			to {
				opacity: 1;
				transform: translateY(0);
			}
		}
	</style>
</head>
<body>
<div class="container">
	<h2>Menu Management System</h2>
	<p>
		<a href="/menus">List Menus</a>
	</p>
</div>
</body>
</html>