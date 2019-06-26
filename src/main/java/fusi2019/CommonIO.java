package fusi2019;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

public class CommonIO {

	public static void readURL() throws MalformedURLException, IOException {
		InputStream in  = new URL ("http://commons.apache.org").openStream();
		try {
			System.out.println(IOUtils.toString);
			
		}finally {
			IOUtils(in);
		}
		public static void main(String[] args) throws IOException{
			try {
				readURL();
			}catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
