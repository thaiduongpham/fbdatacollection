<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
	<head>
		<tiles:insertAttribute name="meta" />
		<tiles:insertAttribute name="js-css" />
		<title><tiles:getAsString name="title" /></title>
	</head>
	<body>
		<!-- Header -->
		<tiles:insertAttribute name="header" />
		<!-- Body -->
		<tiles:insertAttribute name="body" />
		<!-- Footer -->
		<tiles:insertAttribute name="footer" />
	</body>
</html>