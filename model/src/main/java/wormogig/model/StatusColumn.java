package wormogig.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString

@Entity
@Table(name = "status_column")

public class StatusColumn implements Comparable<StatusColumn>{

    @Id
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "ordered")
    private int order;

    @ManyToOne
    @JoinColumn(name = "workspace_id")
    @JsonIgnore
    private Workspace workspace;


    @Override
    public int compareTo(StatusColumn statusColumn) {
        return this.order - statusColumn.getOrder();
    }
}
