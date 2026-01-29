# ActividadOptimizacionMaven

Repositorio para la Actividad de Optimización de Código de Entornos de Desarrollo.

En la carpeta Screenshots se recopilan las capturas de pantalla sobre las comprobaciones de SonarQube y los detalles de cada paso del proceso de Refactorización.

A continuación se ofrece la explicación de las capturas de pantalla así como su significado y los cambios que han ido realizándose durante el proceso del proyecto.

En primer lugar, se procede con la instalación del plugin SonarQube (anteriormente denominado SonarLint) a través del Marketplace de Eclipse. 
![Al aparecer el plugin en la siguiente captura se muestra que se ha instalado correctamente](https://github.com/antondm11/ActividadOptimizacionMaven/tree/main/Screenshots/Captura1SonarQube.png)

Prosiguiendo, una vez instalado SonarQube, acceder a la pestaña Preferencias en Eclipse, donde al hacer clic en el desplegable de SonarQube se pinchará en la opción “Rules Configuration”. Una vez allí, al hacer clic en el desplegable de Java, aparecerán todas las reglas asociadas, revisando en este caso con la denominada “Cognitive Complexity”, que ![activada por defecto.](https://github.com/antondm11/ActividadOptimizacionMaven/tree/main/Screenshots/Captura1CognitiveComplexityOn.png)
Se desmarca la regla como se ve en la siguiente captura:
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/Captura2CognitiveComplexityOff.png)

El código del proyecto se ve ![así](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaMagicNumbersBeta.png)

Además de esta regla, se revisará la denominada "Magic Numbers" ("Magic numbers should not be used" tal cual aparece), también en el desplegable de Java, que aparece desactivada por defecto. ![Se activa](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaMagicNumbersRule.png)

Una vez activada se revisa el código del proyecto, ![apreciándose como los números que se pueden definir como una constante aparecerán subrayados en azul](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaMagicNumbers.png). De hecho, el propio plugin SonarQube ofrece la sugerencia de cambiar dichos números por las constantes cuando se realice el proceso de refactorizar más adelante. Cabe destacar que esta vista con dichos números en azul aparece así cuando se han marcado ambas reglas, tanto "Magic Numbers" como "Cognitive Complexity".

Por su parte, una vez expuesto el funcionamiento del plugin, procede explicar todo el proceso de refactorización que se ha llevado a cabo en este proyecto.
En primer lugar, se refactorizaron algunas de las variables utilizadas para darles un nombre más significativo y adecuado al contexto del proyecto. Para esto se realizó clic derecho en la variable o Alt+Shift+T, opción "Refactor" y "Rename". Así, para la variable inicialmente recogida como "a", se realizó este proceso para renombrarla como "listaNombres" .
El código estaba tal que así con la variable "a"
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaAListaNombres.png)

La siguiente captura muestra cómo se ve visualmente el proceso de renombrar, observándose el pequeño menú en el que se teclea el nuevo nombre de la variable y una vez presionado Enter la variable quedará renombrada y refactorizada. 
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaRefactorListaNombres.png)
Se repitió este proceso para las demás variables que no tenían un nombre significativo, en este caso la codificadas como "b", "t" y "res". A continuación se muestra el resultado de cada procedimiento de renombrar.

Variable "b" renombrada a "precio":
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaRefactorPrecio.png)

Variable "t" renombrada a "totalSinImpuestos":
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaSinImpuestosRefactorPreview.png)

Variable "res" renombrada a "totalConImpuestos":
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaImpuestosRefactorizar.png)

Cabe destacar que al realizar el proceso de refactorizar, y para el caso concreto de renombrar una variable, en Eclipse se puede hacer uso de un menú previo (preview menu) que muestra una comparativa entre la vista del código actual previo a la refactorización y la vista de cómo quedará el código una vez refactorizado al renombrar la variable en cuestión. La siguiente captura refleja este menú previo aplicado a la refactorización de la variabe "t" en "totalSinImpuestos"
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaPreviewMenu.png)

Después de renombrar, el siguiente proceso que se llevó a cabo para refactorizar fue la extracción de métodos específicos para determinados cálculos, para así integrar su lógica en el método y por tanto optimizar el código
Se comenzó con el método para el cálculo del IVA, que al hacer clic derecho tras seleccionar la lógica correspondiente o Alt+Shift+T se seleccionó la opción "Refactor" y "Extract Method". 
Esto abre el siguiente menú previo en Eclipse:

El nuevo método extraído a partir de su lógica mediante el proceso de refactorización quedaría dentro de la misma clase como aparece en la siguiente captura.
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/Captura1MetodoIVA.png)

Y cuando se vaya a utilizar, quedará así en el código:
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/Captura2MetodoIVA.png)

Al realizar el mismo procedimiento para extraer un método de la lógica del cálculo de los Gastos de envío, quedará tal que así:
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaMetodoGastosEnvio.png)


Por último, se completó el proceso de refactorización con la praxis de Extraer Constantes. Esto permitiría de nuevo optimizar el código al recoger en dichas constantes números definidos para los cálculos, que curiosmanete son algunos de los que quedaban marcados como "Magic Numbers" por el plugin SonarQube.
El primer número que se extrajo como una constante fue el IVA, que al ser 0.21 y no cambiar en ningún momento, tendría todo el sentido del mundo recogerlo en una constante. Para ello, de manera similar a los pasos anteriores, se selecciona el número mágico, se hace clic derecho o Alt+Shift+T y Refactor, después Extract Constant. Aquí se podrá renombrar el número mágico mediante un menú previo similar al de los pasos anteriores, destacando que será conveniente escribirla en mayúsculas y marcar la opción para que todas la coincidencias del número mágico sean reemplazadas por la nueva constante. 



En la siguiente captura se aprecia el código del método extraído anteriormente para el cálculo del IVA, donde el 0.21 correspondiente al IVA aparece reemplazado por una constante llamada IVA cuyo valor es ese mismo número. Así queda el código refactorizado, específicamente para el caso de la constante pero también por partida doble si se consideran los cambios anteriores, estando pues más conciso al aunar en el método la lópgica de cálculo y la constante.
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaConstanteIVA.png)

De hecho, una vez creada la nueva constante, la lógica del cálculo de los impuestos, que la utiliza, quedará mostrada como en la siguiente captura, quedando el número mágico original (0.21) reemplazado por la nueva constante renombrada. Ésta aparece en al principio del código como "public static final IVA"
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaCalculoIVARefactorizado.png)

Para las demás constantes se repitió el mismo proceso, quedando de la siguiente manera:

Constante para Descuento:
Menú previo
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaExtraerConstanteDescuento.png)

Constante refactorizada
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaConstanteDescuento.png)


Constante para Gastos
Ejemplo de cómo aparece el menú previo en el que configurar la refactorización al nuevo valor, para esta constante de Gastos de envío:
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaConstantePreview.png)

Constante refactorizada, siendo vista aquí dentro del método para el cálculo de los gastos de envío
![](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaConstanteGastos.png)

Cabe apuntar finalmente que tras los cambios se ejecutaron las pruebas Junit y todo el código pasó el test, con la cobertura del 100%.














