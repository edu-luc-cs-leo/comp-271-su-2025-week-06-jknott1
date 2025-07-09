public class Stack extends DynamicArray implements Comparable<Stack>, Xifo<String>, Lifo<String> {

    /**
     * Compares stacks by their size.
     * If the current stacks's size is larger than the other,
     * the return value is postive. Else, it will be negative.
     */
    public int compareTo(Stack other) {
        // each size of the stack is taken
        // subtracts the size of the other stack from the current stack
        return this.getOccupancy() - other.getOccupancy();
    } // method compareTo

    /**
     * Allows the client to see the top of the stack. If the stack is empty
     * returns the null default value.
     */
    public String peek() {
        // initializing variable representative of the top of the stack
        // default initialization of null
        String top = null;
        if (this.getOccupancy() > 0) {
            // as long as the stack isn't empty, the last value is assigned to "top"
            top = this.getUnderlying()[this.getOccupancy() - 1];
        return top;
        }
    } // method peek

    /**
     * removes the top of the stack and returns the popped value.
     */
    public String pop() {
        // default return value initialized
        String popped = null;
        // determines is stack is empty
        if (this.getOccupancy() > 0) {
            // assigns the top of the stack to the "popped" value
            // if the stack isn't empty
            popped = this.getUnderlying()[this.getOccupancy() - 1];
            // removes the string from the underlying array AFTER
            // assigning the variable "pop"
            this.remove(this.getOccupancy() - 1);
        }
        return popped;
    } // method pop

    /**
     * changes the string representation of the stack.
     * prints in the same fashion as a regular array.
     */
    public String toString() {
        // value for the first bracket
        String openBracket = "[";
        // initializing the variable to represent the elements in order
        String mid = "";
        // value for closed bracket.
        String closeBracket = "]";
        // initialzing return statement
        String retStr = "";
        // for loop that builds the mid contents
        for (int i = 0; i < this.getOccupancy(); i++) {
            if (i == 0) {
                mid += this.getUnderlying()[i];
            } else {
                mid += ", " + this.getUnderlying()[i];
            }
        }
        retStr = openBracket + mid + closeBracket;
        return retStr;
    } // method toString

    public void push(String e) {
        String[] temp = new String[this.getOccupancy() + 1];
        temp[0] = e;
        for (int i = 1; i < temp.length; i++) {
            temp[i] = this.getUnderlying()[i-1];
        }
        this.setUnderlying(temp);
    } // method push

} // class Stack