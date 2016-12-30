/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () { 
    $.ajax({
            url: '../ValidateUser',
            type: 'post',
            dataType: 'text',
            success: function(data) {
                   var post=data;
                    //$("#username").append('<p>'+post+'</p>');
                    document.getElementById("username").textContent=post;
                  pass=data;
                  //alert(pass);
                  setAttributes(pass);
               }
            
        });
        
    geUserDetails();
    
    $('#btnUpdatePassword').click(function () {
            updatePassword();
    });
    $('#btnUpdateDetails').click(function () {
            updateUserDetails();
    });
});

function updatePassword(){
    var currentPassword = document.getElementById("txtCurrentPassword").value;
    var newPassword = document.getElementById("txtPassword2").value;
    var reEnterNewPassword = document.getElementById("txtReEnterPassword").value;
    
    //alert(currentPassword+newPassword+reEnterNewPassword);
    if(currentPassword === null || currentPassword === "" || newPassword === null || newPassword === "" || reEnterNewPassword === null || reEnterNewPassword === ""){
        alert(currentPassword+newPassword+reEnterNewPassword);document.getElementById("lblWarning").setAttribute("Style", "color:red");
        document.getElementById("lblWarning").textContent="Enter a pasword to continue.";  
        
        document.getElementById("txtPassword2").value = "";
        document.getElementById("txtReEnterPassword").value = "";
        document.getElementById("txtCurrentPassword").value = "";
    }
    else{
        $.ajax({
            url: '../UpdateUserDetails',
            data:{currentPassword:currentPassword, newPassword:newPassword, update:0},
            type: 'post',
            dataType: 'text',
            success: function(data) {
                   var post=data;
                    //alert(post);
                    if(post === "1"){
                        document.getElementById("lblWarning").setAttribute("Style", "color:green");
                        document.getElementById("lblWarning").textContent="Password changed Successfully";
                    }
                    else{
                        document.getElementById("lblWarning").setAttribute("Style", "color:red");
                        document.getElementById("lblWarning").textContent="Update Fail. Enter a Correct Password";
                    }
                    document.getElementById("txtPassword2").value = "";
                    document.getElementById("txtReEnterPassword").value = "";
                    document.getElementById("txtCurrentPassword").value = "";
                    
               }
            
        });
    }
    
}


function geUserDetails(){
    $.ajax({
            url: '../UpdateUserDetails',
            type: 'get',
            dataType: 'json',
            success: function(data) {
                   var post=data[0];
                    //alert(post['dw_dob']);
                    
                    document.getElementById("txtFirstName").value = post['dw_first_name'];
                    document.getElementById("txtLastName").value = post['dw_last_name'];
                    
                    if(post['dw_gender'] === "Male"){
                        document.getElementById("radioMale").checked=true;
                    }
                    else{
                        document.getElementById("radioFemale").checked=true;
                    }
                    
                    var dob = post['dw_dob'].toString();
                    var dobSplit = dob.split("/");

                    document.getElementById("selectDobDate").value = dobSplit[0];
                    document.getElementById("selectDobMonth").value = dobSplit[1];
                    document.getElementById("txtDobYear").value = dobSplit[2];
                    
               }
            
        });
}

function updateUserDetails(){
    var firstName = document.getElementById("txtFirstName").value;
    var lastName = document.getElementById("txtLastName").value;
    var dob = document.getElementById("selectDobDate").value + "/" + document.getElementById("selectDobMonth").value + "/" + document.getElementById("txtDobYear").value;
    var gender;
    
    if(document.getElementById("radioMale").checked===true){
        gender="Male";
    }
    else{
        gender="Female";
    }
    
    if(firstName===null || firstName==="" || lastName===null || lastName==="" || document.getElementById("txtDobYear").value===null || document.getElementById("txtDobYear").value==="" ){
        document.getElementById("lblWarning2").setAttribute("Style", "color:red");
        document.getElementById("lblWarning2").textContent="Please fill all mandatory fields.";
    }
    else{
        $.ajax({
                url: '../UpdateUserDetails',
                data:{firstName:firstName, lastName:lastName, dob:dob, gender:gender, update:1},
                type: 'post',
                dataType: 'text',
                success: function(data) {
                       var post=data;

                        if(post === "1"){
                            document.getElementById("lblWarning2").setAttribute("Style", "color:green");
                            document.getElementById("lblWarning2").textContent="Details updated Successfully";
                        }
                        else{
                            document.getElementById("lblWarning2").setAttribute("Style", "color:red");
                            document.getElementById("lblWarning2").textContent="Update Fail.";
                        }

                        
                   }

            });
    }
    geUserDetails();
}


function setAttributes(pass) {
            if(pass === "1" || pass === "null"){
                document.getElementById("liUsername").style.display="none";
                document.getElementById("liCreateAccount").style.display="block";
                document.getElementById("liLogOut").style.display="none";
                //alert(pass + " if");
            }
            else{
                document.getElementById("liUsername").style.display="block";
                document.getElementById("liCreateAccount").style.display="none";
                document.getElementById("liLogOut").style.display="block";
                //alert(pass + " else");
            }
 }