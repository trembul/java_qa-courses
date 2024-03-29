package ru.stqa.pft.addressbook.model;

import com.google.gson.annotations.Expose;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

import java.util.Objects;

@XStreamAlias("group")
public class GroupData {
    @XStreamOmitField
    private int id = Integer.MAX_VALUE;;
    @Expose
    private String name;
    @Expose
    private String header;
    @Expose
    private String footer;

    public String getName(){
        return name;
    }

    public int getId() {
        return this.id;
    }

    public GroupData withId(int id) {
        this.id = id;
        return this;
    }

    public GroupData withName(String name) {
        this.name = name;
        return this;
    }

    public GroupData withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupData withFooter(String footer) {
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
        return this.id == groupData.id && Objects.equals(this.name, groupData.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }
}