<%-- 
    Document   : Downloader
    Created on : Jul 2, 2016, 9:05:11 AM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="/PageLoad" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Downloader</title>
        <link href="css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="css/navbar_style.css" rel="stylesheet" type="text/css"/>
        <link href="css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <link href="css/slider/js-image-slider.css" rel="stylesheet" type="text/css"/>
        
        <script src="js/jquery.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        
        <script src="js/jquery-3.0.0.min.js" type="text/javascript"></script>

        <script src="js/Downloader.js" type="text/javascript"></script>
        
        <script src="js/slider/js-image-slider.js" type="text/javascript"></script>

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
      
      
      <div class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" id="txtSearch" placeholder="Search" autocomplete="off" style="width: 400px">
        </div>
        <button id="btnSearch" class="btn btn-default" style="width: 120px">Search</button>
      </div>
      
      
      
    <div class="nav navbar-nav navbar-right" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav" >
          <li><a href="Downloader.jsp">Home</a></li>
          <li><a href="DownloaderSpecialist.jsp?id=1">Movies</a></li>
          <li><a href="DownloaderSpecialist.jsp?id=2">TV Shows</a></li>
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
            <li id="liUsername"><a href="Users/UpdateDetails.jsp"><span id="username"></span></a></li>
      
            <li class="dropdown" id="liLogOut">
          <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">              
                <li>
                    <form name="LogOut" action="LogOut" method="post">
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
         
         <%-- Start of Sliderr--%>   
         
         
         <div id="sliderFrame">
        <div id="slider">
            <a class="lazyImage" href="images/slider/image-slider-1.jpg" title="Pure Javascript. No jQuery. No flash."></a>
            <a class="lazyImage" href="images/slider/image-slider-2.jpg" title="Pure Javascript. No jQuery. No flash."></a>
            <a class="lazyImage" href="images/slider/image-slider-3.jpg" title="Pure Javascript. No jQuery. No flash."></a>
            <a class="lazyImage" href="images/slider/image-slider-4.jpg" title="Pure Javascript. No jQuery. No flash."></a>
            <a class="lazyImage" href="images/slider/image-slider-5.jpg" title="#htmlcaption5"></a>
            <a class="lazyImage" href="images/slider/image-slider-1.jpg" title="Light weight Image Slider"></a>
            <a class="lazyImage" href="images/slider/image-slider-2.jpg" title="Fine tuned. Sleek & Smooth"></a>
            <a class="lazyImage" href="images/slider/image-slider-3.jpg" title="Easy-to-Use Slider"></a>
        </div>
        
                
        <!--thumbnails-->
        <div id="thumbs">
            <div class="thumb"><img src="images/slider/thumb1.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb2.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb3.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb4.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb5.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb1.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb2.jpg" /></div>
            <div class="thumb"><img src="images/slider/thumb3.jpg" /></div>
        </div>
    </div>

          <%-- End of Sliderr--%>   
          
          
          <%-- Start of Data Table--%> 
         
          </br></br>
        <div class="container text-left">    

          <div class="row">
            <div class="col-md-push-12 well">
                <div id="downloaderTable"></div>
            </div>
          </div>
        </div>
        
         <%-- End of Data Table--%> 
        
        
        
        
    </body>
</html>
