package com.gxa.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.entity.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper extends BaseMapper<Goods> {
    @Select("SELECT g.gid,g.gname,g.sale_price,g.buy_price,g.brand,g.status,gd.color,gd.size,gd.spec, " +
            "       s.realqty " +
            "FROM goods g " +
            "LEFT JOIN goods_detail gd ON g.gid = gd.goods_id " +
            "LEFT JOIN stock s ON g.gid = s.goods_id ")
    List<Goods> queryGoods();
}
