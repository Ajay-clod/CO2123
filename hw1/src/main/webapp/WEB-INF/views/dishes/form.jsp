<<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Dish</title>
</head>
<body>
<form:form action="/addDish?menu=${param.menu}" modelAttribute="dish">
    <form:label path="name">Name:</form:label>
    <form:input path="name"/>
    <form:errors path="name" />

    <form:label path="type">Type:</form:label>
    <form:input path="type"/>
    <form:errors path="type" />

    <form:label path="dietary">Dietary:</form:label>
    <form:select path="dietary">
        <form:option value="Vegetarian">Vegetarian</form:option>
        <form:option value="Vegan">Vegan</form:option>
        <form:option value="Lactose Free">Lactose Free</form:option>
    </form:select>
    <form:errors path="dietary" />

    <form:label path="price">Price:</form:label>
    <form:input path="price"/>
    <form:errors path="price" />

    <input type="submit"/>
</form:form>
</body>
</html>
