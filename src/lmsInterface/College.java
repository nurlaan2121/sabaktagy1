package lmsInterface;

import java.time.LocalDate;

public class College extends EducationCenter{
    public College() {
    }

    public College(String name, String locatedCountry, LocalDate localDatefoundationYear) {
        super(name, locatedCountry, localDatefoundationYear);
    }
}
