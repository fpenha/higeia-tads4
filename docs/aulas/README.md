# ESTRUTURA DE DADOS LINEARES

## Ementa
Estruturas de dados lineares: pilhas, filas, vetores, listas encadeadas, deques, dicionários e filas de prioridade. Padrões de projeto Comparador e Iterador. Estruturas de dados lineares baseadas em tipos genéricos.

## Objetivo
- Compreender conceitos utilizados no processo de desenvolvimento das estruturas de dados; 
- Utilizar estruturas de dados contidas em frameworks no desenvolvimento de programas; 
- Implementar estruturas de dados utilizando o paradigma de programação orientada a objetos; 
- Utilizar e implementar os padrões de projeto Comparador e Iterador; 
- Utilizar e implementar estruturas de dados baseadas em tipos genéricos.

## Conteúdo Table of Contents
1. [Conceitos de Estruturas de Dados](#conceitos-de-estruturas-de-dados)
2. [Vetores](#vetores)
3. [Listas Encadeadas](#)
4. [Pilhas](#)
5. [Filas](#)
6. [Deques](#)
7. [Dicionários de Dados](#)
8. [Tabela de Hash](#)
9. [Padrões de Projeto](#)
10. [Estruturas de Dados Baseadas em Tipos Genéricos](#)

## Conceitos de Estruturas de Dados
#### O que é Estrutura ?  
#### O que é Dados ?
#### O que é Linear ?

## Vetores

Imagine o seguinte problema: Como programador, você precisa desenvolver um programa que indique os **leitos** vazio e ocupados de cada **ala** do hospital. Exemplo: “a ala de emergência, que tem 10 leitos, 4 estão ocupados. para a ala de uti, que tem 8 leitos, 3 estão ocupados.”

Imagine o seguinte cenário: como programador, você foi designado para criar um sistema que indique a ocupação dos **leitos** em cada **ala** de um hospital. Por exemplo, o sistema deverá informar algo como: "Na ala de emergência, que possui 10 leitos, 4 estão ocupados. Já na UTI, que possui 8 leitos, 3 estão ocupados."

Para resolver este problema, você pode utilizar **vetores**, uma estrutura de dados muito eficiente para armazenar e acessar informações sequenciais.

#### Definição e Conceito de Vetor
Um **vetor** (também chamado de **array**, **arranjo** ou **variável indexada**) é uma estrutura de dados linear que armazena um conjunto de elementos do mesmo tipo em posições consecutivas na memória. Cada posição no vetor é referenciada por um índice, que permite o acesso direto ao valor armazenado naquela posição de forma única.

O índice geralmente começa em `0`, o que significa que o primeiro elemento do vetor está na posição `0`, o segundo na posição `1`, e assim sucessivamente.

#### Principais Características de um Vetor   
- **Tamanho fixo**: O número de elementos que um vetor pode armazenar é determinado no momento de sua criação. Uma vez definido, o tamanho do vetor não pode ser alterado.  
- **Acesso direto**: Como os elementos são armazenados em posições consecutivas na memória, é possível acessar qualquer elemento diretamente usando seu índice, o que torna a operação de acesso muito rápida, com complexidade de tempo O(1).  
- **Homogeneidade**: Todos os elementos de um vetor devem ser do mesmo tipo, como números inteiros, números de ponto flutuante, caracteres ou objetos.  
- **Sequencial**: Os elementos de um vetor são dispostos de maneira linear e sequencial, preservando a ordem de inserção.

#### Vantagens de um Vetor:
- **Rapidez no acesso**: Como os elementos podem ser acessados diretamente pelo índice, um vetor permite buscas e acessos a dados de forma muito eficiente.
- 
#### Desvantagens de um Vetor:
- **Tamanho fixo**: A principal desvantagem de um vetor é que ele tem um tamanho fixo, o que pode ser um problema se o número de elementos a serem armazenados não for conhecido previamente.
- **Dificuldade em inserções e remoções**: Inserir ou remover elementos em qualquer posição, exceto no final, pode ser uma operação lenta, já que todos os elementos subsequentes precisam ser movidos.
