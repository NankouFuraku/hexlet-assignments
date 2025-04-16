@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
           <table>
                    <thead>
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                        </tr>
                    </thead>
                    <tbody>
                        @for(var user : page.getUsers())
                            <tr>
                                <td>${user.getFirstName()}</td>
                                <td>${user.getLastName()}</td>
                                <td>${user.getEmail()}</td>
                            </tr>
                        @endfor
                    </tbody>
                </table>
    `
)