package exercise.dto.posts;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import exercise.model.Post;
import io.javalin.validation.ValidationError;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

// BEGIN
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class EditPostPage {
    private Post post;
    private Map<String, List<ValidationError<Object>>> errors;

    public EditPostPage(Post post) {
        this.post = post;
        errors = new HashMap<>();
    }
}
// END
