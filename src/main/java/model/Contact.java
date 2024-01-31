package model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Contact implements Serializable {
    private String name;
    private String phone;

    public Contact() {
    }

    public Contact(String name, String phone, LocalDateTime registerDate) {
        this.name = name;
        this.phone = phone;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    private LocalDateTime registerDate;
}
