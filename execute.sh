#!/bin/bash
if [[ Expr.g4 -nt ExprParser.java ]]; then
   echo "Executando antlr"
   java -jar antlr.jar Expr.g4
fi

echo "Compilando fontes"
javac -cp antlr.jar:. *.java

echo "Executando programa com $1"
java -cp antlr.jar:. Main "$1"
