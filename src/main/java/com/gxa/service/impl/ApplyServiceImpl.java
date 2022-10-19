package com.gxa.service.impl;

import com.gxa.dto.ApplyAddDto;
import com.gxa.dto.ApplyDto;
import com.gxa.dto.EmpDto;
import com.gxa.entity.Apply;
import com.gxa.entity.Emp;
import com.gxa.mapper.ApplyMapper;
import com.gxa.mapper.SupplierMapper;
import com.gxa.service.ApplyService;
import com.gxa.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplyServiceImpl implements ApplyService {

    @Autowired
    private ApplyMapper applyMapper;

    @Override
    public List<Apply> queryAll(ApplyDto applyDto) {
        List<Apply> applies = this.applyMapper.queryAll(applyDto);

        return applies;
    }

    @Override
    public List<Emp> queryDeot() {
        List<Emp> emps = this.applyMapper.queryDept();
        return emps;
    }

    @Override
    public int updateCheck(Apply apply) {
        int i = this.applyMapper.updateCheck(apply);
        return i;
    }

    @Override
    public int addApply(ApplyAddDto applyAddDto) {

        int i = this.applyMapper.addapply(applyAddDto);

        if (i != 0){

            Integer applyId = this.applyMapper.queryApplyId(applyAddDto);
            int j = this.applyMapper.addGoods(applyAddDto, applyId);
            if( j != 0){
                return j;
            }else {
                //说明第一条语句执行成功，第二条没成功，事务回滚
                return 0;
            }

        }

        return i;
    }

    @Override
    public List<Emp> queryEmp(EmpDto empDto) {
        List<Emp> emps = this.applyMapper.queryEmp(empDto);
        return emps;
    }

    @Override
    public int assign(Integer applyno,Integer eid) {
        int i = this.applyMapper.assign(applyno, eid);

        return i;
    }

    @Override
    public int backout(Integer applyno) {

        int i = this.applyMapper.backout(applyno);

        return i;
    }

    @Override
    public List<ApplyDto> queryGoods(ApplyAddDto applyAddDto) {
        List<ApplyDto> googs = this.applyMapper.queryGoogs(applyAddDto);
        return googs;
    }

    @Override
    public int addGoods(ApplyDto applyDto) {


        return 0;
    }

    @Override
    public int deleteApply(ApplyAddDto applyAddDto) {

        this.applyMapper.deleteApply(applyAddDto);

        this.applyMapper.deleteApplyGoods(applyAddDto);
        return 0;
    }

}
