$("#fileUpload").fileinput({
    uploadUrl: "/abd/fileupload/commonfileupload", //上传的地址
    allowedFileExtensions: ['apk','png','bpmn'],//接收的文件后缀
    uploadAsync: true, //默认异步上传
    showUpload: true, //是否显示上传按钮
    showRemove : true, //显示移除按钮
    showPreview : true, //是否显示预览
    showCaption: false,//是否显示标题
    browseClass: "btn btn-primary", //按钮样式     
    dropZoneEnabled: true,//是否显示拖拽区域
    maxFileCount: 1, //表示允许同时上传的最大文件个数
    enctype: 'multipart/form-data',
    validateInitialCount:true
});
//异步上传返回结果处理
$("#fileUpload").on("fileuploaded", function (event, data, previewId, index) {
        console.log(event);
        console.log(data);
        console.log(previewId);
        console.log(index);
    });

//上传前
$('#fileUpload').on('filepreupload', function(event, data, previewId, index) {
  console.log(event);
  console.log(data);
  console.log(previewId);
  console.log(index);
});