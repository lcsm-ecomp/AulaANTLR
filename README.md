# Projeto ANTLR - Avaliação de Expressões Aritméticas

Este projeto demonstra como usar a ferramenta **ANTLR** para analisar e avaliar expressões aritméticas simples utilizando Java, sem visitantes.

## Arquivos

- `Expr.g4` — Gramática ANTLR
- `Main.java` — Programa principal
- `Evaluator.java` — Avaliador manual sem Visitor

## Requisitos

- Java 8 ou superior
- ANTLR 4.x (`antlr-4.X-complete.jar`)

Baixar: https://www.antlr.org/download.html

## Instruções

### Gerar os arquivos ANTLR

```bash
antlr4 Expr.g4
```

### Compilar os arquivos Java

**Linux/macOS**

```bash
javac -cp .:antlr-4.X-complete.jar *.java
```

**Windows**

```cmd
javac -cp .;antlr-4.X-complete.jar *.java
```

### Executar o programa

**Linux/macOS**

```bash
java -cp .:antlr-4.X-complete.jar Main
```

**Windows**

```cmd
java -cp .;antlr-4.X-complete.jar Main
```

## Alternativa: usando CLASSPATH

**Linux/macOS**

```bash
export CLASSPATH=".:antlr-4.X-complete.jar"
javac Main.java
java Main
```

**Windows**

```cmd
set CLASSPATH=.;antlr-4.X-complete.jar
javac Main.java
java Main
```

## Resultado esperado

```
(expr 1 + (expr 2 * 3))
```

## Licença

Livre para fins educacionais.
