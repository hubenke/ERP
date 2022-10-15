package com.gxa.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.Repository;

import java.util.List;

public
interface RepositoryMapper extends BaseMapper<Repository> {
//property  cargo.cid    column cid
    //select cid
//    @Select("SELECT r.rname,r.address,c.cid,gd.type_a,g.gname,s.qty" +
//            " FROM repository r" +
//            " LEFT JOIN cargo c ON r.rid=c.repository_id" +
//            " LEFT JOIN goods g on c.goods_id=g.gid" +
//            " LEFT JOIN goods_detail gd on g.gid =gd.goods_id" +
//            " LEFT JOIN stock s on gd.goods_id=s.cargo_id")
////
////
////            @Result(column ="rname",property = "rname",jdbcType = JdbcType.VARCHAR)
////            @Result(column = "address",property = "address",jdbcType = JdbcType.VARCHAR)
////            @Result(column ="type_a",property ="goods_detail.type_a",jdbcType = JdbcType.INTEGER)
////            @Result(column ="gname",property ="goods.gname",jdbcType = JdbcType.VARCHAR)
////            @Result(column ="qty",property ="stock.qty",jdbcType = JdbcType.INTEGER)
//@Results({
//        @Result(column ="rname",property = "rname",jdbcType = JdbcType.VARCHAR),
//        @Result(column ="rname",property = "rname",jdbcType = JdbcType.VARCHAR),
//        @Result(column = "address",property = "address",jdbcType = JdbcType.VARCHAR),
//        @Result(column ="type_a",property ="goods_detail.type_a",jdbcType = JdbcType.INTEGER),
//        @Result(column ="gname",property ="goods.gname",jdbcType = JdbcType.VARCHAR),
//        @Result(column ="qty",property ="stock.qty",jdbcType = JdbcType.INTEGER)
//
//})
    List<Repository> queryAll();

    List<Repository> queryStructure();



}
