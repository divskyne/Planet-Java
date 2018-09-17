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
