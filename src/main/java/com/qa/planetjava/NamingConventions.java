package com.qa.planetjava;

import java.util.LinkedList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author divine 2018-09-16
 */
public class NamingConventions
{
	private static final String FILENAME = "PeriodicTable";
	
	public static void main(String[] args)
	{
		NamingConventionController nCC = new NamingConventionController();
		String filename = "elements";
		LinkedList<String> elements = nCC.getElements();
		LinkedList<String> symbols = nCC.assignSymbols();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME)))
		{
			
			for(int i = 0; i < elements.size(); i++)
			{
				String content = elements.get(i) + " -> " + symbols.get(i);
				bw.write(content+"\n");
			}
			
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
