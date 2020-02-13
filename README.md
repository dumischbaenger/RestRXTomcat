# Preface

This is an minimal sample app showing the use of _JAX-RS_ on Tomcat/TomEE.

# Tomcat

Tomcat exactly _Apache Tomcat (TomEE)/9.0.12 (8.0.0-M2)_ comes with _Apache CXF_ as _JAX-RS_ provider so there is nothing else to do but install Tomcat/TomEE.

# Application

The application consists only of  three classes

* ModelClass the domain model
* ModelService the data access class
* RestTestService the real REST service class 
* RestRXTomcatApplication (descendant of javax.ws.rs.core.Application) _JAX-RS_ application class

The RestRXTomcatApplication class is not present in all branches because it is not necessary in all scenarios. It is possible to create a _JAX-RS_ application only with annotations in the code.