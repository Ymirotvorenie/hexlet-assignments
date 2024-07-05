@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
    basePage = page,
    content = @`
    @if(page.getPosts().isEmpty())
        <p>Here no posts yet</p>
    @else
        @for(var post : page.getPosts())
            <div>
                <h2>${post.getName()}</h2>
                <p>${post.getBody()}</p>
            </div>
        @endfor
    @endif
    `
)