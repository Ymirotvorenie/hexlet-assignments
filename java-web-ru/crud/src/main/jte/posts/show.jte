@import exercise.dto.posts.PostPage
@param PostPage page

@template.layout.page(
    content = @`
        <div class="container">
            <h3>${page.getPost().getName()}</h3>
            <p>${page.getPost().getBody()}</p>
        </div>
    `
)
