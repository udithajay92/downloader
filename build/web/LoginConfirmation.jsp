<%-- 
    Document   : LoginConfirmation
    Created on : Jul 10, 2016, 9:34:43 AM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
        <link href="css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/navbar_style.css" rel="stylesheet" type="text/css"/>
        <link href="css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        
        <script src="js/jquery-3.0.0.min.js" type="text/javascript"></script>

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
      <a class="navbar-brand" href="Downloader.jsp">Downloader</a>
    </div>

    <div class="nav navbar-nav navbar-right" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav" >
          <li><a href="Downloader.jsp">Home</a></li>
          <li><a href="DownloaderSpecialist.jsp?id=1">Movies</a></li>
          <li><a href="DownloaderSpecialist.jsp?id=2">TV Shows</a></li>
    </div>
  </div>
</nav>
        
         <%-- End of Navigationbar --%>
         
         
         <%-- Start of Warning --%>
        
         <div class="col-sm-7 well col-centered" >
        <div class="alert alert-dismissible alert-warning">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <h4>Warning!</h4>
            <p>You are not logged in or the username and the password doesn't match.</p>
        </div>
         </div>
          
         <%-- End of Warning --%>
         
         <%-- Start of Login --%>
         
         <div class="container col-centered">    

            <div class="row" >
              <div class="col-sm-8 well col-centered" >
                  
                <fieldset>
                    <form name="RegisterUser" action="LoginUser" method="post" class="form-horizontal">
                        <h3>Login</h3>
                        <div class="form-group">
                            <label for="inputEmail" class="col-sm-4 control-label">Username or Email</label>
                            <div class="col-sm-4">
                                <input type="text" class="form-control" name="txtUsernameORemail" id="txtUsernameORemail" placeholder="Username">
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="inputEmail" class="col-sm-4 control-label">Password</label>
                            <div class="col-sm-4">
                                <input type="password" class="form-control" id="txtPassword" name="txtPassword"  placeholder="password">
                            </div>
                        </div>
                        
                        <div class="form-group">
                            <div class="col-sm-4 col-centered" style="width: 100px">
                                <Button type="submit" class="btn btn-default">Login</Button>
                            </div>
                        </div>
                    </form>
                </fieldset>
                  </br>
                  <fieldset>
                      <div class="form-group text-center"> 
                          <a href="#" >Forgot Password</a>
                      </div>
                      <div class="form-group text-center">
                          <a href="Users/CreateAccount.jsp">Don't have an Account?</a>
                  </fieldset>
                
              </div>
            </div>
        </div>
        
        <%-- End of Login --%>
        
    </body>
</html>
