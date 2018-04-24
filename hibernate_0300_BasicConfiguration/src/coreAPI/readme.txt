三种状态的删除。
    1.瞬时状态：
              控制台没有任何sql语句打出来. 但是， 可以成功删除自己设定id的transient对象（数据库有对应记录）  
    2.持久状态:
     session,databse， 中都有。。
    3.托管状态
            正常执行， 先select去数据库，然后在调用delete语句    
            
2中获取
    1.	不存在对应记录时表现不一样
    2.	load返回的是代理对象，等到真正用到对象的内容时才发出sql语句
    3.	get直接从数据库加载，不会延迟
               
        Load :   org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer  
                 class coreAPI.TeacherD_$$_jvst790_3    

update
    1. 瞬时状态，   update的时候会报错。   但是， 可以成功更新自己设定id的transient对象（数据库有对应记录）  
    2. 托管状态，  就会将托管状态转化为持久状态，update到数据库中去。
    3. 持久状态，  正常update。
    
         控制台的sql语句中只更新我们想要更新的语句。
        1)	使用xml中的dynamic-update  
         2) HQL, Query
     
saveOrUpdate  
        什么时候调用save，什么时候调用update自己动手做实验
        
Clear
          无论是load还是get,都会首先査找缓存（一级缓存)，如果没有，才会去数据库査找，调用clear()方法可以强制清除session缓存

flush
         可以强制进行从内存到数据库的同步
         
     
      