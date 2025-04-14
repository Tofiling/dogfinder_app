## Guía de Contribución - DogFinder 🐶

¡Gracias por tu interés en colaborar con este proyecto! Este documento describe las pautas y buenas prácticas para contribuir de manera ordenada y segura al desarrollo de la aplicación DogFinder.

## 🧭 Flujo de trabajo

1. Crea una rama desde `main` para cada nueva funcionalidad o corrección de errores:
   git checkout -b feature/nombre-funcionalidad

2. Haz commits atómicos y descriptivos:
   - Usa presente y voz activa.
   - Ejemplo: Agrega pantalla de login con Firebase Auth.

3. Sin push directo a `main`:
   La rama `main` está protegida. Solo se puede actualizar mediante Pull Requests (PR).

4. Abre un Pull Request (PR) desde tu rama hacia `main`:
   - Agrega una descripción clara del cambio
   - Asocia el PR a un issue (si existe)
   - Espera revisión y aprobación antes de hacer merge

📁 Convención de nombres de ramas
Tipo	Prefijo recomendado	Ejemplo
Funcionalidad nueva	feature/	feature/reportar-animal
Corrección de bug	bugfix/	bugfix/error-login
Refactorización	refactor/	refactor/login-controller
Documentación	docs/	docs/contributing-md

✅ Revisión y aprobación
- Todo PR debe ser revisado por al menos 1 integrante del equipo
- No se permite hacer merge si hay conflictos o errores en los checks de GitHub Actions
- El historial de `main` debe mantenerse limpio (sin `force push`)

🧪 Revisión automática
Este repositorio usa GitHub Actions para compilar y validar cambios automáticamente:
- Compilación de APK
- Verificación de integridad con Firebase
- Publicación de artefactos (en el futuro)

🚀 ¡Gracias por contribuir!
Tu participación mejora esta app y ayuda a rescatar más animales. ¡Sigue las buenas prácticas y construyamos juntos algo increíble! 🐾
