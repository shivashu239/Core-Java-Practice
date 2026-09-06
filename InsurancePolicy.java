interface Renewable {
    void Renew();
}
abstract class Policy{
    private String holderName;
    private double premium;

    Policy(String holderName, double premium) {
        this.holderName = holderName;
        this.premium = premium;
    }
    public void getName() {
        System.out.println("Policy holder name is = " + holderName);
    }
    public void setPremium(double premium) {
        if ( premium > 0) {
            this.premium = premium;
        }
        else {
            System.out.println("Invalid premium");
        }
    }
    public void getPremium() {
       System.out.println("Premium is = " + premium); 
    }
    public double getPremiumValue() {
        return premium;
    }
}
class HealthPolicy extends Policy implements Renewable {
    HealthPolicy(String holderName, double premium) {
        super(holderName,premium);
    }
    public void getIncreasedPremium() {
        double premium = getPremiumValue();
        premium = premium + (premium * 10/100);
        System.out.println("Increased premium is = " + premium);
    }
    public void Renew() {
        System.out.println("Policy renew successfully" + "\n");
    }
}
class VehiclePolicy extends Policy implements Renewable {
    VehiclePolicy(String holderName, double premium) {
        super(holderName, premium);
    }
    public void getIncreasedPremium() {
        double premium = getPremiumValue();
        premium = premium + (premium * 10/100);
        System.out.println("Increased premium is = " + premium);
    }
    public void Renew() {
        System.out.println("Premium renewed successfully");
    }
}
public class InsurancePolicy {
    public static void main(String[] args) {
        HealthPolicy hp = new HealthPolicy("Shivanshu",50000);
        VehiclePolicy vp = new VehiclePolicy("Shiavnshu",10000);

    
        vp.getName();
        hp.setPremium(50000);
        hp.getPremium();
        hp.getIncreasedPremium();
        hp.Renew();
        
        vp.getName();
        vp.setPremium(1000);
        vp.getPremium();
        vp.getIncreasedPremium();
        vp.Renew();
    }
}

 