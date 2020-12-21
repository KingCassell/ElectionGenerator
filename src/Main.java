import java.util.Scanner;

public class Main {

    public void main(String[] args) {
        // temp value for testing
        final int NUM_BALLOTS = 10;
        Ballots[] ballots = new Ballots[NUM_BALLOTS];
        Scanner scan = new Scanner(System.in);
        int numRegistered;
        boolean isRigged = false;
        boolean isGoodResponse = false;
        String riggedAnswer;
        System.out.print("Registered Voters Count: ");
        numRegistered = scan.nextInt();
        while (!isGoodResponse) {
            System.out.print("Is this election Rigged (y/n): ");
            riggedAnswer = scan.nextLine();
            if (riggedAnswer.equals("Y") || riggedAnswer.equals("y")) {
                // TODO: prompt user for percentage of voter overhead to be added.
                isRigged = true;
                isGoodResponse = true;
            } else if (riggedAnswer.equals("N") || riggedAnswer.equals("n")) {
                isGoodResponse = true;
            } else {
                System.out.println("ERROR: Invalid Character");
            }
        }
        Election election = new Election(numRegistered, isRigged);
        // TODO: testing of rigged votes still needs to account for the overhead.
        for (int i = 0; i < NUM_BALLOTS; ++i) {
            election.ballotReader(ballots[i].getCandidate());
        }
    }
}
