$(function(){
	$("#submit").click(function(){
		var postData={};
		$(".form-control").each(function(index,item){
			postData[item.name]=item.value
		});
		$.ajax({
	        type: 'HEAD', // 获取头信息，type=HEAD即可
	        url : "/user/login",
	        data:postData,
	        complete: function( xhr,data ){
	            // 获取相关Http Response header
	            var wpoInfo = {
	                // 服务器端时间
	                "date" : xhr.getResponseHeader('Date'),
	                // 如果开启了gzip，会返回这个东西
	                "contentEncoding" : xhr.getResponseHeader('Content-Encoding'),
	                // keep-alive ？ close？
	                "connection" : xhr.getResponseHeader('Connection'),
	                // 响应长度
	                "contentLength" : xhr.getResponseHeader('content-length'),
	                // 服务器类型，apache？lighttpd？
	                "server" : xhr.getResponseHeader('Server'),
	                "vary" : xhr.getResponseHeader('Vary'),
	                "transferEncoding" : xhr.getResponseHeader('Transfer-Encoding'),
	                // text/html ? text/xml?
	                "contentType" : xhr.getResponseHeader('Content-Type'),
	                "cacheControl" : xhr.getResponseHeader('Cache-Control'),
	                // 生命周期？
	                "exprires" : xhr.getResponseHeader('Exprires'),
	                "lastModified" : xhr.getResponseHeader('Last-Modified'),
	                "token" : xhr.getResponseHeader('token')
	            };
	            if(wpoInfo.token!= null){
	            	sessionStorage.setItem("token", wpoInfo.token);
	            	window.location.href='/abd/goIndex';
	            }  
	        },
	        success :function(result){
	        	alert(result);
	        }
	    });
//		$.get("/user/login",postData,function(result){
//			if(result.SUCCESS){				
//				window.location.href='/abd/goIndex';
//				return;
//			}else{
//				alert(result.MESSAGE);
//			}
//		});
	});
});