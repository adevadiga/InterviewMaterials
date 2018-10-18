package com.jaxrssample.service;

import javax.jws.WebService;
import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.jaxrssample.model.Employee;

@Path("/employee/{employeeId}")
@WebService(name="employeeService")
public interface EmployeeService {

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public Response getEmployeeDetail(@PathParam("employeeId") String employeeId);
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response saveEmployee(Employee employee);
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response  updateEmployee(Employee employee);
	

}
