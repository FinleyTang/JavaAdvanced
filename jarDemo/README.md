在MyProject目录下：
```
javac -d bin MyClass.java
```
这将在bin目录下创建包结构mypackage，并在其中生成MyClass.class文件。

创建JAR包：
```
jar cvfm MyProject.jar manifest.txt  -C bin .
```


确保MyProject.jar复制到CallerProject/lib目录下。然后编译并运行Caller.java：
```
java -cp .:lib/MyProject.jar Caller
```
运行程序时，也需要指定类路径：

```
java -cp .:lib/MyProject.jar Caller
```
