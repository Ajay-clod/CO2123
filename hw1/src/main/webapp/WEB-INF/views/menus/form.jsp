<<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Menu Form</title>
</head>
<body>
<form:form action="/addMenu" modelAttribute="menu">
    <form:label path="id">Enter Menu ID:</form:label>
    <form:input path="id"/>
    <form:errors path="id" />

    <form:label path="description">Enter Menu Description:</form:label>
    <form:input path="description"/>
    <form:errors path="description" />

    <form:label path="restaurant">Enter Restaurant Name:</form:label>
    <form:input path="restaurant"/>
    <form:errors path="restaurant" />

    <input type="submit"/>
</form:form>
</body>
</html>