@import exercise.dto.users.UsersPage
@param UsersPage page = null

@template.layout.page(
    content = @`
    <form>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Search</label>
            <input type="search" class="form-control" id="exampleInputEmail1"
                   required name="term" method="get" value="${page.getTerm()}">
            <div class="form-text">Enter firstname for search users</div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    @if (page != null)
        <div class="mx-auto p-4 py-md-5">
            <main>
                @if(!page.getUsers().isEmpty())
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

                        @for(var user : page.getUsers())
                            <tr>
                                <th scope="row">${user.getId()}</th>
                                <td>${user.getFirstName()}</td>
                                <td>${user.getLastName()}</td>
                                <td>${user.getEmail()}</td>
                                <td><a href="/users/${user.getId()}">View profile</a></td>
                            </tr>
                        @endfor

                    </tbody>
                </table>
            </main>
            @endif
        </div>
    @endif

    `)