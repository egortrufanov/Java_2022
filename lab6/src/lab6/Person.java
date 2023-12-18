package lab6;

import java.util.Calendar;

public class Person {
    private final int id;
    private String name;
    private String surname;
    private final Calendar birthday;
    private String phone;

    public Person() {
        id = 0;
        birthday = null;
    }

    public Person(int id, String name, String surname, Calendar birthday, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", Имя: " + name +
                ", Фамилия: " + surname +
                ", Дата рождения: " +
                birthday.get(Calendar.DAY_OF_MONTH) + "." +
                birthday.get(Calendar.MONTH) + "." +
                birthday.get(Calendar.YEAR) +
                ", Номер телефона: " + phone;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirthday() {
        return birthday;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
