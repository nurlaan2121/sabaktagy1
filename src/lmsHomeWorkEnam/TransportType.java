package lmsHomeWorkEnam;

public enum TransportType {
    CAR {
        @Override
        public double calculateTravelCost(double distance) {
            return 0.1 * distance;
        }
    },
    BUS {
        @Override
        public double calculateTravelCost(double distance) {
            return 0.05 * distance;
        }
    },
    TRUCK {
        @Override
        public double calculateTravelCost(double distance) {
            return 0.2 * distance;
        }
    };

    public abstract double calculateTravelCost(double distance);
}
