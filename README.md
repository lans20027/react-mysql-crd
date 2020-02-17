"# react-mysql-crd" 

Wildfly's standalone.xml datasource definition:<br>
...<br>
`<datasource jta="true" jndi-name="java:/MySqlDS" pool-name="MySqlDS" enabled="true" use-ccm="true">`<br>
            `<connection-url>jdbc:mysql://localhost:3306/mysql</connection-url>`<br>
            `<driver-class>com.mysql.cj.jdbc.Driver</driver-class>`<br>
...<br>

Build with maven: "mvn clean package"<br>

Deploy "back/target/brand-test.war"