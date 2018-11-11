package restapi.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Zn")
public class Feature {
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "ZnXarObj",
            joinColumns = { @JoinColumn(name = "zn_id") },
            inverseJoinColumns = { @JoinColumn(name = "object_id") }
    )
    Set<Thing> things = new HashSet<Thing>();

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    private CharacteristicClassType type;

    public Feature() {
    }

    public Feature(String name) {
        this.name = name;
    }

    public Set<Thing> getThings() {
        return things;
    }

    public CharacteristicClassType getType() {
        return type;
    }

    public void setType(CharacteristicClassType type) {
        this.type = type;
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
}
