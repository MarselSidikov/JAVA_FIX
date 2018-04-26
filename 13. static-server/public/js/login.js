function login(login, password) {
    var json = '{ "login": "' + login + '" ,"password":"' + password + '"}';
    console.log(json);
    $.ajax({
        url: 'http://localhost:8080/login',
        type: 'post',
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        data: json,
        success: function (data, textStatus, request) {
            token = data["value"];
            document.cookie = "Auth-Token=" + token;
            if (token !== null) {
                window.location = '/users.html';
            }
        }
    })
}