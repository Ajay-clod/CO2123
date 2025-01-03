<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Data List</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #74ebd5, #ACB6E5);
            margin: 0;
            padding: 0;
            color: #333;
        }
        .container {
            max-width: 900px;
            margin: 50px auto;
            background: #ffffff;
            border-radius: 12px;
            box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
            padding: 20px 30px;
        }
        h1 {
            font-size: 32px;
            color: #444;
            margin-bottom: 20px;
            font-weight: bold;
            text-transform: uppercase;
            letter-spacing: 2px;
            text-align: center;
        }
        .card {
            background: #f7f9fc;
            margin: 10px 0;
            padding: 15px;
            border-radius: 8px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
        }
        .card h3 {
            margin: 0 0 10px;
            font-size: 18px;
            color: #007BFF;
        }
        .card p {
            margin: 5px 0;
            color: #555;
            font-size: 14px;
        }
        .footer {
            margin-top: 20px;
            color: #666;
            font-size: 14px;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Data List</h1>
    <c:forEach items="${data}" var="item">
        <div class="card">
            ${item}
        </div>
    </c:forEach>
    <div class="footer">
        <p>&copy; 2025 Your Application. All rights reserved.</p>
    </div>
</div>
</body>
</html>
