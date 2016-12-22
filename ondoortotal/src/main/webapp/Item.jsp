<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="contextPath" value="${pageContext.request.contextPath}" />
 <c:if test="${pageContext.request.userPrincipal.name != null}">
        <form id="logoutForm" method="POST" action="${contextPath}/logout">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>

        <h2>Welcome ${pageContext.request.userPrincipal.name} | <a onclick="document.forms['logoutForm'].submit()">Logout</a></h2>

    </c:if>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>Create an account</title>

<link href="${contextPath}/resources/css/bootstrap.min.css"
	rel="stylesheet">
<link href="${contextPath}/resources/css/common.css" rel="stylesheet">
<link href="${contextPath}/resources/css/bootstrap.css" rel="stylesheet">
<link href="${contextPath}/resources/css/app.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<div class="container" ng-app="myapp" ng-controller="MainController">
		<!-- 		<div class="container" ng-app="myapp"> -->
		<!-- 		<h3>AngularJS Bootstrap 3 Menu Example</h3> -->
		<!-- 		<div ng-controller="MainController"> -->
		<div class="navbar navbar-default ">
			<ul class="nav navbar-nav">
				<li ng-class="{dropdown: menu.menus}" ng-repeat="menu in menus">
					<a href="{{menu.action}}" data-toggle="dropdown"
					ng-class="{'dropdown-toggle': menu.menus}">{{menu.title}} <span
						class="caret"></span></a>
					<ul class="dropdown-menu" ng-if="menu.menus">
						<li ng-repeat="submenu in menu.menus"><a
							href="{{submenu.action}}">{{submenu.title}}</a></li>
					</ul>
				</li>
			</ul>
			<!-- 				</div> -->
			<form:form method="POST" action="${contextPath}/item/save"
				modelAttribute="itemForm" class="form-signin">
				<h2 class="form-signin-heading">Item Form</h2>

				<table>
					<tr>
						<td><spring:bind path="product">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="text" path="product" class="form-control"
										placeholder="Product" autofocus="true"></form:input>
									<%--                 <form:errors path="username"></form:errors> --%>
								</div>
							</spring:bind></td>
						<td></td>
						<td><spring:bind path="rate_mode">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="rate_mode" path="rate_mode"
										class="form-control" placeholder="Rate Mode"></form:input>
								</div>
							</spring:bind></td>
					</tr>

					<tr>
						<td><spring:bind path="description">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="description" path="description"
										class="form-control" placeholder="Description"></form:input>
								</div>
							</spring:bind></td>
						<td></td>
						<td><spring:bind path="ingredient_desc">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="ingredient_desc" path="ingredient_desc"
										class="form-control" placeholder="Ingredient Description"></form:input>
								</div>
							</spring:bind></td>
					</tr>

					<tr>
						<td><spring:bind path="quantity">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="quantity" path="quantity"
										class="form-control" placeholder="Quantity"></form:input>
								</div>
							</spring:bind></td>
						<td></td>
						<td><spring:bind path="packaging_type">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="packaging_type" path="packaging_type"
										class="form-control" placeholder="Packaging Type"></form:input>
								</div>
							</spring:bind></td>
					</tr>


					<tr>
						<td><spring:bind path="MRP">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="MRP" path="MRP" class="form-control"
										placeholder="MRP"></form:input>
								</div>
							</spring:bind></td>
						<td></td>
						<td><spring:bind path="purchase_rate">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="purchase_rate" path="purchase_rate"
										class="form-control" placeholder="Purchase Rate"></form:input>
								</div>
							</spring:bind></td>
					</tr>

					<tr>
						<td><spring:bind path="orp">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="orp" path="orp" class="form-control"
										placeholder="ORP"></form:input>
								</div>
							</spring:bind></td>
						<td></td>
						<td><spring:bind path="scheme">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="scheme" path="scheme" class="form-control"
										placeholder="Scheme"></form:input>
								</div>
							</spring:bind></td>
					</tr>

					<tr>
						<td><spring:bind path="shelf_life">
								<div class="form-group ${status.error ? 'has-error' : ''}">
									<form:input type="shelf_life" path="shelf_life"
										class="form-control" placeholder="Shelf Life"></form:input>
								</div>
							</spring:bind></td>
						<td></td>
						<%-- <td><spring:bind path="rate_mode">
									<div class="form-group ${status.error ? 'has-error' : ''}">
										<form:input type="rate_mode" path="rate_mode"
											class="form-control" placeholder="Rate Mode"></form:input>
									</div>
								</spring:bind></td> --%>
					</tr>
				</table>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
			</form:form>

		</div>
		<!-- 		</div> -->
	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script src="${contextPath}/resources/js/bootstrap.min.js"></script>
	<script src="${contextPath}/resources/js/MainController.js"></script>
</body>
</html>
