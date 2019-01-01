$(function() {
	$("#headerpage").load("/abd?reqUrlParam=header");
	$("#footerpage").load("/abd?reqUrlParam=footer");

	function strToBase64(str) {
		var base64 = new Base64();
		return base64.encode(str);
	}

	function BaseToStr(base64Str) {
		var base64 = new Base64();
		return base64.decode(base64Str);
	}

	$.ajaxSetup({
		url : "/abd/sys/getMessage",
		beforeSend : function(request) {
			request.setRequestHeader("X_token", sessionStorage.getItem("token"));
		},
		statusCode : {
			401 : function(data) {
				window.location.href = "/abd/sys/logout";
			}
		}
	});

});