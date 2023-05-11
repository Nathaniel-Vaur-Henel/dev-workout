# Huile de perlimpinpin

Ce miniprojet humoristique permet de travailler la compréhension de l'héritage et du polymorphisme.  
Il permettra aussi de travailler sur la qualité des tests fonctionnels.  
Il permettra aussi de travailler la maintenabilité et l'évolutivité du code au travers des différentes parties.

## Mise en situation

BM, une entreprise révolutionnaire, développe un moteur à huile de perlimpinpin et en équipe plusieurs poids lourd.  
L'entreprise conçoit un programme de simulation du comportement des véhicules.

### Exercices

Il faut créer le code afin de satisfaire au besoin.  
Il faut créer des tests qui permettront de valider chaque point du développement.  
**Tous** les tests devront être pérennes, c'est-à-dire qu'ils devront continuer de passer au fur et à mesure de
l'avancée du développement des besoins.
Il faut créer des tests qui permettront de simuler le besoin dans une classe à part.

_/!\ les différentes parties correspondent à l'évolution du projet. Elles doivent être menées dans l'ordre_

## Première partie : le commencement

### Description

- Tout véhicule possède une `immatriculation`.
- Chaque type de véhicule a un `poids à vide`, en tonne.
- Chaque type de véhicule peut transporter un certain poids, la `charge maximale`, en tonne.
- Chaque véhicule transporte donc une `charge`, en tonne.
- Les différents types de véhicules dotés du fameux moteur sont les suivants :
    - Le _bus_ :
        - a un `poids à vide de 5 tonnes`
        - peut atteindre une `vitesse maximale de 150 km/h`,
        - ne possède pas de chargement, le poids des passagers est considéré comme négligeable.
    - Le _camion citerne_ :
        - a un `poids à vide de 3 tonnes`,
        - une `charge maximale de 10 tonnes`,
        - sa `vitesse maximale` dépend de sa charge :
            - 130 km/h si la charge est nulle
            - 110 km/h si la charge est inférieure ou égale à 1 tonne
            - 90 km/h si la charge est supérieure à 1 tonne et inférieure ou égale à 4 tonnes
            - 80 km/h pour une charge supérieure à 4 tonnes.
    - Le _camion bâché_ :
        - a un `poids à vide de 4 tonnes`,
        - une `charge maximum de 20 tonnes`,
        - sa `vitesse maximale` dépend également de sa charge :
            - 130 km/h si la charge est nulle
            - 110 km/h si la charge est inférieure ou égale à 3 tonnes
            - 90 km/h si la charge est supérieure à 3 tonnes et inférieure ou égale à 7 tonnes
            - 80 km/h au delà.
- Il faudra pouvoir gérer des `Convois` qui comporte plusieurs véhicules de type différents.
    - la `vitesse maximale` d'un convoi est la plus petite vitesse maximale des véhicules du convoi.
    - une fois `démarré`, la composition du convoi n'est plus modifiable.

### Besoin

- pouvoir afficher toutes les informations en une seule fois d'un véhicule dont on aura renseigné les caractéristiques.
- pouvoir connaitre la vitesse maximale actuelle de n'importe quel véhicule dont on aura renseigné les caractéristiques.
- Pour un `convoi`, il faut pouvoir afficher sa composition complète
    - de façon `simplifiée` : ne contenant que le nombre et le type de véhicule effectivement dans le convoi.
    - de façon `complète` : toutes les informations de tous les véhicules.
    - de façon `sélective` : toutes les informations d'un seul type de véhicule.

## Deuxième partie : la consommation

Les ingénieurs de l'entreprise fournissent une formule permettant de calculer la consommation de carburant d'un véhicule
en fonction de sa vitesse et de son poids total (poids à vide + charge éventuelle).
Cette formule est la même pour tous les types de véhicules : consommation = vitesse/10 + poids en tonne

### Besoin

- pouvoir connaitre la consommation d'un véhicule.
- pouvoir connaitre la consommation d'un convoi.

## Troisième partie : nouveau moteur

Satisfait de leurs tests, les ingénieurs ont développé un moteur adapté au véhicule léger.

Il faut donc prendre en compte un nouveau type de véhicule, la _voiture_ :

- son poids être différent selon le modèle, mais doit être compris entre 500 kg et 3 tonnes.
- elle peut atteindre les 200 km/h, mais sa vitesse maximale diminue d'1 km/h pour 10 kg embarqué au-delà des 50
  premiers
- sa charge maximale est égale à la moitié de son poids.

### Besoin

Identique aux besoins précédents.


