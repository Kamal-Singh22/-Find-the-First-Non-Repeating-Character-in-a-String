# -Find-the-First-Non-Repeating-Character-in-a-String
Write a Java program that takes a string input and returns the first non-repeating character. If all characters repeat, return a message indicating that no unique character was found.
Explanation:
We use a LinkedHashMap to maintain the order of characters as they appear in the string.

First, we count how many times each character appears.

Then, we iterate through the map to find the first character with a count of 1.
