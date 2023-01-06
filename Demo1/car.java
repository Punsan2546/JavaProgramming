public class car{
    /* Attributes */
    public int size;
    public String color;
    public String model;

        public static void main (String[] args) {
       /* moveForward();
        moveBackword();
        stop();
        trunOnlight();
        trunOfflight(); */

        Car redCar = new Car();
        redCar.color = "red";
        redCar.model = "Benz";
        redCar.size = 4;

        Car blueCar = new Car();
        blueCar.color = "blue";
        blueCar.model = "Benz";
        blueCar.size = 4;
        
        System.out.println("Car color: " + redCar.color);
        System.out.println("Car size: " + redCar.saize);
        System.out.println("Car model: " + redCar.model);
        redCar.moveForward();
        System.out.println("Car color: " + blueCar.color);
        System.out.println("Car size: " + blueCar.saize);
        System.out.println("Car model: " + blueCar.model);
        blueCar.moveForward();

    /* Methods */ 
    public void moveForward(){
     System.out.println(this.color + "Move forward");
}

public void moveForward(){
     System.out.println(this.color + "Move backward");
}

public void moveForward(){
     System.out.println(this.color + "stop");
}

public void moveForward(){
     System.out.println(this.color + "trunOnlight");
}
public void moveForward(){
     System.out.println(this.color + "trunOfflight");
}