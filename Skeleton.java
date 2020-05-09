import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Skeleton {
    static List<String> questions = new ArrayList<String>() {
        {
            add("what are the advantages of rust over c++?");
            add("what is the distance between Omaha and Portland?");
            add("negative index in python");
            add("When is Thanksgiving Day 2020?");
            add("what is yml?");
            add("10 gallons in liters");
        }
    };

    public static String GetAnswerFromQA(String query) throws IOException {
        // Call Quick Answers API and return the answer
        return "";
    }
    public static String GetAnswerFromMS(String query) throws IOException {
        // Call Microsoft Project Answer Search API and return the answer
        return "";
    }

    public static void CallQA() throws IOException {
        System.out.println("Part 1. Getting results from Quick Answers API");
        System.out.println("----------------------------------");
        for (String question : questions) {
            String response = GetAnswerFromQA(question);

            System.out.println(">>>>>>> Question: " + question);
            System.out.println(response);
            System.out.println("----------------------------------");
        }
    }

    public static void CallMS() throws IOException {
        System.out.println("Part 2. Getting results from Microsoft Project Answer Search API");
        System.out.println("----------------------------------");
        for (String question : questions) {
            String response = GetAnswerFromMS(question);

            System.out.println(">>>>>>> Question: " + question);
            System.out.println(response);
            System.out.println("----------------------------------");
        }
    }

    public static void main(String[] args) {
        try {
            CallQA();
            CallMS();
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
