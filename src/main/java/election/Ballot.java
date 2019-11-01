package election;

import java.util.ArrayList;

/** Creates a ballot object to hold all valid Candidates.
 *
 * @author Douglas Luman
 */
public class Ballot {
  private ArrayList<Candidate> form;

  /** Constructor.
   *
   */
  public Ballot() {
    form = new ArrayList<Candidate>();
  }
  
  /** Adds a candidate to the ballot, if not already there.
   *
   * @param candidate Candidate object to add
   */
  public void addCandidate(Candidate candidate) {
    // Get index of candidate by name
    int index = searchCandidates(candidate.name);
    // If the index returns not found (-1), add candidate
    if (index == -1) {
      this.form.add(candidate);
    }
  }
  
  /** Retrieves candidate objects by name.
   *
   * @param name Candidate name
   */
  public Candidate getCandidate(String name) {
    int index = searchCandidates(name);
    if (index != -1) {
      return this.form.get(index);
    }
    return null;
  }
  
  /** Searches a ballot form by candidate name and retrieves position.
   *
   * @param name Candidate name
   */
  private int searchCandidates(String name) {
    int index = 0;
    Candidate candidate;
    while (index < this.form.size()) {
      candidate = this.form.get(index);
      if (candidate.name.equals(name)) {
        return index;
      }
      index++;
    }
    return -1;
  }
  
  /** Prints a complete ballot to the screen.
   *
   */
  public String toString() {
    int index = 0;
    String ballot = "Current ballot for pond representative:" + "\n\n";
    Candidate candidate;
    while (index < this.form.size()) {
      candidate = this.form.get(index);
      ballot += String.format("%-20s%5d",candidate.name,candidate.getVotes());
      index++;
      if (index != this.form.size()) {
        ballot += "\n";
      }
    }
    return ballot;
  }
}