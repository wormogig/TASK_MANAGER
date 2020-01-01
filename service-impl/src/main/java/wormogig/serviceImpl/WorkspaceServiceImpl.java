package wormogig.serviceImpl;

import org.springframework.stereotype.Service;
import wormogig.model.Workspace;
import wormogig.repo.WorkspaceRepo;
import wormogig.service.WorkspaceService;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class WorkspaceServiceImpl implements WorkspaceService {
    private WorkspaceRepo workspaceRepo;

    public WorkspaceServiceImpl(WorkspaceRepo workspaceRepo) {
        this.workspaceRepo = workspaceRepo;
    }

    @Override
    public void delete(long id) {
        workspaceRepo.deleteById(id);
    }

    @Override
    public void delete(Workspace workspace) {
        workspaceRepo.delete(workspace);
    }

    @Override
    public Workspace get(long id) {
        return workspaceRepo.findById(id).orElse(null);
    }

    @Override
    public List<Workspace> getAll() {
        return workspaceRepo.findAll();
    }

    @Override
    public Workspace save(Workspace workspace) {
        workspaceRepo.save(workspace);
        return workspace;
    }

}
