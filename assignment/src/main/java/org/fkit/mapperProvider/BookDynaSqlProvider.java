package org.fkit.mapperProvider;


import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import org.fkit.domain.Book;

public class BookDynaSqlProvider {
	// 分页动态查询
    public String selectWhitParam(Map<String, Object> params){
	   String sql =  new SQL(){
		  {
			SELECT("*");
			FROM("book");
			if(params.get("book") != null){
			Book book = (Book)params.get("book");
			if(book.getBook_name() != null && !book.getBook_name().equals("")){
			WHERE("  book_name LIKE CONCAT ('%',#{book.book_name},'%') ");
		    }
							}
						}
					}.toString();
					
					if(params.get("pageModel") != null){
						sql += " limit #{pageModel.firstLimitParam} , #{pageModel.pageSize}  ";
					}
					
					return sql;
				}	
				// 动态查询总数量
				public String count(Map<String, Object> params){
					return new SQL(){
						{
							SELECT("count(*)");
							FROM("book");
							if(params.get("book") != null){
								Book book = (Book)params.get("book");
								if(book.getBook_name() != null && !book.getBook_name().equals("")){
									WHERE(" book_name LIKE CONCAT ('%',#{book.book_name},'%') ");
								}
							}
						}
					}.toString();
				}	
				
				// 动态插入
				public String insertBook(Book book){
					
					return new SQL(){
						{
							INSERT_INTO("book");
							if(book.getBook_id() != null && !book.getBook_id().equals("")){
								VALUES("book_id", "#{book_id}");
							}
							if(book.getBook_name() != null && !book.getBook_name().equals("")){
								VALUES("book_name", "#{book_name}");
							}
							if(book.getAuthor() != null && !book.getAuthor().equals("")){
								VALUES("author", "#{author}");
							}
							if(book.getPrice() != null && !book.getPrice().equals("")){
								VALUES("price", "#{price}");
							}
							if(book.getRemark() != null && !book.getRemark().equals("")){
								VALUES("remark", "#{remark}");
							}
							if(book.getInventory() != null && !book.getInventory().equals("")){
								VALUES("inventory", "#{inventory}");
							}
							if(book.getImage() != null && !book.getImage().equals("")){
								VALUES("image", "#{image}");
							}
							if(book.getImage_a() != null && !book.getImage_a().equals("")){
								VALUES("image_a", "#{image_a}");
							}
							if(book.getImage_b() != null && !book.getImage_b().equals("")){
								VALUES("image_b", "#{image_b}");
							}
							if(book.getBooktypeid() != null && !book.getBooktypeid().equals("")){
								VALUES("booktypeid", "#{booktypeid}");
							}
						}
					}.toString();
				}
				// 动态更新
					public String updateBook(Book book){
						
						return new SQL(){
							{
								UPDATE("book");
								if(book.getBook_id() != null){
									SET(" book_id= #{book_id} ");
								}
								if(book.getBook_name() != null){
									SET(" book_name = #{book_name} ");
								}
								if(book.getAuthor() != null){
									SET(" author = #{author} ");
								}
								if(book.getPrice() != null){
									SET(" price = #{price} ");
								}
								if(book.getRemark() != null){
									SET("remark = #{remark} ");
								}
								if(book.getInventory() != null){
									SET("inventory = #{inventory} ");
								}
								if(book.getImage() != null){
									SET("image = #{image} ");
								}
								if(book.getImage_a() != null){
									SET("image_a = #{image_a} ");
								}
								if(book.getImage_b() != null){
									SET("image_b = #{image_b} ");
								}
								if(book.getBooktypeid() != null){
									SET("booktypeid = #{booktypeid} ");
								}
								
								
								WHERE(" id = #{id} ");
							}
						}.toString();
					}
}
