package com.oca;

class SpeedBoat {
    float speed;
}

public class BoatRace {
    public void breakRecord(SpeedBoat sb, float speed) {
        speed = speed * 2;
        sb.speed = sb.speed + speed;
    }

    public static void main(String[] args) {
        SpeedBoat sb = new SpeedBoat();
        sb.speed = 200;
        float currentRecord = 400;
        BoatRace br = new BoatRace();
        br.breakRecord(sb, currentRecord);
        System.out.println(sb.speed + " vs " + currentRecord);
    }
}
