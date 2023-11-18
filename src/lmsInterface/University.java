package lmsInterface;

import java.time.LocalDate;

public class University extends EducationCenter{
    public University() {
    }

    public University(String name, String locatedCountry, LocalDate localDatefoundationYear) {
        super(name, locatedCountry, localDatefoundationYear);
    }
}
