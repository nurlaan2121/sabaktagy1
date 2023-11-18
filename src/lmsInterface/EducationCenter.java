package lmsInterface;

import java.time.LocalDate;

public abstract class EducationCenter implements Study{
    private String name;
    private String locatedCountry;
    private LocalDate LocalDatefoundationYear;

    public EducationCenter() {
    }

    public EducationCenter(String name, String locatedCountry, LocalDate localDatefoundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        LocalDatefoundationYear = localDatefoundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getLocalDatefoundationYear() {
        return LocalDatefoundationYear;
    }

    public void setLocalDatefoundationYear(LocalDate localDatefoundationYear) {
        LocalDatefoundationYear = localDatefoundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter {" +
                "name: " + name + '\'' +
                ", Country: " + locatedCountry + '\'' +
                ", DatefoundationYear: " + LocalDatefoundationYear +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {

    }

    @Override
    public void getStudentsStudyingYear() {

    }
}
