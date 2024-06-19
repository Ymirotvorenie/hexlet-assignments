@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
    content = @`
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
    `
)
