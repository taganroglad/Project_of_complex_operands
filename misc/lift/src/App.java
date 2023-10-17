import java.util.Scanner;

class Elevator {
    private int currentFloor;
    private String elevatorName;

    public Elevator(String elevatorName) {
        this.elevatorName = elevatorName;
        currentFloor = 1;
    }

    public void move(int targetFloor) {
        if (targetFloor >= 1 && targetFloor <= 20) {
            System.out.println(elevatorName + " is moving from floor " + currentFloor + " to floor " + targetFloor);
            currentFloor = targetFloor;
            System.out.println(elevatorName + " has arrived at floor " + currentFloor);
        } else {
            System.out.println("Invalid floor. Please enter a value between 1 and 20.");
        }
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}

public class App {
    public static void main(String[] args) {
        Elevator elevator1 = new Elevator("Elevator 1");
        Elevator elevator2 = new Elevator("Elevator 2");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Which floor are you on (1-20) or enter -1 to exit: ");
            int currentFloor = scanner.nextInt();

            if (currentFloor == -1) {
                break;
            }

            if (currentFloor >= 1 && currentFloor <= 20) {
                int distance1 = Math.abs(elevator1.getCurrentFloor() - currentFloor);
                int distance2 = Math.abs(elevator2.getCurrentFloor() - currentFloor);

                if (distance1 <= distance2) {
                    elevator1.move(currentFloor);
                } else {
                    elevator2.move(currentFloor);
                }
            } else {
                System.out.println("Invalid floor. Please enter a value between 1 and 20.");
            }
        }

        scanner.close();
    }
}
