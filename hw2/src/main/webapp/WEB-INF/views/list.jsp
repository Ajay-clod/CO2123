<%@ taglib prefix="c" uri="jakarta.tags.core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<ul>
<c:forEach items="${data}" var="item">
    <li>${item}</li>
</c:forEach>
</ul>
</body>
</html>