function getUsers() {
    $.ajax({
        url: 'http://localhost:8080' + '/users?token=' + getCookie("Auth-Token"),
        type: 'get',
        success: function (data, textStatus, request) {
            const table = document.getElementById("users_table");
            for (let i = 0; i < data.length; i++) {
                let row = table.insertRow(i + 1);
                const cellId = row.insertCell(0);
                const cellLogin = row.insertCell(1);
                cellId.innerHTML = data[i]["id"];
                cellLogin.innerHTML = data[i]["login"];
            }
        }
    })
}

function getCookie(name) {
    let matches = document.cookie.match(new RegExp(
        "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
    ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
}