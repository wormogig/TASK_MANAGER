package wormogig.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import wormogig.model.StatusColumn;

public interface StatusColumnRepo extends JpaRepository<StatusColumn, Long> {
}
