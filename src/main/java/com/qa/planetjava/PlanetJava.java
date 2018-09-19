package com.qa.planetjava;
import java.util.stream.Stream;

/**
 * @author divine 2018-09-16
 */

public class PlanetJava {
    public boolean isValid(String element, String symbol)
    {	
        element = element.toLowerCase();
        symbol = symbol.toLowerCase();
        
        return hasValidLength(symbol) && containsBothCharacters(element, symbol) && charactersAreInOrder(element, symbol);
    }

    private boolean hasValidLength(String symbol) {
    	if(symbol.length()==2)
    	{
    		return true;
    	}
    	else return false;
    }

    private boolean containsBothCharacters(String element, String symbol) {
    	// indexOf returns -1 if char not found
        return (element.indexOf(symbol.charAt(0)) != -1) && (element.indexOf(symbol.charAt(1)) != -1);
    }

    private boolean charactersAreInOrder(String element, String symbol) {
    	// second letter of element > first, first letter happens before second, in order
        return element.lastIndexOf(symbol.charAt(1)) > element.indexOf(symbol.charAt(0));
    }

    public String firstValidSymbol(String element) {
        return allElements().filter(symbol -> isValid(element, symbol)).sorted().findFirst().get();
    }

    // All Possible element combinations
    private Stream<String> allElements() {
    	
    	/*StringBuilder s = new StringBuilder();
    	for (char first = 'A'; first <= 'Z'; first++) {
            for (char second = 'a'; second <= 'z'; second++) {
            	s.append(String.valueOf(new char[]{first, second}));
            }
        }*/
    	
        Stream.Builder<String> symbols = Stream.builder();
        for (char first = 'A'; first <= 'Z'; first++) {
            for (char second = 'a'; second <= 'z'; second++) {
                symbols.accept(String.valueOf(new char[]{first, second}));
            }
        }
        return symbols.build();
    }
}
