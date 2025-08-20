<%@page language="java" %>

<html>
    <head>
    <link rel="stylesheet" type="text/css" href="style.css"></link>
    </head>
    <body>
        <h2>Add Programmer</h2>

        <form action="add_programmer">
            <label for="programmerId">Enter ID:</label>
            <input id="programmerId" name="programmerId" type="text"><br>
            <label for="programmerName">Enter Name:</label>
            <input id="programmerName" name="programmerName" type="text"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>