package wormogig.service;

import wormogig.model.StatusColumn;

import java.util.List;

public interface StatusColumnService {

    void delete(long id);

    void delete(StatusColumn statusColumn);

    StatusColumn get(long id);

    List<StatusColumn> getAll();

    List<StatusColumn> getAllColumnByWorkspace(long id);

    StatusColumn save(StatusColumn statusColumn);

}
