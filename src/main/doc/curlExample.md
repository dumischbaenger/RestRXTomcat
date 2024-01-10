This is a minimal JAX-RS example on Glassfish.

#Glassfish

## Admin Console

http://localhost:4848/

## File Realm 

Under Configuration/server-config/Security/Realms/ a file realm can be created.

JAAS Context: fileRealm
Key File: Name of the file in which userdata is stored

## Certificate Realm

https://blog.payara.fish/client-certificate-realm-configuration-in-payara-server

## SSL

### create Keystore

* install Keystore Explorer 
* open the keystore in .../glassfish/domains/domain1/config/keystore.jks
* create key pair along with CA certificate
* use CA key pair to sign a second key pair with its certificate data (server certificate)

A sample keystore keyStoreExample.jks is in this directory. Password is "changeit".

### configure Keystore 

Under Configurations/server-config/http-listener-2 in the GUI or .../glassfish/domains/domain1/config/domain.xml directly in the configuration file.



### debug SSL

Set the Java debugging property on the JVM. To see the handshake information from the application client, append the following:

> -Djavax.net.debug=ssl,handshake to the VMARGS variable.

Details of the server certificate can be shown with:

> keytool  -printcert -sslserver fedora.fritz.box:8181

Curl with parameter -v could also be useful.
 

#Access Restservice 

##http 

curl -u "testuser:testpassword" http://fedora.fritz.box:8080/RestRXTomcat/apppath/resttest/modelclass

##https without verfication

curl -k -u "testuser:testpassword" https://fedora.fritz.box:8181/RestRXTomcat/apppath/resttest/modelclass

##https with verfication


curl  -u "testuser:testpassword" --cacert restrxtomcat.cer https://fedora.fritz.box:8181/RestRXTomcat/apppath/resttest/modelclass

In file restrxtomcat.cer is the root certificate.

Parameter -v show certificate subject ...


