[![Waffle.io - Columns and their card count](https://badge.waffle.io/mhoangvslev/JavaAutomata.svg?columns=all)](https://waffle.io/mhoangvslev/JavaAutomata)

# JavaAutomata 
A Java application capable of parsing, compile and interprete from .descr file.
![App](JavaAutomata.png)

# Features:
- Parsing from .descr file into automata
- Export to .descr, .dot and .png
- Transforming from Non-Deterministic to Deterministic
- Read, interpretate and analyse the automata using graph evaluation

# How it works
![Func](https://upload.wikimedia.org/wikipedia/commons/d/d6/Parser_Flow%D5%B8.gif)

## .descr file:
```
line C (comment) ::= C
line M (meta) ::= M µ : the metacharacter representing lambda (default : #)
line V (in) ::= V "c[c]*" : input words (mandatory)
line O (out) ::= O "c[c]*" : output words (mandatory)
line E (nb) ::= E i : number of states (E = 0..N-1) (mandatory)
line I (init) ::= I i[ i]* : initial states (default : 0)
line F (final) ::= F [i[ i]*] : final states (mandatory)
line T (trans) ::= i 'x' i 'x' : ExVxExO transition
```
# How to use?
Simply launch ```sh launch.sh```
The UI is quite intuitive, to use.

# Development / Evaluation
- You can open the project from and IDE (you may have to create an empty project first)
- For further assistance, please refer to the [document](https://mhoangvslev.github.io/JavaAutomata/index.html)
