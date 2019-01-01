$(function(){
	tableinit();
	function tableinit(){
		var processDeplymentColum = processDeplymentColums();
		var uptable = new BSTable('processDeplyment', '/abd/activiti/processDeplyment',processDeplymentColum);
		uptable.setSuccess(upSuccess);
		uptable.setHeight(200);
		uptable.setPagination(false);
		uptable.init();
		
		var processProcedfColum=processProcedfColums();
		var bottomLeftTable=new BSTable('processProcedf', '/abd/activiti/processProcedf',processProcedfColum);
		bottomLeftTable.setSuccess(bottomSuccess);	
		bottomLeftTable.setHeight(200);
		bottomLeftTable.setPagination(false);
		bottomLeftTable.init();
	}
	
	function upSuccess(data){
		console.log(data);
	}
	
	function bottomSuccess(data){
		console.log(data);
	}
	
	function processDeplymentColums(){
		var processDeplymentColums =[
			{
				field : 'ID_',
				title : 'id',			
			},{
				field : 'NAME_',
				title : 'name',				
			},{
				field : 'DEPLOY_TIME_',
				title : 'create_time',				
			},{
				field : 'TENANT_ID_',
				title : 'tenant_id',				
			}
		];
		return processDeplymentColums;
	}
	
	function processProcedfColums(){
		var processProcedfColums = [
			{
				field : 'ID_',
				title : 'id',			
			},{
				field : 'NAME_',
				title : 'name',				
			},{
				field : 'KEY_',
				title : 'key',				
			},{
				field : 'VERSION_',
				title : 'version',				
			},{
				field : 'CATEGORY_',
				title : 'key',				
			}
		];
		return processProcedfColums;
	}
});