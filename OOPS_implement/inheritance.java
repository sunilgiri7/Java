package OOPS_implement;

public class inheritance {
    protected int gear;
    protected int speed;

    public inheritance(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increament){
        speed += increament;
    }
}