<%-- 
    Document   : Details
    Created on : Jul 9, 2016, 6:26:05 PM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Downloader Details</title>
        
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/navbar_style.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/tabView/tab.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/widget/pieChartWiget.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/glyph/icon.css" rel="stylesheet" type="text/css"/>
        
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.0.0.min.js" type="text/javascript"></script>
        <script src="../js/getUrlParameter.js" type="text/javascript"></script>
        <script src="../js/Details.js" type="text/javascript"></script>
        
        <script src="../js/tabView/tab.js" type="text/javascript"></script>
        
        <script src="../js/widget/pieChartWidget.js" type="text/javascript"></script>
        
        <script src="../js/glyphs/lumino.glyphs.js" type="text/javascript"></script>
        
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
        
            <li id="liUsername"><a href="../Users/UpdateDetails.jsp"><span id="username"></span></a></li>
      
            <li class="dropdown">
          <a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="caret"></span></a>
          <ul class="dropdown-menu" role="menu">              
                <li>
                    <form name="LogOut" action="../LogOut" method="post">
                        <Button type="submit" class="btn btn-default">Log Out</Button>
                    </form>
                </li>
          </ul>
        </li>
      </ul>

        
        
    </div>
  </div>
</nav>
          
         <%-- End of Navigation Bar--%>    
         
         
         
         
         <%-- Start of Details View --%> 
 <div class="container text-left">    
    <div class="row">
       
            <table>
                <tr>
                    <td width="225" height="333" rowspan="7">
                        <img src="" width="225" height="333" alt="IMDBimage" id="image"/>
                    </td>
                    <td width="100"></td>
                    <td width="900" height="50" colspan="2">
                        <h1><span id="downloaderTitle" style="color: #19dcec"></span></h1>
                    </td>
                </tr>
                <tr>
                    <td></td>
                    <td width="100" height="50"></td>
                    <td></td>
                </tr>
                <tr>
                    <td></td>
                    <td width="100" height="25">Added Date</td>
                    <td id="downloaderAddedDate"></td>
                </tr>
                <tr>
                    <td></td>
                    <td width="100" height="25">Quality</td>
                    <td id="downloaderQuality"></td>
                </tr>
                
                <tr>
                    <td></td>
                    <td width="100" height="25">Provider</td>
                    <td id="downloaderProvider"></td>
                </tr>
               <tr>
                    <td></td>
                    <td width="100" height="25">File Size</td>
                    <td id="downloaderFileSize"></td>
                </tr>
                <tr>
                    <td></td>
                    <td width="100" height="25">Get Torrent</td>
                    <td><a id="downloaderTorrent" href="" download><img border="0" src="../images/Download_icon.png" alt="" width="25" height="17"></span></td>  
                </tr>
               
                
            </table>
        
    </div>
 </div>
        
 </br>
 
     <%-- Start of Tab View --%>    
     
    <div class="container text-left">    
        <div class="row">
            <ul class="tab">
                <li><a href="#" class="tablinks" onclick="tabFunction(event, 'IMDBDetails')">IMDB Details</a></li>
                <li><a href="#" class="tablinks" onclick="tabFunction(event, 'Subtitles')">Subtitles</a></li>
                <li><a href="#" class="tablinks" onclick="tabFunction(event, 'Comments')">Comments</a></li>
            </ul>

         
             <%-- Start of Rating View --%>  
            <div id="IMDBDetails" class="tabcontent">
                <h3 id="imdbTitle"></h3>

                <div class="row">
                    <div class="col-xs-5 col-md-4">                       
                        <div class="panel-body easypiechart-panel">
                            <h4>IMDB Ratings</h4>
                            <div class="easypiechart" id="easypiechart-blue" data-percent="100" ><span class="percent" id="imdbRating"></span>
                             </div>
                        </div>                   
                    </div>
                    
                    <div class="col-xs-5 col-md-4">                       
                        <div class="panel-body easypiechart-panel">
                            <h4>Metascore</h4>
                                <div class="easypiechart" id="easypiechart-teal" data-percent="100" ><span class="percent" id="imdbMetascoreRating"></span>
                                </div>
                        </div>                   
                    </div>
                   
                    <div class="col-xs-5 col-md-4">                       
                        <div class="panel-body easypiechart-panel">
                            <h4>IMDB Votes</h4>
                                <div class="easypiechart" id="easypiechart-orange" data-percent="100" ><span class="percent" id="imdbVotes"></span>
                                </div>
                        </div>                   
                    </div>
                </div>  
                <%-- End of Rating View --%>  
                
                
                
                <%-- Start of IMDB Detail View --%>  
                
                <div class="row">
                    
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Title</label>
                        <div id="imdbTitle2"></div>
                    </div>
                    <div class="form-group" id="season">
                        <label class="col-lg-2 control-label">Season</label>
                        <div id="imdbSeason"></div>
                    </div>
                    <div class="form-group" id="episode">
                        <label class="col-lg-2 control-label">Episode</label>
                        <div id="imdbEpisode"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Year</label>
                        <div id="imdbYear"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Released Date</label>
                        <div id="imdbReleasedDate"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Run Time</label>
                        <div id="imdbRunTime"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Genre</label>
                        <div id="imdbGenre"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Director</label>
                        <div id="imdbDirector"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Actors</label>
                        <div id="imdbActors"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Language</label>
                        <div id="imdbLanguage"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Rated</label>
                        <div id="imdbRated"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Country</label>
                        <div id="imdbCountry"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Writer</label>
                        <div id="imdbWriter"></div>
                    </div>
                    <div class="form-group">
                        <label class="col-lg-2 control-label">Plot</label>
                        <div class="col-lg-10 control-label" id="imdbPlot"></div>
                    </div>
                    
                </div>

            </div>
            <%-- End of IMDB Detail View --%>  
            
            
            <%-- Start of IMDB Subtitle View --%>  
            <div id="Subtitles" class="tabcontent">
              <h3>Available Subtitles</h3>
              <div id="subtitleTable"></div>
            </div>
            <%-- End of IMDB Subtitle View --%>  
            
            
            <%-- Start of Comment View --%>  
            <div id="Comments" class="tabcontent">
                
                <table>
                    <td style="width:150px"><label class="control-label">Add A comment :</label></td>
                    <td>                    
                        <input type="text" class="form-control" name="txtComment" id="txtComment" placeholder="Comment" style="width:700px;">
                    </td>
                    <td width="15px"></td>
                    <td>
                        <Button class="btn btn-default" id="btnSubmitComment" style="width:130px">Submit</Button>
                    </td>
                </table>
                </br>
                <div id="commentsTable"></div>
                
            </div>
            <%-- End of Comment View --%>  
        </div>
    </div>
        
       <%-- End of Tab View --%>    
      
       <div id="my"></div>
        
    </body>
</html>
