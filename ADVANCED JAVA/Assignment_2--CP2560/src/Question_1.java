public class Question_1 {

    /* Question: What exception types can be caught by the following handler?

            catch (Exception e) {

    }

    What is wrong with using this type of exception handler? */

    // ANSWER: The handler shown above catches exceptions of type Exception, covering all type of exceptions.
    //         It can be poor practice using this type of exception handler because it will leave out important
    //         information about the type of exception throw, losing efficiency. This causes the program to determine
    //         the type of exception that has been thrown before it can determine a way to fix it.

}
