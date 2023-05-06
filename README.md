﻿# cinema-app
Back end core for cinema aplications, provides endpoints to authenticat and authorize users and handle database <br>
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
  <li>install <b>MySQL</b> and configure connection</li>
  <li>Configure <b>/resources/db.properties</b></li>
  <li>Configure Tomcat</li>
  <li>You will now have access to endpoints listed below</li>
  <li>Users can build the project by executing 'mvn clean package' in terminal</li>
 </ul>
<h2 tabindex="-1">﻿📡Structure📡</h2>
   Web structure
 <ul dir="auto">
  <li><b>/login</b> user authentication page, they will be redirected here unless authorized</li>
  <li><b>/register</b> user may register to get access to more endpoints</li>
  <li><b>/users/by-email</b> admin authorized users can get a user by their email</li>
  <li><b>/cinema-halls</b> admin authorized users can send POST here with json in request body to add a cinema hall to database, anyone can send GET which will return all cinema-halls in database</li>
  <li><b>/movies</b> admin authorized users can send POST here with json in request body to add a movie to database,  anyone can send GET which will return all movies in database</li>
  <li><b>/movie-sessions</b> admin authorized users can send POST here with json in request body to add a movie session to database, anyone can send GET which will return all movie sessions in database</li>
  <li><b>/movie-sessions/available</b> returns all non expiered movie sessions from database in json format</li>
  <li><b>/movie-sessions/{Id}</b> PUT will update specific movie session acording to values in request body in json format, DELETE will irreversibly remove the movie session from database</li>
  <li><b>/orders</b> only accessible to users, GET will return a history of all orders</li>
  <li><b>/orders/complete</b> POST will place an order to db, and clear user's shopping cart</li>
  <li><b>/shopping-carts/movie-sessions</b> PUT adds a ticket to user's shopping cart</li>
  <li><b>/shopping-carts/by-user</b> GET returns user's shopping cart</li>
 </ul>
 
