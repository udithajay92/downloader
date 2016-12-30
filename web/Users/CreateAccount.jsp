<%-- 
    Document   : CreateAccount
    Created on : Jul 2, 2016, 10:18:27 AM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create your Account</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        <link href="../css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <script type="text/javascript">
    function confirmPassword() {
        var password = document.getElementById("txtPassword").value;
        var password_confirm = document.getElementById("txtReEnterPassword").value;
        if(password !== password_confirm) {
            alert('Password Not Matching!');
            document.getElementById("txtPassword").value = "";
            document.getElementById("txtReEnterPassword").value = "";
        }
    }
    </script>
    
    </head>
    <body>
        <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="../Downloader.jsp">Downloader</a>
    </div>

    <div class="nav navbar-nav navbar-right" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav" >
          <li><a href="../Downloader.jsp">Home</a></li>
          <li><a href="../DownloaderSpecialist.jsp?id=1">Movies</a></li>
          <li><a href="../DownloaderSpecialist.jsp?id=2">TV Shows</a></li>
    </div>
  </div>
</nav>
        
         <%-- End of Navigationbar --%>
 
 
 <%-- 
    create account
--%>
<div class="container text-left">    

  <div class="row">
    <div class="col-sm-12 well">

        <form name="RegisterUser" action="../RegisterUser" method="post" class="form-horizontal">
            <h2>Register</h2>
            <fieldset>
                <h3>Account Details</h3>
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Username</label>
                    <div class="col-lg-4">
                        <input type="text" class="form-control" name="txtUserName" id="txtUserName" placeholder="Username">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Email</label>
                    <div class="col-lg-4">
                        <input type="text" class="form-control" name="txtEmail" id="txtEmail" placeholder="Email">
                    </div>
                </div>
                
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Password</label>
                    <div class="col-lg-4">
                        <input type="password" class="form-control" id="txtPassword" name="txtPassword"  placeholder="password">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Re-enter Password</label>
                    <div class="col-lg-4">
                        <input type="password" class="form-control" id="txtReEnterPassword" name="txtReEnterPassword"  placeholder="Re-enter Password" onblur="confirmPassword()">
                    </div>
                </div>
            </fieldset>
            
            <fieldset>
                <h3>Personal Details</h3>
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">First Name</label>
                    <div class="col-lg-6">
                        <input type="text" class="form-control" id="txtFirstName" name="txtFirstName"  placeholder="First Name">
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">Last Name</label>
                    <div class="col-lg-6">
                        <input type="text" class="form-control" id="txtLastName" name="txtLastName"  placeholder="Last Name">
                    </div>
                </div>
                <div class="form-group">
                    <label for="select" class="col-lg-2 control-label">Date of Birth</label>
                    <div class="col-sm-1">
                      <select class="form-control" id="selectDobDate" name="selectDobDate">
                        <option value="1">01
                        </option>
                        <option value="2">02
                        </option>
                        <option value="3">03
                        </option>
                        <option value="4">04
                        </option>
                        <option value="5">05
                        </option>
                        <option value="6">06
                        </option>
                        <option value="7">07
                        </option>
                        <option value="8">08
                        </option>
                        <option value="9">09
                        </option>
                        <option value="10">10
                        </option>
                        <option value="11">11
                        </option>
                        <option value="12">12
                        </option>
                        <option value="13">13
                        </option>
                        <option value="14">14
                        </option>
                        <option value="15">15
                        </option>
                        <option value="16">16
                        </option>
                        <option value="17">17
                        </option>
                        <option value="18">18
                        </option>
                        <option value="19">19
                        </option>
                        <option value="20">20
                        </option>
                        <option value="21">21
                        </option>
                        <option value="22">22
                        </option>
                        <option value="23">23
                        </option>
                        <option value="24">24
                        </option>
                        <option value="25">25
                        </option>
                        <option value="26">26
                        </option>
                        <option value="27">27
                        </option>
                        <option value="28">28
                        </option>
                        <option value="29">29
                        </option>
                        <option value="30">30
                        </option>
                        <option value="31">31
                        </option>
                      </select>
                    </div>
                    <div class="col-sm-2">
                      <select class="form-control" id="selectDobMonth" name="selectDobMonth">
                        <option value="1">January
                        </option>
                        <option value="2">February
                        </option>
                        <option value="3">March
                        </option>
                        <option value="4">April
                        </option>
                        <option value="5">May
                        </option>
                        <option value="6">June
                        </option>
                        <option value="7">July
                        </option>
                        <option value="8">August
                        </option>
                        <option value="9">September
                        </option>
                        <option value="10">October
                        </option>
                        <option value="11">November
                        </option>
                        <option value="12">December
                        </option>
                      </select>
                    </div>
                    <div class="col-sm-2">
                        <input class="form-control" type="text" id="txtDobYear" name="txtDobYear" size="4" maxlength="4"/>
                    </div>
                </div>
                <div class="form-group">
                    <label class="col-lg-2 control-label">Gender</label>
                    <div class="col-lg-10">
                      <div class="radio">
                        <label>
                          <input type="radio" name="optionsRadios" id="radioMale" value="Male" checked="">
                          Male
                        </label>
                      </div>
                      <div class="radio">
                        <label>
                          <input type="radio" name="optionsRadios" id="radioFemale" value="Female">
                          Female
                        </label>
                      </div>
                </div>
              </div>
            </fieldset>
            
            <fieldset>
                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                      <button type="reset" class="btn btn-default">Cancel</button>
                      <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </fieldset>
        </form>
        
    </div>
  </div>
</div>
    </body>
</html>
