package entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {
    private Integer id;
    private String name;
    private Integer age;
    @DateTimeFormat(pattern="MM-dd-yyyy")
    private java.util.Date birthday;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public User(String name, Integer age, Date birthday) {

        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public User(Integer id, String name, Integer age, Date birthday) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public User() {
    }
}
