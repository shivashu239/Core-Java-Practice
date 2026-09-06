class speed {
    private int model;
    private int speed;
    private final int Max_Speed = 180;

    public void setModel( int model) {
        if ( model > 2026 || model < 1980) {
            System.out.println( " Model did not exits");
        }
        else {
            this.model = model;
            System.out.println( " Model of car is = " + model);
        }
    }
    public void setSpeed( int speed) {
        if ( speed < 0 || speed > 180) {
            System.out.println( " Invalid Speed");
        }
        else {
            this.speed = speed;
            System.out.println( " Speed of car is = " + speed);
        }
    }
    public void getMax_Speed() {
        System.out.println("Maximum speed of car = " + Max_Speed);
    }
}

public class Car {
    public static void main(String[] args) {
        speed s1 = new speed();

        s1.setModel(3023);
        s1.setSpeed(200);
        s1.getMax_Speed();
    }
}