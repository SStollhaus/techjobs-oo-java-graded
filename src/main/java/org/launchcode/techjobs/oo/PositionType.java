package org.launchcode.techjobs.oo;

import java.util.Objects;

public class PositionType extends JobField {

    public PositionType(String value) {
        super(value);
    }
}
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//    @Override
//    public String toString() {
//        return value;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        PositionType that = (PositionType) o;
//
//        if (id != that.id) return false;
//        return Objects.equals(value, that.value);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (value != null ? value.hashCode() : 0);
//        return result;
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }


