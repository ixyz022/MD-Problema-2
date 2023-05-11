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
| Requerimiento | Problema | Solución | Patrón a aplicar |
| --- | --- | --- | --- |
| Cada personaje parte equipado con un casco, una armadura y una espada, existiendo distintos tipos de cascos, armaduras y espadas. | La construcción de un luchador requiere una lógica específica por cada uno de ellos, correspondiente al ensamble de distintos componentes. | Crear una abstracción para la creación de luchadores | Abstract Factory |
| Requerimiento 2 | Problema 2 | Solución 2 | Patrón 2 |
| Requerimiento 3 | Problema 3 | Solución 3 | Patrón 3 |

##### Diagrama UML	 
Acá deben poner el diagrama de su solución, por ejemplo, en vez de Client, Fight Engine, y los nombres del resto de clases que correspondan.
Diagramas en herramienta UML:
- http://staruml.io/
- Enterprise Architect: http://sparxsystems.com/products/ea/
- Visual Paradigm: https://www.visual-paradigm.com/

### 3. Entregas:
Semana del 17/05: propuestas de requerimientos para feedback
