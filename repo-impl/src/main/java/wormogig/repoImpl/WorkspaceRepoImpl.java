package wormogig.repoImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import wormogig.model.Workspace;
import wormogig.repo.WorkspaceRepo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//@Repository
//@Primary
//@Transactional
//public class WorkspaceRepoImpl {
//
//    @PersistenceContext
//    EntityManager entityManager;
//
//    public Workspace get(long id) {
//        return entityManager.find(Workspace.class, id);
//    }
//}
