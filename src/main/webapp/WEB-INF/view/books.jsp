<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>List of Books</title>
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

        <input type="button" value="Add a new book"
               onclick="window.location.href='newBook'; return false;"
               class="add-button" />

        <input type="button" value="Go to Main Menu"
               onclick="window.location.href='menu'; return false;"
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

            <tr>
                <td>book.id</td>
                <td>book.title</td>
                <td>book.authors</td>
                <td>book.publicationDate</td>
                <td>book.availableAmount</td>

                <td>
                    <!-- display the update and delete link -->
                    <a>Update</a>
                    |
                    <a>Delete</a>
                </td>

            </tr>

        </table>

    </div>
</div>

</body>

</html>