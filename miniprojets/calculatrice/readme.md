# Calculatrice

C'est un exercice simple, qui ne demande pas de connaissance métier trop compliqué, surtout si l'on se borne aux quatre opérations de bases.
Mais, comme dans tous mes exercices, ce n'est qu'un prétexte pour pousser des concepts en se concentrant sur le code à produire plutôt que sur les fonctionnalités.

## Énoncé
Le but est de faire une calculatrice en ligne de commande, de plus en plus complexe.  
Chaque point est à faire avant de passer au suivant. 
Chaque point enrichi les précédents et donc il ne faut pas casser les fonctionnalités précédentes qui ne sont pas modifiées.  
Je te recommande bien évidemment d'écrire les tests au fur et à mesure du développement, si possible avant même de faire le développement selon le principe du [TDD](https://fr.wikipedia.org/wiki/Test_driven_development). 
Un niveau de difficulté est donné de façon relative à l'exercice de _\* à \*\*\*\*\*_.

### Tâches à faire dans l'ordre : 
- \* : Créer une application en ligne de commande.
- \* : L'application demande d'entrer deux nombres entiers (positif ou négatif) avec {@link Scanner}et affiche le résultat de leur addition. (concepts : entrée et sortie standards)
- \* : Gérer le fait que l'utilisateur a entré une valeur qui n'est pas un nombre et lui afficher un message explicite en français et quitter le programme. (concepts : gestion d'erreurs)
- \*\* : Ne plus sortir en cas d'erreur, mais redemander d'entrer une valeur. Sortir si l'utilisateur entre les valeurs "exit" ou "quit", quelle que soit la casse. (concepts : boucles et conditions)
- \*\* : Ne plus sortir à la fin de l'opération, mais redemander à l'utilisateur de rentrer une nouvelle opération. Toujours sortir avec "exit" ou "quit". (concepts : boucles et conditions)
- \*\* : Implémenter la division, la soustraction, la multiplication et demander à l'utilisateur quelle opération il veut effectuer. Ne pas oublier de gérer les cas d'erreur ! Tips : On utilisera une enum pour gérer les types d'opérations. (concepts : enum)
- \*\* : Ne plus demander séquentiellement à l'utilisateur d'entrer son opération, mais en une seule fois. Lui afficher son opération avec  '= résultat'. Ex. : l'utilisateur rentre "1+1" et il faut afficher "1 + 1 = 2".
    (concepts : parsing, regex) 
- \*\*\* : Gérer des nombres décimaux à {@link java.math.BigDecimal}. (concepts : {@link java.math.BigDecimal})
- \*\*\*\* : Gérer les opérations multiples, sans les priorités de signe. Ex. : l'utilisateur rentre "1+1+2+3\*8" et le programme affiche " 1 + 1 + 2 + 3 \* 8 = 56" et non 28. (concepts : parsing, regex complexe)
- \*\*\*\*\* : Gérer les priorités dans les opérations. (concepts : )
- \*\*\*\*\* : Ajouter la gestion des parenthèses. (concepts : parsing et algorithmie complexe)
- \*\*\*\*\* : Ajouter des opérateurs complexes : puissance, cos, sin, tan, ln, log, etc. (concepts : parsing et algorithmie complexe)

