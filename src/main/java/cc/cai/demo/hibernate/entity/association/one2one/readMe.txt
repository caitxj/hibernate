one2one 描述
1.数据库实现的方式
---------------------------------
1.1 从表的主键使用主表的主键Id
1.2 主从表有各自id的生成策略,在从表中一个字段指向主表的主键id
------------------------------------------------

----------------------------------------
doman  实体

IdCard{
id
cardNumb
User user
}

User{
id
name
IdCard idCard
}
----------------------------------------
对应的映射文件有2种方式进行实现
one-to-one 
从表：
<id name="userId" column="userId">
<generator class="foreign">
<param name="property">idCard</param>
</generator>
</id>
<one-to-one name="idCard" constrained="true" />
主表:
<one-to-one name="user" />
--------------------------------------------------
many-to-one
从表（unique：true 限制为one-to-one）
<many-to-one name="idCard" unique="true" column="idcard" not-null="true" />
主表
<one-to-one name="user" property-ref="idCard"/>