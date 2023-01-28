public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(1, "Black", "2021-01-01",
                "BMW 320d", "sedan");

        Wheel wheel = new Wheel(2);

        Car audi = new Car(wheel);


        Bus bus = new Bus(40, 2);

        Transport bmw2 = new Car();
        Transport mercedes = new Bus();

        bmw2.drive();
        mercedes.drive();

//        System.out.println(bmw.power(2));
//        System.out.println(bmw.power(2, 3));
    }

}
