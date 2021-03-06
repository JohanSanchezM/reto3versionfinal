package jsm.reto3versionfinal.reto3versionfinal.Model;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

// Author Johan Sanchez Martinez

@Entity
@Table (name = "audience") // se creo la tabla Audience
public class Auditorio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String owner;
    private Integer capacity;
    private String description;
    
    //relacion muchos a uno
    @ManyToOne
    @JoinColumn(name="categoryId")
    @JsonIgnoreProperties("audiences")
    private Tipo category;

    //Relacion uno a muchos
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="audience")
    @JsonIgnoreProperties({"audience","client"})
    private List<Mensaje>messages;
    
    @OneToMany(cascade={CascadeType.PERSIST},mappedBy="audience")
    @JsonIgnoreProperties({"audience","client"})
    private List<Reservaciones>reservations;


    //Creacion de getters and setters
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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Tipo getCategory() {
        return category;
    }

    public void setCategory(Tipo category) {
        this.category = category;
    }

    public List<Mensaje> getMessages() {
        return messages;
    }

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }

    public List<Reservaciones> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservaciones> reservations) {
        this.reservations = reservations;
    }

    
}

