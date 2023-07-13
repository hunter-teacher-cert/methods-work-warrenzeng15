
CODE: This method should search through `data` and return the index of the first time `value` appears in `data`. If `value` is not in `data` return -1.

  public int linearSearch(int value, ArrayList<Integer> data) {

    int foundIndex = -1;

    for (int i=0; i < data.size(); i++) {

      int e = data.get(i);

      if (e == value) {
        foundIndex = i;
        break;
        }
      }
    return foundIndex;
  }



Dynamic Duo work! ~20 min
1. Come up with TNPG (Team Name Portending Greatness). Share you TNPG in slack.
2. Read CODE for understanding. Check in with your group if there is any confusion. (Note this is A solution the the problem, not THE solution).
3. Annotate CODE with the provided TEACHER PROMPTS as comments.
4. DELIEVERABLE: `03_annotate.md`: Each member should have a copy of their team’s work.
  TEACHER PROMPTS:
    ```
    PROVIDE :: code snippets or comments you definitely want to provide
    STUDENT-PROMPT :: a specifically-worded question you want to ask, or a general solicitation for input, etc
    MUST-ANSWER-Q :: a question that must be resolved, that a majority of your class must understand before moving on
    BIG IDEA :: an introduction of a new topic, a connection to prior lesson or discussion for application here in code, etc.
    BEEG REVEAL :: this is gonna blow yer minds...
    DELIBERATE-ERROR :: specific code snippet or a general approach that is a bad fit for the situation, is flat-out wrong, or will lead to a compile- or run-time error, etc
