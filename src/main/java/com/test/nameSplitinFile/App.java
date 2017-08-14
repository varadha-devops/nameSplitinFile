package com.test.nameSplitinFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class App {
    public static void main( String[] args ) {
    	ClassLoader classLoader = App.class.getClassLoader();
    	InputStream in = classLoader.getResourceAsStream("data.txt");
    	
    	try{
    		App.splitNameInFile(in);
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
    private static void splitNameInFile(InputStream in) throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(in));
     
    	String line = null;
    	while ((line = br.readLine()) != null) {
    		String name[] = line.split(":");
    		System.out.println(name[0]);
    	}
    	br.close();
    }
}

