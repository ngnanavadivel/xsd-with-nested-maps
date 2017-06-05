# xsd-with-nested-maps
Modeling XSD with JAXB bindings and XmlJavaAdapter to model Map (even nested ones) data types.

Run using mvn generate-sources to generate the Java counterparts.

JRE should be strictly JDK 1.8's JRE...not just any JRE.

Use the Test.java...to try marshalling Java -> XSD types.

#Sample Output
```xml
<?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<ServiceResponse xmlns="http://greensky.com/demo">
    <roundTripIdentifier>1</roundTripIdentifier>
    <serviceResponseCode>200</serviceResponseCode>
    <angularErrors>
        <entry>
            <key>angularError-001</key>
            <value>
                <entry>
                    <key>field.userName</key>
                    <value>
                        <property>firstName</property>
                        <message>Constraint violation exception has occured.</message>
                        <error>DB Error</error>
                        <value>John</value>
                    </value>
                </entry>
                <entry>
                    <key>field.phoneNumber</key>
                    <value>
                        <property>firstName</property>
                        <message>Constraint violation exception has occured.</message>
                        <error>DB Error</error>
                        <value>John</value>
                    </value>
                </entry>
            </value>
        </entry>
        <entry>
            <key>angularError-002</key>
            <value>
                <entry>
                    <key>field.zip</key>
                    <value>
                        <property>firstName</property>
                        <message>Constraint violation exception has occured.</message>
                        <error>DB Error</error>
                        <value>John</value>
                    </value>
                </entry>
                <entry>
                    <key>field.county</key>
                    <value>
                        <property>firstName</property>
                        <message>Constraint violation exception has occured.</message>
                        <error>DB Error</error>
                        <value>John</value>
                    </value>
                </entry>
            </value>
        </entry>
    </angularErrors>
</ServiceResponse>
```
