package com.macro.mall.tiny.controller;

import com.macro.mall.tiny.config.EquipmentType;
import com.macro.mall.tiny.dto.ProcessRequestDTO;
import com.macro.mall.tiny.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author shamo
 */
@RequestMapping("process")
@RestController
public class ProcessController {

    @Autowired
    private ProcessService processService;

    @PostMapping(value = "/dispose/{equipmentCode}")
    public void dispose(@RequestBody ProcessRequestDTO processRequestDTO, @PathVariable String equipmentCode) {
        processService.dispose(EquipmentType.getByCode(equipmentCode), processRequestDTO);
    }

}
