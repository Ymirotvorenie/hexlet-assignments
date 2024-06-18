@import exercise.dto.users.UsersPage
@param UsersPage page

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-table@1.22.6/dist/bootstrap-table.min.js"></script>
    <title>Hexlet Users</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    <main>
        <table class="table caption-top">
            <caption>Hexlet Users</caption>
            <thead class="table-light">
            <tr>
                <th scope="col">id</th>
                <th scope="col">First name</th>
                <th scope="col">Last name</th>
                <th scope="col">Email</th>
                <th scope="col">Profile</th>
            </tr>
            </thead>
            <tbody>
            @if(page.getUsers().isEmpty())
                <tr>
                    <th scope="row">-</th>
                    <td>not found</td>
                    <td>not found</td>
                    <td>not found</td>
                </tr>
            @else
                @for(var user : page.getUsers())
                    <tr>
                        <th scope="row">${user.getId()}</th>
                        <td>${user.getFirstName()}</td>
                        <td>${user.getLastName()}</td>
                        <td>${user.getEmail()}</td>
                        <td><a href="/users/${user.getId()}">View profile</a></td>
                    </tr>
                @endfor
            @endif
            </tbody>
        </table>
        <script>
            function idSorter(a, b) {
              var aa = a.replace('$', '')
              var bb = b.replace('$', '')
              return aa - bb
            }
        </script>
<%--        @if(page.getUsers().isEmpty())--%>
<%--            <p>There are no users</p>--%>
<%--        @else--%>
<%--            @for(var user : page.getUsers())--%>
<%--                <div>--%>
<%--                    <h2><a href="/users/${user.getId()}">${String.format("User id: %s\nFirst name: %s\nLast name: %s\n",--%>
<%--                        user.getId(), user.getFirstName(), user.getLastName())}</a></h2>--%>

<%--                </div>--%>
<%--            @endfor--%>
<%--        @endif--%>
    </main>
</div>
</body>
</html>