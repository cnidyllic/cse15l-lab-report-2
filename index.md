To run the String Server:
```bash
javac Server.java StringServer.java
java StringServer [port]
//e.g: java Main 8080
```
`StringServer.java` will take inputs of strings, keeping track of a single string that gets added to by incoming requests. The requests should look like this: 
`/add-message?s=<string>`
