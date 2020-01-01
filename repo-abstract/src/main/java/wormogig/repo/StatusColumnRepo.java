package wormogig.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import wormogig.model.StatusColumn;

import java.util.List;

public interface StatusColumnRepo extends JpaRepository<StatusColumn, Long> {

    @Query(
            value = "SELECT * FROM status_column sc WHERE sc.workspace_id = ?1 ORDER BY ordered",
            nativeQuery = true
    )
    List<StatusColumn> findStatusColumnByWorkspace(long id);
}
