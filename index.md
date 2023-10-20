To run the server:
```bash
javac Server.java Program.java
java Main [port]
//e.g: java Main 8080
```
`StringServer` will take inputs of strings, keeping track of a single string that gets added to by incoming requests. The requests should look like this: 
`/add-message?s=<string>`
