/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    $("#btnLogin").click(function(){
        var username = $("#txtUserName").val();
        var password = $("#txtPassword").val();
    
        if(username === null || username === "" ||
            password === null || password === "" ){
        
        $("#lblWarning").text("Please enter a username and a password to continue.");
        $("#lblWarning").css("color", "red");
    }
    else{
        $.ajax({
                    url: '../AdminLogin',
                    data:{username:username,                   
                    password:password},         
                    type: 'post',
                    dataType: 'text',
                    success: function(data) {
                        var success = data;
                        //alert(success);
                            if(success === "null" || success === ""){
                                //$.session.set("adminUser", "0");
                                $("#lblWarning").text("Your username and pasword is not matching.");
                                $("#lblWarning").css("color", "red");
                                localStorage['loggedIn'] = "no";
                            }
                            else{
                                localStorage['loggedIn'] = "yes";
                                //$.session.set("adminUser", "1");
                                window.location.replace("AdminDashboard.jsp"); 
                            }
                       }

        });
    }
    });
});

