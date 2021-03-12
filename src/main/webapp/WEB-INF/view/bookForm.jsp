<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>

<html>

<head>
    <title>Add Reader</title>

    <!-- reference our style sheet -->
    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/generalStyle.css" />

    <link type="text/css" rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/addElementStyle.css" />

</head>

<body>

<div id="wrapper">
    <div id="header">
        <h2>Library Management System</h2>
    </div>
</div>

<div id="container">
    <h3>Add Book</h3>

    <form:form action="/books/saveBook" modelAttribute="book"
               method="POST">

        <!-- need to associate this data with customer id -->
            <form:hidden path="id"/>

        <table>
            <tbody>
            <tr>
                <td><label>Title:</label></td>
                <td><form:input path="title" /></td>
            </tr>

            <tr>
                <td><label>Authors:</label></td>
                <td><form:input path="authors" /></td>
            </tr>

            <tr>
                <td><label>Publication date:</label></td>
                <td><form:input path="publicationDate" /></td>
            </tr>

            <tr>
                <td><label>Available amount:</label></td>
                <td><form:input path="availableAmount" /></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save" /></td>
            </tr>

            </tbody>
        </table>

    </form:form>

    <p>
        <a href="${pageContext.request.contextPath}/library/listOfBooks">Back
            to List of Books</a>
    </p>

    <p>
        <a href="${pageContext.request.contextPath}/library/menu">Back
            to Main Menu</a>
    </p>

</div>

</body>

</html>