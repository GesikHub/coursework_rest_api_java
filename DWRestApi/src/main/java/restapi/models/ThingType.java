package restapi.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ObjTypes")
public class ThingType {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    private String name;
    private String comment;
    private String type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private Set<Thing> things = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "thing_type")
    private Set<Classes> classes = new HashSet<>();

    public  ThingType() {
    }

    public ThingType(String name, String comment, String type) {
        this.name = name;
        this.comment = comment;
        this.type = type;
    }

    public ThingType(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public Set<Classes> getClasses() {
        return classes;
    }

    public void setClasses(Set<Classes> classes) {
        this.classes = classes;
    }

    public Set<Thing> getThings() {
        return things;
    }

    public void setThings(Set<Thing> things) {
        this.things = things;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
