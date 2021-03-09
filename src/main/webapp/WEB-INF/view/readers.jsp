<!DOCTYPE html>

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
               class="add-button" />

        <input type="button" value="Go to Main Menu"
               class="add-button" />

        <table>
            <tr>
                <th>No</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>E-mail</th>
                <th>Mobile</th>
                <th>Action</th>
            </tr>

            <tr>
                <td>reader.id</td>
                <td>reader.firstName</td>
                <td>reader.lastName</td>
                <td>reader.email</td>
                <td>reader.mobile</td>

                <td>
                    <!-- display the update and delete link -->
                    <a>Books</a>
                    |
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