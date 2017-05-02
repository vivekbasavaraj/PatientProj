package hospital;

public class Temperature extends Patient
{
	private double bodyTemperature;
	private ReadingLocation readAt;
	public static double fever = 99.0;
	
	public Temperature(String patientName,int patientAge,Gender patientGender, double bodyTemperature, ReadingLocation readAt)
	{	
		super(patientName, patientAge, patientGender);
		this.bodyTemperature = bodyTemperature;
		this.readAt = readAt;
	}
	
	public void setBodyTemperature(double temperature) {
		this.bodyTemperature = temperature;
	}
	
	public double getBodyTemperature() {
		return bodyTemperature;
	}

	public void setTemperatureReadLocation(ReadingLocation readAt) {
		this.readAt = readAt;
	}
	
	public ReadingLocation getTemperatureReadLocation() {
		return readAt;
	}
	
	/*public void hasFever()
	{
		if(bodyTemperature >= fever)
		{
			System.out.println(" "+super.getPatientName()+" has got a fever ");
		} 
		else 
		{
			System.out.println(" "+super.getPatientName()+ " has normal body temperature.");
		}
	}*/
}