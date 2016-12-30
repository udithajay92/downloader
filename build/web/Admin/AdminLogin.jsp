<%-- 
    Document   : AdminLogin
    Created on : Jul 30, 2016, 3:11:13 PM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        
        
        
        <link href="../css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/dashboard/simple-sidebar.css" rel="stylesheet" type="text/css"/>

        <script src="../js/bootstrap.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.0.0.min.js" type="text/javascript"></script>
        
        <script src="../js/AdminLogin.js" type="text/javascript"></script>
        
    </head>
    <body style="text-align: center">
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12"></div>
                    <div class="col-lg-12">
                        
                        <div>
                            <div class="form-horizontal">
                                <h3>Login</h3>

                                <fieldset>
                                    <div class="form-group" style="width: 20%;margin: 0 auto; ">  
                                        <div>
                                            <input type="text" class="form-control" id="txtUserName" name="txtUserName"  placeholder="Username">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group" style="width: 20%;margin: 0 auto; ">
                                        <div>
                                            <input type="password" class="form-control" id="txtPassword" name="txtPassword"  placeholder="Password">
                                        </div>
                                    </div>
                                    </br>
                                    <div class="form-group" style="margin: 0 auto; ">
                                        <div>
                                          <button id="btnLogin" class="btn btn-primary" style="width: 10%">Login</button>
                                        </div>
                                    </div>
                                    </br>
                                    <div class="form-group" style="margin: 0 auto; ">
                                        <div>
                                          <label id="lblWarning"></label>
                                        </div>
                                    </div>
                                </fieldset>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
                            

    </body>
</html>
