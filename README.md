# DESAFIO: Plataforma de ensino
---
## Você foi contratada(o) para criar um sistema de plataforma de ensino. Para isto você deve criar um programa para ler os dados das aulas de um curso, e em seguida mostrar a duração total do curso, que é a soma das durações de cada aula.
## Cada aula pode ser um conteúdo em vídeo, ou então uma tarefa. Os dados de cada aula são: 
### Vídeo: título, url e duração em segundos
### Tarefa: título, descrição e quantidade de questões
## A duração (em segundos) de uma aula vídeo é a própria duração do vídeo, e a duração de uma aula tarefa é de cinco minutos por questão (exemplo: se a tarefa possui 3 questões, então a duração da tarefa é 15 minutos).
## Você deve representar os dados conforme modelo ao lado. O método duration() na classe Lesson é um método abstrato que retorna a duração da aula. Você deve criar uma única lista do tipo List<Lesson> para armazenar todas aulas. A chamada do método duration() deve ser polimórfica.
