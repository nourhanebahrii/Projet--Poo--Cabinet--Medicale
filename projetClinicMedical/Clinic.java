import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private String name;
    private String address;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Clinic(String name, String address) {
        this.name = name;
        this.address = address;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    @Override
    public String toString() {
        return "Clinic: " + name + ", Address: " + address;
    }
}

