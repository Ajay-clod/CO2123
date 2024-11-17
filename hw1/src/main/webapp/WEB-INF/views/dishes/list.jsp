<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu Dishes</title>
    <style>

        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #add8e6;
            color: #444;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        .container {
            width: 100%;
            max-width: 600px;
            background-color: #fff;
            padding: 20px 30px;
            border-radius: 12px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
            animation: fadeIn 1s ease-out;
        }

        h1 {
            font-size: 1.5rem;
            color: #333;
            font-family: 'Comic Sans MS', cursive;
            text-align: center;
            margin-bottom: 15px;
        }

        h2, h3, h4 {
            margin: 5px 0;
            color: #555;
            font-weight: normal;
        }

        h2 {
            font-size: 1.2rem;
        }

        h3 {
            font-size: 1rem;
            color: #666;
        }

        h4 {
            font-size: 0.9rem;
            color: #777;
        }

        a {
            text-decoration: none;
            font-size: 1rem;
            color: #4CAF50;
            font-weight: bold;
            transition: color 0.3s ease;
        }

        a:hover {
            color: #45a049;
        }

        .dish {
            margin-bottom: 20px;
            padding: 15px;
            background: #f9f9f9;
            border: 1px solid #ddd;
            border-radius: 8px;
            transition: transform 0.3s ease, box-shadow 0.3s ease;
        }

        .dish:hover {
            transform: translateY(-5px);
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.2);
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(-10px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        @media (max-width: 600px) {
            .container {
                padding: 15px 20px;
            }

            h1 {
                font-size: 1.2rem;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Menu ID: ${param.menu}</h1>
    <c:forEach items="${dishes}" var="dish">
        <div class="dish">
            <h2>${dish.name}</h2>
            <h3>Dish Type: ${dish.type}</h3>
            <h4>Dietary: ${dish.dietary}</h4>
            <h4>Price: £${dish.price}</h4>
        </div>
    </c:forEach>
    <p style="text-align: center;">
        <a href="/newDish?menu=${param.menu}">Add New Dish</a>
    </p>
</div>
</body>
</html>'
