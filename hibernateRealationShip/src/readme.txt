one2one_uni_fk
      Husband����wife������
      wife���õ�get����������@OneToOne
      @JoinColumn, ���Ըı�����������ݿ������

one2one_bi_fk
       WifeB����Ҳ��HusbandB������
                ��WifeB���gethusbandB()������@OneToOne(mappedBy="wifeB")
       mappedby, ˫���������ϵ��˭��ά���� wifeB��HubbandB���е�����
                  ����:  ����˫�����������mappedBy
           
�����ݿ���һ��һ�ĵ����˫����û������ġ�������

one2one_uni_pk(������)
       HusbandUP����WifeUP������
       @OneToOne
       @PrimaryKeyJoinColumn(�����bug�����Ե���xml���� ���£�)
        <one-to-one name="wifeUP" constrained="true"></one-to-one>
             <generator class="foreign">
	            <param name="property">wifeUP</param>
	         </generator> 
	    
one2one_bi_pk(������)
        wifeBP��Ҳ��HusbandBP������
        @OneToOne
        @PrimaryKeyJoinColumn(�����bug�����Ե���xml���� ���£�)
         <one-to-one name="husbandBP" property-ref="wifeBP"></one-to-one> 
         
one2one_uni_fk_composite
         WifeUFCд���������
             @IdClass(WifePK.class)
             @Id
             @Id
         HusbandUFC��д
             WifeUFC��������д @OneToOne
                                 ���Ҫ�������ݿ��Զ����ɵ�wifeUFC���������������֣� ��Ҫ������Ķ���  
                   @JoinColumns(
    	                   	{
    		            	@JoinColumn(name="wifeId", referencedColumnName="id"),	
    			            @JoinColumn(name="wifeName", referencedColumnName="name")	
    		                 }
                   )      
                   
component
                   һ��������һ�����һ���֣�  2���������ݿ���ֻ����һ�ű�
                   ���@Componentע�⣬�� HusbandC��WifeC��������
        XML ���������£�
            <component name="wifeC">
                <property name="wifeName"/>
                <property name="age"/>
            </component>  
        
many2one_uni
                     �෽ӵ��һ�������á�
         @ManyToOne, ����User����group�������ϡ�
            xml���õĻ�������      
           <many-to-one one="group" column="groupId"/>
           
one2many_uni
                  һ��ӵ�ж෽��set���ϵ�����
       @OneToMany
       @JointColumn
                         ����@JoinitColumn֮�� hibernate�Ͳ��������ݿ�Ĭ�����ɵ����ű��ˡ�����
         xml��������: 
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
                      ����һ��������������@ManyToMany                      