# IntelliJ IDEA plugin for minimal subset of Cobol
This is my solution for the **Multi-language static analysis plugin** internship test task. This plugin can parse minimal subset of Cobol for specific program.

# Overview
The structure of the problem follows the [IntelliJ custom language tutorial ](https://plugins.jetbrains.com/docs/intellij/custom-language-support-tutorial.html). It is build on minimized version of [Cobol grammar](https://www.cs.vu.nl/~x/grammars/vs-cobol-ii/index.html). No additional libraries/frameworks was used. All `.cbl` files are being parsed.

## Demo
**- Valid program**


<img width="531" height="308" alt="image" src="https://github.com/user-attachments/assets/1f7b3712-0101-4e4c-9550-69022a342e50" />



**- Invalid program (absence of Identification division)**


<img width="550" height="384" alt="image" src="https://github.com/user-attachments/assets/04dac392-5d1c-4979-8b0b-1226f03ee93b" />



# Getting started
- Open project in IntelliJ IDEA
    - `Open IntelliJ IDEA`
    - `File -> New -> Project from Version Control`
    - `Clone repository using https://github.com/masqquerade/cobol-basic-parser.git`

- Generate a parser with PSI classes via **Generate Parser Code** from the context menu on the **Cobol.bnf** file in `kotlin/com/example/cobol/language`.

- Generate a lexer class via **Run JFlex Generator** from the context menu on **Cobol.flex** file in `kotlin/com/example/cobol/language`.

- Run the plugin by using the Gradle `runIde` task.
