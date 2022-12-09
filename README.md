# tracking
demo project

#cloning the project using the command 
git clone https://github.com/dineshguntha/tracking.git

#Once clone is completed open the cloned project file in the intellj ide
One the project is opended in the intellj then go the branch & change the branch to "master"

#Go the command prompt or maven setup clean and build the project
mvn clean install

#Once the maven clean & install is done then need to configure the postgres database
Create a database with "tracker" name (or) you can create any database name but need to change database name in src/resource/application.properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tracker

Change the password based on yours postgres database

Once the database is create then need to create a table rating
once table is created then we need to insert the data using the below command 
INSERT INTO public.rating(id, rating) VALUES (1, 3);

Run the application "DemoApplication.java"

Once the application is run then type this url in browser http://localhost:8080/tracking/1
you can see the result
