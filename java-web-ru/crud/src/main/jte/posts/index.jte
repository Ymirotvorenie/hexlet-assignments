@import exercise.dto.posts.PostsPage
@import exercise.repository.PostRepository
@import exercise.util.NamedRoutes
@param PostsPage page

@template.layout.page(
    content = @`
    <ul>
        @if(page.getPosts().isEmpty())
            <p>Here no posts yet</p>
        @else
            @for(var post : page.getPosts())
                <li>
                    <a class="link-offset-2 link-offset-3-hover link-underline link-underline-opacity-0 link-underline-opacity-75-hover"
                       href="${NamedRoutes.postPath(post.getId())}">
                        ${post.getName()}
                    </a>
                </li>
            @endfor
        @endif

        <nav aria-label="Page navigation">
            <ul class="pagination">
                @if(page.getPageNumber() > 1)
                    <li class="page-item">
                        <a class="page-link" href="${NamedRoutes.postsPath()}?page=${page.getPageNumber() - 1}">
                            Previous
                        </a>
                    </li>
                @endif
                
                @if(page.getPageNumber() <= PostRepository.getEntities().size() / 5)
                    <li class="page-item">
                        <a class="page-link" href="${NamedRoutes.postsPath()}?page=${page.getPageNumber() + 1}">
                            Next
                        </a>
                    </li>
                @endif

            </ul>
        </nav>
    </ul>
    `
)