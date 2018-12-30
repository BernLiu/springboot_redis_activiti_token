$(function(){
	$("#headerpage").load("/abd?reqUrlParam=header");
	$("#footerpage").load("/abd?reqUrlParam=footer");


function strToBase64(str){
	var base64 = new Base64();
	return base64.encode(str);
}

function BaseToStr(base64Str){
	var base64 = new Base64();
	return base64.decode(base64Str); 
}

});