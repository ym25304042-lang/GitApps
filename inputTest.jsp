<%@ page contentType="text/html; charset=utf-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <title>所在確認</title>
    </head>
    <body>
        <h1>名前と国籍を入力してください</h1>
        <form method="post" action="/GitApps/test">
            ユーザー名<input type="text" name="name"><br>
            国籍　　　<input type="text" name="nationality"><br>
            <input type="submit" value="登録ボタン" />
        </form>
    </body>
</html>