package src;

import java.util.List;

public interface GeneralPractitionerDao {

    void addGeneralPractitioner(GeneralPractitioner gp);
    List<GeneralPractitioner> getAllGeneralPractitioners();
    GeneralPractitioner getGeneralPractitionerById(int id);
    void updateGeneralPractitioner(GeneralPractitioner gp);
    void deleteGeneralPractitioner(int id);

}
