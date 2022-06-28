# Selenium-TestNG
Proyecto Maven creado con Selenium, WebdriverManager, TestNG, Log4j, JavaFaker, Allure para automatizar lo siguente en la web https://courses.ultimateqa.com/
1. Registro Exitoso
2. Login Exitoso
3. Login Con Credenciales Invalidas
4. Ver el video de bienvenida de un curso en específico
5. Recuperar Contraseña

# Generación de datos
## Java Faker
Uso de java faker para el registro exitoso
## Datos estáticos
Configurables en el archivo config.properties
```
DEFAULT_EMAIL=DEFAULT_EMAIL
DEFAULT_PASSWORD=DEFAULT_PASSWORD
```
# Correr Tests

## Ejecutar desde la consola
```
mvn -Dtest=Tests test
```
## Ejecutar tests en paralelo
- **Ejecutar desde la suite** <br>
Para ejecutarlo desde la suite de TestNG ejecutar el archivo llamado testng.xml y modificar el thread-count<br>
## Ejecutar tests en remoto
- **Ejecutar desde selenoid** <br>
Para ejecutar desde selenoid modificar en archivo config.properties y dejar obligatoriamente remote=true
```
browser=chrome
REMOTE_URL=serverUrl
remote=true
browserRemoteVersion=81.0
enableVNC=true
enableVideo=false
```
# Allure Report
Despues de haber ejecutado los tests, correr en la consola el siguiente comando
```
allure serve allure-results
```
# Tests fallidos
Generará una screenshot y la guardara en failed_tests con el nombre del test

# Listener de TestNG
listener de TestNG para ocupar log4j
