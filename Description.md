
# ProtoCCF

# Description du jeu
Le jeu se joue dans un navigateur web.

## Le but du jeu
Le joueur (**Pj**) doit protéger la tour (**Tower**) des attaques ennemies (**Waves**).

## Les règles du jeu
Le Pj dispose de n points d'action (**apts**). Il gagne un point par tour.</br>
Pour protéger la tour, il dispose d'objets offensifs et d'objets défensifs, représentés sour forme de cartes (**Card**).</br>
Chaque carte nécessite n points d'action pour être jouée.</br>
Quand la tour n'a plus de rpts, la partie est terminée.

## Les éléments du jeu
La tour et la vague sont représentées avec les attributs suivants :
- points de résistance (**rpts**)
- points de protection (**ppts**)
- points de dégats (**dpts**).</br>
Chaque carte possède un coût (**cost**) qui correspond aux apts nécessaires pour la jouer.
Les cartes offensives infligent les dpts.</br>
Les cartes défensives génèrent les ppts.</br>
Le joueur doit remplir un sac (**Learned**) avec des objets issus de son stock (**Library**)</br>
Le sac ne peut pas contenir plus de 3 objets identiques.</br>
Le sac ne peut pas contenir plus de 50 objets.

## Début du tour
Le joueur reçoit 7 objets aléatoirement au 1er tour pour constituer son arsenal (**Equipped**), puis une seule carte par tour.</br>
Si le pj a assez de apts, il pose n cartes.</br>
Le pj clique sur le bouton "Démarrer".</br>

## Combat
La résolution se déroule dans l'ordre suivant :</br>
- Si le pj a posé des cartes offensives, on calcule les dégâts effectués par la tour (par l'addition des dpts des cartes) sur la vague.
- Si la vague a encore des rpts, elle effectue des dégâts à la tour
- Si le pj a posé des cartes défensives, on diminue les dpts de la vague en leur retirant les ppts de la carte.</br>

## Fin du tour
Si la tour n'a plus de rpts, la partie est terminée.</br>
Si la vague n'a plus de rpts, on passe à la vague suivante.</br>
Si la vague a encore des rpts, on fait un nouveau tour.</br>
