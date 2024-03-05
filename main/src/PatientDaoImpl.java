package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PatientDaoImpl implements PatientDao{
    @Override
    public void addPatient(Patient patient) {
        String sql = "INSERT INTO patients (name, age) VALUES (?, ?)";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, gp.getName());
            stmt.setString(2, gp.getSpecialty());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Patient> getAllPatients() {
        List<Patient> patients = new ArrayList<>();
        String sql = "SELECT * FROM patients";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                patients.add(new Patient(rs.getString("name"),rs.getInt("age"),rs.getInt("practitioner_id")));
                //rs.getInt("id"), rs.getString("name"), rs.getString("specialty"))
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return patients;
    }

    @Override
    public Patient getPatientById(int id) {
        return null;
    }

    @Override
    public void updatePatient(Patient patient) {

    }

    @Override
    public void deletePatient(int id) {

    }

    @Override
    public List<Patient> getPatientsByPractitionerId(int practitionerId) {
        return null;
    }
}
