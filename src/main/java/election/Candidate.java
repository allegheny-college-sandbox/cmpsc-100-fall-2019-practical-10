package election;

/** Creates a Candidate object.
 *
 * @author Douglas Luman
 */
public class Candidate {
  
  private int votes = 0;
  public final String name;
  
  /** Constructor.
   *
   * @param name Candidate's name
   */
  public Candidate(String name) {
    this.name = name;
  }
  
  /** Retrieves running vote total for candidate object.
   *
   */
  public int getVotes() {
    return this.votes;
  }
}