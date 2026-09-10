
public class StringBuilderDemo {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // capacity() => It returns the capacity of the StringBuilder. Initially the capacity was 16 later it will get doubled when the number of elements crosses the capacity
        // capacity = capacity*2+2;
        System.out.println("Capacity : " + sb.capacity());

        // length() => It returns the length of the StringBuilder.
        System.out.println("Length : " + sb.length());

        // ensureCapacity() => It ensures the capacity of the StringBuilder.
        // If the required capacity is greater than the current capacity, it will increase the capacity
        // else it will not change the capacity
        sb.ensureCapacity(30);
        System.out.println("Capacity : " + sb.capacity());

        System.out.println(sb);

        // append() => Appends the specified value to this sequence
        sb.append(" Technologies");
        System.out.println(sb);

        // delete() => Deletes the characters in the specified range
        sb.delete(0, 4);
        System.out.println(sb);

        // insert() => Inserts the specified value at the specified position
        sb.insert(0, "Java ");
        System.out.println(sb);

        // replace() => Replaces the characters in the specified range with the specified value
        sb.replace(0, 4, "Hello ");
        System.out.println(sb);

        // reverse() => Reverses the sequence of characters
        sb.reverse();
        System.out.println(sb);

        // toString() => Converts the StringBuilder to a String
        System.out.println(sb.toString());
    }

}
