package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Hospital {

	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String location;

	public Hospital(int hospitalCode, String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {

		this.hospitalCode = hospitalCode;
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	public int getHospitalCode() {
		return hospitalCode;
	}

	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}

	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatments="
				+ listOfTreatments + ", contactPerson=" + contactPerson + ", contactNumber=" + contactNumber
				+ ", location=" + location + "]";
	}
}

class HospitalService {

	private ArrayList<Hospital> hospitals = new ArrayList<>();

	public int addHospital(Hospital hospitalDetails) {
		hospitals.add(hospitalDetails);
		return hospitalDetails.getHospitalCode();
	}

	public Map<Integer, String> getHospitals() {
		Map<Integer, String> map = new HashMap<>();
		for (Hospital hospital : hospitals) {
			map.put(hospital.getHospitalCode(), hospital.getHospitalName());
		}
		return map;
	}

	public void getHospitalDetails(Integer code) {

		for (Hospital hospital : hospitals) {
			if (code.equals(hospital.getHospitalCode())) {
				System.out.println(hospital);
			}
		}

	}

}

public class HospitalFinder {
	public static void main(String[] args) {

		HospitalService service = new HospitalService();

		int hospital1 = service.addHospital(new Hospital(101, "YASHODA",
				Arrays.asList("Cardiac", "ENT", "Ortho", "Pedatric", "Gastro"), "MATHEWS", "8767465807", "Secandrabad"));

		service.addHospital(new Hospital(102, "APOLO",
				Arrays.asList("Surgery", "Dentist", "Ortho", "Pedatric", "Gastro"), "MATHEWS", "8767465807", "Begumpet"));

		service.addHospital(new Hospital(103, "SPARSH", Arrays.asList("Dermatology", "Ortho", "Gastro"),
				"PRIYA", "9000001111", "Solapur"));

		Map<Integer, String> hospitals = service.getHospitals();
		hospitals.forEach((code, name) -> System.out.println(code + " -> " + name));

		service.getHospitalDetails(hospital1);
	}
}
