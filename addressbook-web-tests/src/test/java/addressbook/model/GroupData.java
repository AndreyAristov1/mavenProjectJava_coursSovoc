package addressbook.model;

import org.checkerframework.checker.signature.qual.Identifier;

@XSrtreamAlias("group")
@Entity
@Table(name = "group list")
public class GroupData {
@XStreamOmitField
@Id
@Column(name = "group_id")

    private int id = integer.MAX_VALUE;
@Expose
@Column( name = "group_name")
    private  String name;
    @Expose
    @Column( name = "group_header")
    private  String header;
    @Expose
    @Column( name = "group_footer")
    private  String footer;



     //   public int getId(){return id;}
    //Сетеры
    public GroupData withId(int id){
      //  this.id = id;
        return this;
    }
    public GroupData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupData withFooter(String footer) {
        this.footer = footer;
        return this;
    }


        public String getName(){return name;}
        public String getHeader(){return header;}
        public String getFooter(){return footer;}

  /*  @Override //Позволяет выводить текст элементов при скравнение элементов в массиве а не их номер в ячейке памяти
    public String toString() {
        return "GroupData{" +
                "name='" + name +'\''+
                '}';
    }

    @Override //Позволяет сравнивать объекты
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupData groupData = (GroupData) o;
        return name != null ? name.equals(groupData.name) : groupData.name == null;
    }

*/
}
