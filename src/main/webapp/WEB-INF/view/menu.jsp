<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Library Management System</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/generalStyle.css" />
</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>Library Management System</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="List of Books"
               onclick="window.location.href='listOfBooks'; return false;"
               class="add-button" />

        <input type="button" value="List of Readers"
               onclick="window.location.href='listOfReaders'; return false;"
               class="add-button" />

    </div>
</div>

</body>

</html>