package de.dumischbaenger;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/resttest")
public class RestTestService {

  @GET
  @Path("/modelclass")
  @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public ModelClass getModellClass() {
    ModelClass m=new ModelClass();
    m.setName("hello world");
	  return m;
	}
}
