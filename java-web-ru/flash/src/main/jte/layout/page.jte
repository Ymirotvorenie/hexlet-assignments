@import gg.jte.Content
@import exercise.util.NamedRoutes
@import exercise.dto.BasePage
@param Content content
@param BasePage basePage = null

<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap-table@1.22.6/dist/bootstrap-table.min.js"></script>
    <title>Hexlet Javalin Example</title>
</head>
<body>
<div class="mb-3">
    <p>Hexlitter</p>
    <a href="${NamedRoutes.rootPath()}">Programming courses</a>
</div>
<div class="mb-3">
    <p>Posts</p>
    <a href="${NamedRoutes.postsPath()}">Users</a>
</div>

@if(basePage != null && basePage.getFlash() != null)
    <div class="alert alert-${basePage.getVariant()}" role="alert">
        <p>${basePage.getFlash()}</p>
    </div>
@endif

${content}

</body>
</html>

