package ru.stqa.pft.addressbook.model;

public class ContactData {
    public void setId(final int id) {
        this.id = id;
    }

    private int id;
    private final String firstName;
    private final String lastName;
    private final String mobileNumber;
    private final String email;
    private String group;

    public ContactData(String firstName, String lastName, String mobileNumber, String email, String group) {
        this.id = Integer.MAX_VALUE;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.group = group;
    }

    public ContactData(int id, String firstName, String lastName, String mobileNumber, String email, String group) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.group = group;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getMobileNumber(){
        return mobileNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "ContactData{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    public int getId() {
        return this.id;
    }
}

