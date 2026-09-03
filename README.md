# ♨ Java Study

Exercícios organizados por pacote em `src/main/java`, parte do meu percurso rumo a **Backend Developer**.

## Requisito

JDK 17 ou superior. O projeto foi validado com JDK 25 no Windows.

## Estrutura

```text
src/main/java/
└── com/victor/maratonajava/
    ├── aulas/       → aulas sequenciais (fundamentos iniciais)
    ├── desafios/    → desafios de consolidação
    └── ex/          → exercícios de fixação (um conceito por vez)
```

---

## 🧠 Módulo: Java Fundamentals — ✅ Concluído

```
Variables & Types · Casting · Operators
Conditions (if/else/switch/ternário)
Loops (while/do-while/for/break/continue/nested)
Arrays & Multidimensional Arrays
Methods & Overloading
Strings · Scope
```

---

## 📚 aulas/

| Arquivo                          | Tópico                       |
| -------------------------------- | ---------------------------- |
| `Aula001_Hello.java`             | primeiro programa            |
| `Aula002_TiposPrimitivos.java`   | tipos primitivos             |
| `Aula003_TiposPrimitivosEx.java` | tipos primitivos (exercício) |
| `Aula004_Operadores.java`        | operadores                   |

---

## 🧪 ex/

### Conditions

| Arquivo                     | Conceito                                    |
| --------------------------- | ------------------------------------------- |
| `TesteDeConhecimento.java`  | operador ternário                           |
| `MonthNameFinder.java`      | switch (mapeamento de valores)              |
| `PaymentFeeCalculator.java` | switch (múltiplos rótulos, cálculo de taxa) |

### Loops

| Arquivo                | Conceito                                  |
| ---------------------- | ----------------------------------------- |
| `Count.java`           | while                                     |
| `VerificPassword.java` | while + validação de String (`.equals()`) |
| `Continue.java`        | continue                                  |
| `NestedLoop.java`      | loop aninhado                             |

### Arrays

| Arquivo               | Conceito                                             |
| --------------------- | ---------------------------------------------------- |
| `MaxValue.java`       | busca de maior valor (algoritmo manual)              |
| `Countforeach.java`   | foreach + contagem condicional                       |
| `MatrixAddition.java` | soma de matriz 2D                                    |
| `HighestRow.java`     | maior valor por linha (array 2D + reset de variável) |

### Methods

| Arquivo                       | Conceito                                              |
| ----------------------------- | ----------------------------------------------------- |
| `SimpleMethodWithReturn.java` | parâmetros, return, chamadas independentes            |
| `Overloading.java`            | overloading (mesma assinatura, parâmetros diferentes) |

---

## 🎯 desafios/

### Exercícios de lógica (por tópico)

| Arquivo                      | Combina                                      |
| ---------------------------- | -------------------------------------------- |
| `OrderStatusTracker.java`    | switch aplicado a domínio de negócio         |
| `DesafioMenuBanco.java`      | do-while + switch                            |
| `OrderProcess.java`          | break + continue + ternário                  |
| `InventoryProcessing.java`   | array + condicionais (estoque)               |
| `StoreSales.java`            | array 2D + busca de máximo (vendas por loja) |
| `ProcessOfOrder.java`        | methods chamando methods + array             |
| `DesafioCalculadoraIMC.java` | cálculo de IMC                               |

### Desafios finais do módulo

| #               | Arquivo                       | Conceitos praticados                            |
| --------------- | ----------------------------- | ----------------------------------------------- |
| 1 — Fundamentos | `GridCalculator.java`         | array, method, loop, ternário                   |
| 2 — Aplicação   | `LoanEligibility.java`        | arrays paralelos, operadores lógicos combinados |
| 3 — Integração  | `MultiplePaymentMethods.java` | switch, ternário, methods, arrays paralelos     |

### Extra — Portfólio

`OrderBatchProcessor.java` — 🟨 em andamento

---

## 💡 O que aprendi

- Divisão entre `int` trunca **antes** de qualquer conversão pra `double`
- `==` compara referência, `.equals()` compara conteúdo — sempre `.equals()` para String
- Em loops aninhados, resetar a variável de "melhor valor" no lugar certo evita misturar resultados entre linhas de uma matriz
- `break`/`continue` afetam só o loop mais interno onde estão
- Escopo isola variáveis por método — mesmo nome em métodos diferentes não colide
- Evitar recalcular o que um método já retornou — reaproveitar em vez de chamar duas vezes

---

## Compilar e executar no Windows (PowerShell)

Na raiz do projeto:

```powershell
New-Item -ItemType Directory -Path bin -Force | Out-Null
$fontes = Get-ChildItem -Path src/main/java -Recurse -Filter *.java |
    Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d bin $fontes
java -cp bin com.victor.maratonajava.aulas.Aula001_Hello
```

Para executar um desafio, por exemplo:

```powershell
java -cp bin com.victor.maratonajava.desafios.GridCalculator
```

## Compilar e executar no Linux (bash)

Na raiz do projeto:

```bash
mkdir -p bin
find src/main/java -name "*.java" > /tmp/fontes.txt
javac -encoding UTF-8 -d bin @/tmp/fontes.txt
java -cp bin com.victor.maratonajava.aulas.Aula001_Hello
```

Para executar um desafio, por exemplo:

```bash
java -cp bin com.victor.maratonajava.desafios.GridCalculator
```

O diretório `bin/` contém apenas classes geradas e pode ser recriado a qualquer momento.

---

## 🔜 Próximo módulo

Object-Oriented Programming
