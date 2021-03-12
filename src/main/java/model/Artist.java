package model;

public class Artist {
    private String firstname;
    private String lastname;
    private String stageName;
    private int birthYear;
    private String birthPlace;
    private String label;

    public Artist(String firstname, String lastname, String stageName, int birthYear, String birthPlace, String label) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.stageName = stageName;
        this.birthYear = birthYear;
        this.birthPlace = birthPlace;
        this.label = label;
    }

    public Artist(String firstname, String lastname, int birthYear, String birthPlace) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.birthPlace = birthPlace;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", stageName='" + stageName + '\'' +
                ", birthYear=" + birthYear +
                ", birthPlace='" + birthPlace + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
