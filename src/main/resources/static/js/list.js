list = {
    update : function () {

    },

    deleteById : function (id) {
        $.ajax({
            url: '/delete',
            type: 'delete',
            data: JSON.stringify(id),
            dataType: 'json',
            contentType: 'application/json; charset=utf-8'
        }).done(function () {
            location.reload();
        }).fail(function () {
            alert('Please try again');
        });
    }
}


function update() {
    list.update();
}

function deleteById(id) {
    list.deleteById(id);
}