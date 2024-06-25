@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page

@template.layout.page(content = @`
    @if(page.getErrors() != null)
        <ul>
            @for(var validator : page.getErrors().values())
                @for(var error : validator)
                    <li>${error.getMessage()}</li>
                @endfor
            @endfor
        </ul>
    @endif
    <div class="content" style="margin-left:50px;;">

            <form action="/articles" method="post">
                <br>
                <p class="text">Add new article</p>
                <div class="mb-3">
                    <label class="form-label">Title
                        <input type="text" name="title" class="form-control" value="${page.getTitle()}">
                    </label>
                </div>
                <div class="mb-3">
                    <label class="form-label"> Content
                        <textarea name="content" class="form-control" value="${page.getContent()}"cols="30" rows="10"></textarea>

                    </label>
                </div>

                <input type="submit" class="btn btn-primary" value="Add article">
            </form>

    </div>

`)
