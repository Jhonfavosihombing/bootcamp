package fusi2019;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
public class readUrl {

	
		// TODO Auto-generated method stub
		 public static void main(String[] args) throws MalformedURLException, IOException {
		        URL url = new URL("https://www.facebook.com/");
		        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
		 
		        String inputLine;
		        while ((inputLine = br.readLine()) != null) {            
		            System.out.println(inputLine);
		        }
		        br.close();
	}

}
