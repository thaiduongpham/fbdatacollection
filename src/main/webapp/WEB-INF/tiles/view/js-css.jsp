<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!-- Javascript -->
<script src="${pageContext.request.contextPath}/resources/js/jquery-2.1.3.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angular.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap-3.3.4/js/bootstrap.js"></script>

<script>
  $(document).ready(function() {
	  $.ajaxSetup({ cache: true });
	  $.getScript('//connect.facebook.net/en_US/sdk.js', function(){
	    FB.init({
	      appId: '1559814667604043',
	      version: 'v2.3' // or v2.0, v2.1, v2.0
	    });     
	    $('#loginbutton,#feedbutton').removeAttr('disabled');
	    FB.getLoginStatus(updateStatusCallback);
	  });
	});
</script>

<!-- Css -->
<link href="${pageContext.request.contextPath}/resources/bootstrap-3.3.4/css/bootstrap.css" rel="stylesheet" type="text/css" />