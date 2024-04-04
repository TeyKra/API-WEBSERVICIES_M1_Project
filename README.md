# Projet-API-WEBSERVICIES

# REST PROJECT REQUIREMENTS

In this project, you are required to propose a web application providing the following REST services. The project consists of presenting movie schedules in various Parisian cinemas. To get a better idea of what we expect from you for this project, please visit the AlloCiné website.

## First Service

The first provided service is the publication of new movies and their schedules. For this purpose, you should offer a web page to movie creators, with a login so they can post movie details:

- Title
- Duration
- Language (subtitles if needed)
- Director
- Main actors
- Minimum age requirement

For simplicity, it is assumed that a movie has a start date and an end date, showing three days a week (with a given start time for each cinema session). Of course, you must specify the city where the movie is shown (the address of the cinema).

## Second Service

A second service is to display all the movies offered in a given city. This will be done via a freely accessible web page, no login required.

## Third Service

For each requested movie, it is necessary to display the list of cities where the movie is playing, as well as all the movie details (given in question 1).

## Work Organization

### Team Work

The project is to be carried out in groups of 2-3 students (same lab group).

### Technical Constraints

For this project, you will need Java, Eclipse, JAX-RS, Jersey Jackson, and Tomcat. You can either use a MySQL database or an in-memory database like HSQLDB to store movie information. An object-oriented collection initiated at the start of the project execution is also suitable.

## Defenses

A defense lasts 15 minutes: 10 minutes presentation + execution of your program and 5 minutes for Q/A.

## Submission of Work

All teams must submit their work on Moodle by Thursday, December 21st at the latest (submissions will be closed at 23:59 on 12/21).

### Submission Content

No PPT, no Doc, only a functional code/project.

# Submission

We have created a web application that meets all the constraints imposed by the project's specifications. Our application requires an administrator login to add new movies. The administrator view is distinguished by two main functions: adding new movies and managing the movie catalog, including viewing movies. As for the user view, it requires no login. The user view contains only the visualization of the movie catalog.
Regarding the storage of movies and administrator data, this is carried out through a MySQL database directly connected to our web application.

