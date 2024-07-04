@import exercise.dto.LoginPage
@param LoginPage page

@template.layout.page(
    content = @`
        @if(!page.getError().isEmpty())
            ${page.getError()}
        @endif
        <form action="${exercise.util.NamedRoutes.loginPath()}" method="post">
            <input type="text" placeholder="Nickname" name="name" />
            <input type="password" placeholder="Password" name="password" />
            <input type="submit" value="Login"/>
        </form>
    `
)