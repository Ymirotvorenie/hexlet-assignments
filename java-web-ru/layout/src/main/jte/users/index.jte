@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
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
        </main>
    </div>
    `
)