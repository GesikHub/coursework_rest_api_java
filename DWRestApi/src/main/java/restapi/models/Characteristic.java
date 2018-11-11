package restapi.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Xarakt")
public class Characteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String type_value;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "characteristic")
    private Set<CharacteristicClassType> types = new HashSet<>();

    public Characteristic() {
    }

    public Characteristic(String name, String type_value) {
        this.name = name;
        this.type_value = type_value;
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

    public String getType_value() {
        return type_value;
    }

    public void setType_value(String type_value) {
        this.type_value = type_value;
    }
}
