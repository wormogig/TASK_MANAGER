package wormogig.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import wormogig.model.Workspace;

public interface WorkspaceRepo extends JpaRepository<Workspace, Long> {
}
