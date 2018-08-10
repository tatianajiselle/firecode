/*Write a simple interpreter which understands "+", "-", and "*" operations. Apply the operations in order using command/arg pairs starting with the initial value of `value`. If you encounter an unknown command, return -1.


interpret(1, ["+"], [1]) → 2
interpret(4, ["-"], [2]) → 2
interpret(1, ["+", "*"], [1, 3]) → 6 */

public int interpret(int value, String[] commands, int[] args) {
    int index = 0;
    
    for(String c : commands){
      if("+"==c){
        value += args[index];
        index++;
      }
      
      else if("-"==c){
        value -= args[index];
        index++;
      }
      
      else if("*"==c){
        value *= args[index];
        index++;
      }
      else
        return -1; //error
    }
    return value;
  }