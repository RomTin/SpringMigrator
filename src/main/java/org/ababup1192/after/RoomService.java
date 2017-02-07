package org.ababup1192.after;

import java.util.List;

public interface RoomService {
    void truncateRoom();
    void dropRoom();

    // Delete code on production
    List<Room> findByEquipmentName(String equipmentName);
}
