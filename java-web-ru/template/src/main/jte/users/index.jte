@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
    <head>
        <meta charset="utf-8" />
        <title>Пользователи</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" />
    </head>
    <body>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Имя</th>
                    <th>Фамилия</th>
                    <th>Email</th>
                </tr>
            </thead>
            <tbody>
                @for(var user : page.getUsers())
                    <tr>
                        <td>${user.getId()}</td>
                        <td><a href="/users/${user.getId()}">${user.getFirstName()}</a></td>
                        <td>${user.getLastName()}</td>
                        <td>${user.getEmail()}</td>
                    </tr>
                @endfor
            </tbody>
        </table>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
    </body>
</html>
