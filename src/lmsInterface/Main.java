package lmsInterface;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        University educationCenter = new University("Oshmu", "Kyrgyzstan", LocalDate.of(2000, 5, 4));

        School educationCenter1 = new School("JBokonbaev", "USA", LocalDate.of(2000, 4, 4));

        College educationCenter2 = new College("Manas", "Kyrgyzstan", LocalDate.of(2000, 4, 5));

        Student student = new Student("Nurlan", "Abiibillaev", "male", educationCenter, LocalDate.of(2013, 4, 22));
        Student student2 = new Student("Ermek", "Niazov", "male", educationCenter, LocalDate.of(2012, 6, 18));
        Student student4 = new Student("Asan", "Erkebaev", "male", educationCenter, LocalDate.of(2015, 1, 22));
        Student student9 = new Student("Mairambek", "Eneskulov", "male", educationCenter, LocalDate.of(2016, 5, 9));

        Student student7 = new Student("Uson", "Eneskulov", "male", educationCenter1, LocalDate.of(2017, 1, 9));
        Student student1 = new Student("Nurtaazim", "Ermekov", "male", educationCenter1, LocalDate.of(2017, 5, 21));
        Student student5 = new Student("Timur", "Alymbekov", "male", educationCenter1, LocalDate.of(2013, 5, 7));

        Student student8 = new Student("Mirbek", "Eneskulov", "male", educationCenter2, LocalDate.of(2013, 7, 1));
        Student student6 = new Student("Erzat", "Muranov", "male", educationCenter2, LocalDate.of(2019, 5, 4));
        Student student3 = new Student("Taalai", "Teshebaev", "male", educationCenter2, LocalDate.of(2018, 7, 12));


        Student[] allStudents = {student, student1, student2, student3, student4, student5, student6, student7, student8, student9};
        System.out.println(educationCenter + "\n");
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getEducationCenter().getName().equals(educationCenter.getName())){
                allStudents[i].getStudentsEducationCenter();
                allStudents[i].getStudentsStudyingYear();
            }
        }
        System.out.println("\n\n" + educationCenter1 + "\n");
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getEducationCenter().getName().equals(educationCenter1.getName())){
                allStudents[i].getStudentsEducationCenter();
                allStudents[i].getStudentsStudyingYear();
            }
        }
        System.out.println("\n\n"+ educationCenter2 + "\n");
        for (int i = 0; i < allStudents.length; i++) {
            if (allStudents[i].getEducationCenter().getName().equals(educationCenter2.getName())){
                allStudents[i].getStudentsEducationCenter();
                allStudents[i].getStudentsStudyingYear();
            }
        }


    }
}
