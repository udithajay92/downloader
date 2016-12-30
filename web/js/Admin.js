/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
    numericOnlyValidation("txtFileSize");
    //alert(localStorage['loggedIn'] );
    
    if(localStorage['loggedIn'] === "yes"){
    
        //page load functons
        $("#addSubtitle").hide();
        $("#addSubtitleFor").hide();
        $("#providers").hide();
        $("#qualityType").hide();
        $("#subtitleLanguage").hide();



    //---------------------------------------------------------------------------  
        //sidebar click
        $("#a1").click(function(){
            $("#addDownloaderItem").show();

            $("#addSubtitle").hide();
            $("#addSubtitleFor").hide();
            $("#providers").hide();
            $("#qualityType").hide();
            $("#subtitleLanguage").hide();

            $("#lblWarning").text("");

            getSubtitleLanguages();
            getProviders();
            getQualityType();
        });

        $("#a2").click(function(){
            $("#addSubtitle").show();

            $("#addSubtitleFor").hide();

            $("#providers").hide();
            $("#qualityType").hide();
            $("#subtitleLanguage").hide();

            $("#addDownloaderItem").hide();

            $("#lblWarning2").text("");
            getSubtitleLanguagesSubtitle(); 
        });

        $("#a3").click(function(){
            $("#providers").show();

            $("#addDownloaderItem").hide();
            $("#addSubtitle").hide();
            $("#addSubtitleFor").hide();

            $("#qualityType").hide();
            $("#subtitleLanguage").hide();

            $("#lblWarningProvider").text("");

            getProvidersToView();
        });

        $("#a4").click(function(){
            $("#qualityType").show();

            $("#addDownloaderItem").hide();
            $("#addSubtitle").hide();
            $("#addSubtitleFor").hide();
            $("#providers").hide();

            $("#subtitleLanguage").hide();

            $("#lblWarningQuality").text("");

            getQualityTypesToView();
        });

        $("#a5").click(function(){
            $("#subtitleLanguage").show();

            $("#addDownloaderItem").hide();
            $("#addSubtitle").hide();
            $("#addSubtitleFor").hide();
            $("#providers").hide();
            $("#qualityType").hide();

            $("#lblWarningSubtitleLanguage").text("");

            getSubtitleLanguagesToView();
        });
        
        $("#a6").click(function(){
            localStorage['loggedIn'] = "no";
            window.location.replace("AdminLogin.jsp");
        });


     //---------------------------------------------------------------------------   






        //to insert a downloader item
        $("#btnSubmitDownloaderItem").click(function(){
            insertDownloaderItem();
        });

        //get the downloader item list to add subtitles
        $("#btnSearchDownloaderItemSubtitle").click(function(){
            var keyWord = $("#txtKeywordSubtitle").val();
            var typeId;

            if(document.getElementById('optionsRadiosMovieSubtitle').checked)
                typeId = 1;
            else
                typeId = 2;

            $('#downloaderTable').show();
            searchDownloaderItem(keyWord, typeId);
        });

        //add subtitles seperately
        $("#btnSubmitDownloaderItemSubtitle").click(function(){
            insertDownloaderItemSubtitle();
        });

        //add providers
        $("#btnSubmitProvider").click(function(){
            insertProviders();
        });

        //add quality types
        $("#btnSubmitQuality").click(function(){
            insertQualityTypes();
        });

        //add subtitle languages
        $("#btnSubmitSubtitleLanguage").click(function(){
            insertSubtitleLanguage();
        });
    
    }
    else{
        window.location.replace("AdminLogin.jsp");
    }
});

