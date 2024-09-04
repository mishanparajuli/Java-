public class ArrayExample {
    public static void main(String[] args) {
  
        String[] cars = new String[3];

        cars[0] = "Toyota";
        cars[1] = "Mercedez";
        cars[2] = "BMW";

        for (int i = 0; i < cars.length; i++) {
            System.out.println("CARS: " + cars[i]);
        }
    }
}
