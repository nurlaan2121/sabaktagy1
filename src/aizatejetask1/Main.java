//Car классын тузунуз, полялары : машина маркасы,
//        чыгарылган жылы, баасы жана кузов түрү ENUM (седан,
//        хэтчбек, кроссовер, внедорожник, универсал) .
//        Көрсөтмөлөр боюнча bodyTypeIdentification методу болушу
//        керек, бул правилалар боюнча: седан жана хэтчбек -
//        "легковой классындагы машина"
//        , кроссовер жана
//        внедорожник - "внедорожник классындагы машина"
//        ,
//        универсал - "универсал классындагы машина" деп бизге
//        машинан типи менен кайсы класска кирет чыгарып
//        берсин. Жана determinationoYearOfManufacture методу,
//        азыркы жыл LocalDate now getYear методтун колдонуп
//        алып, чыгарылган жылынан эсептеп машинага канча
//        жыл болгонун эсептеп берсин
        package aizatejetask1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mersedes", LocalDate.of(2000,4,5),15000);
        Car car2 = new Car("Niva", LocalDate.of(2005,8,5),16000);
        Car car3 = new Car("Fit", LocalDate.of(2015,5,5),10000);
        Car car4 = new Car("Audi s4", LocalDate.of(2005,2,5),19000);
        Car car5 = new Car("Lexus 570", LocalDate.of(2008,1,5),22000);
        System.out.println(Body.KROSSOVER.bodyTypeIdentification(car5));
        Body.KROSSOVER.determinationoYearOfManufacture(car5);
        System.out.println(Body.HETCHBEK.bodyTypeIdentification(car3));
        Body.HETCHBEK.determinationoYearOfManufacture(car3);
        System.out.println(Body.SEDAN.bodyTypeIdentification(car));
        Body.SEDAN.determinationoYearOfManufacture(car);
        System.out.println(Body.UNIVERSAL.bodyTypeIdentification(car4));
        Body.UNIVERSAL.determinationoYearOfManufacture(car4);
        System.out.println(Body.VNEDOROJNIK.bodyTypeIdentification(car2));
        Body.VNEDOROJNIK.determinationoYearOfManufacture(car2);





    }
}
