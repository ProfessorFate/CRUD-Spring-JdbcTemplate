<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contact Manager</title>
</head>
<body>
<div align="center">
    <h1>Contact List</h1>
    <h3> <a href="newContact">New Contact</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>No</th>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Action</th>
        </tr>
        <#list contacts as contact>
            <tr>
                <td>${contact.id}</td>
                <td>${contact.name}</td>
                <td>${contact.email}</td>
                <td>${contact.address}</td>
                <td>${contact.phone}</td>
                    <td>
                        <a href="/edit/${contact.id}">Edit</a>
                        <a href="/delete/${contact.id}">Delete</a>
                    </td>
            </tr>
        </#list>
    </table>
</div>
</body>
</html>