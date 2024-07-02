package exercise.util;

public class NamedRoutes {

    public static String rootPath() {
        return "/";
    }

    // BEGIN
    public static String postPath(Long pageNumber) {
        return "/posts/" + pageNumber;
    }

    public static String postPath(String pageNumber) {
        return "/posts/" + pageNumber;
    }

    public static String postsPath() {
        return "/posts";
    }
    // END
}
