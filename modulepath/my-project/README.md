**My Module**

```bash
javac -d target/my_module my_module/src/main/java/module-info.java my_module/src/main/java/com/mypackage/MyClass.java
```

```bash
jar --create --file my_module.jar -C target/my_module .
```

```bash
del ./lib/my_module.jar
```

```bash
move my_module.jar lib/my_module.jar
```

**My App**

```bash
javac -d target/my_app --module-path lib/my_module.jar my_app/src/main/java/module-info.java my_app/src/main/java/com/myapp/Main.java
```

```bash
java --module-path target --module my_app/com.myapp.Main    
```

