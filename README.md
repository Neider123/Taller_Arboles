# Taller_Arboles

# Problema 1.

La clase CBTInserter tiene los siguientes métodos:

CBTInserter(TreeNode root): Este es el constructor de la clase y recibe como parámetro el nodo raíz del árbol binario completo. El constructor inicializa la estructura de datos y realiza un recorrido por niveles del árbol para identificar los nodos incompletos (aquellos que no tienen ambos hijos) y los almacena en una cola.

int insert(int val): Este método recibe como parámetro el valor del nodo que se desea insertar en el árbol. El método inserta el nuevo nodo en el lugar correspondiente manteniendo la propiedad de árbol binario completo. Para hacer esto, se toma el primer nodo incompleto de la cola y se agrega el nuevo nodo como su hijo izquierdo si aún no tiene uno, o como su hijo derecho si ya tiene un hijo izquierdo. Después de insertar el nuevo nodo, se agrega a la cola.

TreeNode get_root(): Este método devuelve el nodo raíz del árbol binario completo.

La idea principal detrás de la solución es mantener una cola de nodos incompletos para asegurarse de que la inserción de nuevos nodos se realice de manera que el árbol permanezca completo. Al tomar el primer nodo incompleto de la cola para insertar un nuevo nodo, nos aseguramos de que el nuevo nodo se agregue en la posición más a la izquierda posible en el último nivel del árbol.

![image](https://github.com/Neider123/Taller_Arboles/assets/102388129/48336151-c246-41ad-bf70-1f3af75f2d30)


# Problema 2.

El método getTargetCopy recibe tres parámetros:

original: el nodo raíz del árbol binario original.
cloned: el nodo raíz del árbol binario clonado.
target: el nodo objetivo que se desea encontrar en el árbol original.
El objetivo es encontrar el nodo en el árbol original que es igual al nodo target y devolver su correspondiente nodo clonado del árbol clonado.

El enfoque utilizado para resolver este problema es una búsqueda recursiva en profundidad (DFS) en ambos árboles. La recursión se realiza de la siguiente manera:

Si el nodo original es nulo, significa que hemos alcanzado el final del árbol original y no se ha encontrado el nodo target. En este caso, se devuelve null.
Si el nodo original es igual al nodo target, hemos encontrado el nodo objetivo en el árbol original. En este caso, se devuelve el nodo cloned, ya que es la copia correspondiente del nodo target en el árbol clonado.
Si no se cumple ninguna de las dos condiciones anteriores, se realiza una búsqueda recursiva en los subárboles izquierdo y derecho. Primero, se realiza una búsqueda en el subárbol izquierdo llamando a la función getTargetCopy con los nodos original.left y cloned.left. Si se encuentra el nodo objetivo en el subárbol izquierdo, se devuelve el nodo clonado correspondiente. Si no se encuentra en el subárbol izquierdo, se realiza una búsqueda en el subárbol derecho llamando a la función getTargetCopy con los nodos original.right y cloned.right. Se devuelve el nodo clonado correspondiente si se encuentra en el subárbol derecho. Si no se encuentra en ninguno de los subárboles, se devuelve null.

![image](https://github.com/Neider123/Taller_Arboles/assets/102388129/0261baa0-64c2-4817-afb1-0897cbcb5b6d)


# Problema 3

La clase TreeNode representa un nodo en el árbol binario. Tiene un valor (val) y referencias a sus nodos hijos izquierdo (left) y derecho (right).

La clase Solution contiene el método isValidBST, que toma la raíz de un árbol binario como entrada y devuelve un valor booleano que indica si el árbol es un BST válido.

El método isValidBST utiliza una técnica de recorrido en orden (inorder traversal) para verificar la propiedad de ordenación del BST. Comienza inicializando una variable prev a null para almacenar el valor del nodo anterior durante el recorrido en orden.

El método privado inorderTraversal realiza el recorrido en orden del árbol. Verifica recursivamente los nodos hijos izquierdo, actualiza prev con el valor actual del nodo y luego verifica si el valor del nodo actual es mayor que prev. Si alguna de estas condiciones no se cumple, el método devuelve false, lo que indica que el árbol no es un BST válido.

Si el recorrido en orden se completa sin encontrar ninguna inconsistencia, el método isValidBST devuelve true, indicando que el árbol es un BST válido.

Esta implementación utiliza la propiedad del BST en la que el recorrido en orden de los nodos produce una secuencia de valores ordenada de manera ascendente. Verificar esta propiedad garantiza que el árbol cumple con la definición de BST.

![image](https://github.com/Neider123/Taller_Arboles/assets/102388129/d782fef1-9889-4183-8860-841ac26120ef)

# Problema 4.

La clase Solution contiene el método inorderTraversal, que toma la raíz de un árbol binario como entrada y devuelve una lista de enteros que representa el recorrido en orden de los nodos.

El método inorderTraversal utiliza un enfoque iterativo y una pila para realizar el recorrido en orden. Se inicializa una lista result para almacenar los valores de los nodos en el recorrido en orden.

Se crea una pila stack y se inicializa con el nodo raíz. Se utiliza una variable current para rastrear el nodo actual durante el recorrido.

Se realiza un bucle mientras current no sea nulo o la pila no esté vacía. En cada iteración, se realiza lo siguiente:

Se realiza un bucle interno mientras current no sea nulo. En este bucle, se empujan los nodos visitados en la pila y se avanza al nodo hijo izquierdo hasta llegar al nodo más izquierdo del subárbol.

Se extrae el nodo superior de la pila, que corresponde al nodo más a la izquierda que aún no ha sido visitado. Se agrega el valor del nodo a la lista result.

Se actualiza current con el nodo hijo derecho del nodo extraído, si existe. Esto permite visitar el subárbol derecho después de visitar el subárbol izquierdo.

Una vez que se completa el recorrido en orden, se devuelve la lista result que contiene los valores de los nodos en el orden correcto.

![image](https://github.com/Neider123/Taller_Arboles/assets/102388129/2e74aafe-49ad-4bc8-88c7-79f93d75249f)

#Problema 5

La clase Solution contiene el método getTargetCopy, que toma tres parámetros: el nodo raíz del árbol original (original), el nodo raíz del árbol clonado (cloned) y el nodo objetivo que se desea encontrar y copiar (target). El método devuelve el nodo copiado que coincide con el nodo objetivo.

El método getTargetCopy utiliza una estrategia de búsqueda recursiva en el árbol binario para encontrar el nodo objetivo y obtener su copia en el árbol clonado.

En cada llamada recursiva, se verifican las siguientes condiciones:

Si el nodo original es nulo o es igual al nodo objetivo, se devuelve el nodo clonado correspondiente. Esto significa que se ha encontrado el nodo objetivo y se devuelve su copia.

Si el nodo original no es nulo ni es igual al nodo objetivo, se realiza una llamada recursiva al método getTargetCopy en los subárboles izquierdo y derecho, pasando los nodos originales y clonados correspondientes. La llamada recursiva se realiza primero en el subárbol izquierdo, y si devuelve un nodo no nulo, se devuelve ese nodo. De lo contrario, se realiza la llamada recursiva en el subárbol derecho y se devuelve el nodo resultante.

La recursión continúa hasta que se encuentra el nodo objetivo o hasta que se recorren todos los nodos del árbol.

![image](https://github.com/Neider123/Taller_Arboles/assets/102388129/c039aee7-cc64-43d9-98fd-1dfc96801dee)





