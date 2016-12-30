/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function () {  
    var pass;
        $.ajax({
            url: 'ValidateUser',
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
        
        $.ajax({
            url: 'DownloaderData',  
            type: 'post',
            dataType: 'json',
            //data: jsonInfo,
            success: function (data) {
                $('#downloaderTable').append('<table class="table table-striped table-hover" id="table1"><thead><tr><th class="table-text-align-centre">Downloader Name</th><th class="table-text-align-centre">Downloader Link</th><th class="table-text-align-centre">Added Date</th><th class="table-text-align-centre">File Size</th><th class="table-text-align-centre">Provider</th><th class="table-text-align-centre">Quality</th></tr></thead><tbody class="table-hover"></tbody></table>');
                var length = data.length;
                for (i = 0; i < length; i++) {
                    var post = data[i];
                    //   $('#Questions').append('');
                    $('#table1').append('<tr><td onClick="setPage('+post['dw_downloader_id']+')">' + post['dw_downloader_display_name'] + '</td><td class="table-text-align-centre"><a href="' + post['dw_downloader_link'] + '" download><img border="0" src="images/Download_icon.png" alt="" width="25" height="17"></td><td class="table-text-align-centre">' + post['dw_downloader_inserted_date'] + '</td>\n\
                    <td class="table-text-align-centre">' + post['dw_downloader_file_size'] + '</td> <td class="table-text-align-centre">' + post['dw_provider_name'] + '</td> <td class="table-text-align-centre">' + post['dw_quality_type_name'] + '</td>\n\
                    </tr>');
                }
            }
        });
        
        $('#btnSearch').click(function () {
            var keyWord = document.getElementById("txtSearch").value;
            search(keyWord);
    });

});

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
 
 function setPage(clicked) {
    var id = clicked + "";
    window.location = 'DownloaderItems/Details.jsp?id=' + id;
}

function search(keyWord) {
    //alert(keyWord);
    
    $('#downloaderTable').empty();
    
    /*$.ajax({
            url:'DownloaderDataSearch',
            data:{keyWord:keyWord},
            type:'get',
            cache:false,
            success:function(data){
                
            },
            error:function(){
              alert('error');
            }
         }
    );*/
    
     $.ajax({
            url: 'DownloaderDataSearch', 
            data:{keyWord:keyWord},
            type: 'post',
            dataType: 'json',
            //data: jsonInfo,
            success: function (data) {
                $('#downloaderTable').append('<table class="table table-striped table-hover" id="table1"><thead><tr><th class="table-text-align-centre">Downloader Name</th><th class="table-text-align-centre">Downloader Link</th><th class="table-text-align-centre">Added Date</th><th class="table-text-align-centre">File Size</th><th class="table-text-align-centre">Provider</th><th class="table-text-align-centre">Quality</th></tr></thead><tbody class="table-hover"></tbody></table>');
                var length = data.length;
                for (i = 0; i < length; i++) {
                    var post = data[i];
                    //   $('#Questions').append('');
                    $('#table1').append('<tr><td onClick="setPage('+post['dw_downloader_id']+')">' + post['dw_downloader_display_name'] + '</td><td class="table-text-align-centre"><a href="' + post['dw_downloader_link'] + '" download><img border="0" src="images/Download_icon.png" alt="" width="25" height="17"></td><td class="table-text-align-centre">' + post['dw_downloader_inserted_date'] + '</td>\n\
                    <td class="table-text-align-centre">' + post['dw_downloader_file_size'] + '</td> <td class="table-text-align-centre">' + post['dw_provider_name'] + '</td> <td class="table-text-align-centre">' + post['dw_quality_type_name'] + '</td>\n\
                    </tr>');
                }
            }
        });
}