A simple database to save strings

This project use the SQL Lite to save e recovery texts. Fast and useful.

1- Clone this project

2 - Install using maven:

`mvn clean install package`

3 - Import into your project:

```
<dependency>
    <groupId>org.lemanoman.simplestorage</groupId>
    <artifactId>simple-storage</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

4 - Usage:

```
SimpleStorage simpleStorage = new SimpleStorage();
simpleStorage.put("mykey", "Some Text");
System.out.println(simpleStorage.get("mykey"));
```

