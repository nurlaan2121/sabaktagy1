package lmsInterface;

import java.time.LocalDate;

public class Student implements Study{
    private  String name;
    private  String surname;
    private String gender;
    private EducationCenter educationCenter;
    private  LocalDate dateOfStart;

    public Student() {
    }

    public Student(String name, String surname, String gender, EducationCenter educationCenter, LocalDate dateOfStart) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.educationCenter = educationCenter;
        this.dateOfStart = dateOfStart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "Student {" +
                "name: " + name + '\'' +
                ", surname: " + surname + '\'' +
                ", gender: " + gender + '\'' +
                ", dateOfStart: " + dateOfStart +
                '}';
    }

    @Override
    public void getStudentsEducationCenter() {
            System.out.println("Student {" +
                    "name: " + name + '\'' +
                    ", surname: " + surname + '\'' +
                    ", gender: " + gender + '\'' +
                    ", dateOfStart: " + dateOfStart +
                    '}');
    }

    @Override
    public void getStudentsStudyingYear() {
        System.out.println("Info:  {" +
                "name: " + name + '\'' +
                ", Name Learning center: " + educationCenter.getName() +
                ", Year of Learn: " + (dateOfStart.getYear() - educationCenter.getLocalDatefoundationYear().getYear()) +
                '}');
    }
}
