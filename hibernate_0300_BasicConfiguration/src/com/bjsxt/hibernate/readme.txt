���������ɲ��Է�Ϊ4��
     native, identity, sequence, uuid

  xml���÷�ʡ����
     ע��ķ���:
     @GenerateValue,   �൱��native.
     @GeneratedValue(strategy=GenerationType.IDENTITY)   identity
 ~~~
     @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="teacherSEQ")  ע���������� 
     @SequenceGenerator(name="teacherSEQ", sequenceName="teacherSEQ_DB")       ע��������
 ~~
    @GeneratedValue(generator="iduuid")        ע����������
	@GenericGenerator(name = "iduuid" ,strategy="uuid")  �������棬����ע��������
 