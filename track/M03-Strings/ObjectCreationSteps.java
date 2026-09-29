// steps involed in object creation and excution (in case of java class)

// step 1: Create the address of the Vairable (Reference Variable)
// step 2: Execute the static block (Only once at the first time)
// step 3: Allocate memory for the object
// step 4: Execute the non-static block (Only once for each object)
// step 5: Execute the constructor
// step 6: Assign the address to the Reference Variable
public class ObjectCreationSteps {

    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("Non-Static Block");
    }

    ObjectCreationSteps() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        ObjectCreationSteps obj = new ObjectCreationSteps();
        System.out.println("Address of obj: " + obj);

        ObjectCreationSteps obj2 = new ObjectCreationSteps();
        System.out.println("Address of obj2: " + obj2);
    }

}
