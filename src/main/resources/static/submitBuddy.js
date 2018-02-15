jQuery(document).ready(function($) {
    $("#buddyForm").submit(function(event) {

        // Prevent the form from submitting via the browser.
        event.preventDefault();
        searchAjax();

    });
});

function searchAjax() {
    var data = {}
    data["name"] = $("#name").val();
    data["address"] = $("#address").val();
    data["phoneNumber"] = $("#phoneNumber").val();
    data["landLine"] = $("#landLine").val();

    $.ajax({
        type : "POST",
        contentType : "application/json",
        url : "/buddies",
        data : JSON.stringify(data),
        dataType : 'json',
        timeout : 100000,
        success : function(data) {
            console.log("SUCCESS: ", data);
            $("success").append("SUCCESS buddy added");
        },
        error : function(e) {
            console.log("ERROR: ", e);
        },
        done : function(e) {
            console.log("DONE");
        }
    });
}