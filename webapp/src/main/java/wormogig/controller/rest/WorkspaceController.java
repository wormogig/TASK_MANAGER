package wormogig.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wormogig.model.StatusColumn;
import wormogig.model.Workspace;
import wormogig.service.StatusColumnService;
import wormogig.service.WorkspaceService;

import java.util.List;

@RestController
@RequestMapping("/rest/workspaces")
public class WorkspaceController {

    private WorkspaceService workspaceService;
    private StatusColumnService statusColumnService;

    public WorkspaceController(WorkspaceService workspaceService, StatusColumnService statusColumnService) {
        this.workspaceService = workspaceService;
        this.statusColumnService = statusColumnService;
    }

    @GetMapping
    public List<Workspace> getWorkspaces() {
        List<Workspace> workspaces = workspaceService.getAll();
        return workspaces;
    }

    @GetMapping(value = "/{id}")
    public List<StatusColumn> getStatusColumnByWorkspace(@PathVariable("id") long id) {
        List<StatusColumn> statusColumns = statusColumnService.getAllColumnByWorkspace(id);
        return statusColumns;
    }

}
