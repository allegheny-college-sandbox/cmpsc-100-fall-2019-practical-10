# CMPSC 100-03 Practical Session 10

* Assigned: Friday, 1 November, 2019
* Due: Monday, 3 November, 2019
* Point value: 20 points

We revisit our gator friend to see that he's preparing for a nationally-televised test. This practical will deepen your experience with:
* `while` loops
* `if` statements
* `ArrayList` objects
* `methods`
* `classes`
* Problem-solving

## General guidelines for this particular practical session

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our lab TLs, or your neighbor.

## Cloning your repository

- [ ] Open a terminal window. Keep this window open during all of today's assignment.
- [ ] Add your SSH key to your terminal session so that you can prove your identity to GitHub.
- [ ] In your terminal window, type `eval "$(ssh-agent -s)"` and press `Enter` to start the SSH Agent `process`
- [ ] Next, add your key. Type `ssh-add ~/.ssh/id_rsa`
* You may need to provide your password.

## Slack

Before beginning the practical session, log into our shared [Slack](https://cmpsc100Fall2019.slack.com) workspace and navigate to the `#practicals` channel. Remain in this channel for the duration of the session to accept the assignment and ask and answer questions.

## GitHub

An individualized version of this assignment is available on our GitHub Classroom platform. The link for accepting your individual repository is in the `#practicals` channel of our [Slack](#slack).

## G. Wiz runs for office

It's election season, and everyone's getting in the spirit. While you may know the Gator Kingdom as a _kingdom_, they modernized the way they run their government many, many years ago. It now functions as a _representative reptocracy_, in which citizens directly elect their leaders. G. Wiz, now flush with his game show cash and full of ideals, hopes, and dreams, is ready to take his place as part of the political class.

However, the election system hasn't quite modernized so fully. In fact, up until this year, many of the Gator Kingdom's precincts still held _paper elections_! This year, intent on making bold claims and keeping his campaign promises, arranged for a digital voting system...which you have to finish.

Your goal is to finish the ballot creation side of the program, incorporating `Candidate` and `Ballot` objects into your `RunElection` code.

## Required deliverables

### `Ballot.java`

- [ ] Exists
- [ ] Builds
- [ ] Contains no `TODO` placeholders
- [ ] Contains no `{Your Name Here}` placeholders
- [ ] Only adds candidates to the ballot _one_ time
* Looks like G. Wiz is up to something _fishy_...
- [ ] Finishes the `searchCandidate` method to look up candidates by name in the `ArrayList`
- [ ] Uses at least 2 single-line comments (one in `searchCandidate` and one in `addCandidate`) to describe functionality

### `Candidate.java`

- [ ] Exists
- [ ] Builds
- [ ] Contains no `TODO` placeholders
- [ ] Contains no `{Your Name Here}` placeholders
- [ ] Implements the constructor method such that it accepts and sets a candidate's name
- [ ] Implements the `getVotes` method to return the current amount of votes for a given candidate

### `RunElection.java`

- [ ] Exists
- [ ] Builds
- [ ] Contains no `TODO` placeholders
- [ ] Contains no `{Your Name Here}` placeholders
- [ ] Reads an external candidate file (`inputs/candidate.list`) using a `Scanner`
- [ ] Implements a `while` loop to iterate on the `Scanner` object`
- [ ] Uses a `Candidate` object to register each of the candidates
- [ ] Adds each `Candidate` to the `Ballot` object using the `addCandidate` method of `Ballot`
- [ ] Prints the completed `Ballot` object to the screen
- [ ] Uses at least 4 single-line comments to organize sections of the code

An example of the output looks like this:

```
Current ballot for pond representative:

G. Wiz                  0
Ulysses                 0
Chompers                0
Wally Gator             0
Rango                   0
Leon Powalski           0
Croc. O. Dile           0
Ray Croc                0
Randall Boggs           0
Slippy Toad             0
Frogger                 0
```

## GatorGrader

### Docker `container`

If you do not already have the GatorGrader `container`, in a new terminal or Docker Quickstart Terminal, type `docker pull gatoreducator/dockagator` to download the correct `container`.

In the last lab session, we were able to get Docker `container` versions of GatorGrader working! That means that everyone can choose to use the `container` if they'd like. Here are a couple of ways to do it:

#### Running GatorGrader directly on `container` start

* Be sure that you are in the main directory of your practicals repository when running these commands, or you'll certainly experience issues!
* Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
* To make sure you're in the right repository, run a `pwd` command.
    * If you recieve the expected path, you're in the right place. Else, find your way to the right location.

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator /bin/bash
```

- [ ] To `grade` your team's work, type `gradle grade` at the `command` prompt and press the `Enter` key.

### Using `gradle` commands directly

- [ ] To grade your team's work, type `gradle grade`

## `commit` your work

When you've finished your work: remember that there are three (3) steps to submitting a `git` repository: to "pack," to "label," and to "ship."

* Note: attempt all of these from the main directory of the repository.

- [ ] To "pack" the submission: `git add .`
- [ ] To "label" the submission: `git commit -m "{ADD MESSAGE DESCRIPTING PURPOSE OF COMMIT HERE}"`
- [ ] To "ship" the submission: `git push`
