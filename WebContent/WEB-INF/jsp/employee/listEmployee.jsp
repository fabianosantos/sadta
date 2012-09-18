<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"></jsp:include>
	<table class="table table-striped">
		<tr>
			<td>ID</td>
			<td>Nome</td>
			<td>Endere&ccedil;o</td>
			<td>Cidade</td>
		</tr>
		<c:forEach items="${employeeList}" var="employee">
    		<tr>
    			<td>${employee.id}</td>
    			<td>${employee.name} ${employee.surname}</td>
    			<td>${employee.address}</td>
    			<td>${employee.city}</td>
    		</tr>
		</c:forEach>
	</table>
<jsp:include page="../footer.jsp"></jsp:include>