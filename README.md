# PharmacyLocator_application_SpringBoot 

## This is an application for locating pharmacies that allows users to easily find a pharmacy in their city or area and filter pharmacies by their opening hours. The application has the following features:

Search for pharmacies by city
Search for pharmacies by area
Filter pharmacies by opening hours (day or night)
Display a list of found pharmacies
Display detailed information of a pharmacy
Display directions to reach a pharmacy
Possibility to mark a pharmacy as favorite
Management of user preferences (language, dark mode, etc.)
Management of errors and clear error messages
Technologies Used
Java 11
Spring Boot
Spring Data JPA
H2 Database
Maven
Eclipse IDE
Postman
Development
The project will be developed using the Agile method with short iterations to ensure good responsiveness to client requests. Unit and integration tests will be carried out regularly throughout the development to ensure code quality. The developments will be carried out in a development environment separate from the production environment.

API Endpoints
The following API endpoints are available:

Retrieval of all cities:

GET /api/villes
This API returns a list of all available cities in the database.
Retrieval of all areas for a given city:

GET /api/villes/{ville}/zones
This API takes the name of the city as a parameter and returns a list of all available areas for that city.
Retrieval of all pharmacies for a given area:

GET /api/villes/{ville}/zones/{zone}/pharmacies
This API takes the name of the city and the name of the area as parameters and returns a list of all available pharmacies for that area.
Retrieval of all pharmacies on duty for a given area and period:

GET /api/villes/{ville}/zones/{zone}/pharmacies/garde?periode={periode}
This API takes the name of the city, the name of the area, and the period (day or night) as parameters and returns a list of all pharmacies on duty available for that area and period.
Retrieval of details of a pharmacy:

GET /api/pharmacies/{id}
This API takes the ID of the pharmacy as a parameter and returns all details of the pharmacy, including its address, opening hours, and geographical coordinates.
Retrieval of directions to reach a pharmacy:

GET /api/pharmacies/{id}/itineraire?depart={depart}
This API takes the ID of the pharmacy and the departure address as parameters and returns directions to reach the pharmacy.
Development Setup
To set up the development environment for this application, follow these steps:

Clone the repository to your local machine.
Open the project in Eclipse IDE.
Run the application using the Spring Boot Run Configuration.
Use Postman to test the functionalities of the application.
Conclusion
This application provides an easy way for users to find pharmacies in their area and filter them based on their opening hours. It is developed using modern technologies and follows best practices for development.
