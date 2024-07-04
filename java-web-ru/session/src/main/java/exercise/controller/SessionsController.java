package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;

import com.mifmif.common.regex.Main;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import exercise.util.NamedRoutes;
import exercise.util.Security;
import io.javalin.http.Context;
import io.javalin.http.HttpStatus;
import io.javalin.http.NotFoundResponse;
import io.javalin.validation.ValidationException;

public class SessionsController {

    // BEGIN
    public static void build(Context ctx) {
        if(ctx.sessionAttribute("currentUser") == null) {
            var page = new LoginPage("","");
            ctx.render("build.jte", model("page", page));
        } else {
            ctx.redirect("/");
        }

    }

    public static void create(Context ctx) {
        var nickname = ctx.formParam("name");
        var encryptedPassword = Security.encrypt(ctx.formParam("password"));
        try {
            var user = UsersRepository.findByName(nickname);

            if (user == null || !user.getPassword().equals(encryptedPassword)) {
                throw new NotFoundResponse("Wrong username or password");
            }
            ctx.sessionAttribute("currentUser", nickname);
            ctx.redirect(NamedRoutes.rootPath());

        } catch (NotFoundResponse e) {
            var page = new LoginPage(nickname, e.getMessage());
            ctx.render("build.jte", model("page", page));
        }
    }

    public static void destroy(Context ctx) {
        ctx.sessionAttribute("currentUser", null);
        ctx.redirect("/");
    }
    // END
}
