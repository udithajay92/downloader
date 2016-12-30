<%-- 
    Document   : UpdateDetails
    Created on : Jul 17, 2016, 10:58:20 AM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update your Account</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        <link href="../css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.0.0.min.js" type="text/javascript"></script>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        
        <script src="../js/UpdateDetails.js" type="text/javascript"></script>
        
        <script type="text/javascript">
    function confirmPassword() {
        var password = document.getElementById("txtPassword2").value;
        var password_confirm = document.getElementById("txtReEnterPassword").value;
        alert("p " + password + " rp " + password_confirm);
        if(password !== password_confirm) {
            //alert('Password Not Matching!');
            document.getElementById("lblWarning").setAttribute("Style", "color:red");
            document.getElementById("lblWarning").textContent="Passwords you entered doesn't match.";
            document.getElementById("txtPassword").value = "";
            document.getElementById("txtReEnterPassword").value = "";
            document.getElementById("txtCurrentPassword").value = "";
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
        <li class="dropdown" id="liCreateAccount">
          <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Login / Create Account <span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">
              <form name="LoginUser" action="LoginUser" method="post">
                    <li><table class="table table-striped table-hover ">
                          <tr>
                              <td>
                                    Username</li>
                              </td>
                              <td>
                                    <input class="form-control input-sm" type="text" name="txtUsernameORemail" id="txtUsernameORemail">
                              </td>
                          </tr>
                      </table>
                    </li>
                    <li><table class="table table-striped table-hover ">
                          <tr>
                              <td>
                                    Password</li>
                              </td>
                              <td>
                                    <input class="form-control input-sm" type="password" name="txtPassword" id="txtPassword">
                              </td>
                          </tr>
                      </table>
                    </li>
                <li>
                    <Button type="submit" class="btn btn-default" style="width:180px;">Login</Button>
                </li>
                </form>
                <li> <br></li>
                <li>
                    <a href="Users/CreateAccount.jsp" class="btn btn-default">Create Account</a>
                </li>
          </ul>
        </li>
            <li id="liUsername"><a href="UpdateDetails.jsp"><span id="username"></span></a></li>
      
            <li class="dropdown" id="liLogOut">
          <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">              
                <li>
                    <form name="LogOut" action="../LogOut" method="post">
                        <Button type="submit" class="btn btn-default" style="width:180px;">Log Out</Button>
                    </form>
                </li>
          </ul>
        </li>
      </ul>

        
        
    </div>
  </div>
</nav>
          
         <%-- End of Navigation Bar--%>   
 
 
 <%-- 
    create account
--%>
<div class="container text-left">    

  <div class="row">
    <div class="col-sm-12 well">

        <div class="form-horizontal">
            <h2>Update Your Account</h2>
            <fieldset>
                <h3>Change Password</h3>
                <div class="form-group">
                    <label for="currentPassword" class="col-lg-2 control-label">Current Password</label>
                    <div class="col-lg-4">
                        <input type="password" class="form-control" id="txtCurrentPassword" name="txtCurrentPassword"  placeholder="Current Password">
                    </div>
                </div>                
                <div class="form-group">
                    <label for="inputEmail" class="col-lg-2 control-label">New Password</label>
                    <div class="col-lg-4">
                        <input type="password" class="form-control" id="txtPassword2" name="txtPassword"  placeholder="New Password">
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
                <div class="form-group">
                    <div class="col-lg-10 col-lg-offset-2">
                      <button id="btnUpdatePassword" class="btn btn-primary">Update Password</button>
                      <label  id="lblWarning"></label>
                    </div>
                </div>
            </fieldset>
            
            </br>
            
            <fieldset>
                <h3>Change Personal Details</h3>
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
                        <option value="01">01
                        </option>
                        <option value="02">02
                        </option>
                        <option value="03">03
                        </option>
                        <option value="04">04
                        </option>
                        <option value="05">05
                        </option>
                        <option value="06">06
                        </option>
                        <option value="07">07
                        </option>
                        <option value="08">08
                        </option>
                        <option value="09">09
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
                        <option value="01">January
                        </option>
                        <option value="02">February
                        </option>
                        <option value="03">March
                        </option>
                        <option value="04">April
                        </option>
                        <option value="05">May
                        </option>
                        <option value="06">June
                        </option>
                        <option value="07">July
                        </option>
                        <option value="08">August
                        </option>
                        <option value="09">September
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
                      <button id="btnUpdateDetails" class="btn btn-primary">Update Personal Details</button>
                       <label  id="lblWarning2"></label>
                    </div>
                </div>
            </fieldset>
        </div>
        
    </div>
  </div>
</div>
    </body>
</html>

