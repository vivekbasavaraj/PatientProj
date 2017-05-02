package hospital;

import java.util.*;


public class Patient
{
	private String patientName;
	private int patientAge;
	private Gender  patientGender;
	private AllergySeverity severity;
	
	public Patient(String patientName,int patientAge,Gender  patientGender,AllergySeverity severity)
	{
		this.patientName = patientName;
		this.patientAge = patientAge ;
		this.patientGender = patientGender;
		this.severity = severity;
	}
	
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	
	public String getPatientName() {
		return patientName;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	
	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientGender(Gender patientGender) {
		this.patientGender = patientGender;
	}
	
	public Gender getPatientGender() {
		return patientGender;
	}

	public void setSeverity(AllergySeverity severity) {
		this.severity = severity;
	}

	public AllergySeverity getSeverity() {
		return severity;
	}

}