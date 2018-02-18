$(document).ready(function() {

    var role2 = $("#userRole").text();
    var myElement = document.getElementsByClassName("navBarList");

    if(role2.includes("ADMIN") || role2.includes("USER")){
        for (var i = 0; i < myElement.length; i++){
            myElement[i].style.visibility = "visible";
        }
    }
    else{
        for (var i = 0; i < myElement.length; i++){
            myElement[i].style.visibility = "hidden";
        }
    }

});

