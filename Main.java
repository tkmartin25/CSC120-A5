
public static void main(String[]args) {
    Engine engine = new Engine("engine 1", 360, 400, FuelType.ELECTRIC);
    Car car_1 = new Car("car 1", 20);
    Passenger teddy = new Passenger("Teddy Martin");
    Train myTrain = new Train(engine, FuelType.ELECTRIC, 400, 8, 160);
    teddy.boardCar(car_1);
    myTrain.printManifest();
}
