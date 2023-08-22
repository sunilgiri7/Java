package OOPS_implement;

public class inheritance_pt_1 extends inheritance {
    public int seatHeight;
    public inheritance_pt_1(int startHeight, int startSpeed, int startGear){
        super(startSpeed, startGear);
        this.seatHeight = startHeight;
    }
    public void seatHeight(int newValue){
        seatHeight = newValue;
    }
}