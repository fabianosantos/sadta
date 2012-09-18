<jsp:include page="../header.jsp"></jsp:include>
	<h1>Cadastro de Empregados</h1>
	<hr>
	
	<c:forEach var="error" items="${errors}">
    	${error.category}  ${error.message}<br />
	</c:forEach>
	
	<form action="saveEmployee">
		<table>
			<tr>
				<td>Nome:</td><td><input type="text" name="employee.name" /></td>
			</tr>
			<tr>
				<td>Sobrenome:</td><td><input type="text" name="employee.surname" /></td>
			</tr>
			<tr>
				<td>Endere&ccedil;o:</td><td><input type="text" name="employee.address" /></td>
			</tr>
			<tr>
				<td>Cidade:</td><td><input type="text" name="employee.city" /></td>
			</tr>
			<tr>
				<td>Estado:</td><td><input type="text" name="employee.state" /></td>
			</tr>
			<tr>
				<td>Pa&iacute;s:</td><td><input type="text" name="employee.country" /></td>
			</tr>
			<tr>
				<td>CEP:</td><td><input type="text" name="employee.postalCode" /></td>
			</tr>
			<tr>
				<td>Nascimento:</td><td><input type="text" name="employee.birthDate" /></td>
			</tr>
			<tr>
				<td>Taxa de Cobran&ccedil;a:</td><td><input type="text" name="employee.feeCharge" /></td>
			</tr>
<!-- 
	private Date birthDate;
	private Double feeCharge;
	private Date admissionDate;
	private String department;
	private String email;
	private String fax;
	private String cellphone;
	private String notes;
	private Double salary;
	private String cpf;
	private String spouse;
	private Double comission;
 -->
			<tr>
				<td></td><td align="right"><input type="submit" class="btn btn-primary"></input></td>
			</tr>
		</table>
	</form>
	
<jsp:include page="../footer.jsp"></jsp:include>