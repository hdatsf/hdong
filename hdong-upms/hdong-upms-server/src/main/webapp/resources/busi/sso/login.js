$(function() {
  $('input').iCheck({
    checkboxClass : 'icheckbox_square-blue',
    radioClass : 'iradio_square-blue',
    increaseArea : '20%'
  });
  $('#signIn').click(function() {
    $.ajax({
      url : 'sso/login',
      type : 'POST',
      data : {
	username : $('#username').val(),
	password : $('#password').val(),
	rememberMe : $('#rememberMe').is(':checked')
      },
      success : function(json) {
	if (json.code == 1) {
	  location.href = json.data;
	} else {
	  alert(json.data);
	  if (10101 == json.code) {
	    $('#username').focus();
	  }
	  if (10102 == json.code) {
	    $('#password').focus();
	  }
	}
      },
      error : function(error) {
	console.log(error);
      }
    });
  });
});