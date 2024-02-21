# Forme

> Héritage & Polymorphisme

Cet exercice te permettra de renforcer ta compréhension de l'héritage et du polymorphisme.
Tu pourras aussi te familiariser avec les concepts de base de la création et de la manipulation de listes d'objets.

## Étapes

- Crée une classe `Forme` avec les propriétés `couleur` et `position`.
    - Ajoute des méthodes pour `afficher et modifier les propriétés`.
- Crée une classe `Rectangle` qui hérite de la classe `Forme`.
    - Ajoute les propriétés spécifiques au rectangle `longueur` et `largeur`.
    - Ajoute des méthodes pour `calculer la surface`, `le périmètre` et pour `afficher les propriétés` du rectangle.
- Crée une classe `Cercle` qui hérite également de la classe `Forme`.
    - Ajoute des propriétés spécifiques au cercle telles que le `rayon`.
    - Ajoute des méthodes pour `calculer la surface`, `le périmètre` et pour `afficher les informations` du cercle.
- Crée une classe `Dessin` qui a un champ de type `List` qui contiendra des `Forme`.
    - Ajoute des méthodes pour `ajouter`, `supprimer` et `afficher` des formes dans le dessin.
    - Utilise le polymorphisme pour ajouter des objets de type `Rectangle` et de type `Cercle` dans le dessin.

## Pour aller plus loin

Si tu veux, tu peux transformer cet exercice en mini-projet en mettant tout ça en pratique dans un mini logiciel de dessin :

- Crée une zone de dessin dans une fenêtre.
- Donne le choix des formes, par exemple dans une liste déroulante.
- Donne le choix de la couleur, par exemple dans une liste déroulante ou un "color picker".
- Au clic dans la zone de dessin, dessine la forme choisie à la couleur choisie.
- Implémente un undo (<kbd>CTRL</kbd> + <kbd>Z</kbd>) et un redo (<kbd>CTRL</kbd> + <kbd>Y</kbd>).
- Permet de choisir la taille de ta forme.
- Rajoute des formes : ovale, carré, losange, etc.
- Permet d'avoir une couleur de contour différente de celle de remplissage.
- Permet de ne pas avoir de couleur de remplissage (ça dessine juste le contour).
- Ajoute le choix de l'épaisseur du contour.
- Ajoute tes propres idées et fais-en nous part !
