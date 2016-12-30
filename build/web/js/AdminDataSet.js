/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function insertDownloaderItem() {
    var downloaderName = $("#txtDownloaderName").val();
    var fileSize = $("#txtFileSize").val();
    var downloadLink = $("#txtDownloadLink").val();
    var subtitleLink = $("#txtSubtitleLink").val();
    var imdbId = $("#txtImdbId").val();
    var typeId;
    var active;
    var verified;
    
    if(document.getElementById('optionsRadiosMovie').checked)
        typeId = 1;
    else
        typeId = 2;
    
    if(document.getElementById('chkActive').checked)
        active = 1;
    else
        active = 0;
    
    if(document.getElementById('chkVerified').checked)
        verified = 1;
    else
        verified = 0;
    
    var providerId = $('#drpProvider').val();
    //var providerName = $('#drpProvider :selected').text();
    
    var qualityId = $('#drpQuality').val();
    //var qualityName = $('#drpQuality :selected').text();
    
    var subtitleLanguageId = $('#drpSubtitleLanguage').val();
    //var subtitleLanguageName = $('#drpSubtitleLanguage :selected').text();
    
    if(downloaderName === null || downloaderName === "" ||
            fileSize === null || fileSize === "" ||
            downloadLink === null || downloadLink === "" ||
            subtitleLink === null || subtitleLink === "" ||
            typeId === null || typeId === "" ||
            active === null || active === "" ||
            verified === null || verified === "" ||
            imdbId === null || imdbId === ""){
        
        $("#lblWarning").text("Please fill all the fields to continue.");
        $("#lblWarning").css("color", "red");
    }
    else{
        $.ajax({
                    url: '../AdminDataSet',
                    data:{dataSave:1,                   //dataSave = 1 --> insert downloader item
                    downloaderName:downloaderName,
                    fileSize:fileSize,
                    downloadLink:downloadLink,
                    subtitleLink:subtitleLink,
                    typeId:typeId,
                    active:active,
                    verified:verified,
                    providerId:providerId,
                    qualityId:qualityId,
                    subtitleLanguageId:subtitleLanguageId,
                    imdbId:imdbId},         
                    type: 'post',
                    dataType: 'text',
                    success: function(data) {
                        var success = data;
                            if(success === "1"){
                                $('#txtDownloaderName').val("");
                                $('#txtDownloadLink').val("");
                                $('#txtFileSize').val("");
                                $('#txtSubtitleLink').val("");
                                
                                $("#lblWarning").text("Successfull submitted.");
                                $("#lblWarning").css("color", "green");
                            }
                       }

        });
    }
}



function insertDownloaderItemSubtitle() {
    var downloaderId = $("#downloaderIdSubtitle").text();
    var subtitleLanguageId = $('#drpSubtitleLanguageSubtitle').val();
    var subtitleLink = $("#txtSubtitleLinkSubtitle").val();  
    
    if(downloaderId === null || downloaderId === "" ||
            subtitleLanguageId === null || subtitleLanguageId === "" ||
            subtitleLink === null || subtitleLink === ""){
        
        $("#lblWarning2").text("Please fill all the fields to continue.");
        $("#lblWarning2").css("color", "red");
    }
    else{
        $.ajax({
                    url: '../AdminDataSet',
                    data:{dataSave:2,                   //dataSave = 2 --> insert downloader subtitle only
                    downloaderId:downloaderId,
                    subtitleLanguageId:subtitleLanguageId,
                    subtitleLink:subtitleLink,},         
                    type: 'post',
                    dataType: 'text',
                    success: function(data) {
                        var success = data;
                            if(success === "1"){
                                $('#txtSubtitleLinkSubtitle').val("");
                                
                                $("#lblWarning2").text("Successfull submitted.");
                                $("#lblWarning2").css("color", "green");
                            }
                       }

        });
    }
}



function insertProviders() {
    var providerName = $("#txtProviderName").val();
    var providerDescription = $('#txtProviderDescription').val(); 
    
    if(providerName === null || providerName === "" || providerDescription === null || providerDescription === ""){
        
        $("#lblWarningProvider").text("Please fill all the fields to continue.");
        $("#lblWarningProvider").css("color", "red");
    }
    else{
        $.ajax({
                    url: '../AdminDataSet',
                    data:{dataSave:3,                   //dataSave = 3 --> insert providers
                    providerName:providerName,
                    providerDescription:providerDescription},         
                    type: 'post',
                    dataType: 'text',
                    success: function(data) {
                        var success = data;
                            if(success === "1"){
                                $('#txtProviderName').val("");
                                $('#txtProviderDescription').val("");
                                
                                $("#lblWarningProvider").text("Successfull submitted.");
                                $("#lblWarningProvider").css("color", "green");
                                
                                getProvidersToView();
                            }
                       }

        });
    }
}


function insertQualityTypes() {
    var qualityType = $("#txtQualityType").val();
    var qualityDescription= $('#txtQualityTypeDescription').val(); 
    
    if(qualityType === null || qualityType === "" || qualityDescription === null || qualityDescription === ""){
        
        $("#lblWarningQuality").text("Please fill all the fields to continue.");
        $("#lblWarningQuality").css("color", "red");
    }
    else{
        $.ajax({
                    url: '../AdminDataSet',
                    data:{dataSave:4,                   //dataSave = 4 --> insert quality types
                    qualityType:qualityType,
                    qualityDescription:qualityDescription},         
                    type: 'post',
                    dataType: 'text',
                    success: function(data) {
                        var success = data;
                            if(success === "1"){
                                $('#txtQualityType').val("");
                                $('#txtQualityTypeDescription').val("");
                                
                                $("#lblWarningQuality").text("Successfull submitted.");
                                $("#lblWarningQuality").css("color", "green");
                                
                                getQualityTypesToView();
                            }
                       }

        });
    }
}



function insertSubtitleLanguage() {
    var subtitleLanguage = $("#txtSubtitleLanguage").val();
    var subtitleLanguageDescription = $('#txtSubtitleLanguageDescription').val(); 
    
    if(subtitleLanguage === null || subtitleLanguage === "" || subtitleLanguageDescription === null || subtitleLanguageDescription === ""){
        
        $("#lblWarningSubtitleLanguage").text("Please fill all the fields to continue.");
        $("#lblWarningSubtitleLanguage").css("color", "red");
    }
    else{
        $.ajax({
                    url: '../AdminDataSet',
                    data:{dataSave:5,                   //dataSave = 3 --> insert subtitle language
                    subtitleLanguage:subtitleLanguage,
                    subtitleLanguageDescription:subtitleLanguageDescription},         
                    type: 'post',
                    dataType: 'text',
                    success: function(data) {
                        var success = data;
                            if(success === "1"){
                                $('#txtSubtitleLanguage').val("");
                                $('#txtSubtitleLanguageDescription').val("");
                                
                                $("#lblWarningSubtitleLanguage").text("Successfull submitted.");
                                $("#lblWarningSubtitleLanguage").css("color", "green");
                                
                                getSubtitleLanguagesToView();
                            }
                       }

        });
    }
}