package hibernate_sandbox_andrew;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "guitar")
public class Guitar {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String guitar;
    public String getGuitar() {
        return guitar;
    }
    public void setGuitar(String guitar) {
        this.guitar = guitar;
    }
}