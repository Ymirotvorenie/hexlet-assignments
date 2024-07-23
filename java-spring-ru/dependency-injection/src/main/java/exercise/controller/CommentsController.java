package exercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.http.HttpStatus;

import java.util.List;

import exercise.model.Comment;
import exercise.repository.CommentRepository;
import exercise.exception.ResourceNotFoundException;

// BEGIN
@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentRepository commentRepository;

    @GetMapping
    public List<Comment> index() {
        return commentRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Comment show(@PathVariable Long id) {
        return commentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Comment with id " + id + " not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Comment create(@RequestBody Comment data) {
        commentRepository.save(data);
        return data;
    }

    @PutMapping(path = "/{id}")
    public Comment update(@PathVariable Long id, @RequestBody Comment data) {
        var comment = commentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Comment with id " + id + " not found"));
        comment.setBody(data.getBody());

        commentRepository.save(comment);
        return comment;
    }

    @DeleteMapping(path = "/{id}")
    public void destroy(@PathVariable Long id) {
        commentRepository.deleteById(id);
    }
}
// END
//Реализуйте полный CRUD сущности Comment. Необходимо реализовать следующие маршруты:
//
//GET /comments — список всех комментариев
//GET /comments/{id} – просмотр конкретного комментария
//POST /comments – создание нового комментария. При успешном создании возвращается статус 201
//PUT /comments/{id} – обновление комментария
//DELETE /comments/{id} – удаление комментария
//
//В классе контроллера добавьте инъекцию репозитория с комментариями.