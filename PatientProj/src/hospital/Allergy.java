package hospital;

import java.util.List;

public class Allergy 
{
    private String allergyName;
	private AllergySeverity severity;
	private List<String> symptoms;
	
	public Allergy(String allergyName,AllergySeverity severity,List<String> symptoms)
	{
		this.allergyName = allergyName;
		this.severity = severity;
		this.symptoms = symptoms;
		
	}

	public void setAllergyName(String allergyName) {
		this.allergyName = allergyName;
	}
	
	public String getAllergyName() {
		return allergyName;
	}

	public void setSeverity(AllergySeverity severity) {
		this.severity = severity;
	}

	public AllergySeverity getSeverity() {
		return severity;
	}

	public void setSymptoms(List<String> symptoms) {
		this.symptoms = symptoms;
	}
	
	public List<String> getSymptoms() {
		return symptoms;
	}
}