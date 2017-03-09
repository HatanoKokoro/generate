# generate
用来测试代码自动生成的测试项目，保持简洁，只引用了`spring` `spring-mvc` `mybatis`<br>
其中的codeGenerate.jar为自动生成提取的jar包<br>
classTest为测试类<br>
调用jar包中的CreateFile方法可以直接生成service接口,service,dao接口,jsp的增加,修改,详情,列表,mybatis的基础xml,以及controller<br>
会自动生成一个base_key_sequence表来储存表的主键,用来生成其余表的主键<br>
2017/3/9第一阶段初步完成
-
增删改查已经可以直接使用,但是有很多部分不够灵活，下一阶段会增加一个jsp页面来生成代码,不需要使用main方法生成，以及剥离参数解耦和
