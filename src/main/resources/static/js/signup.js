function signup() {
    var user = {
        userName : $('#userName').val(),
        userId : $('#userId').val(),
        password : $('#password').val()
    };

    $.ajax({
        url: '/signup',
        type: 'post',
        data: JSON.stringify(user),
        dataType: 'json',
        contentType: 'application/json; charset=utf-8'
    }).done(function () {
        $('#signUp').hide();
        $('#login').show();
    }).fail(function () {
        console.log('fail');
    });
}