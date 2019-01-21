public class car {
	
	private String make;
	private String model;
	private int speed;
	private double fuel_level;
 
	
	/*public car ()
	{
		this.make = "Lambo";
		this.model = "Lime";
		this.speed = 69;
		this.fuel_level = 500;*/
	
	public car(String make, String model , int speed, double fuel_level)
	{
		this.make = make;
		this.model = model;
		this.speed = speed;
		this.fuel_level = fuel_level;
	}
													// Getters
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public double getFuelLevel()
	{
		return fuel_level;
	}
	
													// Setters
	public void setMake (String make)
	{
		this.make = make;
	}
	
	public void setModel (String model)
	{
		this.model = model;
	}
	
	public void setSpeed (int speed)
	{
		this.speed = speed;
	}
	
	public void setFuelLevel (double fuel_level)
	{
		this.fuel_level = fuel_level;
	}
	
	public boolean drive (double speed, double distance)
	{
		//double speed;
		//double distance;
		
		if (fuel_level < (speed/20))
		{
			return false;
		}
		
		else if (speed != this.speed)
		{
			this.accelerate(speed - this.speed);
		}
		fuel_level -=(speed/20);
		return true;
	}
	
	public int accelerate (double d)  {
		return (this.speed += d);
	}
													// ToString Method
	@Override
    public String toString() {
      return  "{Make:" + this.make  + ", Model:" +
    		this.model    + ", Speed:"+
    		this.speed + ", Fuel:"+ this.fuel_level + "}" ;
   }
}
