🎭 Playwright Java Automation Framework
Framework de automatización de pruebas end-to-end (E2E) para aplicaciones Web y Mobile (emulación), diseñado sobre la arquitectura Page Object Model (POM) utilizando Java, Playwright y JUnit 5.

🚀 Tecnologías Utilizadas
Lenguaje: Java 21

Herramienta de Automatización: Playwright (v1.48.0)

Framework de Pruebas: JUnit 5 (Jupiter)

Gestor de Dependencias: Maven

Entorno de Desarrollo: Visual Studio Code

📁 Estructura del Proyecto
El proyecto sigue la arquitectura estándar de Maven y el patrón de diseño Page Object Model para garantizar un código modular, mantenible y escalable:

Plaintext
playwright-framework-java/
├── .gitignore
├── pom.xml
├── README.md
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── saucedemo/
    │               ├── factory/
    │               │   └── PlaywrightFactory.java  # Control del ciclo de vida del Browser/Page
    │               └── pages/
    │                   └── HomePage.java           # Selectores y acciones de la página principal
    └── test/
        └── java/
            └── com/
                └── saucedemo/
                    ├── base/
                    │   └── BaseTest.java          # Setup (@BeforeEach) y Teardown (@AfterEach)
                    └── tests/
                        └── HomeTest.java          # Casos de prueba automatizados
🛠️ Requisitos Previos
JDK: Java 21 o superior instalado y configurado en el sistema.

VS Code: Con la extensión Extension Pack for Java (Microsoft).

🧪 Ejecución de Pruebas
Desde VS Code (Recomendado)
Abre el panel de Testing (icono del tubo de ensayo en la barra lateral izquierda).

Haz clic en el icono de Refresh (flechas en círculo) si es necesario.

Haz clic en el botón de Play (▶) sobre la clase HomeTest o el método individual.

Desde la Terminal (si Maven está configurado en el PATH)
Bash
mvn test
🎯 Sitio Bajo Prueba
URL: https://sauce-demo.myshopify.com/

Desarrollado por Viviana Garcia