package com.gxa.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gxa.dto.GoodsDto;
import com.gxa.entity.Goods;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsMapper {
//    @Select("SELECT g.gid,g.gname,g.sale_price,g.buy_price,g.brand,g.status,gd.color,gd.size,gd.spec, " +
//            "       s.realqty " +
//            "FROM goods g " +
//            "LEFT JOIN goods_detail gd ON  gd.goods_id = g.gid" +
//            "LEFT JOIN stock s ON  s.goods_id = g.gid ")
    List<Goods> queryGoods();

    List<Goods> queryAllByGoodsDto(GoodsDto goodsDto);
}
