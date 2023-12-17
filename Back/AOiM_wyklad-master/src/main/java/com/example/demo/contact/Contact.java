package com.example.demo.contact;

import jakarta.persistence.*;

@Entity
@Table
public class Contact {
    @Id
    @SequenceGenerator(name = "contact_sequence", sequenceName = "contact_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_sequence")
    private int id;
    private String name;
    private String number;
    private String email;
    public Contact() {
    }

    public Contact(int id, String name, String number, String email) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email=email;
    }

    public Contact(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", email='" + email + '\'' +
                '}';
    }
}
