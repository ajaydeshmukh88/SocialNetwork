
var $create_dialog = $("#logindialog");
var buttons = [{
     /*   text: 'Quit',*/
        click: function() {
          $( this ).dialog( "close" );
        }
      }/*,{
        text: 'Register',
        click: function() {
        // registration path
        }
      },{		
        text: 'Login',
        click: function() {
         // login($('#loginform'), true);
        }
      }*/
	];



$create_dialog.dialog({
      dialogClass: "no-close",
      width: 'auto',
      height: 'auto',
      resizable: false,
      autoOpen : true,
      closeOnEscape: false,
      /*buttons: buttons,*/
      dialogClass:"showLoginDialog",
      close: function( event, ui ) {
        $('#logindialog').remove(); 
      }
});