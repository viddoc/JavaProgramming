//Tommy Hudson MultiChoiceQuestion program

package e9point9;
/**
 * Class that allows a multiple choice question to be created that has more than one correct answers seperated 
 * by space and then take any number of responses by the user seperated by a space.
 */
public class MultiChoiceQuestion extends Question
{
    //Instance variable.
    private String answers;
    private String choices;
    //Empty constructor.
    public MultiChoiceQuestion()
    {
        answers = "";
        choices = "";
    }
    /**
     * Set the choices possible to the user.
     * @param choices possible to the user
     */
    public void setChoices(String choices)
    {
        this.choices = choices;
    }
    /**
     * Set the correct answers.
     * @param answers the correct answers
     */
    public void setAnswers(String answers)
    {
        this.answers = answers.trim().toUpperCase();
    }
    /**
     * Check the responses given vs the correct answers.
     * @param responses entered by the user
     */
    public void checkAnswers(String responses)
    {

        responses = responses.trim().toUpperCase();
        if (responses.contains(answers))
        {
            System.out.println("Correct");
        }
        else
        {
            System.out.println("Incorrect");
            System.out.println("Correct Answers: " + answers);
        }
    }
    /**
     * Method to display the prompt explaining the correct way to answer, the question text, and the prompt for the answer.
     */
    public void displayAny()
    {
        String[] choicesArr = choices.split(",");
        System.out.println("Please enter as many correct answer choices as there are seperated by a space.");
        super.display();
        for (String choice:choicesArr)
        {
            System.out.println(choice);
        }
        System.out.print("Your answer: ");
    }


}
