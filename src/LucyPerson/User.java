package LucyPerson;


import java.time.LocalDateTime;

public class User {

    // 1- Bir user class olusturun fields: name, registerDate (LocalDateTime cinsinden)

    String name;

    LocalDateTime registerDate;

    public User() {}

    public User(String name, LocalDateTime registerDate) {

        this.name = name;

        this.registerDate = registerDate;
    }
}
