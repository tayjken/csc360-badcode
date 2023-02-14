# csc360-badcode

This project was created as an excercise in our Software Design class
Our goal was to break as many design principles and conventions as outlined in the cautionary fairytale:
Best Practices of Spell Design by Jeremy Kubica

We ended up with functioning, but ill-designed, poorly formatted, and unreadable code:
- design collapse: employee pay type is controlled by and integer flag and handled by an if-else ladder in payroll rather than being a designed in a good and extensible way
- we eliminated most of the use of subspells (functions in our code)
- we elmininated ALL non-mandatory spacing in our code:
  - linebreaks
  - spacing around operators
  - indentations
- all of the names of classes, attributes, methods, and parameters were changed to non-sensical characters, only vaugely abbreviations
- in if statements, we formatted them as "thing == #" so it would be easy to accidentally assign a value
- we eliminated all comments from our code (but used them in the test cases)
- there is no documentation of the code
- we neglected version control and only uploaded the final product to git

Despite all of this, our code passes the test cases, but would result in a big headache if you wanted to read or extend it
