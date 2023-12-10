package de.dumischbaenger;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/resttest")
public class RestTestService {

  @Inject
  ModelService service;
  
  @GET
  @Path("/modelclass")
  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<ModelClass> getModellClass() {
    List<ModelClass> list=service.getModelList();
//    ModelClass m=new ModelClass();
//    m.setName("hello world");
	  return list;
	}
}
