<!DOCTYPE html>

<head>
    <meta charset="UTF-8">
    <title>Reader's Books</title>
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

        <input type="button" value="Go back to Readers"
               class="add-button" />

        <input type="button" value="Go to Main Menu"
               class="add-button" />

        <h3>"John Smith" books</h3>

        <table>
            <tr>
                <th>Title</th>
                <th>Authors</th>
                <th>Publication date</th>
                <th>Action</th>
            </tr>

            <tr>
                <td>book.title</td>
                <td>book.authors</td>
                <td>book.publicationDate</td>

                <td>
                    <!-- display the update and delete link -->
                    <a>Delete</a>
                </td>

            </tr>

        </table>

    </div>
</div>

</body>

</html>