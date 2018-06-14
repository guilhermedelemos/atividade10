# Atividade 10

Moodle: http://moodle.utfpr.edu.br/mod/assign/view.php?id=248804

Foram escolhidos os exercício 7 e 8.

## Comentários sobre o exercício 7

O grafo de fluxo de controle (GFC) foi feito manualmente com apoio da ferramenta http://graphonline.ru

Os testes unitários foram construídos manualmente com base no grafo elaborado e validados por ferramenta de cobertura de testes.

## Comentários sobre o exercício 8

A classe OriginalTest possui todos os testes elaborados para matar todos os mutantes. Representa a classe de teset ideal. As demais classes de teste possuem a implementação dos teste exclusivos para matar o mutante específico.

### Mutante 1

Mutante 1 morto colocando o maior valor em posição diferente da última no vetor.

### Mutante 2

Mutante 2 morto colocando o maior valor no índice 1 do vetor.

### Mutante 3

Mutante 3 é quivalente ao Original pois o original inicializa a variável de comparação "maior" com a posição 0 (zero) e percorre o vetor ignorando a posição usada na inicialização enquanto o mutante também inicializa com a posição zero mas percorre todas as posições do vetor. Pelo lógica de comparação adotada, o resultado será sempre o mesmo. A única diferença é que o Mutante é menos eficiente.
