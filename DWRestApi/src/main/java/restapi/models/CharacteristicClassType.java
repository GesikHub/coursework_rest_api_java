package restapi.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "XarClassType")
public class CharacteristicClassType {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer id;

    private Integer serial_number;
    private String min;
    private String max;
    private String max_lenght;
    private String unit;
    private Boolean list_value;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "type")
    private Set<Feature> types = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    private Characteristic characteristic;

    @ManyToOne(fetch = FetchType.LAZY)
    private Classes classes;

    public CharacteristicClassType() {
    }

    public CharacteristicClassType(Integer serial_number, String min, String max, String max_lenght, String unit, Boolean list_value) {
        this.serial_number = serial_number;
        this.min = min;
        this.max = max;
        this.max_lenght = max_lenght;
        this.unit = unit;
        this.list_value = list_value;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(Characteristic characteristic) {
        this.characteristic = characteristic;
    }

    public Set<Feature> getTypes() {
        return types;
    }

    public void setTypes(Set<Feature> types) {
        this.types = types;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(Integer serial_number) {
        this.serial_number = serial_number;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMax_lenght() {
        return max_lenght;
    }

    public void setMax_lenght(String max_lenght) {
        this.max_lenght = max_lenght;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Boolean getList_value() {
        return list_value;
    }

    public void setList_value(Boolean list_value) {
        this.list_value = list_value;
    }
}
