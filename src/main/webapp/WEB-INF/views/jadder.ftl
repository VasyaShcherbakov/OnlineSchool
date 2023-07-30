<!DOCTYPE html>
<html>
<head>
    <title>Student Form</title>
</head>
<body>

<ul>
    <#list menu as menuItem>
        <li><a href="${menuItem.link}">${menuItem.label}</a></li>
    </#list>
</ul>

<h1>Add Student</h1>
<form id="studentForm" onsubmit="submitForm(); return false;">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name"><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email"><br>
    <button type="submit">Submit</button>
</form>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    function submitForm() {
        var formData = {
            "name": $("#name").val(),
            "email": $("#email").val()
        };

        $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/badex_war_exploded/categories",
            data: JSON.stringify(formData),
            dataType: "json",
            success: function (data) {
                alert("Form data saved successfully!");
            },
            error: function (error) {
                alert("Error saving form data.");
            }
        });
    }
</script>
</body>
</html><!DOCTYPE html>
       <html lang="en">

       <head>
          <meta charset="UTF-8">
          <meta http-equiv="X-UA-Compatible" content="IE=edge">
          <meta name="viewport" content="width=device-width, initial-scale=1.0">
          <link rel="stylesheet" href="css/bootstrap.min.css">

          <title>Home</title>
       </head>

       <%@ page contentType="text/html;charset=UTF-8" language="java" %>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
       <body>


       <h1>Web MVC jsp file</h1>





          <script defer src="js/bootstrap.bundle.min.js"></script>
       </body>

       </html>