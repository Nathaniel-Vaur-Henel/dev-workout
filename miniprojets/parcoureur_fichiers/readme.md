# Parcoureur de fichiers

> - Arguments
> - Fichiers
> - Gestion d'erreurs
> - Algorithmie
> - Maintenabilité et évolutivité du code
> - récursivité

## Énoncé

Le but est de faire une parcoureur de fichiers en ligne de commande, un peu l'équivalent de `ls`ou de `dir`.

Chaque point est à faire avant de passer au suivant.
Chaque point enrichi les précédents et donc il ne faut pas casser les fonctionnalités précédentes qui ne sont pas modifiées.

## Étapes

- Le programme prendra en premier argument un chemin absolu ou relatif d'un dossier.
- Le programme gérera les erreurs telles que l'absence d'argument, les chemins inexistants ou les chemins pointant sur un fichier.
- Le programme parcourt tous les dossiers et sous-dossiers du dossier passé en paramètre et affiche uniquement le nom complet des _fichiers_, sans le chemin.

_/!\ Pour que l'exercice ait du sens, ne te sert pas de librairie toutes faites et parcourt les fichiers à la main en utilisant la récursivité._

## Pour aller plus loin

- Rajoute des paramètres _optionnels_ qui peuvent être passé dans _n'importe quel ordre_ et qui permettent :
    - d'afficher uniquement les dossiers, uniquement les fichiers ou les deux. Comportement par défaut : n'affiche que le nom des fichiers.
    - de gérer une éventuelle profondeur maximale. Comportement par défaut : aucune profondeur maximale.
    - d'ajouter un string avant le nom des _dossiers_. Comportement par défaut : aucun préfixe.
    - d'afficher le chemin complet ou seulement le nom. Comportement par défaut : uniquement le nom du fichier/dossier
    - d'afficher ou non les fichiers cachés. Comportement par défaut : les afficher.
    - d'afficher la taille si c'est un fichier.
    - d'afficher sa date.
    - d'afficher la description de toutes tes commandes sur un paramètre spécial qui annule donc tous les autres, y compris le fait de parcourir un dossier. Le chemin devient donc optionnel
- tu peux aller regarder la doc de `ls` ou de `dir` si tu veux d'autres idées.

Le comportement par défaut est le comportement si le paramètre n'est pas spécifié.