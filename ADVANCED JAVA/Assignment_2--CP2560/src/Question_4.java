public class Question_4 {
    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        }
        catch ( ExceptionA exception1)
        {
            System.err.println("This show the first Exception subclass being caught \n");
        }

        try
        {
            throw new ExceptionB();
        }
        catch ( ExceptionA exception2)
        {
            System.err.println("This shows the second Exception subclass being caught \n");
        }
    }
}
class ExceptionA extends Exception{}
class ExceptionB extends ExceptionA{}
class ExceptionC extends ExceptionB{}