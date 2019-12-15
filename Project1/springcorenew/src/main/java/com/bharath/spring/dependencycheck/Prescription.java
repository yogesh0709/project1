package com.bharath.spring.dependencycheck;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;

public class Prescription {

	public int id;
	public String patientName;
	public List<String> medicines;

	public int getId() {
		return id;
	}

	@Required
	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public List<String> getMedicines() {
		return medicines;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", patientName=" + patientName + ", medicines=" + medicines + "]";
	}

	public void setMedicines(List<String> medicines) {
		this.medicines = medicines;
	}

}
