# Project-1-DynamicSuggestion
Dynamic Suggestion - Passing(input) a List of String and Retrieving the output in 2 Dimensional list of String that are matching the word which is given to be found in the input List
This is a Java Program

Writing an algorithm that will output a product suggestions after each character is typed by the customer in search field.

If there are more suggestions then return the product in the alphabetical order, Ruturn only the product suggestions after the customer has entered two charaters. The wordshould be compared ina case-insensitive manner

# Input:
The input of the method/function consists of three arguments:
numProducts: an integer representing the number of various products in product repository
repository: a list of unique strings representing the various products in the product repository
query: a string representing the full search query of the customer

# Output:
Return a list of a list of Strings, where each list represents the product suggestions made by the system as the user types each character of the query. Assume the user type characters in order without deleting or removing any character.

# Example:
Input:
numProducts = 5
repository = ['mobile', 'mouse', 'moneypot', 'monitor', 'monitor', 'mousepad']
query = 'mouse

Output:
mobile  moneypot  monitor
mouse   mousepad
mouse   mousepad
mouse   mousepad
