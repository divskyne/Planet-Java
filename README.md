The inhabitants of the planet Java are building their own periodic table of the elements; this table will be just like our Periodic Table.

These chemical symbols must follow certain rules:

    1. All chemical symbols must be exactly two letters, so O is not a valid symbol for Oxygen.
    2. Both letters in the symbol must appear in the element name, but the first letter of the element name does not necessarily need to appear in the symbol. So Hg is not valid for Mercury, but Cy is.
    3. The two letters must appear in order in the element name. So Vr is valid for Silver, but Rv is not. To be clear, both Ma and Am are valid for Magnesium, because there is both an a that appears after an m, and an m that appears after an a.
    4. If the two letters in the symbol are the same, it must appear twice in the element name. So Nn is valid for Xenon, but Xx and Oo are not.
Your task is to determine whether a proposed chemical symbol fits these rules.

Details

Write a function that, given two strings, one an element name and one a proposed symbol for that element, determines whether the symbol follows the rules. 

The symbol will have exactly two letters. Both element name and symbol will contain only the letters a-z. Both the element name and the symbol will have their first letter capitalized, with the rest lowercase. 

Example Input and Output
Sveggjerium, Ee -> true
Zockurijirium, Zr -> true
Jeffkanium, Kn -> true
Jefftzlon, Zt -> false
Jeffntzum, Nn -> false
Tuffjeffium, Ty -> false


Bonus

Given an element name, find the valid symbol for that name that's first in alphabetical order. E.g. Gozerium -> Ei, Slimyrine -> Ie.


Part 2

The Planet Java has decided to keep their current naming conventions, as listed above, but to add a preference system. So while there are still 6 valid symbols for the element Iron, the preferred symbol is Ir. The second-most preferred symbol is Io then In, Ro, Rn and finally On.

A symbol is preferred based on how early in the element name its first letter is, followed by how early its second letter is.

In the case of repeated letters like in Neon, Eo is preferred to En, even though an n is closer to the beginning of Neon than the o is. This is because it's the second n that's used in the symbol En, since the second letter in the symbol must appear after the first.

Choose the most preferred valid symbol for that element that's not already taken by another element. For instance, if Chlorine were the first element added, then it would get the symbol Ch, If Chromium was added later, it would get the symbol Cr.  If Cesium and Cerium were then added, they would get the symbols Ce and Ci.  If there are no valid symbols for the new element you need to decide how to handle this disruption.

Details and Example
Details and examples
The list of all 366 elements known are set to be assigned a symbol, one by one, in order, following the preference rules above.  There are many ways to achieve this.

Determine the symbol assigned to each element in the list. For instance, you should find that Protactinium is assigned Pt, Californium is assigned Cf, and Lionium is assigned Iu.
Find the first element that will not be able to have a symbol assigned, because when you get to it all the valid symbols for it are taken. The program should not terminate here.
