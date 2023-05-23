# Taller_Arboles

Problema 1.

La clase CBTInserter tiene los siguientes métodos:

CBTInserter(TreeNode root): Este es el constructor de la clase y recibe como parámetro el nodo raíz del árbol binario completo. El constructor inicializa la estructura de datos y realiza un recorrido por niveles del árbol para identificar los nodos incompletos (aquellos que no tienen ambos hijos) y los almacena en una cola.

int insert(int val): Este método recibe como parámetro el valor del nodo que se desea insertar en el árbol. El método inserta el nuevo nodo en el lugar correspondiente manteniendo la propiedad de árbol binario completo. Para hacer esto, se toma el primer nodo incompleto de la cola y se agrega el nuevo nodo como su hijo izquierdo si aún no tiene uno, o como su hijo derecho si ya tiene un hijo izquierdo. Después de insertar el nuevo nodo, se agrega a la cola.

TreeNode get_root(): Este método devuelve el nodo raíz del árbol binario completo.

La idea principal detrás de la solución es mantener una cola de nodos incompletos para asegurarse de que la inserción de nuevos nodos se realice de manera que el árbol permanezca completo. Al tomar el primer nodo incompleto de la cola para insertar un nuevo nodo, nos aseguramos de que el nuevo nodo se agregue en la posición más a la izquierda posible en el último nivel del árbol.

Problema 2.

El método getTargetCopy recibe tres parámetros:

original: el nodo raíz del árbol binario original.
cloned: el nodo raíz del árbol binario clonado.
target: el nodo objetivo que se desea encontrar en el árbol original.
El objetivo es encontrar el nodo en el árbol original que es igual al nodo target y devolver su correspondiente nodo clonado del árbol clonado.

El enfoque utilizado para resolver este problema es una búsqueda recursiva en profundidad (DFS) en ambos árboles. La recursión se realiza de la siguiente manera:

Si el nodo original es nulo, significa que hemos alcanzado el final del árbol original y no se ha encontrado el nodo target. En este caso, se devuelve null.
Si el nodo original es igual al nodo target, hemos encontrado el nodo objetivo en el árbol original. En este caso, se devuelve el nodo cloned, ya que es la copia correspondiente del nodo target en el árbol clonado.
Si no se cumple ninguna de las dos condiciones anteriores, se realiza una búsqueda recursiva en los subárboles izquierdo y derecho. Primero, se realiza una búsqueda en el subárbol izquierdo llamando a la función getTargetCopy con los nodos original.left y cloned.left. Si se encuentra el nodo objetivo en el subárbol izquierdo, se devuelve el nodo clonado correspondiente. Si no se encuentra en el subárbol izquierdo, se realiza una búsqueda en el subárbol derecho llamando a la función getTargetCopy con los nodos original.right y cloned.right. Se devuelve el nodo clonado correspondiente si se encuentra en el subárbol derecho. Si no se encuentra en ninguno de los subárboles, se devuelve null.

Problema 3

![Árbol de decisiones (1)](https://github.com/Neider123/Taller_Arboles/assets/102388129/ff8f7a42-231e-4ebe-9619-1b0f7dbfcdaa)
