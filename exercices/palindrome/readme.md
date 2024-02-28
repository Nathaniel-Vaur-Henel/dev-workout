# Palindrome

> Ce que tu vas travailler :
> - Entrée et sortie standards
> - String
> - Boucles

Qu'est-ce qu'un [palindrome](https://fr.wikipedia.org/wiki/Palindrome) ? C'est un mot ou une phrase qui se lit de la même manière dans les deux sens. Par exemple, "radar" est un palindrome.

Cet exercice te permettra de renforcer ta compréhension des entrées et sorties standards, des chaînes de caractères et des boucles. 

> Et oui, cet exercice ressemble à l'exercice [inversion de string](../inversion-string). C'est fait exprès, c'est pour te faire travailler sur les chaînes de caractères et les boucles sous un autre angle.

## Conseils

- Lis tout l'énoncé avant de commencer afin de bien comprendre ce que tu vas devoir faire.
- Avance étape par étape.
- Test chaque étape avant de passer à la suivante.
- Si tu as cloné le repo, tu peux cocher les étapes que tu as terminées en modifiant le fichier `readme.md` de l'exercice. Cela t'aidera à t'y retrouver.

## Étapes

- [ ] Fais un programme qui lit un String en paramètre et affiche si c'est un palindrome. Par exemple : en entrée "radar" affiche "'radar' est un palindrome" ou "chocabug" en entrée affiche "'chocabug' n'est pas un palindrome".
  - ⚠ _Pour savoir si une phrase est un palindrome, il faut enlever les espaces et la ponctuation._
  - Dans tes valeurs d'entrée, évite pour l'instant de mettre des majuscules, des accents ou des caractères spéciaux.
- [ ] Ajoute une gestion des erreurs : Si aucun argument n'est entré, afficher à l'utilisateur le message "Aucun argument détecté, veuillez entrer une chaine de caractère"
- [ ] Si plusieurs arguments sont entrés, concatène-les ensemble en les séparant avec un espace et gère comme si l'utilisateur n'avait rentré qu'une seule chaine de caractère.
  - [ ] N'oublie pas de remettre un espace entre chaque mot pour l'affichage.
  - [ ] On vérifie si la phrase entière est un palindrome, pas chaque mot séparément.

## Pour aller plus loin

- [ ] Tu peux améliorer ton programme pour qu'il gère les accents et les majuscules/minuscules. Par exemple, "Ésope reste ici et se repose" est un palindrome.
- [ ] Tu peux optimiser ton programme afin qu'il ne parcoure que la moitié de la chaîne de caractères pour savoir si c'est un palindrome ou non. 

