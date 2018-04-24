联合主键，分两种形式。
    student,  xml
    teacher,   注解
   (自定义注解， 在hibernate-config中用 mapping-class..
    xml,  在hibernate-config中用mapping-resources)
    
注解有3种方式
    1.   @Embeded,   @Id
    2.   @EmbededId
    3.   @IdClass    @Id    @Id


为什么主键类需要实现serlialize()接口呢?
     1.  服务器集群， 到时候可能要将一个硬盘上的数据迁移到另一个硬盘上， 不实现这个接口， 怎么迁移呢？？？
     2.  虚拟内存，  需要硬盘的一块空间暂时来充当内存，放在虚拟内存上的对象要不要实现这个接口呢？？

为什么要求主键类实现euqlas方法和hascode方法呢？
       数据库区分两行记录是靠主键来完成的， 这些对象放到内存中怎么区分呢， 还不是equlas方法和hashcode方法。。。


