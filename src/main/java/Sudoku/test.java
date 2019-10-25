import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.net.*;
import com.google.gson.*;
package Sudoku;

public class test {

}
public class Solution {
    /*
     * Complete the function below.
     * Base url: https://jsonmock.hackerrank.com/api/movies/search/?Title=
     */

    static String[] getMovieTitles(String substr) throws MalformedURLException, IOException {
        //Gson
        String[] returnArray = new String[20];
        URL apiEndpoint = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=spiderman");
        BufferedReader in = new BufferedReader(
                new InputStreamReader(apiEndpoint.openStream())
        );
        String response = new String();
        String input = new String();
        while ((input = in.readLine()) != null) {
            response = response.concat(input);
        }
        Gson gson = new Gson();
        Movie[] movies = gson.fromJson(response, Movie[].class);

        return returnArray;
    }
}
