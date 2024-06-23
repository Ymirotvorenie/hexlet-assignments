@template.layout.page(
    content = @`
    <form action="/users" method="post">
        <div class="mb-3">
            <label class="form-label">First name
                <input type="text" name="firstName" class="form-control"/>
            </label>
        </div>
        <br>
        <div class="mb-3">
            <label class="form-label">Last name
                <input type="text" name="lastName" class="form-control"/>
            </label>
        </div>
        <br>
        <div class="mb-3">
            <label  class="form-label">Email
                <input type="text" name="email" class="form-control"/>
            </label>
        </div>
        <br>
        <div class="mb-3">
            <label  class="form-label">Password
                <input type="text" name="password" class="form-control"/>
            </label>
        </div>
        <br>
        <input type="submit" value="Registration" class="btn btn-primary"/>
    </form>
    `
)