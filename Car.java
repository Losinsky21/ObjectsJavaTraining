public class Car {

    private double d_numberOfKilometersTraveled;
    private double d_fuelLevel;
    private double d_fuelUsageLitersIn100Kilometers;

    public Car(double _fuelUsage)
    {
        this.d_fuelUsageLitersIn100Kilometers = _fuelUsage;
    }

    public void drive(double _kilometers)
    {
        if (d_fuelLevel > 0 && (this.d_fuelLevel - (d_fuelUsageLitersIn100Kilometers/100.0d) * _kilometers > 0)) {
            this.d_numberOfKilometersTraveled += _kilometers;
            this.d_fuelLevel -= (d_fuelUsageLitersIn100Kilometers/100.0d) * _kilometers;
        }
        else {
            System.out.println("Not enough fuel to travel!");
        }
    }

    public double getTotalAmountOfKilometersTraveled()
    {
        return Math.round(this.d_numberOfKilometersTraveled*100.0d)/100.0d;
    }

    public double getTotalFuel()
    {
        return Math.round(this.d_fuelLevel*100.0d)/100.0d;
    }

    public void addFuel(double _fuel)
    {
        this.d_fuelLevel += _fuel;
    }
}
