# ActividadOptimizacionMaven

Repositorio para la Actividad de Optimización de Código de Entornos de Desarrollo.

En la carpeta Screenshots se recopilan las capturas de pantalla sobre las comprobaciones de SonarQube y los detalles de cada proceso de Refactorización.

A continuación se ofrece la explicación de las capturas de pantalla así como su significado y los cambios que han ido realizándose durante el proceso del proyecto.

En primer lugar, se procede con la instalación del plugin SonarQube (anteriormente denominado SonarLint) a través del Marketplace de Eclipse. 
![Al aparecer el plugin en la siguiente captura se muestra que se ha instalado correctamente](https://github.com/antondm11/ActividadOptimizacionMaven/tree/main/Screenshots/Captura1SonarQube.png)

Prosiguiendo, una vez instalado SonarQube, acceder a la pestaña Preferencias en Eclipse, donde al hacer clic en el desplegable de SonarQube se pinchará en la opción “Rules Configuration”. Una vez allí, al hacer clic en el desplegable de Java, aparecerán todas las reglas asociadas, revisando en este caso con la denominada “Cognitive Complexity”, que ![activada por defecto.](https://github.com/antondm11/ActividadOptimizacionMaven/tree/main/Screenshots/Captura1CognitiveComplexityOn.png)
Se ![desmarca la regla](https://github.com/antondm11/ActividadOptimizacionMaven/tree/main/Screenshots/Captura1CognitiveComplexityOff.png)
El código del proyecto se ve ![de la siguiente manera].


Además de esta regla, se revisará la denominada "Magic Numbers" ("Magic numbers should not be used" tal cual aparece), también en el desplegable de Java, que aparece desactivada por defecto. ![Se activa](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaMagicNumbersRule.png)

Una vez activada se revisa el código del proyecto, ![apreciándose como los números que se pueden definir como una constante aparecerán subrayados en azul](https://github.com/antondm11/ActividadOptimizacionMaven/blob/main/Screenshots/CapturaMagicNumbers.png)














