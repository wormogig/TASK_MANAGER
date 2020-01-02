package wormogig.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import wormogig.model.Task;

public interface TaskRepo extends JpaRepository<Task, Long> {
}
