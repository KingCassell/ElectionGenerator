public class Green {
    private int count;
    private boolean Winner;
    String name = "Hawkins";

    public Green() {
        count = 0;
        Winner = false;
    }

    public Green(String candidate) {
        count = 0;
        Winner = false;
        name = candidate;
    }

    public void addVote() {
        ++count;
    }

    public void addVote(int numVotes) {
        count += numVotes;
    }

    public int getCount() {
        return count;
    }

    public boolean isWinner() {
        return Winner;
    }

    public String getName() {
        return name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setWinner(boolean winner) {
        Winner = winner;
    }

    public void setName(String name) {
        this.name = name;
    }
}
