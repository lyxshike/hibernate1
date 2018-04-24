主键的生成策略分为4种
     native, identity, sequence, uuid

  xml的用法省略了
     注解的方法:
     @GenerateValue,   相当于native.
     @GeneratedValue(strategy=GenerationType.IDENTITY)   identity
 ~~~
     @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="teacherSEQ")  注解在主键上 
     @SequenceGenerator(name="teacherSEQ", sequenceName="teacherSEQ_DB")       注解在类上
 ~~
    @GeneratedValue(generator="iduuid")        注解在主键上
	@GenericGenerator(name = "iduuid" ,strategy="uuid")  跟着上面，或者注解在类上
 