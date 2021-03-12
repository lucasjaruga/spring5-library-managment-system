<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>

    <head>
        <meta charset="UTF-8">
        <title>List of Readers</title>
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

                <input type="button" value="Add a new Reader"
                       onclick="window.location.href='/reader/newReader'; return false;"
                       class="add-button" />

                <input type="button" value="Go to Main Menu"
                       onclick="window.location.href='/library/menu'; return false;"
                       class="add-button" />

                <table>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>E-mail</th>
                        <th>Mobile</th>
                        <th>Action</th>
                    </tr>

                    <!-- loop over and print our customers -->

                    <c:forEach var="reader" items="${readers}" >

                    <!-- construct an "update" link with customer id -->
                    <c:url var="updateLink" value="/reader/updateReader">
                        <c:param name="readerId" value="${reader.id}" />
                    </c:url>

                    <tr>
                        <td>${reader.firstName}</td>
                        <td>${reader.lastName}</td>
                        <td>${reader.email}</td>
                        <td>${reader.mobile}</td>

                        <td>
                            <!-- display the update and delete link -->
                            <a>Books</a>
                            |
                            <a href="${updateLink}">Update</a>
                            |
                            <a>Delete</a>
                        </td>

                    </tr>

                    </c:forEach>

                </table>

            </div>
        </div>

    </body>

</html>