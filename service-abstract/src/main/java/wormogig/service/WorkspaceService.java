package wormogig.service;

import wormogig.model.Workspace;

import java.util.List;

public interface WorkspaceService {

    Workspace get(long id);

    List<Workspace> getAll();

    Workspace save(Workspace workspace);

}
