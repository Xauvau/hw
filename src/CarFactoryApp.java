class Car {
    private String model;
    private int year;
    private String manufacturer;
    private static int totalCarsProduced = 0;

    public Car(String model, int year, String manufacturer) {
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        totalCarsProduced++;
    }

    public void displayInfo() {
        System.out.println("Модель: " + model + ", Рік: " + year + ", Виробник: " + manufacturer);
    }

    public static int getTotalCarsProduced() {
        return totalCarsProduced;
    }
}

    public class CarFactoryApp {
        public void main(String[] args) {
            Car car1 = new Car("Tesla Model S", 2023, "Tesla");
            Car car2 = new Car("Ford Mustang", 2022, "Ford");
            Car car3 = new Car("BMW X5", 2023, "BMW");

            System.out.println("Інформація про автомобілі:");
            car1.displayInfo();
            car2.displayInfo();
            car3.displayInfo();

            System.out.println("Загальна кількість випущених автомобілів: " + Car.getTotalCarsProduced());
        }
    }


