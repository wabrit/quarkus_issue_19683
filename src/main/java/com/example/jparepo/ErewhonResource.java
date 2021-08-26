package com.example.jparepo;

import javax.annotation.security.PermitAll;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@RequestScoped
@Path("/doStuff")
public class ErewhonResource {

  @Inject
  ErewhonService erewhonService;

  @GET
  @PermitAll
  public String doStuff() {
    erewhonService.doStuff();
    return "done";
  }
}
