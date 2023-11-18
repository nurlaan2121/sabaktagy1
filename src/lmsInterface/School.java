package lmsInterface;

import java.time.LocalDate;

public class School extends EducationCenter{
    public School() {
    }

    public School(String name, String locatedCountry, LocalDate localDatefoundationYear) {
        super(name, locatedCountry, localDatefoundationYear);
    }
}
