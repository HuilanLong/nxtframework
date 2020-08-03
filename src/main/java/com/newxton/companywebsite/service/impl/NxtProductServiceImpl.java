package com.newxton.companywebsite.service.impl;

import com.newxton.companywebsite.entity.NxtProduct;
import com.newxton.companywebsite.dao.NxtProductDao;
import com.newxton.companywebsite.service.NxtProductService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (NxtProduct)表服务实现类
 *
 * @author makejava
 * @since 2020-08-03 10:21:56
 */
@Service("nxtProductService")
public class NxtProductServiceImpl implements NxtProductService {
    @Resource
    private NxtProductDao nxtProductDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public NxtProduct queryById(Long id) {
        return this.nxtProductDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<NxtProduct> queryAllByLimit(int offset, int limit) {
        return this.nxtProductDao.queryAllByLimit(offset, limit);
    }

    /**
     * 通过筛选条件查询指定行数据
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    public List<NxtProduct> selectAllByLimit(@Param("offset") int offset, @Param("limit") int limit,
                                             @Param("categoryId") Long categoryId){
        return this.nxtProductDao.selectAllByLimit(offset, limit, categoryId);
    }

    /**
     * 通过实体作为筛选条件查询Count
     *
     * @param nxtProduct 实例对象
     * @return 对象列表
     */
    public Long queryCount(NxtProduct nxtProduct){
        return this.nxtProductDao.queryCount(nxtProduct);
    }


    /**
     * 新增数据
     *
     * @param nxtProduct 实例对象
     * @return 实例对象
     */
    @Override
    public NxtProduct insert(NxtProduct nxtProduct) {
        this.nxtProductDao.insert(nxtProduct);
        return nxtProduct;
    }

    /**
     * 修改数据
     *
     * @param nxtProduct 实例对象
     * @return 实例对象
     */
    @Override
    public NxtProduct update(NxtProduct nxtProduct) {
        this.nxtProductDao.update(nxtProduct);
        return this.queryById(nxtProduct.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.nxtProductDao.deleteById(id) > 0;
    }
}