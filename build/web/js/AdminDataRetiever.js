/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    getSubtitleLanguages();
    getProviders();
    getQualityType();
});


function getSubtitleLanguages() {
    $('#drpSubtitleLanguage').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:1},         //dataRetriverId = 1 --> get subtitle Languages
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    var array = data;
                        $.each(array, function (index, value) {
                              $("#drpSubtitleLanguage").append($("<option></option>").val(this.dw_subtitle_language_id).html(this.dw_subtitle_language_type + " - " + this.dw_subtitle_languagec_description));
                          });

                   }

    });
}


function getProviders() {
    $('#drpProvider').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:2},         //dataRetriverId = 2 --> get providers
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    var array = data;
                        $.each(array, function (index, value) {
                              $("#drpProvider").append($("<option></option>").val(this.dw_provider_id).html(this.dw_provider_name + " - " + this.dw_provider_description));
                          });

                   }

    });
}


function getQualityType() {
    $('#drpQuality').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:3},         //dataRetriverId = 3 --> get quality
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    var array = data;
                        $.each(array, function (index, value) {
                              $("#drpQuality").append($("<option></option>").val(this.dw_quality_type_id).html(this.dw_quality_type_name + " - " + this.dw_quality_type_descriptionl));
                          });

                   }

    });
}



function searchDownloaderItem(keyWord, typeId) {
    
    $('#downloaderTable').empty();

     $.ajax({
            url: '../DownloadSpecialistDataSearch',
            data:{keyWord:keyWord,
                  id:typeId},
            type: 'post',
            dataType: 'json',
            //data: jsonInfo,
            success: function (data) {
                $('#downloaderTable').append('<table class="table table-striped table-hover" id="table1"><thead><tr><th class="table-text-align-centre">Downloader Name</th><th class="table-text-align-centre">Added Date</th></tr></thead><tbody class="table-hover"></tbody></table>');
                var length = data.length;
                for (i = 0; i < length; i++) {
                    var post = data[i];
                    //   $('#Questions').append('');
                    $('#table1').append('<tr  onClick="viewAddSubtitle('+post['dw_downloader_id']+')"><td>' + post['dw_downloader_display_name'] + '</td><td class="table-text-align-centre">' + post['dw_downloader_inserted_date'] + '</td>\n\
                    </tr>');
                }
            }
        });
}

function getSubtitleLanguagesSubtitle() {
    $('#drpSubtitleLanguageSubtitle').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:1},         //dataRetriverId = 1 --> get subtitle Languages
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    var array = data;
                        $.each(array, function (index, value) {
                              $("#drpSubtitleLanguageSubtitle").append($("<option></option>").val(this.dw_subtitle_language_id).html(this.dw_subtitle_language_type + " - " + this.dw_subtitle_languagec_description));
                          });

                   }

    });
}


function getDownloaderDiaplayName(downloaderId) {
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:4,
                downloaderId:downloaderId},         //dataRetriverId = 1 --> get downloader item display name
                type: 'post',
                dataType: 'text',
                success: function(data) {
                    
                    var name = data;
                    $('#downloaderNameSubtitle').text(name);
                   }

    });
}


 function viewAddSubtitle(downloaderId) {
    var id = downloaderId + "";
    getDownloaderDiaplayName(downloaderId);
    
    $('#downloaderIdSubtitle').text(downloaderId); //set the id of the selected downloader
    
    $("#addSubtitleFor").show();
    
    $('#downloaderTable').hide();
}






//set views
function getProvidersToView() {
    $('#tableAvailableProviders').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:2},         //dataRetriverId = 2 --> get all providers
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    $('#tableAvailableProviders').append('<table class="table table-striped table-hover" id="table1" style="width:60%"><thead><tr><th class="table-text-align-centre">Provider Name</th><th class="table-text-align-centre">Description</th></tr></thead><tbody class="table-hover"></tbody></table>');
                        var length = data.length;
                        for (i = 0; i < length; i++) {
                            var post = data[i];
                            $('#table1').append('<tr><td class="table-text-align-centre">' + post['dw_provider_name'] + '</td><td class="table-text-align-centre">' + post['dw_provider_description'] + '</td>\n\
                            </tr>');
                        }

                   }

    });
}


function getQualityTypesToView() {
    $('#tableAvailableQualityTypes').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:3},         //dataRetriverId = 3 --> get all quality types
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    $('#tableAvailableQualityTypes').append('<table class="table table-striped table-hover" id="table2" style="width:60%"><thead><tr><th class="table-text-align-centre">Quality Type</th><th class="table-text-align-centre">Description</th></tr></thead><tbody class="table-hover"></tbody></table>');
                        var length = data.length;
                        for (i = 0; i < length; i++) {
                            var post = data[i];
                            $('#table2').append('<tr><td class="table-text-align-centre">' + post['dw_quality_type_name'] + '</td><td class="table-text-align-centre">' + post['dw_quality_type_descriptionl'] + '</td>\n\
                            </tr>');
                        }

                   }

    });
}


function getSubtitleLanguagesToView() {
    $('#tableAvailableSubtitleLanguages').empty();
    $.ajax({
                url: '../AdminDataRetrive',
                data:{dataRetriverId:1},         //dataRetriverId = 1 --> get all subtitle languages
                type: 'post',
                dataType: 'json',
                success: function(data) {
                    
                    $('#tableAvailableSubtitleLanguages').append('<table class="table table-striped table-hover" id="table3" style="width:60%"><thead><tr><th class="table-text-align-centre">Subtitle Language</th><th class="table-text-align-centre">Description</th></tr></thead><tbody class="table-hover"></tbody></table>');
                        var length = data.length;
                        for (i = 0; i < length; i++) {
                            var post = data[i];
                            $('#table3').append('<tr><td class="table-text-align-centre">' + post['dw_subtitle_language_type'] + '</td><td class="table-text-align-centre">' + post['dw_subtitle_languagec_description'] + '</td>\n\
                            </tr>');
                        }

                   }

    });
}

