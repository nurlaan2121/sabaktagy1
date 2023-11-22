package aizatejetask1;

import java.time.LocalDate;

public enum Body {
    SEDAN {
        @Override
        public String bodyTypeIdentification(Car name) {

            return name + " bul madina {Sedan cllassyndagy mashina }";
        }

        @Override
        public void determinationoYearOfManufacture(Car localdate) {
            System.out.println("Bul mashinanayn chykkanyna:  " + (LocalDate.now().getYear() - localdate.getYearOfFoundation().getYear()) + " boldu");
        }
    },
    HETCHBEK {
        @Override
        public String bodyTypeIdentification(Car name) {

            return name + " bul mashina lehkovoi classyndagy mashina!";
        }

        @Override
        public void determinationoYearOfManufacture(Car localdate) {
            System.out.println("Bul mashinanyn jykkanuna: " + (LocalDate.now().getYear() - localdate.getYearOfFoundation().getYear()) + " boldu");
        }
    },
    KROSSOVER {
        @Override
        public String bodyTypeIdentification(Car name) {

            return name + " bul mashina Krossover classyndagy mashina!";
        }

        @Override
        public void determinationoYearOfManufacture(Car localdate) {
            System.out.println("Bul mashinanyn jykkanuna: " +(LocalDate.now().getYear() - localdate.getYearOfFoundation().getYear()) + " boldu");
        }
    },
    VNEDOROJNIK {
        @Override
        public String bodyTypeIdentification(Car name) {

            return name + " bul mashina Vnedorojnik classyndagy mashina";
        }

        @Override
        public void determinationoYearOfManufacture(Car localdate) {
            System.out.println("Bul mashinanyn jykkanuna: " +(LocalDate.now().getYear() - localdate.getYearOfFoundation().getYear()) + " boldu");
        }
    },
    UNIVERSAL {
        @Override
        public String bodyTypeIdentification(Car name) {
            return name + " bul  mashina Universal  classyndagy mashina!";
        }

        @Override
        public void determinationoYearOfManufacture(Car localdate) {
            System.out.println("Bul mashinanyn jykkanuna: " + (LocalDate.now().getYear() - localdate.getYearOfFoundation().getYear()) + " boldu");

        }
    };

    public abstract String bodyTypeIdentification(Car name);
    public abstract void determinationoYearOfManufacture(Car localdate);
}
