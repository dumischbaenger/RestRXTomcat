package de.dumischbaenger;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;


@SessionScoped
@Named("modelService")
public class ModelService implements Serializable {
  private static final long serialVersionUID = 1L;

  public ModelService() {
    super();
  }

  public List<ModelClass> getModelList() {
    List<ModelClass> list=new LinkedList<>();

    ModelClass m=new ModelClass();
    m.setName("hello world1");
    list.add(m);

    m=new ModelClass();
    m.setName("hello world2");
    list.add(m);

    return list;
  }
}
