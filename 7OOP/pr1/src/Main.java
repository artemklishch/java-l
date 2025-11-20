public class Main {
    static public void main(String[] args) {
        Car car1 = new Car();
//        car1.setMake("Tesla");
        car1.setMake("Maserati");
        car1.setModel("Tesla X");
        car1.setDoors(2);
        car1.setColor("red");
        car1.setConvertible(true);
        System.out.println(car1.getMake());
        car1.describeCar();
    }
}
