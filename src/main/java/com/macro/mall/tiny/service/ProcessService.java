package com.macro.mall.tiny.service;

import com.macro.mall.tiny.config.EquipmentType;
import com.macro.mall.tiny.dto.ProcessRequestDTO;

public interface ProcessService {

    void dispose(EquipmentType equipmentType, ProcessRequestDTO processRequestDTO);

}
