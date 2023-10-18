//Tommy Hudson QuestionDemo program

package e9point8;

import java.util.Scanner;

/**
   This program shows a simple quiz with two questions.
*/
public class QuestionDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      AnyCorrectChoiceQuestion q = new AnyCorrectChoiceQuestion();
      q.setText("What are the primary colors?");
      q.setAnswers("red yellow blue");      

      q.displayAny();
      String responses = in.nextLine();
      q.checkAnswers(responses);

      AnyCorrectChoiceQuestion r = new AnyCorrectChoiceQuestion();
      r.setText("What are some popular computer programming languages?");
      r.setAnswers("C++ Java Python C# Rust GoLang JavaScript HTML");
      r.displayAny();
      responses = in.nextLine();
      r.checkAnswers(responses);
      in.close();
   }
}

