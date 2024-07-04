@import exercise.util.NamedRoutes
@import exercise.dto.MainPage
@param MainPage page

@template.layout.page(
    content = @`
        @if(page.getName() == null)
            <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
        @else
            ${page.getName().toString()}
            <br>
            <form action="${NamedRoutes.logoutPath()}" method="post">
                <input type="submit" value="Выйти">
            </form>
        @endif



    `)