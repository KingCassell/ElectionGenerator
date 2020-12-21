import java.util.Random;

public class Ballots {
    private int candidate = 1;
    private String firstName;
    private String lastName;
    private String address;
    private String birthDate;
    private String socialSecurityNumber;
    private String licenseNumber;

    public Ballots() {
        firstName = "";
        lastName = "";
        address = "";
        birthDate = "";
        socialSecurityNumber = "";
        licenseNumber = "";
    }

    public int getCandidate() {
        return candidate;
    }
}
