@import gg.jte.Content
@param Content content

<!doctype html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <title>Layout assignment</title>
    </head>
    <body>
        <header>
            <ul>
                <li><a href="/">Main page</a></li>
                <li><a href="/users">Users</a></li>
            </ul>
        </header>
        ${content}
        <footer>
            <h3>That's all, folks</h3>
        </footer>
    </body>
</html>