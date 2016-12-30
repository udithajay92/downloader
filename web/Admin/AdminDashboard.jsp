<%-- 
    Document   : AdminDashboard
    Created on : Jul 23, 2016, 12:13:46 PM
    Author     : Uditha Jay
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Dashboard</title>
        
        <link href="../css/bootstrap-slate.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/downloader.css" rel="stylesheet" type="text/css"/>
        
        <link href="../css/dashboard/simple-sidebar.css" rel="stylesheet" type="text/css"/>
        
        <script src="../js/bootstrap.js" type="text/javascript"></script>
        <script src="../js/bootstrap.min.js" type="text/javascript"></script>
        <script src="../js/jquery.min.js" type="text/javascript"></script>
        <script src="../js/jquery-3.0.0.min.js" type="text/javascript"></script>
        
        <script src="../js/dashboard/jquery.js" type="text/javascript"></script>
        
        <script src="../js/AdminDataRetiever.js" type="text/javascript"></script>
        <script src="../js/AdminDataSet.js" type="text/javascript"></script>
        <script src="../js/Admin.js" type="text/javascript"></script>
        
        <script src="../js/validation.js" type="text/javascript"></script>
        
    </head>
    <body>
        <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li class="sidebar-brand">
                    <a href="#">
                        Admin Dashboard
                    </a>
                </li>
                <li>
                    <a href="#" id="a1">Add Item</a>
                </li>
                <li>
                    <a href="#" id="a2">Add Subtitle</a>
                </li>
                <li>
                    <a href="#" id="a3">Providers</a>
                </li>
                <li>
                    <a href="#" id="a4">Quality Type</a>
                </li>
                <li>
                    <a href="#" id="a5">Subtitle Language</a>
                </li>
                <li>
                    <a href="#" id="a6">Log Out</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <a href="#menu-toggle" class="btn btn-default" id="menu-toggle" ><img src="../images/arrow_left.png" hight="20px" width="20px"></a>
                        <h1>Admin Dashboard</h1>
                        
                        <div id="addDownloaderItem">
                            <div class="form-horizontal">
                                <h3>Add Downloader Item</h3>

                                <fieldset>
                                    <div class="form-group">
                                        <label for="inputEmail" class="col-lg-2 control-label">Downloader Name</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtDownloaderName" name="txtDownloaderName"  placeholder="Downloader Name">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="inputEmail" class="col-lg-2 control-label">File Size</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtFileSize" name="txtFileSize"  placeholder="File Size">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="inputEmail" class="col-lg-2 control-label">Download Link</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtDownloadLink" name="txtDownloadLink"  placeholder="Download Link">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Downloader Type</label>
                                        <div class="col-lg-10">
                                          <div class="radio">
                                            <label>
                                              <input type="radio" name="optionsRadios" id="optionsRadiosMovie" value="Movie" checked="">
                                              Movie
                                            </label>
                                          </div>
                                          <div class="radio">
                                            <label>
                                              <input type="radio" name="optionsRadios" id="optionsRadiosTV" value="TV">
                                              TV Show
                                            </label>
                                          </div>
                                        </div>
                                    </div>

                                    <div class="form-group">
                                        <label class="col-sm-4 control-label"><input type="checkbox" id="chkActive" checked="true"> Is Active </label>
                                        <label class="col-sm-2 control-label"><input type="checkbox" id="chkVerified" checked="true"> Is Verified </label>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="IMDBID" class="col-lg-2 control-label">IMDB ID</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtImdbId" name="txtImdbId"  placeholder="IMDB ID" style="width:250px">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Provider</label>
                                        <div class="col-lg-10">
                                            <select name="drpProvider" id="drpProvider" class="form-control" style="width:250px">
                                                
                                            </select>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Quality</label>
                                        <div class="col-lg-10">
                                            <select name="drpQuality" id="drpQuality" class="form-control" style="width:250px">
              
                                            </select>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Subtitle Language</label>
                                        <div class="col-lg-10">
                                            <select name="drpSubtitleLanguage" id="drpSubtitleLanguage" class="form-control" style="width:250px">
                                                
                                            </select>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="inputEmail" class="col-lg-2 control-label">Subtitle Link</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtSubtitleLink" name="txtSubtitleLink"  placeholder="Subtitle Link">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                          <!--<button type="reset" class="btn btn-default">Cancel</button>-->
                                          <button id="btnSubmitDownloaderItem" class="btn btn-primary">Submit</button>
                                          <label id="lblWarning"></label>
                                        </div>
                                    </div>
                                    
                                </fieldset>
                            </div>
                        </div>
                        
                        
                        <div id="addSubtitle">
                            <div class="form-horizontal">
                                <h3>Add Subtitle</h3>
                                
                                <fieldset>
                                    <div class="form-group">
                                        <label for="SearchDownloader" class="col-lg-2 control-label">Search Downloader</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtKeywordSubtitle" name="txtKeywordSubtitle"  placeholder="Search Downloader">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label">Downloader Type</label>
                                        <div class="col-lg-10">
                                          <div class="radio">
                                            <label>
                                              <input type="radio" name="optionsRadiosSubtitle" id="optionsRadiosMovieSubtitle" value="Movie" checked="">
                                              Movie
                                            </label>
                                          </div>
                                          <div class="radio">
                                            <label>
                                              <input type="radio" name="optionsRadiosSubtitle" id="optionsRadiosTVSubtitle" value="TV">
                                              TV Show
                                            </label>
                                          </div>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                          <button id="btnSearchDownloaderItemSubtitle" class="btn btn-primary">Search</button>
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                          <div id="downloaderTable"></div>
                                        </div>
                                    </div>
                                    
                                    
                                    <div id="addSubtitleFor">
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"></label>
                                            <label id="downloaderIdSubtitle" style="display: none"></label>
                                            <h4 class="col-lg-4 control-label" id="downloaderNameSubtitle"></h4>
                                            
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"></label>
                                            <label class="col-lg-2 control-label">Subtitle Language</label>
                                            <div class="col-lg-8">
                                                <select name="drpSubtitleLanguageSubtitle" id="drpSubtitleLanguageSubtitle" class="form-control" style="width:250px">

                                                </select>
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-lg-2 control-label"></label>
                                            <label for="inputEmail" class="col-lg-2 control-label">Subtitle Link</label>
                                            <div class="col-lg-6">
                                                <input type="text" class="form-control" id="txtSubtitleLinkSubtitle" name="txtSubtitleLinkSubtitle"  placeholder="Subtitle Link">
                                            </div>
                                        </div>
                                        
                                        <div class="form-group">
                                            <label class="col-lg-5 control-label"></label>
                                            <!--<div class="col-lg-10 col-lg-offset-2">-->
                                                <!--<button type="reset" class="btn btn-default">Cancel</button>-->
                                                <button id="btnSubmitDownloaderItemSubtitle" class="btn btn-primary" style="width:150px">Submit</button>
                                                <label id="lblWarning2"></label>
                                            <!--</div>-->
                                        </div>
                                        
                                    
                                    </div>
                                    
                                </fieldset>
                            </div>
                        </div>
                        
                        
                        
                        <div id="providers">
                            <div class="form-horizontal">
                                <h3>Add Providers</h3>
                                
                                <fieldset>
                                    <div class="form-group">
                                        <label for="ProviderName" class="col-lg-2 control-label">Provider Name</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtProviderName" name="txtProviderName"  placeholder="Provider Name">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="SearchDownloader" class="col-lg-2 control-label">Provider Description</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtProviderDescription" name="txtProviderDescription"  placeholder="Provider Description">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                          <!--<button type="reset" class="btn btn-default">Cancel</button>-->
                                          <button id="btnSubmitProvider" class="btn btn-primary">Submit</button>
                                          <label id="lblWarningProvider"></label>
                                        </div>
                                    </div>
                                      
                                </fieldset>
                            </div>
                            
                            <div class="form-horizontal">
                                <h3>Available Providers</h3>
                                <div class="form-group">
                                    <fieldset>
                                        <label class="col-lg-2 control-label"></label>
                                        <div id="tableAvailableProviders"></div>
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                        
                        <div id="qualityType">
                            <div class="form-horizontal">
                                <h3>Add Quality Types</h3>
                                
                                <fieldset>
                                    <div class="form-group">
                                        <label for="QualityTypee" class="col-lg-2 control-label">Quality Type</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtQualityType" name="txtQualityType"  placeholder="Quality Type">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="QualityTypeDescription" class="col-lg-2 control-label">Quality Type Description</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtQualityTypeDescription" name="txtQualityTypeDescription"  placeholder="Quality Type Description">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                          <!--<button type="reset" class="btn btn-default">Cancel</button>-->
                                          <button id="btnSubmitQuality" class="btn btn-primary">Submit</button>
                                          <label id="lblWarningQuality"></label>
                                        </div>
                                    </div>
                                      
                                </fieldset>
                            </div>
                            
                            <div class="form-horizontal">
                                <h3>Available Quality Types</h3>
                                <div class="form-group">
                                    <fieldset>
                                        <label class="col-lg-2 control-label"></label>
                                        <div id="tableAvailableQualityTypes"></div>
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                        
                        <div id="subtitleLanguage">
                            <div class="form-horizontal">
                                <h3>Add Subtitle Language</h3>
                                
                                <fieldset>
                                    <div class="form-group">
                                        <label for="SubtitleLanguage" class="col-lg-2 control-label">Subtitle Language</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtSubtitleLanguage" name="txtSubtitleLanguage"  placeholder="Subtitle Language">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <label for="SubtitleLanguageDescription" class="col-lg-2 control-label">Subtitle Language Description</label>
                                        <div class="col-lg-6">
                                            <input type="text" class="form-control" id="txtSubtitleLanguageDescription" name="txtSubtitleLanguageDescription"  placeholder="Subtitle Language Description">
                                        </div>
                                    </div>
                                    
                                    <div class="form-group">
                                        <div class="col-lg-10 col-lg-offset-2">
                                          <!--<button type="reset" class="btn btn-default">Cancel</button>-->
                                          <button id="btnSubmitSubtitleLanguage" class="btn btn-primary">Submit</button>
                                          <label id="lblWarningSubtitleLanguage"></label>
                                        </div>
                                    </div>
                                      
                                </fieldset>
                            </div>
                            
                            <div class="form-horizontal">
                                <h3>Available Subtitle Languages</h3>
                                <div class="form-group">
                                    <fieldset>
                                        <label class="col-lg-2 control-label"></label>
                                        <div id="tableAvailableSubtitleLanguages"></div>
                                    </fieldset>
                                </div>
                            </div>
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
    </script>
    </body>
</html>
