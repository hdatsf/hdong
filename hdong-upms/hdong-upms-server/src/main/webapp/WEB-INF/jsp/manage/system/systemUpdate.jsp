<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<div id="createDialog" class="crudDialog">
	<form id="createForm" method="post">
		<div class="form-group">
			<label for="theme"></label>
			<input id="theme" type="color" class="form-control" name="theme" maxlength="50" value="${system.theme}">
		</div>
		<div class="form-group">
			<label for="icon">图标</label>
			<input id="icon" type="text" class="form-control" name="icon" maxlength="20" value="${system.icon}">
		</div>
		<div class="form-group">
			<label for="title">标题</label>
			<input id="title" type="text" class="form-control" name="title" maxlength="20" value="${system.title}" required="true">
		</div>
		<div class="form-group">
			<label for="name">名称</label>
			<input id="name" type="text" class="form-control" name="name" maxlength="20" value="${system.name}" required="true">
		</div>
		<div class="row">
			<div class="col-lg-8 form-group">
				<label for="name">背景图</label>
				<input id="banner" type="text" class="form-control" name="banner" maxlength="150" value="${system.banner}">
			</div>
			<div class="col-lg-4">
				<div id="picker">上传背景图</div>
			</div>
		</div>
		<div class="form-group">
			<label for="description">描述</label>
			<input id="description" type="text" class="form-control" name="description" maxlength="300" value="${system.description}">
		</div>
		<div class="form-group">
			<label for="basepath">根目录</label>
			<input id="basepath" type="text" class="form-control" name="basepath" maxlength="100" value="${system.basepath}">
		</div>
		<div class="radio">
			<div class="radio radio-inline radio-success">
				<input id="status_1" type="radio" name="status" value="1" <c:if test="${system.status==1}">checked</c:if>>
				<label for="status_1">正常 </label>
			</div>
			<div class="radio radio-inline">
				<input id="status_0" type="radio" name="status" value="-1" <c:if test="${system.status!=1}">checked</c:if>>
				<label for="status_0">锁定 </label>
			</div>
		</div>
		<div class="form-group text-right dialog-buttons">
			<a class="waves-effect waves-button" href="javascript:;" onclick="createSubmit();">保存</a>
			<a class="waves-effect waves-button" href="javascript:;" onclick="createDialog.close();">取消</a>
		</div>
	</form>
</div>
<script>
function createSubmit(){
    alert(123);
    $.dialog({
	animationSpeed: 300,
	title: '新增系统',
	theme:'bootstrap',
	content: 'url:manage/system/create',
	onContentReady: function () {
	}
});
}

</script>