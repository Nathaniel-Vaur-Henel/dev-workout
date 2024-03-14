# Regex

> Ce que tu vas travailler :
> - Regex

Cet exercice te permettra de renforcer ta compréhension des regex ou expressions régulières. C'est un outil très puissant pour manipuler des chaînes de caractères. 

## Conseils

- Avance étape par étape.
- Test chaque étape avant de passer à la suivante.
- Si tu as cloné le repo, tu peux cocher les étapes que tu as terminées en modifiant le fichier `readme.md` de l'exercice. Cela t'aidera à t'y retrouver.
- 

## Étapes

### Exercices simples

Il faut simplement écrire la regex qui permet de trouver les éléments demandés dans le texte donné en exemple.

- [ ] Trouvez tous les mots commençant par "cat" dans une liste de mots.
  > Exemple : "cat", "caterpillar", "category", etc.
- [ ] Trouvez tous les nombres dans une chaîne de texte.
  > Exemple : "Il y a 10 pommes et 20 oranges." 
- [ ] Trouvez tous les emails dans une liste de chaînes de texte.
  > Exemple : "john.doe@example.com, alice@example.org, nathaniel.vaur.henel@dev-sensei.fr", etc.
- [ ] Trouvez tous les mots contenant exactement cinq lettres dans une phrase.
  > Exemple : "La pluie est tombée fort aujourd'hui."
- [ ] Trouvez toutes les adresses IP dans un fichier de logs.
  > Exemple : "192.168.1.1, 10.0.0.1, pas.une.ip.valide, la suivante non plus 256.256.256.256 car les nombres d'une IP vont jusqu'à 255 maximum".
- [ ] Trouvez tous les mots qui commencent par une lettre majuscule dans un texte.
  > Exemple : "Bonjour à Tous. Comment ça va ?"
- [ ] Trouvez tous les mots contenant au moins deux voyelles dans une phrase.
  > Exemple : "Le chat dort sur le tapis moelleux."
- [ ] Trouvez tous les mots qui ne contiennent que des lettres minuscules dans un texte.
  > Exemple : "Il est temps de sortir."
- [ ] Trouvez tous les mots qui sont des acronymes (tous les caractères sont en majuscules) dans une phrase.
  > Exemple : "L'UNESCO est une organisation internationale."

### Exercices plus complexes

- [ ] Trouvez tous les mots qui contiennent une séquence de trois consonnes consécutives dans une phrase.
  > Exemple : "Les enfants jouent dans le jardin."
- [ ] Trouvez tous les mots qui contiennent au moins une lettre majuscule et au moins une lettre minuscule dans une phrase.
  > Exemple : "La maison est Grande."
- [ ] Trouvez toutes les occurrences du mot "chat", en ignorant la casse.
  > Exemple : "Le chat noir est sur le toit. Le Chat est tranquille."
- [ ] Trouvez tous les mots qui contiennent exactement deux voyelles dans une phrase.
  > Exemple : "Les oiseaux chantent dans le jardin."
- [ ] Trouvez tous les mots qui ont cinq lettres ou plus.
  > Exemple : "La maison est lumineuse."

### Exercices avancés

- [ ] Trouvez toutes les occurrences de parenthèses imbriquées dans une chaîne de texte.
  > Exemple : "(Ceci est (un exemple) de parenthèses) imbriquées."
- [ ] Trouvez toutes les dates valides d'un texte au format dd/mm/yyyy.
  > Exemple : "La réunion aura lieu le 14/03/2024. Le compte rendu sera disponible le 15/03/2024."
- [ ] Trouvez toutes les URL valides d'un texte.
  > Exemple : "Voici un lien vers un site web : https://www.google.com/. Vous pouvez également consulter cet autre site : https://www.wikipedia.org/." 

## Pour aller plus loin

Tu peux utiliser les autres méthodes qui utilisent les regex dans ton langage de programmation préféré :
- `split` qui sépare une chaîne de caractères en fonction d'un motif.
- `replace` qui remplace un motif par un autre.

_⚠ Ces noms de méthodes sont données à titre indicatif, ils peuvent changer selon le langage de programmation que tu utilises. Vérifie dans la documentation de ton langage avant de te lancer._ 