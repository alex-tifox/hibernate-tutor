package system;




import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "age")
    private Integer age;

    @Embedded
    UserAdditionalData userAdditionalData;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void setUserAdditionalData(UserAdditionalData userAdditionalData) {
        this.userAdditionalData = userAdditionalData;
    }

    public String getUserAdditionalData(){
        return "User{" +
                "County: "+ userAdditionalData.getCountry() +
                ", city : " + userAdditionalData.getCity() +
                ", adress : " + userAdditionalData.getAddress() + "}";
    }
}
