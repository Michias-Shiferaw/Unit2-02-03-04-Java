//Scan all primitive data types
import java.util.ArrayList;

/**
 * Created by: Michias Shiferaw
 * Created on: Sept 2016
 * Stack of items class.
*/

public class MrCoxallStackpp<S> {
  
  private static final ArrayList<Integer> stackey = new ArrayList<Integer>();
   
  /**
  * Created by: Michias Shiferaw
  * Created on: Sept 2016
  * Stack of items class.
  */  
  public int peek() {
    if (stackey.size() == 0) {
      return -1;
    } else {
      return stackey.get(stackey.size() - 1);
    }
  }

  public void clear() {
    stackey.clear();
  }
  
  /**
  * Created by: Michias Shiferaw
  * Created on: Sept 2016
  * Stack of items class.
  */  
  public int pop() {
    //removes top value from stack
    int delete = stackey.remove(stackey.size() - 1);
    return delete;
  }

  // Adds integers onto stack
  public void push(int numbero) {
    stackey.add(numbero);
  }

  /**
  * Created by: Michias Shiferaw
  * Created on: Sept 2016
  * Stack of items class.
  *
  */
  public String toString() {
    String output = "";

    for (Integer element : stackey) {
      output += element + "\n";
    }

    return output.toString();
  }

}
