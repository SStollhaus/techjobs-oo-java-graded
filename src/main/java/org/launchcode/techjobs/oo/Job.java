package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job( String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Job job = (Job) o;
//
//        if (id != job.id) return false;
//        if (!Objects.equals(name, job.name)) return false;
//        if (!Objects.equals(employer, job.employer)) return false;
//        if (!Objects.equals(location, job.location)) return false;
//        if (!Objects.equals(positionType, job.positionType)) return false;
//        return Objects.equals(coreCompetency, job.coreCompetency);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + (employer != null ? employer.hashCode() : 0);
//        result = 31 * result + (location != null ? location.hashCode() : 0);
//        result = 31 * result + (positionType != null ? positionType.hashCode() : 0);
//        result = 31 * result + (coreCompetency != null ? coreCompetency.hashCode() : 0);
//        return result;
//    }

    @Override
    public String toString() {
        if (name.equals("")) {
            setName("Data not available");
        }
        if (employer.getValue().equals("")) {
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("")) {
            location.setValue("Data not available");
        }
        if (positionType.getValue().equals("")) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("")) {
            coreCompetency.setValue("Data not available");
        }
        return ("\n" + "ID: " + id + "\nName: " + name + "\nEmployer: " + employer + "\nLocation: " + location + "\nPosition Type: " + positionType + "\nCore Competency: " + coreCompetency + "\n");
    }
// TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
}
