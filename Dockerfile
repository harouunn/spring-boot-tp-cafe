# Utiliser une image Java légère
FROM ibm-semeru-runtimes:open-22.0.1_8-jdk

# Créer le dossier pour l'application
WORKDIR /app

# Copier le jar dans l'image
COPY target/TPCafe_HarounBenSalem-0.0.1-SNAPSHOT.jar app.jar

# Exposer le port Spring Boot
EXPOSE 8080

# Lancer l'application
ENTRYPOINT ["java", "-jar", "app.jar"]

