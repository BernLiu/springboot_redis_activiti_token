$(function() {
	$('#tokenTest').click(function() {
		$.ajax({
			url : '/user/getMessage',
			type : 'POST',
			dataType: 'JSON',
			data : {'message':'传值测试'},
			//  在ajax 的header头中携带token
			beforeSend : function(request) {
				request.setRequestHeader("X_token", sessionStorage.getItem("token"));
			},
			success : function(result) {
				//debugger
				alert(result.MESSAGE+"||"+result.SUCCESS)
			},
			error : function(data) {
				alert("error");
			}
		});
	});
});