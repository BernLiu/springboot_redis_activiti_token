/**
 * bootstrap 基础封装对象
 * @returns
 * @author Bern_Liu
 */
(function () {
	var BSTable = function (bstableId, url, columns) {
	    this.btInstance = null;
	    this.bstableId = bstableId; 
	    this.url = url;
	    this.method = "post";
	    this.paginationType = "server";  
	    this.columns = columns;	    
	    this.data = {};
	    this.queryParams = {}; 
	    this.pageSize=10;
	    this.success=null;
	    this.pagination=true;
	    this.fixedNumber=null;
	    this.fixedColumns=false;
	    this.height=10;
	};
	
	BSTable.prototype = {
			//添加公有set方法
	    init: function () {
	        var tableId = this.bstableId;
	        var qParams = this.queryParams;
	        this.btInstance = $('#' + tableId).bootstrapTable('destroy').bootstrapTable({
	            contentType: "application/json",
	            url: this.url,             
	            method: this.method,       	         
	            striped: false,              
	            cache: false,              
	            pagination: this.pagination,
	            height:this.height,
	            sortable: true,            
	            sortOrder: "asc",        
	            pageNumber: 1,                  
	            pageSize: this.pageSize,              
	            queryParamsType: '',
	            fixedColumns: this.fixedColumns,
	            fixedNumber: this.fixedNumber,
	            queryParams: function (params) {
	                return $.extend(params, qParams);
	            }, 
	            sidePagination: this.paginationType,         	                  	                     
	            clickToSelect: false,         
	            columns: this.columns,
	            onLoadSuccess:this.success
	        });	    	       	     	       	  
	        return this;
	    },
	    setHeight:function(height){
	    	this.height=height;
	    },
	    setFixedNumber:function(fixedNumber){
	    	this.fixedNumber=fixedNumber;
	    },
	    setFixedColumns:function(fixedColumns){
	    	this.fixedColumns=fixedColumns;
	    },
	    setPagination:function(pagination){
	    	this.pagination=pagination;
	    },
	    /**
	     * 设置请求方式
	     */
	    setMethod : function(method){
	    	this.method = method
	    },
	    /**
	     * 设置加载成功后执行方法
	     */
	    setSuccess : function(success){
	    	this.success=success;
	    },
	    /**
	     * 设置页面条数
	     */
	    setpageSize:function(pageSize){
	    	 this.pageSize=pageSize;
	    },
	    /**
	     * 设置查询参数
	     */
	    setQueryParams: function (param) {
	        this.queryParams = param;
	    },
	    /**
	     * 设置分页方式 
	     */
	    setPaginationType: function (type) {
	        this.paginationType = type;
	    },
	   /**
	    * 刷新表格方法
	    */
	    refresh: function (parms) {
	        if (typeof parms != "undefined") {
	            this.btInstance.bootstrapTable('refresh', parms);
	        } else {
	            this.btInstance.bootstrapTable('refresh');
	        }
	    },
	  
	    getSelections: function () {
	        return this.btInstance.bootstrapTable('getSelections');
	    }
	};
	window.BSTable = BSTable;
}());