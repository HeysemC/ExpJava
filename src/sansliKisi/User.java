package sansliKisi;

import java.time.LocalDateTime;

public class User {


    // 1- Bir user class olusturun fields: name, registerDate (LocalDateTime cinsinden)
    // objeleri burada üreteceğiz
    String name;
    LocalDateTime registerDate;
    public User() { // p.siz cons.
    }
    public User(String name, LocalDateTime registerDate) { // p.li cons.
        this.name = name;
        this.registerDate = registerDate;

    }

}
