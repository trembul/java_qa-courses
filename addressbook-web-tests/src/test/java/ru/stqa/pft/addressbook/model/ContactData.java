package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class ContactData {
    public void setId(final int id) {
        this.id = id;
    }

    private int id;
    private final String firstName;
    private final String lastName;



    public ContactData(String firstName, String lastName) {
        this.id = Integer.MAX_VALUE;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ContactData(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final ContactData that = (ContactData) o;
        return this.id == that.id && Objects.equals(this.firstName, that.firstName) && Objects.equals(this.lastName, that.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName);
    }
}

