package cn.aegisa.selext.dao.service;


import cn.aegisa.selext.dao.spi.ICommonDao;
import cn.aegisa.selext.dao.spi.IMapper;

import java.util.List;

/**
 * @author XianYingda
 */
public interface ICommonService extends IMapper {
    ICommonDao getCommonDao();

    void setCommonDao(ICommonDao commonDao);

    /**
     * 批量处理数据,非事务
     *
     * @param batchSize
     * @param beanList
     * @return
     */
    <T> Integer batchInsert(final Integer batchSize, List<T> beanList);
}
