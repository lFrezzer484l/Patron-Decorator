# Patron-Decorator

1 ¿Que es el patron de diseño Decoder?

el patron Decoder permite agregar responsabilidades adicionales a un objeto de forma dinamica, sin alterar su estructura. es una forma flexible de extender la funcionalidad de los objetos de manera transparente y sin modificar el codigo original de la clase
este patron es util cuando necesitamos agregar funcionalidades adicionales a objetos de una clase, ero sin recurria la herencia, lo que permite una mayor flexibilidad y un codigo mas limpio.

2 ¿Para que se utiliza comunmente el atron Decoder?
dicho patron es usado para extender e comportamiento de objetos de manera flexible esto sin modificar su implementacion original. En lugar de cambiar el codigo de la case base, se envuelve el objeto con un decorador que agrega comportamientos adicionales.
tambien es usado como una alternativa de la herencia cuando quieres añadir caracteristicas o funcionalidades adicionales a un objeto, pero sin crear una jerarquia de clases complicada.

3 ¿Como ayuda el patron Decoder en la interpretacion de datos?

El patron puede agregar responsabilidades de forma dinamica. en sistemas de interpreacion de datos, a menudo es necesario aplicar diferentes transformaciones o interpretaciones a los datos segun el contexto. el patron decorador permite agregar comportamiento a un objeto de interpretacion de datos de forma dinamica y sin modificar el objeto original

4 ¿Cua es la estructura tipica de un patron Decoder?

1 Component
es una interfaz o clase abstracta que define la funcionalidad estandar que sera implementada por el componente concreto y lo decoradores
2 ConCreteComponent
es la implementacion original o base de la funcionalidad. puede funcionar por si sola, pero puede ser envolvida por decoradores.
3 Decorator
clase abstracta que tambien implementa la interfaz Component y contiene una referencia a un objeto Component. su funcion principal es delegar las operaciones al objeto que envuelve.
4 ConcreteDecorator
Son clases que extienden el decorador abstracto y añaden funcionalidades especificas antes o despues de delegar el trabajo al objeto Component.
