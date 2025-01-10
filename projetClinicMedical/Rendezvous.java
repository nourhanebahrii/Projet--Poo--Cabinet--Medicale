public class Rendezvous {
    private Patient patient;
    private Doctor doctor;
    private  String date;
    private  String heure;


    public Rendezvous(Patient patient, Doctor doctor, String date,String heure) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.heure = heure;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public  String getDate() {
        return date;
    }

    public void setDate( String date) {
        this.date = date;
    }
    public  String getHeure() {
        return heure;
    }

    public void setHeure( String heure) {
        this.heure = heure;
    }

    @Override
    public String toString() {
        return "Rendez-vous : Patient=" + patient.getName() + " with Doctor=" + doctor.getName() +
               " on " + date+"at"+heure;
    }
}

