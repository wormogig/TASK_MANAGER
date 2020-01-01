package wormogig.serviceImpl;

import org.springframework.stereotype.Service;
import wormogig.model.StatusColumn;
import wormogig.repo.StatusColumnRepo;
import wormogig.service.StatusColumnService;

import java.util.List;

@Service
public class StatusColumnServiceImpl implements StatusColumnService {

    private StatusColumnRepo statusColumnRepo;

    public StatusColumnServiceImpl(StatusColumnRepo statusColumnRepo) {
        this.statusColumnRepo = statusColumnRepo;
    }

    @Override
    public void delete(long id) {
        statusColumnRepo.deleteById(id);
    }

    @Override
    public void delete(StatusColumn statusColumn) {
        statusColumnRepo.delete(statusColumn);
    }

    @Override
    public StatusColumn get(long id) {
        return statusColumnRepo.findById(id).orElse(null);
    }

    @Override
    public List<StatusColumn> getAll() {
        return statusColumnRepo.findAll();
    }

    @Override
    public List<StatusColumn> getAllColumnByWorkspace(long id) {
        return statusColumnRepo.findStatusColumnByWorkspace(id);
    }

    @Override
    public StatusColumn save(StatusColumn statusColumn) {
        statusColumnRepo.save(statusColumn);
        return statusColumn;
    }
}
