import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class QuestionnaireOrder {

 public static void main(String[] args) throws IOException {
  try {
   int number, generated_num;
   int i;

   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

   System.out.print("Enter number of questionnaire: ");

   number = Integer.parseInt(br.readLine());

   List < Integer > questions = new ArrayList < > (number);

   questions.add((int)((Math.random() * 100) % number + 1));
   for (i = 2; i <= number; i++) {
    generated_num = (int)((Math.random() * 100) % number + 1);

    while (questions.contains(generated_num)) {
     generated_num = (int)((Math.random() * 100) % number + 1);
    }
    questions.add(generated_num);
   }

   System.out.println("The order of numbers picked is: ");
   System.out.print("Question : ");
   for (i = 0; i < number; i++) {
    System.out.print(questions.get(i) + " ");
   }
  } catch (NumberFormatException ex) {
   System.out.println("Invalid entry. Run program again.");
  }
 }
}
