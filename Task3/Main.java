// 3
package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Room room1 = new Room(1, 2, 2);
        Room room2 = new Room(4, 1, 1);
        Room room3 = new Room(3, 4, 2);

        ArrayList<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);

        Building building = new Building(roomList, 2, 3, true);

        int totalLamps = countLampsInBuilding(building);
        System.out.println("Total antal lamper i bygningen: " + totalLamps);

        boolean isNormalBuilding = isNormal(building);
        if (!isNormalBuilding){

            System.out.println("Spøjs bygning!");

        }
    }

    public static int countLampsInBuilding(Building building){

        int totalLamps = 0;
        for (Room room : building.getRooms()){
            totalLamps += room.getNumberOfLamps();

        }

        return totalLamps;

    }

    public static boolean isNormal(Building building){

        return building.getNumberOfFloors() > building.getRooms().size();

    }
}