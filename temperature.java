class temp {
    double celcius;

    public void setCelcius ( double celcius) {
        this.celcius = celcius;
    }
    public double getCelcius() {
        return celcius;
    }
    public double getFehrenhiet () {
        return ( celcius * 9/5) + 32;
    }
}

public class temperature {
    public static void main(String[] args) {
        temp t1 = new temp();
        t1.setCelcius(25);
        System.out.println( " Celcius is = " + t1.getCelcius());
        System.out.println( " Fahrenhiet is = " + t1.getFehrenhiet());
    }
}