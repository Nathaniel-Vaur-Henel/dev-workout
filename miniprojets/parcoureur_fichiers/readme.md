/**
* <h2> Partie I</h2>
* <ul>
*     <li>Le programme prendra en PREMIER argument un chemin absolu ou relatif d'un dossier. AVEC GESTION DES ERREURS.</li>
*     <li>le programme parcoure tout les dossiers et sous-dossiers et affiche uniquement le nom complet des fichiers, sans le chemin.</li>
*     <li>Il faut  partir de {@link java.nio.file.Path}</li>
*     <li>Il ne faut pas utiliser de lib externes mais le FAIRE À LA MAIN EN UTILISANT LA RÉCURSIVITÉ</li>
* </ul>
* </p>
* <h2> Partie II - à faire quand la <i>partie I</i> est terminée</h2>
* Rajouter des paramètres OPTIONNELS qui peuvent être écrit dans n'importe quel ordre  :
* <ul>
*    <li>afficher les dossiers seulement ou afficher les fichiers seulement ou afficher tout le monde (par défaut, n'affiché que le nom nom des fichiers)</li>
*    <li>gérer une éventuelle profondeur maximale (par défaut aucune)</li>
*    <li>ajouter un string avant le nom des DOSSIERS (par défaut rien)</li>
*    <li>afficher le chemin complet ou le uniquement nom (par défaut uniquement le nom)</li>
*    <li>afficher ou non les fichiers cachés (par défaut, les afficher)</li>
* </ul>
* Le comportement par défaut est le comportement si le paramètre n'est pas spécifié.
* </p>
*/