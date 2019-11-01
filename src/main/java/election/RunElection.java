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
   * @param args The command line arguments.
   */
  public static void main(String[] args){
    String name;
    Candidate candidate;
    Ballot ballot = new Ballot();
    Scanner input = readFile("inputs/candidates.list");
    while (input.hasNext()) {
      name = input.nextLine();
      candidate = new Candidate(name);
      ballot.addCandidate(candidate);
    }
    System.out.print(ballot);
  }
  
  /** Creates a blueprint for file Scanner objects.
   *
   * @param filename Relative file path.
   */
  public static Scanner readFile(String filepath) {
    File file = null;
    Scanner input = null;
    try {
      file = new File(filepath);
      input = new Scanner(file);
    } catch (FileNotFoundException noFile) {
      System.exit(0);
    }
    return input;
  }
}