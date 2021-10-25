package com.jid.thrillio.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class IOUtil {
	public static void read(String[] data, String filename) {
		try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
			String line;
			int count = 0;
			while((line = br.readLine()) != null) {
				data[count] = line;
				count++;
			}
		}
		
	}

}
