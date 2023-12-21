# Problem 92, Read Roman numerals

**Difficulty:** hard

Roman numerals are easy to recognize, but not everyone knows all the rules necessary to work with them. Write a function to parse a Roman-numeral string and return the number it represents. You can assume that the input will be well-formed, in upper-case, and follow the subtractive principle. You don't need to handle any numbers greater than MMMCMXCIX (3999), the largest number representable with ordinary letters.

```clj
(= 14 (__ "XIV"))
```

```clj
(= 827 (__ "DCCCXXVII"))
```

```clj
(= 3999 (__ "MMMCMXCIX"))
```

```clj
(= 48 (__ "XLVIII"))
```
