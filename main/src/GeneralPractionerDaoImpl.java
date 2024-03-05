package src;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GeneralPractionerDaoImpl implements GeneralPractitionerDao{
    @Override
    public void addGeneralPractitioner(GeneralPractitioner gp) {
        String sql = "INSERT INTO general_practitioners (name, specialty) VALUES (?, ?)";
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
    public List<GeneralPractitioner> getAllGeneralPractitioners() {
        List<GeneralPractitioner> practitioners = new ArrayList<>();
        String sql = "SELECT * FROM general_practitioners";
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                practitioners.add(new GeneralPractitioner(rs.getInt("id"), rs.getString("name"), rs.getString("specialty")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return practitioners;
    }

    @Override
    public GeneralPractitioner getGeneralPractitionerById(int id) {
        return null;
    }

    @Override
    public void updateGeneralPractitioner(GeneralPractitioner gp) {

    }

    @Override
    public void deleteGeneralPractitioner(int id) {

    }
}
