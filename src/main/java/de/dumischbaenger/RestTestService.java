package de.dumischbaenger;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

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
