# Lab7_AREP


# TAREA DE AMAZON GATEWAY Y LAMBDA
<img src="https://github.com/sf-burgos/ArquitecturaEmpresarial/blob/master/laboratorio1AREP-app/resources/Imagenes/BB.jpg" width="100" height="100">

##### **Presentado por:** **[Brayan Steven Burgos Delgado](https://www.linkedin.com/in/brayan-steven-burgos-delgado-21a9a0178/)**
##### Repositorio: [click aqui](https://github.com/sf-burgos/Lab3_AREP_Reto1)
## Objetivo: 

Cree un servicio Web en Spark que convierta de grados farenheit en grados celcius. El servicio debe responder un JSON.
Despliegue el servicio en una máquina de AWS EC2 y publíquelo.
Cree una ruta en el API getway para acceder al servicio . Ojo ya la integración no es con función lambda.
Cree un aplicación JS para usar el servicio. Depliegue la aplicación en S3. Asegúrese que esté disponible sobre internet.
Pruebe la aplicación Web
Entregue el código desarrollado en Github, un reporte de las pruebas, y u video con el experimento funcionando.
Intente que el servicio en EC2 no esté accesible sobre internet, solo debe estar accesible por medio del API gateway.
# Creacion del proyecto 

> mvn archetype:generate -DgroupId=edu.escuelaing.edu.AREP -DartifactId=LAB7 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

## Prerrequisitos

Java

Es una plataforma necesaria para que Maven ejecute, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:

> java -version

- java version "1.8.0_101"
- Java(TM) SE Runtime Environment (build 1.8.0_101-b13)
- Java HotSpot(TM) Client VM (build 25.101-b13, mixed mode)

Maven
- La estructura está estandalizada con Maven, desde la linea de comandos comprobamos que se encuentre instalado por medio del comando:

> mvn -v

# Git version

>git --version
>git version 2.21.0.windows.1


#Instalacion

1. Clone el repositorio: 

>git clone https://github.com/sf-burgos/Lab7_AREP.git

2. Compile el proyecto 


>mvn clean install

>mvn package

##### Para OBSERVAR EL VIDEO SE ENCUENTRA EN EL SIGUIENTE LINK:[click aqui](https://github.com/sf-burgos/Lab7_AREP/blob/main/resources/S3%20Management%20Console%20-%20Google%20Chrome%202021-04-05%2021-27-24.mp4)