# ParcialAREP2
## ENUNCIADO
La secuencia de Lucas es una secuencia de enteros que lleva el nombre del matemático François Édouard Anatole Lucas (1842-1891), quien estudió tanto esa secuencia como su relación con la secuencia de Fibonacci.
Diseñe, construya y despliegue un aplicación web para investigar la secuencia de Lucas. El programa debe estar desplegado en tres máquinas virtuales de EC2 de AWS como se describe abajo. Las tecnologías usadas en la solución deben ser maven, git, github, maven, sparkjava, html5, y js. No use liberías adicionales.
## PROBLEMA:
Diseñe un prototipo de sistema de microservicios que tenga un servicio (En la figura se representa con el nombre Math Services) para computar la secuencia de enteros.  El servicio de la secuencia debe estar desplegado en al menos dos instancias virtuales de EC2. Adicionalmente, debe implementar un service proxy que reciba las solicitudes de llamdo desde los clientes  y se las delega a las dos instancias del servicio de secuencia usando un algoritmo de round-robin. El proxy deberá estar desplegado en otra máquina EC2. Asegúrese que se pueden configurar las direcciones y puertos de las instancias del servicio en el proxy usando variables de entorno del sistema operativo.  Finalmente, construya un cliente Web mínimo con un formulario que reciba la cadena y de manera asíncrona invoke el servicio único en el PROXY. El cliente debe ser escrito en HTML y JS.
![image](https://github.com/sebasporras14/ParcialAREP2/assets/69282634/18f929ad-a8aa-4c56-9e07-6bd5a1f70b9c)

## CORRIENDO PROYECTO 

Se clona el repositorio
~~~
git clone https://github.com/sebasporras14/ParcialAREP2.git
~~~
Luego se compila
~~~
mvn package
~~~
una vez compilado se ejecuta con el comando
~~~
java -cp "./target/classes;./target/dependency/*" com.example.SparkWebServer
~~~

al ingresar a http://localhost:4567/ aparecera lo siguiente 

![image](https://github.com/sebasporras14/ParcialAREP2/assets/69282634/6e2a5309-7845-440b-8c55-6c3360b66192)

y cuando se coloque el numero saldra la secuencia:


![image](https://github.com/sebasporras14/ParcialAREP2/assets/69282634/42b2948a-0d49-438a-8386-5e8a8870005d)

![image](https://github.com/sebasporras14/ParcialAREP2/assets/69282634/30a9e0c4-66f5-4e00-96c3-1d61ce7ef79a)



## VIDEO AWS:
https://www.youtube.com/watch?v=dWzlZjkDB-E
