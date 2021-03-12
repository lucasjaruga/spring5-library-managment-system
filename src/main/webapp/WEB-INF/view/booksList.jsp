<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>List of Books</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/generalStyle.css" />
</head>

<html>

<body>

<div id="wrapper">
    <div id="header">
        <h2>Library Management System - List of Books</h2>
    </div>
</div>

<div id="container">
    <div id="content">

        <input type="button" value="Add a new book"
               onclick="window.location.href='/books/addNewBook'; return false;"
               class="add-button" />

        <input type="button" value="Go to Main Menu"
               onclick="window.location.href='/library/menu'; return false;"
               class="add-button" />

        <table>
            <tr>
                <th>No</th>
                <th>Title</th>
                <th>Authors</th>
                <th>Publication date</th>
                <th>Available amount</th>
                <th>Action</th>
            </tr>

            <!-- loop over and print our customers -->

            <c:forEach var="book" items="${books}" >

            <!-- construct an "update" link with customer id -->
            <c:url var="updateLink" value="/books/updateBook">
                <c:param name="bookId" value="${book.id}" />
            </c:url>

            <!-- construct an "delete" link with customer id -->
            <c:url var="deleteLink" value="/books/deleteBook">
                <c:param name="bookId" value="${book.id}" />
            </c:url>

            <tr>
                <td>${book.id}</td>
                <td>${book.title}</td>
                <td>${book.authors}</td>
                <td>${book.publicationDate}</td>
                <td>${book.availableAmount}</td>

                <td>
                    <!-- display the update and delete link -->
                    <a href="${updateLink}">Update</a>
                    |
                    <a href="${deleteLink}"
                       onclick="if (!(confirm('Are you sure you want to delete this book?'))) return false ">Delete</a>
                </td>

            </tr>

            </c:forEach>

        </table>

    </div>
</div>

</body>

</html>