package org.fkit.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.domain.Book;
import org.fkit.mapperProvider.BookDynaSqlProvider;


/**
 * BookMapper接口
 * */
public interface BookMapper {
	/**
	 * 查询所有图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book ")
	List<Book> findAll();
	
	
	/**
	 * 查询教育类图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book where booktypeid='1' ")
	List<Book> findAllEducation();
	
	/**
	 * 查找文艺类图书
	 * @return 图书对象集合
	 * */
	@Select(" select * from book where booktypeid='2'")
	List<Book> findAllArt();
	
	@Select(" select * from book where id = #{id}" )
	Book findbookdetail(Integer id);
	
    @Select("select * from book where id=#{id} ")
    Book  findWithId(@Param("id") Integer id);
    
   @Select("select * from book where id=#{id}")
   @Results({@Result(id=true, column="id", property="id"),@Result(column="id", property="id"),
   @Result(column="book_name",property="book_name"),@Result(column="price",property="price"),
   @Result(column="image", property="image"),
   @Result(column="count", property="count")})
   List<Book> selectByBookId(int id);
   
   //动态插入物品
    @SelectProvider(type=BookDynaSqlProvider.class,method="insertBook")
	void save(Book booK);
    //动态修改物品
    @SelectProvider(type=BookDynaSqlProvider.class,method="updateBook")
	void update(Book book);
    //动态查询物品
    @SelectProvider(method = "selectWhitParam", type = BookDynaSqlProvider.class)
    List<Book> selectById(Map<String, Object> params);
   
    

}  	