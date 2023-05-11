# Metodología de Diseño - Problema 2
## Evaluación
### Objetivo
Evaluar la aplicación de patrones de diseño GOF

### 1. Contexto
#### Patrones de Diseño GOF
##### ¿Qué son?
El patrón de diseño Estrategia es uno de los patrones de diseño conocidos como GoF (de Gang of Four, por sus cuatro creadores: Gamma, Helm, Johnson y Vlissides). Son patrones de diseño orientado a objetos, que encapsulan soluciones a problemas comunes de diseño.

Existen tres tipos de patrones de diseño GoF, que resuelven tres tipos de problema distintos:
- Creacionales, que resuelven problemas de creación de objetos, como, por ejemplo, ¿cómo crear un objeto si no sé su clase? ¿cómo crear un objeto idéntico a otro? ¿cómo crear un objeto de la misma clase de otro, pero sin saber su clase?
- Estructurales, que resuelven problemas para organizar objetos en estructuras dinámicas, recursivas o en contextos de ambigüedad, como por ejemplo ¿Cómo represento un árbol?, ¿cómo le puedo agregar atributos a una clase en tiempo de ejecución? ¿cómo represento una estructura recursiva de todo y partes?
- De Comportamiento, que resuelven problemas de comportamiento dinámico o en condiciones de ambigüedad, como por ejemplo ¿Cómo hago que un objeto cambie su comportamiento para un mismo método en tiempo de ejecución? (Como el patrón estrategia)

##### Patrones más usados y código
En la URL siguiente, encontrará ejemplos de los patrones de diseño GoF en C#. Además, están clasificados con un ranking de popularidad.

http://dofactory.com/net/design-patterns

### 2. Actividad de evaluación: parte 1
Invente tres requerimientos para nuestro juego Extreme Fighter, que para ser resuelto requiera utilizar tres patrones de diseño GoF: Uno creacional, uno de comportamiento y uno de estructura. Debe plantear el cambio de requerimiento según el ejemplo siguiente:

#### Ficha de requerimiento
| Requerimiento | Problema | Solución | Patrón a aplicar                |
| --- | --- | --- |---------------------------------|
| El juego necesita un sistema de niveles que se desbloqueen al completar el nivel anterior. | Se necesita un mecanismo para organizar los niveles en una estructura jerárquica y controlar el acceso a los mismos. | Utilizar el patrón de diseño de estructura Composite para organizar los niveles en una estructura jerárquica y controlar el acceso a los mismos, el patrón creacional Factory Method para crear instancias de niveles según la posición que ocupen en la estructura jerárquica y el patrón conductual State para representar el estado de cada nivel (desbloqueado o bloqueado). | Factory Method Composite  State |
| El juego necesita una forma de crear nuevos personajes que puedan tener diferentes habilidades y atributos. | Cada personaje es único y tiene diferentes combinaciones de habilidades y atributos, lo que hace que la creación de objetos sea difícil y requiere mucho código duplicado. | Utilizar el patrón de diseño de estructura Composite para organizar los niveles en una estructura jerárquica y controlar el acceso a los mismos, el patrón creacional Factory Method para crear instancias de niveles según la posición que ocupen en la estructura jerárquica y el patrón conductual State para representar el estado de cada nivel (desbloqueado o bloqueado). | Builder                         |
| Requerimiento 3 | Problema 3 | Solución 3 | Patrón 3                        |

##### Diagrama UML	 
Acá deben poner el diagrama de su solución, por ejemplo, en vez de Client, Fight Engine, y los nombres del resto de clases que correspondan.
Diagramas en herramienta UML:
- http://staruml.io/
- Enterprise Architect: http://sparxsystems.com/products/ea/
- Visual Paradigm: https://www.visual-paradigm.com/

### 3. Entregas:
Semana del 17/05: propuestas de requerimientos para feedback
