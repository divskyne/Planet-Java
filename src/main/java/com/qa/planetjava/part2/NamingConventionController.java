package com.qa.planetjava.part2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.stream.Stream;

/**
 * @author divine 2018-09-16
 */
public class NamingConventionController {
	
	LinkedList<String> symbols = new LinkedList<String>();
	LinkedList<String> elements = new LinkedList<String>();
	
	public LinkedList<String> getSymbols() {
		return symbols;
	}

	public LinkedList<String> getElements() {
		return elements;
	}
	
	public NamingConventionController()
	{
		String filename = "elements";
		try
		{
			elements = getElementList(filename);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		symbols = assignSymbols();
	}
	
	public LinkedList<String> getElementList(String file) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		LinkedList<String> list = new LinkedList<String>();
		String currentLine = br.readLine();
		while(currentLine != null)
		{
			list.add(currentLine);
			currentLine = br.readLine();
		}
		return list;
	}
	
	int counter = 0;
	public String genSymbol(String name)
	{
		
		int i, j = 0;
		String symbol;
		name = name.toLowerCase();
		for(i = 0; i < name.length(); i++)
		{
			for(j = i+1; j < name.length(); j++)
			{
				// ASCII 97-65 = 32 a -> A
				symbol = "" + (char)(name.charAt(i)-32) + "" + name.charAt(j);
				if(!symbols.contains(symbol))
				{
					return "" + (char)(name.charAt(i)-32) + name.charAt(j);
				}
			}
		}
		counter++;
		// if symbol exists
		return name.charAt(0)+""+counter;
	}

	public LinkedList<String> assignSymbols()
	{
		String symbol;
		for(int i = 0; i < elements.size(); i++)
		{
			symbol = genSymbol(elements.get(i));
			
			//System.out.println(elements.get(i));
			//String element = elements.remove(i);
			//elements.addLast(element);
		
			symbols.add(symbol);
		}
		return symbols;
	}
}
