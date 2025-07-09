public class Queue extends DynamicArray implements Comparable<Queue>, Xifo<String>, Fifo<String> {

    /**
     * This method returns the difference of the size of the two arrays. If the current array is bigger than the other,
     * the returned value is positive.
     */
    public int compareTo(Queue other) {
        // uses occupancy to compare, as other spaces are empty.
        return this.getOccupancy() - other.getOccupancy();
    } // method compareTo

    /**
     * this returns the first element of the underlying array, following FIFO
     */

    public String peek() {
        // initialize the return string with a default value of null
        String first = null;
        // determines if the queue is empty.
        if (this.getOccupancy() > 0) {
            // if not, then it takes the first element of the list and assigns it to the return string.
            first =  this.getUnderlying()[0];
        }
        // first will only be the default value if the queue isn't empty.
        return first;
    } // method peek

    /**
     * This method takes the "first in" and removes it from the list, and returns it's value
     */

    public String pop() {
        // initialize the return string with a default value of null
        String popped = null;
        // determines if the queue is empty
        if (this.getOccupancy() > 0) {
            // if the queue isn't empty
            // assigns the value at the front of the list to the return string
            popped = this.getUnderlying()[0];
            // removes the value AFTER it is assigned to the return string
            this.remove(0);
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

} // class Queue