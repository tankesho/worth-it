$(function() {
    $("#form").validate({
        rules: {
            review: {
                required:true
            },
            "user-name": {
                required:true
            },
            "product-name": {
                required:true
            }
        }
    })
})