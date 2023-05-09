# Cinema-App
Back end core for cinema aplications. Provides endpoints that may be accessed from front end to authenticate and authorize users and handle database via spring web controllers. <br>
<h2 tabindex="-1">﻿🛠️Functionality🛠️</h2>
 <ul dir="auto">
  <li>User registration and authentication</li>
  <li>Creating and extracting movies</li>
  <li>Creating and finding avalable movie sessions based on date-time</li>
  <li>Adding tickets to users' shopping carts</li>
  <li>Handling orders</li>
 </ul>
<h2 tabindex="-1">﻿⚙️Used technologies⚙️</h2>
  <ul dir="auto">
  <li>Java (v17.0.6)</li>
  <li>APACHE TOMCAT (v9.0.73)</li>
  <li>Spring Security (v5.2.1)</li>
  <li>Spring WEB (v2.5.1) +jackson (v2.14.1)</li>
  <li>MySQL (v8.0.24)</li>
  <li>Hibernate (v6.1.4)</li>
  <li>Apache maven (v4.0.0)</li>
 </ul>
<h2 tabindex="-1">﻿🎯How to run🎯</h2>
 In order to start using taxi service, user will need to go throgh a few steps first
 in MySQL WORKBENCH.
 <ul dir="auto">
  <li>Install <b>MySQL</b> and configure connection</li>
  <li>Configure <b>/resources/db.properties</b></li>
  <li>Configure Tomcat</li>
  <li>You will now have access to endpoints listed below</li>
  <li>Users can build the project by executing `mvn clean package` in terminal</li>
  <li>On launch, application will have admin user embeded by default (username: admin, password:1290)</li>
 </ul>
<h2 tabindex="-1">﻿📡Structure📡</h2>
   Web structure
 <ul dir="auto">
  <li><b>/login</b> user authentication page, they will be redirected here unless authorized</li>
  <li><b>/register</b> (USER/ADMIN) get access to more endpoints</li>
  <li><b>/users/by-email</b> (ADMIN) get a user by their email</li>
  <li><b>/cinema-halls</b> (ADMIN) POST with json in request body adds a cinema hall to database</li>
 <li><b>/cinema-halls</b> (USER/ADMIN) GET returns all cinema-halls in database</li>
  <li><b>/movies</b> (ADMIN) send POST here with json in request body to add a movie to database</li>
 <li><b>/movies</b> (ADMIN/USER) send GET which will return all movies in database</li>
  <li><b>/movie-sessions</b>(ADMIN) send POST here with json in request body to add a movie session to database
  <li><b>/movie-sessions/available</b> (ADMIN/USER) return all non expiered movie sessions from database in json format</li>
  <li><b>/movie-sessions/{Id}</b> (ADMIN) PUT will update specific movie session acording to values in request body in json format</li>
 <li><b>/movie-sessions/{Id}</b> (ADMIN) DELETE will irreversibly remove the movie session from database</li>
  <li><b>/orders</b> (USER) GET will return a history of all orders</li>
  <li><b>/orders/complete</b> (USER) POST will place an order to db, and clear user's shopping cart</li>
  <li><b>/shopping-carts/movie-sessions</b> (USER) PUT adds a ticket to user's shopping cart</li>
  <li><b>/shopping-carts/by-user</b> (USER) GET returns user's shopping cart</li>
 </ul>
 
