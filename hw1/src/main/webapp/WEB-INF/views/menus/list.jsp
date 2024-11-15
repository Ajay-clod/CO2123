<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>Menus</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

</head>
<body>

<c:forEach items="${menus}" var="menu">
        <h3>${menu.restaurant}</h3>
        <p>
            <a href="/dishes?menu=${menu.id}">
                    ${menu.description}
            </a>
        </p>
</c:forEach>

</body>
</html>
