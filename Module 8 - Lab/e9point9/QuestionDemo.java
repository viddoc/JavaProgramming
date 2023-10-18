//Tommy Hudson QuestionDemo program

package e9point9;

import java.util.Scanner;

/**
   This program shows a simple quiz with two questions.
*/
public class QuestionDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      MultiChoiceQuestion q = new MultiChoiceQuestion();
      q.setText("What are the primary colors?");
      q.setChoices("A red,B blue,C yellow,D green");      
      q.setAnswers("A B C");
      q.displayAny();
      String responses = in.nextLine();
      q.checkAnswers(responses);

      MultiChoiceQuestion r = new MultiChoiceQuestion();
      r.setText("What are some popular computer programming languages?");
      r.setChoices("A C++,B C--,C Python,D Java");
      r.setAnswers("A C D");
      r.displayAny();
      responses = in.nextLine();
      r.checkAnswers(responses);
      in.close();
   }
}

