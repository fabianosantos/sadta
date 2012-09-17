<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../header.jsp"></jsp:include>
	<ul>
		<c:forEach items="${employeeList}" var="employee">
    		<li> ${employee.id} - ${employee.name} ${employee.surname} - ${employee.address} - ${employee.city} </li>
		</c:forEach>
	</ul>
<jsp:include page="../footer.jsp"></jsp:include>