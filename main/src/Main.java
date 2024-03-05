package src;

public class Main {
    public static void main(String[] args) {

        GeneralPractitionerDao gpDao = new GeneralPractionerDaoImpl();
        PatientDao patientDao = new PatientDaoImpl();

        // Add a general practitioner
            /*GeneralPractitioner gp = new GeneralPractitioner("Dr. Smith", "Family Medicine");
            gpDao.addGeneralPractitioner(gp);*/

        // Add a Patient
        Patient p1 = new Patient("Ray", 80,1);
        Patient p2 = new Patient("Say", 85,2);
        Patient p3 = new Patient("May", 90,3);
        patientDao.addPatient(p1);

        // List all general practitioners
       /* System.out.println("General Practitioners:");
        gpDao.getAllGeneralPractitioners().forEach(System.out::println);*/

        //List all Patients
        System.out.println(" All Patients:");
        patientDao.getAllPatients().forEach(System.out::println);

        // Add, list, update, and delete operations for patients can be demonstrated similarly  }
    }
}
