@template.layout.page(
    content = @`
    <form action="/users" method="post">
        <div>
            <label for="firstName">First name
                <input type="text" name="firstName" id="firstName" class="form-control"/>
            </label>
        </div>
        <br>
        <div>
            <label for="lastName">Last name
                <input type="text" name="lastName" id="lastName" class="form-control"/>
            </label>
        </div>
        <br>
        <div>
            <label for="email">Email
                <input type="text" name="email" id="email" class="form-control"/>
            </label>
        </div>
        <br>
        <div>
            <label for="password">Password
                <input type="text" name="password" id="password" class="form-control"/>
            </label>
        </div>
        <br>
        <input type="submit" value="Registration" class="btn btn-primary"/>
    </form>
    `
)