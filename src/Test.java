import java.util.*;

/**
 * Created by omcna on 11/9/2017.
 */
public class Test {

    public static void main(String[] args) {

        //test one
        Room[][] verticalTrue = new Room[][]{
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}
        };

        if (isOutbreakThree(verticalTrue)) {
            System.out.println("Test one has an outbreak");
        } else {
            System.out.println("Test one has NO outbreak");
        }

        //test two
        Room[][] horizontalTrue = new Room[][]{
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}
        };

        if (isOutbreakThree(horizontalTrue)) {
            System.out.println("Test two has an outbreak");
        } else {
            System.out.println("Test two has NO outbreak");
        }
        //test three
        Room[][] noInfection = new Room[][]{
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}
        };

        if (isOutbreakThree(noInfection)) {
            System.out.println("Test three has an outbreak");
        } else {
            System.out.println("Test three has NO outbreak");
        }

        //test four
        Room[][] mytest = new Room[][]{
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(true), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(true), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
                {new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)}
        };

        if (isOutbreakThree(mytest)) {
            System.out.println("Test mytest has an outbreak");
        } else {
            System.out.println("Test mytest has NO outbreak");
        }


    }

    private static boolean isOutbreakThree(Room[][] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {

                if(i > 0) {
                    rooms[i][j].setUp(rooms[i - 1][j]);
                }

                if(i < rooms.length - 1) {
                    rooms[i][j].setDown(rooms[i + 1][j]);
                }

                if(j < rooms[i].length - 1) {
                    rooms[i][j].setRight(rooms[i][j + 1]);
                }

                if(j > 0) {
                    rooms[i][j].setLeft(rooms[i][j - 1]);
                }

            }
        }

        for(Room[] floorRooms : rooms){
            for(Room room : floorRooms ){
                goWalk(room, null,  0);
            }
        }

        int max = 0;
        for(Room[] floorRooms : rooms){
            for(Room room : floorRooms ){
                if(room.getCountOfRoomsConnectedInfected() > max){
                    max = room.getCountOfRoomsConnectedInfected();
                }
            }
        }
        if(max >= 5){
            return true;
        }
        return false;
    }

    private static void goWalk(Room room, Room previcous, int count) {
        if(room != null && !room.visited) {
            room.visited = true;
            if (room.isInfected) {
                if(previcous != null){
                    room.setCountOfRoomsConnectedInfected(previcous.getCountOfRoomsConnectedInfected() + 1);
                    previcous.setCountOfRoomsConnectedInfected(previcous.getCountOfRoomsConnectedInfected() + 1);
                }else {
                    room.setCountOfRoomsConnectedInfected(count + 1);
                }
                goWalk(room.getUp(),    room, room.getCountOfRoomsConnectedInfected());
                goWalk(room.getRight(), room, room.getCountOfRoomsConnectedInfected());
                goWalk(room.getDown(),  room, room.getCountOfRoomsConnectedInfected());
                goWalk(room.getLeft(),  room, room.getCountOfRoomsConnectedInfected());
            }
        }
    }

}