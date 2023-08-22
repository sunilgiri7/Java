package OOPS_implement;

public class inheritance_pt_2 {
    public static void main(String[] args) {
        inheritance_pt_1 mountainbike = new inheritance_pt_1(20, 10, 1);
        System.out.println("Gear is:" + mountainbike.gear);
        System.out.println("Seat height is:" + mountainbike.seatHeight);
        System.out.println("Speed is:" + mountainbike.speed);
        mountainbike.applyBrake(1);
        System.out.println("Bike speed after applying break:" + mountainbike.speed);
    }
}
