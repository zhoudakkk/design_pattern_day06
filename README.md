# 状态模式
 
### 简介

  状态模式中的行为是由状态来决定的,
  
  不同状态下有不同的行为.
  
  就是说当一个对象的内在状态改变是允许改变其行为
  
  这个对象看起来像是改变了其类
  
  
### 使用场景
   
   1 一个对象的行为取决于他的状态,并且他必须在运行是根据状态改变他的行为
   
   2 代码中有大量的if switch 语句
   
     状态模式将每一个条件分支放入一个独立的类中,让你可以更具对象自身的情况将对象的状态作为一个
     
     对象 这对象可以不依赖其他对象而独立变化,这样通过多态来去除过多的if语句
     
     从而提高代码的扩展性和可读性
