<<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Menu Form</title>
    <style>
        /* Global Styles */
        body {
            font-family: 'Roboto', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #add8e6; /* Light Blue */
            color: #444;
            display: flex;
            align-items: center;
            justify-content: center;
            min-height: 100vh;
        }

        .container {
            width: 100%;
            max-width: 500px;
            background-color: #fff;
            padding: 20px 30px;
            border-radius: 12px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.2);
            animation: driveIn 1s ease-out; /* Drive-in animation */
            display: flex;
            flex-direction: column;
            position: relative;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            font-size: 1rem;
            font-weight: bold;
            border: none;
            cursor: pointer;
            padding: 12px 20px;
            text-align: center;
            transition: background-color 0.3s ease, transform 0.3s ease, box-shadow 0.3s ease;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            align-self: flex-end; /* Aligns the button to the right within its container */
            margin-top: 20px; /* Adds space between the button and other form elements */
        }


        input[type="submit"]:hover {
            background-color: #45a049;
            transform: translateY(-5px); /* Hover effect */
            box-shadow: 0 6px 15px rgba(0, 0, 0, 0.2);
        }

        /* Animation for the container */
        @keyframes driveIn {
            0% {
                opacity: 0;
                transform: translateX(-100%) rotate(-20deg) scale(0.5);
            }
            50% {
                opacity: 1;
                transform: translateX(25%) rotate(5deg) scale(0.8);
            }
            100% {
                opacity: 1;
                transform: translateX(0) rotate(0deg) scale(1);
            }
        }

        /* Heading Styles */
        h1 {
            text-align: center;
            font-size: 1.8rem;
            color: #333;
            margin-bottom: 20px;
            font-family: 'Comic Sans MS', cursive;
        }

        /* Form Styles */
        form {
            display: flex;
            flex-direction: column;
            gap: 15px;
        }

        label {
            font-size: 1rem;
            color: #555;
            margin-bottom: 5px;
        }

        input, select {
            padding: 12px 15px;
            font-size: 1rem;
            border: 1px solid #ddd;
            border-radius: 8px;
            transition: all 0.3s ease;
        }

        input:focus, select:focus {
            border-color: #4CAF50;
            outline: none;
            box-shadow: 0 0 5px rgba(76, 175, 80, 0.4);
        }

        .form-group {
            display: flex;
            flex-direction: column;
        }

        .error {
            color: #e74c3c;
            font-size: 0.9rem;
            margin-top: 5px;
        }

        @media (max-width: 600px) {
            .container {
                padding: 15px 20px;
            }
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Add a New Menu</h1>
    <form:form action="/addMenu" modelAttribute="menu">
        <div class="form-group">
            <form:label path="id">Menu ID:</form:label>
            <form:input path="id" id="id" placeholder="Enter Menu ID"/>
            <form:errors path="id" id="id-error" class="error" />
        </div>

        <div class="form-group">
            <form:label path="description">Menu Description:</form:label>
            <form:input path="description" id="description" placeholder="Enter Menu Description"/>
            <form:errors path="description" id="description-error" class="error" />
        </div>

        <div class="form-group">
            <form:label path="restaurant">Restaurant Name:</form:label>
            <form:input path="restaurant" id="restaurant" placeholder="Enter Restaurant Name"/>
            <form:errors path="restaurant" id="restaurant-error" class="error" />
        </div>

        <input type="submit" value="Add Menu"/>
    </form:form>
</div>
</body>
</html>