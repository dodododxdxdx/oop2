public class Ship {
    private String name;
    private String captainFullName;
    private double displacement;
    private double xCoordinate;
    private double yCoordinate;

    public Ship(String name, String captainFullName, double displacement, double x, double y) {
        this.name = name;
        this.captainFullName = captainFullName;
        this.displacement = displacement;
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    // Методы для назначения и изменения полей
    public void setName(String name) {
        this.name = name;
    }

    public void setCaptainFullName(String captainFullName) {
        this.captainFullName = captainFullName;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public void setCoordinates(double x, double y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    // Метод вывода информации о корабле
    public void displayInfo() {
        System.out.println("Ship Name: " + name);
        System.out.println("Captain: " + captainFullName);
        System.out.println("Displacement: " + displacement + " tons");
        System.out.println("Coordinates: (" + xCoordinate + ", " + yCoordinate + ")");
    }
}
public class CruiseLiner extends Ship {
    private int numberOfSeats;

    public CruiseLiner(String name, String captainFullName, double displacement, double x, double y, int numberOfSeats) {
        super(name, captainFullName, displacement, x, y);
        this.numberOfSeats = numberOfSeats;
    }

    // Метод для назначения и изменения количества мест
    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    // Метод вывода информации о круизном лайнере
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вызов метода родительского класса
        System.out.println("Number of Seats: " + numberOfSeats);
    }
}
public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship("Black Pearl", "Jack Sparrow", 500, 10.0, 20.0);
        ship.displayInfo();

        CruiseLiner cruiseLiner = new CruiseLiner("Titanic", "Edward Smith", 52310, 15.0, 25.0, 2200);
        cruiseLiner.displayInfo();
    }
}
