# 工厂模式
    
### 1.简单工厂模式
    简单工厂模式，就是根据不同的条件创建不同的对象，然后后将其返回，直接看代码吧
   [简单工厂模式](https://github.com/811105717/Design-Pattern/tree/master/factory/src/main/java/com/xiaobai/simplefactory)
   
### 2.工厂模式
    有些时候简单工厂模式并不能满足我们的需求，因为并不是什么时候都只有一个工厂，
    并且不同的工厂生产的产品也有可能不同。关键在于，我们需要在第一步选好工厂。
   [工厂模式](https://github.com/811105717/Design-Pattern/tree/master/factory/src/main/java/com/xiaobai/factory)

### 3.抽象工厂模式
    有些时候我们可能有一系列的依赖（产品族），A厂生产的产品并不能被B厂使用，同样
    的，B厂生产的产品也不与A厂兼容，这时如果随机组装就会产生错误，但是由于我们最
    后的成品是相同的，我们就可以抽象出最后的成品工厂进行生产，由工厂控制组装过程。
   [抽象工厂模式](https://github.com/811105717/Design-Pattern/tree/master/factory/src/main/java/com/xiaobai/abstractfactory)
