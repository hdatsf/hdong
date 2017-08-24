//div加载页面
function loadPage(url, container) {
    if (!container)
	container = "#mainDiv";
    $(container).load(url, function(response, status, xhr) {
	if (status == "success") {
	    if (response) {
		try {
		    var result = jQuery.parseJSON(response);
		    if (result.code == 100) {
			jQuery(container).html("");
			alert(result.data);
		    }
		} catch (e) {
		    return response;
		}
	    }
	}
    });
}