/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(function () {
    //alert(getUrlParameter('id'));
    var downloaderid = getUrlParameter('id');

        $.ajax({
            url: '../ValidateUser',
            type: 'post',
            dataType: 'text',
            success: function(data) {
                   var post=data;
                    document.getElementById("username").textContent=post;
                        
                  pass=data;
                  //alert(pass);
                  if (data==="null" || data==="1"){
                      window.location = '../LoginConfirmation.jsp?returnUrl=' + downloaderid;
                  }
               }
            
        });
        
        
        
        /* $.ajax({
            url:'../DetailsData',
            data:{downloaderId:downloaderid},
            type:'get',
            cache:false,
            success:function(data){
               //alert(data);
               //$('#somediv').text(responseText); 
            },
            error:function(){
              alert('error');
            }
         }
    );*/
    
    /*$.ajax({
            url:'../IMDBData',
            data:{downloaderId:downloaderid},
            type:'get',
            cache:false,
            success:function(data){
               //alert(data);
               //$('#somediv').text(responseText); 
            },
            error:function(){
              alert('error');
            }
         }
    );*/
    
     /*$.ajax({
            url:'../SubtitleData',
            data:{downloaderId:downloaderid},
            type:'get',
            cache:false,
            success:function(data){
               //alert(data);
               //$('#somediv').text(responseText); 
            },
            error:function(){
              alert('error');
            }
         }
    );*/
    
    

        
        $.ajax({
            url: '../DetailsData',
            data:{downloaderId:downloaderid},
            type: 'post',
            dataType: 'json',
            success: function(data) {
                    var length = data.length;
                    //alert(length);
                        var post = data[0];
                        if(length <= 0){            //check whether the details of the requested id is available.
                            window.location = '../Downloader.jsp';
                        }
                        else{
                            document.getElementById('downloaderTitle').textContent=post['dw_downloader_display_name'];
                            document.getElementById('downloaderAddedDate').textContent=post['dw_downloader_inserted_date'];
                            document.getElementById('downloaderQuality').textContent=post['dw_quality_type_name'];
                            document.getElementById('downloaderProvider').textContent=post['dw_provider_name'];
                            document.getElementById('downloaderFileSize').textContent=post['dw_downloader_file_size'];
                            //document.getElementById('downloaderTorrent').textContent=post['dw_downloader_link'];
                            document.getElementById('downloaderTorrent').setAttribute("href",post['dw_downloader_link']);
                        }   
                
               }
            
        });
        
        $.ajax({
            url: '../IMDBData',
            data:{downloaderId:downloaderid},
            type: 'post',
            dataType: 'json',
            success: function(data) {
                   var post=data;
                        var post = data[0];
                        if(post['Type']==="movie"){
                            document.getElementById("season").style.display="none";  
                            document.getElementById("episode").style.display="none"; 
                        }
                        else{
                            document.getElementById("season").style.display="block";  
                            document.getElementById("episode").style.display="block"; 
                            
                            document.getElementById('imdbSeason').textContent=post['Season'];
                            document.getElementById('imdbEpisode').textContent=post['Episode'];
                        }
                        
                            document.getElementById('image').src=post['Poster'];
                            document.getElementById('imdbTitle').textContent=post['Title'] + " (" + post['Year'] + ")";
                            
                            document.getElementById('imdbRating').textContent=post['imdbRating']+"/10";
                            //document.getElementById('easypiechart-blue').setAttribute("data-percent",post['imdbRating']);
                            //$('#easypiechart-blue').attr('data-percent', '50');
                            
                            if(post['Metascore'] === "N/A"){
                                document.getElementById('imdbMetascoreRating').textContent=post['Metascore'];
                            }
                            else{
                                document.getElementById('imdbMetascoreRating').textContent=post['Metascore']+"%";
                            }
                            
                            document.getElementById('imdbVotes').textContent=post['imdbVotes'];                  
                            document.getElementById('imdbTitle2').textContent=post['Title'];                        
                            document.getElementById('imdbYear').textContent=post['Year'];                           
                            document.getElementById('imdbReleasedDate').textContent=post['Released'];                            
                            document.getElementById('imdbRunTime').textContent=post['Runtime'];  
                            document.getElementById('imdbGenre').textContent=post['Genre'];
                            document.getElementById('imdbDirector').textContent=post['Director']; 
                            document.getElementById('imdbActors').textContent=post['Actors'];
                            document.getElementById('imdbLanguage').textContent=post['Language'];
                            document.getElementById('imdbRated').textContent=post['Rated'];
                            document.getElementById('imdbCountry').textContent=post['Country']
                            document.getElementById('imdbWriter').textContent=post['Writer']
                            document.getElementById('imdbPlot').textContent=post['Plot'];
                            
               }
            
        });
        
        $.ajax({
            url: '../SubtitleData',  
            data:{downloaderId:downloaderid},
            type: 'post',
            dataType: 'json',
            success: function (data) {
                $('#subtitleTable').append('<table class="table table-striped table-hover" id="table1" style="width:80%; margin: 0 auto;"><thead><tr><th class="table-text-align-centre">Subtitle Language</th><th class="table-text-align-centre">Subtitle Description</th><th class="table-text-align-centre">Download</th></tr></thead><tbody class="table-hover"></tbody></table>');
                var length = data.length;
                for (i = 0; i < length; i++) {
                    var post = data[i];
                    $('#table1').append('<tr><td class="table-text-align-centre">' + post['dw_subtitle_language_type'] + '</td><td class="table-text-align-centre">' + post['dw_subtitle_languagec_description'] + '</td><td class="table-text-align-centre"><a href="' + post['dw_subtitle_link'] + '" download><img border="0" src="../images/Download_icon.png" alt="" width="25" height="17"></td>\n\
                    </tr>');
                }
            }
        });
        
        
        
        $.ajax({
            url: '../DetailsComment',  
            data:{downloaderid:downloaderid},
            type: 'post',
            dataType: 'json',
            //data: jsonInfo,
            success: function (data) {
                $('#commentsTable').append('<table class="table table-striped table-hover" id="table2" style="width:80%; margin: 0 auto;"><tbody class="table-hover"></tbody></table>');
                var length = data.length;
                //alert(length);
                for (i = 0; i < length; i++) {
                    var post = data[i];
                    $('#table2').append('<tr><td colspan="4">' + post['dw_comment'] + '</td>\n\
                    </tr><tr><td></td><td class="table-text-align-right" width="250">' + post['dw_username'] + '</td><td class="table-text-align-right" width="100">' + post['dw_comment_date'] + '</td><td class="table-text-align-right" width="100">' + post['dw_comment_time'] + '</td></tr>');
                }
            }
        });
        
        
        
        
        $('#btnSubmitComment').click(function () {
            submitComment(downloaderid);
    });
        
        
        
        
});

function setAttributes(pass) {
            if(pass === "1" || pass === "null"){
                document.getElementById("liUsername").style.visibility="hidden";
                //document.getElementById("liCreateAccount").style.visibility="visible";
                //alert(pass + " if");
            }
            else{
                document.getElementById("liUsername").style.visibility="visible";
                //document.getElementById("liCreateAccount").style.visibility="hidden";
                //alert(pass + " else");
            }
 }
 
 function submitComment (downloaderId){
 var comment = document.getElementById("txtComment").value;
    //alert(comment);
    
    if(comment === null || comment === ""){
        //alert("invalid");
    }
    else{
        $.ajax({
               url:'../DetailsComment',
               data:{downloaderId:downloaderId, comment:comment},
               type:'get',
               cache:false,
               success:function(data){
                  //alert(data);
                  //$('#somediv').text(responseText); 
                  document.getElementById("txtComment").value = "";
                  
                        $('#commentsTable').empty();
                        $.ajax({
                             url: '../DetailsComment',  
                             data:{downloaderid:downloaderId},
                             type: 'post',
                             dataType: 'json',
                             success: function (data) {
                                 $('#commentsTable').append('<table class="table table-striped table-hover" id="table2" style="width:80%; margin: 0 auto;"><tbody class="table-hover"></tbody></table>');
                                var length = data.length;
                                //alert(length);
                                for (i = 0; i < length; i++) {
                                    var post = data[i];
                                    $('#table2').append('<tr><td colspan="4">' + post['dw_comment'] + '</td>\n\
                                    </tr><tr><td></td><td class="table-text-align-right" width="250">' + post['dw_username'] + '</td><td class="table-text-align-right" width="100">' + post['dw_comment_date'] + '</td><td class="table-text-align-right" width="100">' + post['dw_comment_time'] + '</td></tr>');
                                }
                             }
                         });
               },
               error:function(){
                 alert('error');
               }
            }
       );
       
       
    }
    
    
 }