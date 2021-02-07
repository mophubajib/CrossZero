import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnterTXT {

    public String getUserInput(){
        String inputLine = null;
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            return inputLine;
        }catch (IOException e ){
            System.out.println("IOException: "+e);
        }
        return inputLine;
    }
}
