# 单例模式
## 1. 饿汉模式 
    最简单的方法，在初始化的时候直接new出来 
 [饿汉模式](https://github.com/811105717/Design-Pattern/tree/master/singleton/src/main/java/hunger)

## 2. 懒汉模式 
    在需要的时候才new 但是需要注意线程安全问题，同时需要使用volatile进行修饰
    使其避免发生指令重排
  [懒汉模式](https://github.com/811105717/Design-Pattern/tree/master/singleton/src/main/java/lazy)

## 3. 内部类模式 
    我个人认为这种方式是最好的方法  具体请看代码 
  [内部类模式](https://github.com/811105717/Design-Pattern/tree/master/singleton/src/main/java/innerclass)

