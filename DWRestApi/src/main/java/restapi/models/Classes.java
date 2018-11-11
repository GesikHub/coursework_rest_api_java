package restapi.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Classes")
public class Classes {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    private String name;
    private String serial_number;

    @ManyToOne(fetch = FetchType.LAZY)
    private ThingType thing_type;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "classes")
    private Set<CharacteristicClassType> class_types = new HashSet<>();

    public Classes() {
    }

    public Classes(String name, String serial_number) {
        this.name = name;
        this.serial_number = serial_number;
    }

    public Set<CharacteristicClassType> getClass_types() {
        return class_types;
    }

    public void setClass_types(Set<CharacteristicClassType> class_types) {
        this.class_types = class_types;
    }

    public Integer getId() {
        return id;
    }

    public ThingType getThing_type() {
        return thing_type;
    }

    public void setThing_type(ThingType thing_type) {
        this.thing_type = thing_type;
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

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }
}
