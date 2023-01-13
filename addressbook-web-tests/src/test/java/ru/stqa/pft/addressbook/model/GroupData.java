package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
    private int id = Integer.MAX_VALUE;;
    private String name;
    private String header;
    private String footer;

    public String getName(){
        return name;
    }

    public int getId() {
        return this.id;
    }

    public GroupData withId(final int id) {
        this.id = id;
        return this;
    }

    public GroupData withName(final String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(final String header) {
        this.header = header;
        return this;
    }

    public GroupData withFooter(final String footer) {
        this.footer = footer;
        return this;
    }

    public String getHeader(){
        return header;
    }

    public String getFooter(){
        return footer;
    }

    @Override
    public String toString() {
        return "GroupData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        final GroupData groupData = (GroupData) o;
        return Objects.equals(this.name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }

}