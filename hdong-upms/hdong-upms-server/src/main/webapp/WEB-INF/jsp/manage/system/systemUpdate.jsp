<%@ page contentType="text/html; charset=utf-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<div id="createDialog">
	<form id="createForm" method="post" class="form-horizontal">
		<div class="form-group">
			<label for="theme" class="col-sm-2 control-label"></label>
			<div class="col-sm-10">
				<input id="theme" type="color" class="form-control" name="theme" maxlength="50" value="${system.theme}">
			</div>
		</div>
		<div class="form-group">
			<label for="icon" class="col-sm-2 control-label">图标</label>
			<div class="col-sm-10">
				<input id="icon" type="text" class="form-control" name="icon" maxlength="20" value="${system.icon}">
			</div>
		</div>
		<div class="form-group">
			<label for="title" class="col-sm-2 control-label">标题</label>
			<div class="col-sm-10">
				<input id="title" type="text" class="form-control" name="title" maxlength="20" value="${system.title}">
			</div>
		</div>
		<div id="toolbar2" class="btn-toolbar pull-right">
			<button id="btn_query2" type="button" class="btn btn-primary btn-sm">
	            <span class="glyphicon glyphicon-search" aria-hidden="true"></span>查询
	        </button>
	    </div>
	</form>
</div>
<script>
    $(function() {
    });
</script>