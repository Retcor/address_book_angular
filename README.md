# address_book_angular
A simple Address Book web application using Spring Boot, AngularJS and Spring Data.

Getting Started:
- To download frontend components, make sure to have bower installed and run "bower install" in the resources/static folder.
- In the application.properties, configure the "spring.jpa.hibernate.ddl-auto" to "create" or "update" as needed.
- Add database connection information in the pom.xml for flyway and run "mvn flyway:migrate" to auto generate the db schema.
