package hibernate_sandbox_andrew;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name = "app_user")
public class Owner {
    
    @Id
    @GeneratedValue
    private Integer id;
    private String uname;
    private String pword;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
               name="user_number",
               joinColumns = { @JoinColumn( name="user_id") },
               inverseJoinColumns = @JoinColumn( name="guitar_id")
               )
    private Set<Guitar> guitars;
    public Owner() {
    	
    }
    
    public String toString() {
        return "User [id=" + id + ", pword=" + pword + ", uname=" + uname + ", guitars]";
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUname() {
        return uname;
    }
    public void setUname(String uname) {
        this.uname = uname;
    }
    public String getPword() {
        return pword;
    }
    public void setPword(String pword) {
        this.pword = pword;
    }
    public Set<Guitar> getGuitars() {
        return guitars;
    }
}