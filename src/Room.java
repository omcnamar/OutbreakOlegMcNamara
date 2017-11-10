/**
 * Created by omcna on 11/9/2017.
 */
public class Room {
    public final boolean isInfected;
    public boolean visited = false;
    private Room Up;
    private Room Down;
    private Room left;
    private Room Right;

    public int getCountOfRoomsConnectedInfected() {
        return countOfRoomsConnectedInfected;
    }

    public void setCountOfRoomsConnectedInfected(int countOfRoomsConnectedInfected) {
        this.countOfRoomsConnectedInfected = countOfRoomsConnectedInfected;
    }

    private int countOfRoomsConnectedInfected = 0;


    Room(boolean infected){
        isInfected = infected;
    }

    public Room getUp() {
        return Up;
    }

    public void setUp(Room up) {
        Up = up;
    }

    public Room getDown() {
        return Down;
    }

    public void setDown(Room down) {
        Down = down;
    }

    public Room getLeft() {
        return left;
    }

    public void setLeft(Room left) {
        this.left = left;
    }

    public Room getRight() {
        return Right;
    }

    public void setRight(Room right) {
        Right = right;
    }
}
