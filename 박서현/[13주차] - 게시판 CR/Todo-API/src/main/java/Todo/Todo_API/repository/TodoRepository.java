package Todo.Todo_API.repository;

import Todo.Todo_API.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TodoRepository extends JpaRepository<Todo, Long> {

    //제목으로도 검색하게 하고 싶음
    Optional<Todo> findByTitle(String title);



}
