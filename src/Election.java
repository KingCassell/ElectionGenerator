import java.util.Random;

public class Election {
    private int registeredVoters;
    private int inflationValue;
    private int riggedForCandidate;
    private boolean rigging;
    // Candidates
    private Democrat democrat;
    private Republican republican;
    private Libertarian libertarian;
    private Green green;

    public Election() {
        registeredVoters = 0;
        inflationValue = 50;
        rigging = false;
    }

    public Election(int numVoters) {
        registeredVoters = numVoters;
        rigging = true;
    }

    public Election(int numVoters, boolean isRigged) {
        registeredVoters = numVoters;
        rigging = isRigged;
    }

    /**
     * Purpose: Intakes the votes for president from the ballot and increments a
     *          vote for the specific candidate based on if the vote is
     *          0 for Democrat,
     *          1 for Republican,
     *          2 Libertarian,
     *          3 Communist.
     * @param voteForCandidate the specific candidate that the vote is intended for.
     */
    private void ballotReader(int voteForCandidate) {
        int riggedVoteCount = calcRiggedVote();
        if (voteForCandidate == 0) {
            if (rigging) {
                democrat.addVote(riggedVoteCount);
            } else {
                democrat.addVote();
            }
        } else  if (voteForCandidate == 1){
            if (rigging) {
                republican.addVote(riggedVoteCount);
            } else {
                republican.addVote();
            }
        } else  if (voteForCandidate == 2){
            if (rigging) {
                libertarian.addVote(riggedVoteCount);
            } else {
                libertarian.addVote();
            }
        } else  if (voteForCandidate == 3){
            if (rigging) {
                green.addVote(riggedVoteCount);
            } else {
                green.addVote();
            }
        } else {
            System.out.println("ERROR: Vote Count value invalid");
        }
    }

    private int calcRiggedVote() {
        Random rand = new Random();
        int randNum = rand.nextInt(100) + 1;
        if (randNum < inflationValue) {
            return 2;
        } else {
            return 1;
        }
    }

    public int getRegisteredVoters() {
        return registeredVoters;
    }

    public int getInflationValue() {
        return inflationValue;
    }

    public int getRiggedForCandidate() {
        return riggedForCandidate;
    }

    public boolean isRigging() {
        return rigging;
    }

    public Democrat getDemocrat() {
        return democrat;
    }

    public Republican getRepublican() {
        return republican;
    }

    public Libertarian getLibertarian() {
        return libertarian;
    }

    public Green getGreen() {
        return green;
    }

    public void setRegisteredVoters(int registeredVoters) {
        this.registeredVoters = registeredVoters;
    }

    public void setInflationValue(int inflationValue) {
        this.inflationValue = inflationValue;
    }

    public void setRiggedForCandidate(int riggedForCandidate) {
        this.riggedForCandidate = riggedForCandidate;
    }

    public void setRigging(boolean rigging) {
        this.rigging = rigging;
    }

    public void setDemocrat(Democrat democrat) {
        this.democrat = democrat;
    }

    public void setRepublican(Republican republican) {
        this.republican = republican;
    }

    public void setLibertarian(Libertarian libertarian) {
        this.libertarian = libertarian;
    }

    public void setGreen(Green green) {
        this.green = green;
    }
}
