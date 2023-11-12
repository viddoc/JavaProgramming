//Tommy Hudson AnyCorrectChoiceQuestion program

package e9point8;
/**
 * Class that allows a question to be created that will set up multiple correct answers seperated by space and then take any number of responses by the user seperated by comma.
 */
public class AnyCorrectChoiceQuestion extends Question
{
    //Instance variable.
    private String answers;
    //Empty constructor.
    public AnyCorrectChoiceQuestion()
    {
        answers = "";
    }
    /**
     * Set the correct answers
     * @param answers the correct answers
     */
    public void setAnswers(String answers)
    {
        this.answers = answers;
    }
    /**
     * Check the responses given vs the correct answers.
     * @param responses entered by the user
     */
    public void checkAnswers(String responses)
    {
        //String array to hold the responses delimited by commas.
        String[] responsesArr = responses.split(",");
        //Boolean array to hold the true or false result of the response vs the answers.
        boolean[] results = new boolean[responsesArr.length];
        //For loop to test the response vs the correct answer and populate the boolean array.
        for (int i = 0; i < responsesArr.length; i++)
        {
            if(answers.contains(responsesArr[i].trim().toLowerCase()))
            {
                results[i] = true;
            }
            else
            {
                results[i] = false;
            }
        }
        //For loop to print the results.
        for (int i = 0; i < results.length; i++)
        {
            System.out.println(results[i]);
        }
    }
    /**
     * Method to display the prompt explaining the correct way to answer, the question text, and the prompt for the answer.
     */
    public void displayAny()
    {
        System.out.println("Please enter as many correct answers that you can think of each seperated by a , (comma).");
        super.display();
        System.out.print("Your answer: ");
    }


}
