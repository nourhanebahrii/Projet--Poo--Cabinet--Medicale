import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Création d'une clinique
        Clinic clinic = new Clinic("Clinique ABC", "123 rue de la santé");

        // Scanner pour les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Ajout d'un docteur
        System.out.print("Nom du docteur: ");
        String doctorName = scanner.nextLine();
        System.out.print("Âge du docteur: ");
        int doctorAge = scanner.nextInt();
        scanner.nextLine();  // Consommer la nouvelle ligne
        System.out.print("Spécialisation du docteur: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(doctorName, doctorAge, specialization);
        clinic.addDoctor(doctor);

        // Ajout d'un patient
        System.out.print("Nom du patient: ");
        String patientName = scanner.nextLine();
        System.out.print("Âge du patient: ");
        int patientAge = scanner.nextInt();
        scanner.nextLine();  // Consommer la nouvelle ligne
        System.out.print("Maladie du patient: ");
        String ailment = scanner.nextLine();

        Patient patient = new Patient(patientName, patientAge, ailment);
        clinic.addPatient(patient);

        // Création d'un rendez-vous
        System.out.print("Date du rendez-vous (ex: 01-02-2025): ");
        String date = scanner.nextLine();
        System.out.print("Heure du rendez-vous (ex: 09:30): ");
        String heure = scanner.nextLine();
        Rendezvous rendezvous = new Rendezvous(patient, doctor, date,heure);

        // Affichage des détails
        System.out.println("\n--- Détails du Rendez-vous ---");
        System.out.println(rendezvous);

        // Affichage des docteurs et des patients
        System.out.println("\n--- Liste des Docteurs ---");
        for (Doctor d : clinic.getDoctors()) {
            d.displayDetails();
        }

        System.out.println("\n--- Liste des Patients ---");
        for (Patient p : clinic.getPatients()) {
            p.displayDetails();
        }
    }
}

