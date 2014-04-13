package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.io.IOUtils;

public class Main {

    private static int counter(boolean[] answers) {
        int count = 0;
        for (boolean answer : answers) {
            if (answer) {
                count += 1;
            }
        }

        return count;
    }

    private static String stringify(boolean[] answers) {
        String string = "";

        for (int i = 0; i < answers.length; i++) {
            if (answers[i]) {
                string = string + (i+1);

                if (i < answers.length-1) {
                    string = string + " ";
                }
            }
        }

        return string;
    }

    public static void main(String[] args) throws IOException {
        String studentNr = "012345678";
        if ( args.length>0) {
            studentNr = args[0];
        }

        System.out.println("Opiskelijanumero " + studentNr);
        System.out.println();

        String url = "http://ohtustats.herokuapp.com/students/"+studentNr+"/submissions";

        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);
        client.executeMethod(method);

        InputStream stream =  method.getResponseBodyAsStream();

        String bodyText = IOUtils.toString(stream);

        Gson mapper = new Gson();
        Submission[] subs = mapper.fromJson(bodyText, Submission[].class);

        int number_of_things = 0;
        int number_of_hours  = 0;

        for (Submission submission : subs) {
            number_of_things += counter(submission.getAnswers());
            number_of_hours  += submission.getHours();
            System.out.println("\tViikko " + submission.getWeek() + ": " + "Tehtyjä tehtäviä yhteensä: " +
                               counter(submission.getAnswers()) + ", aikaa kului " + submission.getHours() + " tuntia, " +
                               "tehdyt tehtävät: " + stringify(submission.getAnswers()));
        }

        System.out.println();

        System.out.println("Yhteensä: " + number_of_things + " tehtävää, " + number_of_hours + " tuntia");
    }
}
