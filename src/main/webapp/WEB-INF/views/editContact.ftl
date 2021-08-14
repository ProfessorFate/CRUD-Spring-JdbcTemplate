<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div align="center" >
    <h1>Edit Contact</h1>
    <form name="contact" action="/editContact" method="post">
        <table cellpadding="5">
            <tr>
                <td>Id:</td>
                <td><input title="id" type="text" name="id" value="${contact.id}"></td>
            </tr>
            <tr>
                <td>Name:</td>
                <td><input title="name" type="text" name="name" value="${contact.name}"></td>
            </tr>
            <tr>
            <td>Email:</td>
            <td><input title="email" type="text" name="email" value="${contact.email}"></td>
            </tr>
            <tr>
                <td>Address:</td>
                <td><input title="address" type="text" name="address" value="${contact.address}"> </td>
            </tr>
            <tr>
                <td>Phone:</td>
                <td><input title="phone" type="text" name="phone" value="${contact.phone}"> </td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>