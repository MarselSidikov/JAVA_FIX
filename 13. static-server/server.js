// подключаем библиотеки
let express = require('express');
let cookieParser = require('cookie-parser');
// создаем экземпляр express-сервера
let app = express();
// испольузем куки-парсер
app.use(cookieParser());
// если пользователь запросил страницу user.html
app.get('/users.html', function(req, res, next) {
    // смотрим, есть ли в куках токен
    // если токена нет - редиректим на логин
    let token = req.cookies['Auth-Token'];
    if (!req.cookies['Auth-Token']) {
        res.redirect('/login.html')
    }
    next();
});
// раздаем папку public
app.use(express.static('public'));
// говорим, что приложение должно запуститься
// на 80-м порту
app.listen(80);
console.log("StaticServer started...");