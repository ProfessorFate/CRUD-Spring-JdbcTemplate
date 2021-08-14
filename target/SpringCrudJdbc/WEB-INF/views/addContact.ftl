<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>New Contact</title>
</head>
<body>
<div align="center">
    <h1>New Contact</h1>
    <form name="contact" action="/newContact" method="post">
        <table cellpadding="5">
        <tr>
            <td>Name:</td>
            <td><input title="name" type=text" name="name"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input title="email" type="text" name="email"></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><input title="address" type="text" name="address"></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><input title="phone" type="text" name="phone"></td>
        </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>