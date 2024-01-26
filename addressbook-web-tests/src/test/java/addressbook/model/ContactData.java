package addressbook.model;

import javax.persistence.*;
import java.beans.Transient;
import java.io.File;
import java.util.HashSet;

@Entity
@Table(name = "addressbook")

public class ContactData {

    @Id
    @Column (name = "id")
    private int id;

    @Column (name = "firstname")
    private String firstname;

    @Column (name = "lastname")
    private String lastname;



    @Column (name = "home")
    private String homePhone;

    @Column (name = "mobile")
    private String mobilePhone;

    @Column (name = "work")
    private String workPhone;

    @Transient
    private  String allPhones;

    @Column (name = "photo")
    private String photo;

    @ManyToMany
    @JoinTable(name = "addres_in_groups",
    joinColumns = @JoinColumn(name = "id"), inverseJoinColumns = @JoinColumn(name ="group_id"))
    private Set<GroupData> groups new  HashSet<GroupData>();

    public File getPhoto() {return new File(photo);}
    public ContactData withPhoto (File photo){
        this.photo =photo.getPath();
        return this;
    }

}
