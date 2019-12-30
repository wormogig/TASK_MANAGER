package wormogig.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wormogig.model.Workspace;
import wormogig.service.WorkspaceService;

@RestController
@RequestMapping("/rest/workspaces")
public class WorkspaceController {

    private WorkspaceService workspaceService;

    public WorkspaceController(WorkspaceService workspaceService) {
        this.workspaceService = workspaceService;
    }

    @GetMapping(value = "/{id}")
    public Workspace getWorkspaceById(@PathVariable("id") long id) {
        Workspace workspace = workspaceService.get(id);
//        Workspace workspace = new Workspace();
//        workspace.setId(1);
//        workspace.setName("ddd");
        System.out.println(workspace.getName());
        return workspace;
    }

}
