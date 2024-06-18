@import exercise.dto.users.UserPage
@param UserPage page

<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-table@1.22.6/dist/bootstrap-table.min.js"></script>
    <title>${String.format("%s %s", page.getUser().getFirstName(), page.getUser().getLastName())}</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    <main>
        <table class="table">
            <thead class="table-light">
            <tr>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">id</th>
                    <td>${page.getUser().getId()}</td>
                </tr>
                <tr>
                    <th scope="row">First name</th>
                    <td>${page.getUser().getFirstName()}</td>
                </tr>
                <tr>
                    <th scope="row">Last name</th>
                    <td>${page.getUser().getLastName()}</td>
                </tr>
                <tr>
                    <th scope="row">Email</th>
                    <td>${page.getUser().getEmail()}</td>
                </tr>
            </tbody>
        </table>
    </main>
</div>
</body>
</html>