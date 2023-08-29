import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class VaccinationSystemHomePage 
	{
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "password";
    
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            
            // Get current vaccination status
            String sql = "SELECT COUNT(*) AS vaccinated_count FROM patients WHERE is_vaccinated = 1";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            int vaccinatedCount = result.getInt("vaccinated_count");
            
            sql = "SELECT COUNT(*) AS total_count FROM patients";
            statement = connection.prepareStatement(sql);
            result = statement.executeQuery();
            int totalCount = result.getInt("total_count");
            
            double vaccinatedPercentage = (double) vaccinatedCount / totalCount * 100;
            
            // Get next scheduled vaccination appointment
            sql = "SELECT * FROM appointments WHERE appointment_time > ?";
            statement = connection.prepareStatement(sql);
            Date now = new Date();
            statement.setTimestamp(1, new java.sql.Timestamp(now.getTime()));
            result = statement.executeQuery();
            
            String nextAppointment = "";
            if (result.next()) {
                String patientName = result.getString("patient_name");
                Date appointmentTime = new Date(result.getTimestamp("appointment_time").getTime());
                SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy 'at' h:mm a");
                nextAppointment = "Your next vaccination appointment is on " + formatter.format(appointmentTime) + " with " + patientName + ".";
            } else {
                nextAppointment = "You don't have any upcoming vaccination appointments.";
            }
            
            // Display home page
            System.out.println("Welcome to the Vaccination System!");
            System.out.println("-------------------------------");
            System.out.printf("Current vaccination status: %.2f%% of patients have been vaccinated.\n", vaccinatedPercentage);
            System.out.println(nextAppointment);
            
            connection.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}