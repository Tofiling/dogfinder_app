## DogFinder - App de Rescate Animal Callejero 🐶

DogFinder es una aplicación móvil y web desarrollada en Flutter, que permite reportar y ubicar animales en situación de calle. El objetivo es conectar rescatistas, fundaciones y ciudadanos para brindar ayuda rápida y coordinada a los animales que más lo necesitan.
📱 Características principales

- Inicio de sesión con Firebase (correo y contraseña)
- Reporte de animales con fotografía, descripción y ubicación
- Visualización de reportes en mapa (en desarrollo)
- Multiplataforma: Android, Web y escritorio (Windows)
- Sincronización en tiempo real con Firebase Firestore
- Compilación automática con GitHub Actions

🚀 Tecnologías utilizadas
Tecnología	Rol
Flutter	Desarrollo multiplataforma
Firebase	Backend (Auth, Firestore, Storage)
GitHub Actions	CI/CD automatizado
Android Studio / VS Code	IDEs recomendados
🛠️ Instalación y ejecución

Requisitos:
- Flutter SDK
- Android Studio
- Git
- Cuenta de Firebase

Pasos para desarrollo:

1. Clona el repositorio:
   git clone https://github.com/TU_USUARIO/dogfinder_app.git
   cd dogfinder_app

2. Instala las dependencias:
   flutter pub get

3. Ejecuta en:
   Web: flutter run -d chrome
   Android: flutter run -d emulator-5554

4. Asegúrate de tener `google-services.json` ubicado en:
   android/app/google-services.json (reemplazado por Actions)

👥 Contribuciones
¿Quieres colaborar? Revisa nuestra guía de contribución (`CONTRIBUTING.md`) antes de enviar un PR.

🔐 CI/CD y Seguridad
Este proyecto usa GitHub Actions para automatizar la compilación de APKs y restaurar secretos de forma segura. La rama `main` está protegida.

📄 Licencia
Este proyecto está bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente, dando el debido crédito.

❤️ Hecho con amor por:  José Almontes
                        Carlos Navarro
                        Giovanni Vargas
