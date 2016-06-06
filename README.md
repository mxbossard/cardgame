# cardgame

## Notes
Pour le moment je me dis qu'avec un modèle simple on doit pouvoir manipuler tous les jeux de cartes.
Si c'est le cas, il suffirait d'une API REST dessus et on pourrai utiliser cette unique API pour réaliser plein de jeux de cartes différent.

Actuellement je pense que tous les jeux de cartes peuvent ^etre représenté par une pile de carte.
Une main est une pile de Carte, un graveyard, une pioche sont des piles de cartes. Un plateau de jeu est un ensemble de piles de cartes.
On peut peut ^etre se contenter de modéliser des echanges de Cartes entre piles.
Du coup il ne serait pas utile de modéliser une main.
Néanmoins, une main est conceptuellement différente d'une pile de carte. Je ne sais pas encore si nous aurons besoin de ce concept, ou bien si nous pouvons nous en passer.
Enfin, j'imagine que les cartes pourront avoir des comportements