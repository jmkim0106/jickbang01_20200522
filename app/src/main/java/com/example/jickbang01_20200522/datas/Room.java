package com.example.jickbang01_20200522.datas;

public class Room {

    private int price; // 만원단위로 기록. 15000 => 1억 5천
    private String address; // 구 동 만 기록. (마포구 망원동)
    private int floor; // 층수 : 양수, 0층 : 반지하, 음수 : 지하 ?층
    private String description; // 설명 문구

    public Room(int price, String address, int floor, String description) {
        this.price = price;
        this.address = address;
        this.floor = floor;
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
