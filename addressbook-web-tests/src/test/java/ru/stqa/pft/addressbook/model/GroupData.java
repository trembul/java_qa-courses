package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupData {
    private final String name;
    private final String header;
    private final String footer;

    public GroupData(String name, String header, String footer){
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public String getName(){
        return name;
    }

    public String getHeader(){
        return header;
    }

    public String getFooter(){
        return footer;
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

    @Override
    public String toString() {
        return "GroupData{" +
                "name='" + name + '\'' +
                '}';
    }
}