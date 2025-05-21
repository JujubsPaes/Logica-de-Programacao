![senai_logo](https://transparencia.sp.senai.br/Content/img/logo-senai.png)

# Lista de Exercícios 01: Fluxogramas

Profº.: Cainã Antunes Silva  
Faculdade de Tecnologia **SENAI Sorocaba**  
Tecnólogo em Análise e Desenvolvimento de Sistemas (ADS)
___


> O objetivo desta aula é exercitar o raciocínio lógico para a criação de algoritmos através de fluxogramas.  

O fluxo de um algorítmo poder ser representado graficamente através de fluxogramas. Um conjunto de símbolos, representam cada ação realizada pelo programa, além disso, setas conectam estes símbolos uns com os outros indicando a sequencia em que as ações são executadas.

Para mais informações acesse [Aula 01: Fluxogramas.](https://www.notion.so/cainaantunes/Aula-01-Fluxogramas-188bde521b3b80de90f7dbd9407af71e)

***

1. Crie o fluxograma de um programa que solicita que o usuário digite sua nota e em seguida o programa exibe se o aluno foi “Aprovado” ou “Reprovado”. Leve em consideração que a nota deve estar entre 0 e 100 e que a condição para aprovação é ter uma nota igual ou superior à 50.
   
    ```mermaid
   
    flowchart TD
        start(( Início )) --> input[\ Digite sua Nota \]
        input --> verification{ Nota >= 50? }
        verification --> |Sim| A[/ Aprovado /]
        verification --> |Não| B[/ Reprovado /]
        A --> finish([ Fim ])
        B --> finish
    ```
   
2. Altere o exemplo anterior, acrescentando as seguintes condições: para ser o aprovado, o aluno precisar ter nota igual ou superior à 50 e frequência igual ou superior a 75%.
   
   ```mermaid
   flowchart TD
   inicio(( Início )) --> entrada1[\Digite sua nota\]
   entrada1 --> entrada2[\Digite sua frequencia em %\]
   entrada2 --> teste{ Nota >= 50 \n E \n frequencia >= 75%? }
   teste --> |Não| resposta1[/ Reprovado /]
   teste --> |Sim| resposta2[/ Aprovado /]
   resposta1 --> final([Fim])
   resposta2 --> final
   ```
   
3. Crie um fluxograma para calcular a soma de dois números fornecidos pelo usuário.
   
   ```mermaid
   flowchart TD
   inicio(( Início )) --> entrada1[\Digite o primeiro 1número\]
   entrada1 --> entrada2[\Digite o segundo 2número\]
   entrada2 --> calculo{ Resultado = 1número + 2número }
   calculo --> resultado([Resultado])
   resultado --> final([Fim])
      
   ```
   
4. Elabore um fluxograma que leia um número e exiba se ele é positivo ou negativo.
   
   ```mermaid
   flowchart TD
   inicio(( Início )) --> entrada1[\Digite um número \]
   entrada1 --> calculo{ número >= 1 = + \n E \n número <= 0 = -  }
   calculo --> |+| resposta1[/ Positivo /]
   calculo --> |-| resposta2[/ Negativo /]
   resposta1 --> resultado([Resultado])
   resposta2 --> resultado
   resultado --> final([Fim])
   
   ```
   
5. Desenvolva um fluxograma que leia a idade de uma pessoa e indique se ela pode votar.
   
   ```mermaid
   flowchart TD
   inicio(( Início )) --> entrada1[\Digite sua idade \]
   entrada1 --> calculo{ idade >= 18 \n E \n <=17 }
   calculo --> |+| resposta1[/ Pode votar /]
   calculo --> |-| resposta2[/ Não pode votar /]
   resposta2 --> final([Fim])
   resposta1 --> final
   
   ```
   
6. Crie um fluxograma que leia dois números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
   inicio(( Inicio )) --> entrada1[\ Digite o primeiro número\]
   inicio --> entrada2[\ Digite o segundo número\]
   entrada1 --> calculo1{ n1 < n2 \n e \n n1 > n2}
   entrada2 --> calculo1
   calculo1 --> resultado1[\N2 é o maior\]
   calculo1 --> resultado2[\N1 é o maior\]
   resultado1 --> final([Fim])
   resultado2 --> final
   
   ```
   
7. Crie um fluxograma que leia três números e determine o maior entre eles.
   
   ```mermaid
   flowchart TD
   inicio(( Inicio )) --> entrada1[\ Digite o primeiro número\]
   inicio --> entrada2[\ Digite o segundo número\]
   inicio --> entrada3[\ Digite o terceito número\]
   entrada1 --> calculo1{Resposta 1: \n n1 < n2 > n3\n \n Resposta 2: \n  n2 < n1 > n3 \n \n Resposta 3: \n n1 < n3 > n2 \n \n Resposta 4: \n n1 = n2 = n3}
   entrada2 --> calculo1
   entrada3 --> calculo1
   calculo1 --> resultado1[Resposta 1 \n N2 é o maior!]
   calculo1 --> resultado2[Respota 2 \n N1 é o maior!]
   calculo1 --> resultado3[Resposta 3 \n N3 é o maior!]
   calculo1 --> resultado4[Respota4 \n Os três números tem o mesmo valor!]
   resultado1 --> final([Fim])
   resultado2 --> final
   resultado3 --> final
   resultado4 --> final
   ```
   
8. Construa um fluxograma para calcular o fatorial de um número fornecido pelo usuário.
   
   ```mermaid
   flowchart TD
       A(( Inicio )) --> B[\ Digite um número: \]
   B --> C[r= 1] 
   C --> D[n>1?]
   D --> |Sim| E[r= r*n]
   E --> F[n= n-1]
   F --> D
   D --> |Não| G[/Resposta = r/]
   G --> H([Fim])
   ```
   
9. Elabore um fluxograma para verificar se um número digitado pelo usuário é par.
   
   > Em várias linguagens de programação, o operador % retorna o resto da divisão entre dois números.    
   > 
   >**Exemplos**:  
   > - 9 % 2 = 1  
   > - 11 % 3 = 2
   
   ```mermaid
   flowchart TD
      start((Inicio)) --> A[\ Digite um número: \]
     A --> B[N % 2]
     B --> C{Se o resto da divisão for = 0?}
     C --> |Sim| D[/ O numero é par /]
     C --> |Não| E[/ O numero é impar /]
   D --> final([Fim])
   E --> final
   ```
   
10. Elabore um fluxograma para verificar se um número digitado pelo usuário é primo.
   
   ```mermaid
   flowchart TD
    Start[Início] --> A[Digite um número: ]
    A --> B[Leia número N]
    B --> C{N <= 1?}
    C -- Sim --> D[Não é primo]
    C -- Não --> E[Defina i = 2]
    E --> F{i * i <= N?}
    F -- Não --> G[É primo]
    F -- Sim --> H{N % i == 0?}
    H -- Sim --> I[Não é primo]
    D --> K[Fim]
    G --> K
    I --> K
   ```