/**
 * Created by omcna on 11/9/2017.
 */
public class Room {
    public final boolean isInfected;
    public boolean visited = false;
    private Room up;
    private Room down;
    private Room left;
    private Room right;

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
        return up;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public Room getDown() {
        return down;
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public Room getLeft() {
        return left;
    }

    public void setLeft(Room left) {
        this.left = left;
    }

    public Room getRight() {
        return right;
    }

    public void setRight(Room right) {
        this.right = right;
    }
}
