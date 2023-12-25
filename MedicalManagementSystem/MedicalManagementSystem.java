import java.util.ArrayList;
import java.util.Date;

class MedicalRecord {
    // Class representing the medical records of a patient
    private String patientName;
    private ArrayList<String> labReports;

    public MedicalRecord(String patientName) {
        this.patientName = patientName;
        this.labReports = new ArrayList<>();
    }

    public void addLabReport(String report) {
        labReports.add(report);
    }

    public ArrayList<String> getLabReports() {
        return labReports;
    }
}

class User {
    // Class representing a user (Admin, Doctor, or Patient)
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}

class Doctor extends User {
    // Class representing a Doctor
    private ArrayList<MedicalRecord> patientRecords;

    public Doctor(String username, String password) {
        super(username, password);
        this.patientRecords = new ArrayList<>();
    }

    public void accessPatientRecord(String patientName) {
        // Logic to access patient records
        // Display medical history, lab reports, etc.
    }

    public void prescribeMedication(String patientName, String medication) {
        // Logic to prescribe medication
    }

    public void scheduleAppointment(String patientName, Date date) {
        // Logic to schedule an appointment
    }
}

class Admin extends User {
    // Class representing an Admin
    public Admin(String username, String password) {
        super(username, password);
    }

    public void manageSystem() {
        // Logic to manage the overall system
        // Add/remove doctors, view system statistics, etc.
    }
}

class Patient extends User {
    // Class representing a Patient
    private ArrayList<String> appointments;

    public Patient(String username, String password) {
        super(username, password);
        this.appointments = new ArrayList<>();
    }

    public void viewMedicalHistory() {
        // Logic to view medical history
    }

    public void requestAppointment(Date date) {
        // Logic to request an appointment
    }

    public void donateOrgan() {
        // Logic for organ donation
    }
}

public class MedicalManagementSystem {
    public static void main(String[] args) {
        // You can implement the user interface using Java Swing here
        // Create instances of Admin, Doctor, and Patient and demonstrate functionality
    }
}
