package com.gxa.service.impl;

import com.gxa.entity.Goods;
import com.gxa.service.GoodsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author:
 * @ClassName:GoodsServiceImpl
 * @Package:com.gxa.service.impl.GoodsServiceImpl
 * @Description:
 * @CreateDate:2022年10月12日
 * @Version:
 **/

@Service
public class GoodsServiceImpl  implements GoodsService {
    @Override
    public List<Goods> queryAll() { //查询所有
        return null;
    }

    @Override
    public void add(Goods goods) { //添加

    }

    @Override
    public void queryGoods() { //查询商品

    }

    @Override
    public void update(Goods goods) { //修改

    }

    @Override
    public void delete(Integer gid) { //根据id删除

    }
}
