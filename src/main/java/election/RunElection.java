package election;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Manages all election objects.
 *
 * @author Douglas Luman
 */
public class RunElection {

  /** Entry point.
   *
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    // Read file in
    File file = null;
    Scanner input = null;
    try {
      file = new File("inputs/candidates.list");
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    // Initialize variables
    String name;
    Candidate candidate;
    Ballot ballot = new Ballot();
    // Run ballot processing
    while (input.hasNext()) {
      name = input.nextLine();
      candidate = new Candidate(name);
      ballot.addCandidate(candidate);
    }
    // Print ballot
    System.out.print(ballot);
  }
}