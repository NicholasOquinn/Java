public class SomeClass {
    int firstNumber;
    int secondNumber;

    public SomeClass() {

    }

    public SomeClass(int firstNumber, int secondNumber) throws Exception {
        //the message to show when you have getMessage() invoked
        throw new Exception("Some exception occurred");

    }
}
