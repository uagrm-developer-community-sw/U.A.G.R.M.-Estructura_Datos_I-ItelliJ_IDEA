# U.A.G.R.M.-Estructura_Datos_I-ItelliJ_IDEA
U.A.G.R.M. | Materia: Estructura de Datos I | Docente: Mario Campos Barrera | Repositorio: Avance de Contenido | Lenguaje: Java | IDE: IntelliJ IDEA

# IDE: INTELLIJ IDEA
![intellij-idea_logo_300x300](https://user-images.githubusercontent.com/36086876/106154818-6389f780-6156-11eb-891e-11e44d96e57f.png)
<br>
# IDE: SDK 1.8.0_271
![java](https://user-images.githubusercontent.com/36086876/106154871-743a6d80-6156-11eb-860c-4f709d1d8ba4.jpg)
<br>
# TAREA # 1<br><br> Tipo de dato Abstracto 
# + TDA Dupla<br>
Codificar el TDA para representar una "dupla". Una dupla es un conjunto ordenado de tamaño fijo de 2 elementos. Para acotar la implementación podrían realizar una Dupla de dos enteros (int), a fin de simplificarlo. Con lo cual no sería una Dupla genérica que podrá tener cualquier tipo de elemento.<br><br>
Las operaciones definidas sobre la dupla deberán ser:<br>
crear(int primero, int segundo) -> Dupla<br>
primero(Dupla) -> int<br>
segundo(Dupla) -> int<br><br>
multiplicar(Dupla d, int multiplo) -> Dupla : Genera una nueva Dupla que es el resultado de multiplicar ambos elementos por el número multiplo que se pasa por parámetro.<br><br>
etc... (pueden acá definir más operaciones que les parezca).<br><br>
Nota:<br>
Estas definición de las operaciones, definen al tipo de dato Dupla como inmutable, es decir, cuando invocamos la función multiplicar, por ejemplo, no va a alterar la dupla original que pasamos por parámetro, si no que va a devolver una nueva. La original nunca se modifica. Ésto es una decisión, no es necesario. Podríamos haber definido operaciones que modifican la Dupla, en cuyo caso no haría falta que devuelvan nada. Eso va a "gusto" de ustedes. Hasta podrían ejercitar hacer ambas cosas.<br><br>

# + TDA String / Texto
Realizar un TDA que represente la idea de “texto” que soporte 128 caracteres. Como ya sabemos en C no existe este tipo básico, con lo cual nuestras aplicaciones siempre quedan acopladas a la idea de que un string es una cadena de caracteres, por lo que se manejan con punteros y posiciones.<br><br>

A continuación una definición básica del TDA (pueden ustedes definir más operaciones si quisieran).<br>
tipo abstracto Texto<br>
operacion  crear() -> Texto<br>
operacion destruir(Texto t)<br>


operacion tamanio(Texto t) -> int<br>

operacion caracterEn(Texto texto, int posicion) -> char<br>
ETC. Completar y modelar el TDA string<br> 

# + TDA Boolean
Realizar un TDA para el tipo booleano en C. Recordar que en C no existe este tipo como tipo básico, por lo cual muchas veces nuestro código pierde legibilidad y a veces el uso de números lleva a errores. En C se asume que el número 1 es verdadero y el 0 es falso.

Describimos el TDA como:

tipo abstracto boolean
operacion create(int condicionComoInt) -> boolean
operacion and(boolean b1, boolean b2) -> boolean

Pueden agregar más operaciones

# + TDA Fecha
Realizar un TDA Fecha, abstracción de las fechas, que consisten en un año, un mes y un día y permiten abstraer de la representación interna y operar fechas:

tipo abstracto Fecha
operacion crearDesdeTextoAnioDosDigitos(char[6] fechaEnTexto) -> Fecha
operacion crearDesdeTextoAnioCompleto(char[8] fechaEnTexto) -> Fecha
operacion crear(int dia, int mes, int anio) -> Fecha
// devuelven los componentes de la fecha como números
operacion dia(Fecha f) -> int
Etc. Completar los demás Datos

# + TDA Periodo
tipo abstracto Periodo
// Crea un periodo especificado todo el períod en días. Ej: trabajé en la empresa 66 días
operacion crear(int dias) -> Periodo
// Crea un periodo especificado en meses + dias. Ej: trabajé en la empresa 2 meses y 6 días
operacion crear(int meses, int dias) -> Periodo
// Crea un periodo especificado en anios + meses + dias. Ej: trabajé en la empresa 2 años, 3 meses y 7 días
operacion crear(int anios, int meses, dias) -> Periodo

// Retorno la representacion del Periodo en dias: Ej: 2 meses y 3 dias -> 63 dias
operacion traducirADias(Periodo p) -> int
COMPLETAR ESTE TDA.

# + TDA Fracciones
Realizar un TDA para números fraccionarios, es decir aquellos que se expresan como el cociente de dos números enteros.
Las operaciones que deberá soportar el TDA son:
tipo abstracto Fraccion
operacion crear(int numerador, int denominador) -> Fraccion
operacion Setnumerador (int numerador  ) -> cambia el numerador Numerador de la fracción  
terminar el TDA

# + TDA punto
Realizar un TDA para representar un punto en la pantalla de una computadora, los elementos básicos de un puntos son coordenada x, coordenada y, etc.
Las operaciones básicas de este TDA son:
Tipo abstracto Punto
Operación crear(int coord X, int coord. y);
Operación mover(int coord X, int coord. y)
Terminar el TDA complete<br><br><br><br>

# IMAGEN TDA - PRACTICO #1
![practico 1](https://user-images.githubusercontent.com/36086876/109461636-d4178300-7a38-11eb-8aa5-835bd97d79aa.png)

# AVANCE DE EJERCICIOS EN CLASE # 1<br><br> Tipo de dato Abstracto


# REPOSITORIO: U.A.G.R.M. - F.I.C.C.T.
![repository-open-graph-template UAGRM](https://user-images.githubusercontent.com/36086876/100397386-c1e40e00-301f-11eb-8315-584dd27f953c.png)