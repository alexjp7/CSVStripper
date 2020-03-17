# Mini Project - CSV Stripper
- We have been advised that exporting data to CSV may become a security risk if the client then imports (or opens) the file with Microsoft Excel. 
- As a result, no field exported should start with any of the following characters (@+-=) ...
    however, a number field may start with (+-), so this has to be catered for.

1. Create a Java class that provides a function that will take a String (that represents a single field), & produces a "clean" version of that String.
2. Create a main class that uses the function to convert multiple lines of CSV from a file.


# Assumptions
- Once the CSVStripper reaches a valid string beginning (number or string), the remainder of the expression will NOT contain any more special characters
- The 'start' of a field can contain a variable length special-character prefix.  
