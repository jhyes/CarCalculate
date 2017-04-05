package com.chinalife.sz.cc.combos.service.impl;

import com.chinalife.sz.cc.combos.mapper.CombosSchemaMapper;
import com.chinalife.sz.cc.combos.service.CombosSchemaService;
import com.chinalife.sz.cc.model.combos.CombosSchemaDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by tianwei on 2016/12/23.
 */
@Service
public class CombosSchemaServiceImpl implements CombosSchemaService {
    private Logger logger= LoggerFactory.getLogger(CombosSchemaService.class);
    @Resource
    private CombosSchemaMapper combosSchemaMapper;
    @Override
    @CacheEvict(value="myCache",key="#combosSchemaDTO.getHandlerCode()")
    public void saveCombosSchema(CombosSchemaDTO combosSchemaDTO) {
        logger.info("save:----------"+combosSchemaDTO.getHandlerCode());
        combosSchemaMapper.saveCombosSchema(combosSchemaDTO);
    }

    @Override
    @Cacheable(value="myCache",key="#handlerCode")
    public List<CombosSchemaDTO> findCombosSchemas(String handlerCode) {
        logger.info("find:------------"+handlerCode);
        return combosSchemaMapper.findCombosSchemas(handlerCode);
    }

    @Override
    @CacheEvict(value="myCache",key="#combosSchemaDTO.getHandlerCode()")
    public int updateCombosSchema(CombosSchemaDTO combosSchemaDTO) {
        logger.info("update:----------"+combosSchemaDTO.getHandlerCode());
        return combosSchemaMapper.updateCombosSchema(combosSchemaDTO);
    }

    @Override
    @CacheEvict(value="myCache",key="#handlerCode")
    public int deleteCombosSchema(Long id,String handlerCode) {
        logger.info("delete -----"+handlerCode);
        return combosSchemaMapper.deleteCombosSchema(id);
    }
}