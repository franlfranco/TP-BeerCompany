# TP-BeerCompany

# Cuántos consumidores se necesitan para que el stock llegue a 0?

Con un consumidor o más es posible que el stock llegue a 0, sin embargo, si es uno solo, es necesario darle prioridad para que consuma se consuma más de lo que se produce.

# Bloques synchronized por qué deben serlo?

Se utilizan bloques sincronizados porque existe un recurso que es compartido.

# Explicar el recurso compartido

El recurso compartido es la unidad de cerveza, ya que se accede al mismo tanto para ser producido como para ser consumido. Se deben sincronizar estas acciones para evitar conflictos.

# Tres formas de crear Threads.

1) Interfaz Runnable: Implementando la interfaz runnable.
Instanciacion : new Thread(new ClaseNueva()). 

2) Clase Thread: Extendiendo la clase Thread, la desventaja de esta forma es que Java no permite la herencia múltiple.
Instanciacion : new ClaseNueva().

3) Clase que implemente interfaz Runnable: En caso de que nuestra clase extienda una clase que ya tenga implementado Runnable. 
