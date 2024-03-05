package src;

import java.util.List;

public interface PatientDao {
    void addPatient(Patient patient);
    List<Patient> getAllPatients();
    Patient getPatientById(int id);
    void updatePatient(Patient patient);
    void deletePatient(int id);
    List<Patient> getPatientsByPractitionerId(int practitionerId);
}
