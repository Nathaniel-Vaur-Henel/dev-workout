# Calculatrice

> - Entrée et sortie standards
> - Gestion d'erreurs
> - Boucles et conditions
> - Énumération
> - Parsing et regex

C'est un exercice simple, qui ne demande pas de connaissance métier trop compliqué, surtout si tu te bornes aux quatre opérations de bases.
Mais, comme dans tous mes exercices, ce n'est qu'un prétexte pour pousser des concepts en se concentrant sur le code à produire plutôt que sur les fonctionnalités.

## Énoncé

Le but est de faire une calculatrice en ligne de commande.

Chaque point est à faire avant de passer au suivant.
Chaque point enrichi les précédents et donc il ne faut pas casser les fonctionnalités précédentes qui ne sont pas modifiées.

## Étapes

- Crée une application en ligne de commande.
- L'application demande d'entrer deux nombres entiers (positif ou négatif) et affiche le résultat de leur addition.
- Gère le fait que l'utilisateur a entré une valeur qui n'est pas un nombre et affiche-lui un message explicite en français avant de quitter le programme.
- L'application ne doit plus sortir en cas d'erreur, mais doit redemander d'entrer une valeur. L'application ne se termine que si l'utilisateur entre les valeurs "exit" ou "quit", quelle que soit la casse.
- L'application ne doit plus sortir à la fin de l'opération, mais redemander à l'utilisateur de rentrer une nouvelle opération. Elle doit toujours sortir avec "exit" ou "quit".
- Implémente la division, la soustraction, la multiplication et demande à l'utilisateur quelle opération il veut effectuer. N'oublie pas de gérer les cas d'erreurs ! Tu pourras utiliser une enumération pour gérer les types d'opérations.
- Ne demande plus séquentiellement à l'utilisateur d'entrer son opération, mais en une seule fois. L'application lui affichera son opération avec  '= résultat'. Ex. : l'utilisateur rentre "1+1" et il faut afficher "1 + 1 = 2".

## Pour aller plus loin

- Gère les opérations avec plusieurs opérateurs, sans les priorités de signe. Ex. : l'utilisateur rentre "1+1+2 + 3\*8" et le programme affiche " 1 + 1 + 2 + 3 \* 8 = 56" et non 28.
- Gère les priorités dans les opérations.
- Ajoute la gestion des parenthèses.
- Ajoute des opérateurs complexes : puissance, cos, sin, tan, ln, log, etc.

