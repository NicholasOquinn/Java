public class Question_2 {/*
    Question: Is there anything wrong with this exception handler as written? Will this code compile?

            try {

    } catch (Exception e) {

    } catch (ArithmeticException a) {

    }
*/

    // ANSWER: This code will not compile because the first exception handler, which catches all types of exceptions,
    //         including the second handler listed in the code, ArithmeticException, therefore not allowing the second
    //         handler to ever be executed.

}
