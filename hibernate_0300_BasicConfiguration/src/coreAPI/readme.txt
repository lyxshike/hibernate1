����״̬��ɾ����
    1.˲ʱ״̬��
              ����̨û���κ�sql�������. ���ǣ� ���Գɹ�ɾ���Լ��趨id��transient�������ݿ��ж�Ӧ��¼��  
    2.�־�״̬:
     session,databse�� �ж��С���
    3.�й�״̬
            ����ִ�У� ��selectȥ���ݿ⣬Ȼ���ڵ���delete���    
            
2�л�ȡ
    1.	�����ڶ�Ӧ��¼ʱ���ֲ�һ��
    2.	load���ص��Ǵ�����󣬵ȵ������õ����������ʱ�ŷ���sql���
    3.	getֱ�Ӵ����ݿ���أ������ӳ�
               
        Load :   org.hibernate.proxy.pojo.javassist.JavassistLazyInitializer  
                 class coreAPI.TeacherD_$$_jvst790_3    

update
    1. ˲ʱ״̬��   update��ʱ��ᱨ��   ���ǣ� ���Գɹ������Լ��趨id��transient�������ݿ��ж�Ӧ��¼��  
    2. �й�״̬��  �ͻὫ�й�״̬ת��Ϊ�־�״̬��update�����ݿ���ȥ��
    3. �־�״̬��  ����update��
    
         ����̨��sql�����ֻ����������Ҫ���µ���䡣
        1)	ʹ��xml�е�dynamic-update  
         2) HQL, Query
     
saveOrUpdate  
        ʲôʱ�����save��ʲôʱ�����update�Լ�������ʵ��
        
Clear
          ������load����get,�������Ȗ��һ��棨һ������)�����û�У��Ż�ȥ���ݿ���ң�����clear()��������ǿ�����session����

flush
         ����ǿ�ƽ��д��ڴ浽���ݿ��ͬ��
         
     
      