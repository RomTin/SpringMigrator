package org.ababup1192.before.room;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class EquipmentRoom implements Serializable {
    @Id
    @GeneratedValue
    private Integer id;
    private String roomName;

    private Integer capacity;

    private String equipmentName;

    public EquipmentRoom() {
    }

    public EquipmentRoom(String roomName, Integer capacity, String equipmentName) {
        this.roomName = roomName;
        this.capacity = capacity;
        this.equipmentName = equipmentName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EquipmentRoom that = (EquipmentRoom) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (roomName != null ? !roomName.equals(that.roomName) : that.roomName != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        return equipmentName != null ? equipmentName.equals(that.equipmentName) : that.equipmentName == null;

    }

    @Override
    public String toString() {
        return "EquipmentRoom{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", capacity=" + capacity +
                ", equipmentName='" + equipmentName + '\'' +
                '}';
    }
}
