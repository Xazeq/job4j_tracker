package ru.job4j.stream;

public class Airplane {
    private String manufacturer;
    private String model;
    private int engineCount;
    private int seatCount;
    private double maxSpeed;
    private double flightRange;
    private String color;

    static class Builder {
        private String manufacturer;
        private String model;
        private int engineCount;
        private int seatCount;
        private double maxSpeed;
        private double flightRange;
        private String color;

        Builder buildManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildEngineCount(int engineCount) {
            this.engineCount = engineCount;
            return this;
        }

        Builder buildSeatCount(int seatCount) {
            this.seatCount = seatCount;
            return this;
        }

        Builder buildMaxSpeed(double maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        Builder buildFlightRange(double flightRange) {
            this.flightRange = flightRange;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Airplane build() {
            Airplane airplane = new Airplane();
            airplane.manufacturer = manufacturer;
            airplane.model = model;
            airplane.engineCount = engineCount;
            airplane.seatCount = seatCount;
            airplane.maxSpeed = maxSpeed;
            airplane.flightRange = flightRange;
            airplane.color = color;
            return airplane;
        }
    }

    @Override
    public String toString() {
        return "Airplane{"
                + "manufacturer='" + manufacturer + '\''
                + ", model='" + model + '\''
                + ", engineCount=" + engineCount
                + ", seatCount=" + seatCount
                + ", maxSpeed=" + maxSpeed
                + ", flightRange=" + flightRange
                + ", color='" + color + '\''
                + '}';
    }

    public static void main(String[] args) {
        Airplane airplane = new Builder()
                .buildManufacturer("Airbus")
                .buildModel("A380")
                .buildEngineCount(4)
                .buildSeatCount(853)
                .buildMaxSpeed(1185)
                .buildFlightRange(15400)
                .buildColor("White")
                .build();
        System.out.println(airplane);
        Airplane airplane2 = new Builder()
                .buildManufacturer("Cessna")
                .buildModel("172")
                .buildEngineCount(1)
                .buildSeatCount(4)
                .buildMaxSpeed(302)
                .buildFlightRange(1185)
                .buildColor("Red")
                .build();
        System.out.println(airplane2);
    }
}
