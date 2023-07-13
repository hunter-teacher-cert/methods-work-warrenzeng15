
CODE: This method should search through `data` and return the index of the first time `value` appears in `data`. If `value` is not in `data` return -1.

    public int linearSearch(int targetValue, ArrayList<Integer> data) {        //provide
    //int foundIndex = -1; //deliberate-error (at the "end" of the live demo, or if a student asks, we show that the code we have will not work correctly if value is not in the   arraylist)
    int foundIndex = 0;  //provide
    
    for (int i=0; i < data.size(); i++) {      //must-answer-q: "We need to search through "data" to find what we're looking for. How do we traverse through data?" A: we use for loop
                                                //big idea: the for loop is also a connection/application to a prior concept 
      int currentValue = data.get(i);   
      
      if (currentValue == targetValue) {   // student-prompt: "how do we know if we've found our target?" A: We track "currentValue" and compare to see if it is our targetValue
                                          //                  use a conditional to find it
        foundIndex = i;                 //student-prompt: "what do we do now that we've found our target?"
        break;                      //big reveal?/deliberate error? - depends on how much time allocated to excercise/lesson. can show how the question prompt isnt answered without using this break statement
        }
      }
      
    return foundIndex;  //provide
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
