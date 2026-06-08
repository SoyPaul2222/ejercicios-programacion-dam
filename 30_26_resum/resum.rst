Nom: Rainier Paul Santiago Tacsiat

Què he après?

Quan volem crear un objecte i inicialitzar-ne els valors, en lloc d’utilitzar els setters al main, 
podem definir aquests valors directament dins de la nova instància mitjançant un constructor. 
Això permet que el codi sigui més curt i llegible, 
evitant haver de cridar constantment als setters, cosa que el faria més llarg i menys clar.

A més, quan creem un constructor i especifiquem paràmetres, en crear l’objecte és 
obligatori passar els valors corresponents. Això garanteix 
que l’objecte s’inicialitzi correctament amb la informació que el constructor espera.

També, si volem controlar o modificar un valor abans de guardar-lo, 
i comprovar possibles errors, podem cridar els setters des del constructor. 
D’aquesta manera, assegurem que l’objecte sempre es crea amb valors correctes.

D’altra banda, la paraula clau this és molt útil als setters, 
ja que permet distingir entre 
els paràmetres del mètode i les variables de la classe amb el mateix nom,
que crear un nou nom de la variable, ja que sería llarg.

Per últim vaig aprender a conéixer la funció this(), i s'utilitza dins d'un constructor
per cridar un altre constructor, i això ajuda a reutilitzar codi i no repetir alhora d'assignar valors.