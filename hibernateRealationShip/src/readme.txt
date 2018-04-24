one2one_uni_fk
      Husband内有wife的引用
      wife引用的get方法上配置@OneToOne
      @JoinColumn, 可以改变此属性在数据库的名字

one2one_bi_fk
       WifeB类中也有HusbandB的引用
                在WifeB类的gethusbandB()上配置@OneToOne(mappedBy="wifeB")
       mappedby, 双向的依赖关系由谁来维护， wifeB是HubbandB类中的属性
                  规律:  凡是双向关联，必设mappedBy
           
在数据库中一对一的单向和双向是没有区别的。。。。

one2one_uni_pk(不常用)
       HusbandUP内有WifeUP的引用
       @OneToOne
       @PrimaryKeyJoinColumn(这个有bug，所以得用xml来配 如下：)
        <one-to-one name="wifeUP" constrained="true"></one-to-one>
             <generator class="foreign">
	            <param name="property">wifeUP</param>
	         </generator> 
	    
one2one_bi_pk(不常用)
        wifeBP中也有HusbandBP的引用
        @OneToOne
        @PrimaryKeyJoinColumn(这个有bug，所以得用xml来配 如下：)
         <one-to-one name="husbandBP" property-ref="wifeBP"></one-to-one> 
         
one2one_uni_fk_composite
         WifeUFC写下面的内容
             @IdClass(WifePK.class)
             @Id
             @Id
         HusbandUFC内写
             WifeUFC的引用上写 @OneToOne
                                 如果要更改数据库自动生成的wifeUFC的两个主键的名字， 需要配下面的东西  
                   @JoinColumns(
    	                   	{
    		            	@JoinColumn(name="wifeId", referencedColumnName="id"),	
    			            @JoinColumn(name="wifeName", referencedColumnName="name")	
    		                 }
                   )      
                   
component
                   一个类是另一个类的一部分，  2个类在数据库中只生成一张表。
                   添加@Component注解，在 HusbandC中WifeC的引用上
        XML 配置入如下：
            <component name="wifeC">
                <property name="wifeName"/>
                <property name="age"/>
            </component>  
        
many2one_uni
                     多方拥有一方的引用。
         @ManyToOne, 加在User类中group的引用上。
            xml配置的话，如下      
           <many-to-one one="group" column="groupId"/>
           
one2many_uni
                  一方拥有多方的set集合的引用
       @OneToMany
       @JointColumn
                         加上@JoinitColumn之后， hibernate就不会让数据库默认生成第三张表了。。。
         xml配置如下: 
         <set name="user1">
             <key column="groupId"/>
             <one-to-many class="one2many_uni.User1"/>
         </set>                  
 one2many_many2one
          @OneToMany(mappedBy="groupMO")

          @ManyToOne
many2many_uni
         @ManyToMany
	     @JoinTable(name="t_s",
	        joinColumns={@JoinColumn(name="tid")},
	        inverseJoinColumns={@JoinColumn(name="sid")}
	     )
 many2many_bi
                      在另一个类的引用上添加@ManyToMany                      