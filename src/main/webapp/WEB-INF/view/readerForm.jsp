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
    <h3>Add Reader</h3>

    <form:form action="/readers/saveReader" modelAttribute="reader"
               method="POST">

        <!-- need to associate this data with customer id -->
        <form:hidden path="id"/>

        <table>
            <tbody>
            <tr>
                <td><label>First name:</label></td>
                <td><form:input path="firstName" /></td>
            </tr>

            <tr>
                <td><label>Last name:</label></td>
                <td><form:input path="lastName" /></td>
            </tr>

            <tr>
                <td><label>Email:</label></td>
                <td><form:input path="email" /></td>
            </tr>

            <tr>
                <td><label>Mobile:</label></td>
                <td><form:input path="mobile" /></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="save" /></td>
            </tr>

            </tbody>
        </table>

    </form:form>

    <p>
        <a href="${pageContext.request.contextPath}/library/listOfReaders">Back
            to List of Readers</a>
    </p>

    <p>
        <a href="${pageContext.request.contextPath}/library/menu">Back
            to Main Menu</a>
    </p>

</div>

</body>

</html>