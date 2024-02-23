# Trouve le nombre

> - Génération aléatoire
> - Boucles & conditions
> - Gestion d'erreurs
> - Parcours utilisateur
> - Sauvegarde
> - Paramétrage
> - Easter egg 🐰

C'est un exercice que j'aime beaucoup, car c'est le tout premier programme que j'ai créé 😎

## Énoncé

Le but est de faire un jeu qui génère secrètement un nombre et le joueur doit le trouver.

Chaque point est à faire avant de passer au suivant.
Chaque point enrichi les précédents et donc il ne faut pas casser les fonctionnalités précédentes qui ne sont pas modifiées.

## Étapes

- Le programme doit générer secrètement un nombre aléatoire entre 0 et 9.
- Le programme doit demander à l'utilisateur d'entrer un nombre entre 0 et 9.
- Le programme affiche ensuite si le nombre secret est plus petit ou plus grand que le nombre entré par l'utilisateur. Si le nombre entré est égal au nombre secret, le logiciel félicite l'utilisateur, car il a trouvé le bon nombre.
- le programme doit demander au joueur de rentrer un nombre tant qu'il n'a pas trouvé le bon. Il lui affiche alors son nombre d'essais et le programme se termine.
- Le programme doit être robuste : il ne doit pas planter à cause d'une saisie erronée.
- Chaque erreur de saisie doit faire l'objet d'un affichage clair permettant d'identifier l'erreur.
- L'utilisateur doit savoir quoi faire à tout moment : chaque entrée doit être spécifiée (ex. "entrez un nombre entre 0 et 9 :")

## Pour aller plus loin :

- Permets la personnalisation de la difficulté, en gérant un max à 100 pour une partie `facile`, un max à 10.000 pour une difficulté `moyenne`, un max à 100.000 pour une partie `difficile` et sois inventif pour une partie `impossible`.
- Demande le nom du joueur et affiche-le lorsque que le programme lui parle.
- Enregistre les meilleurs scores, dans un fichier par exemple, et affiche-les à la fin de la partie.
- Afficher, et sauvegarder, le temps d'une partie.
- Afficher, et sauvegarder, la difficulté d'une partie.
- Intègre un cheat-code qui te permettra d'afficher le nombre à trouver, mais t'enregistrera comme tricheur à la fin.
- Amuse-toi avec plein d'autres fonctionnalités !