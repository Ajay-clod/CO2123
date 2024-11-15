<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Menu Dishes</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

<c:forEach items="${dishes}" var="dish">
    <h1>Menu #${param.menu} ${dish.name}</h1>
    <h2>${dish.type}</h2>
    <h3>${dish.dietary}</h3>
    <h4>£${dish.price}</h4>
    <p><a href="/newDish?menu=${param.menu}">Add new Dish</a></p>
</c:forEach>

</body>
</html>
