package com.macro.mall.tiny.service;

import com.macro.mall.tiny.config.EquipmentType;
import com.macro.mall.tiny.dto.ProcessRequestDTO;
import com.macro.mall.tiny.handler.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author shamo
 */
@Service
public class ProcessServiceImpl implements ProcessService {

    @Autowired
    private InspectionApplyHandler inspectionApplyHandler;

    @Autowired
    private InstructionIssueHandler instructionIssueHandler;

    @Autowired
    private InspectHandler inspectHandler;

    @Autowired
    private CheckHandler checkHandler;

    @Override
    public void dispose(EquipmentType equipmentType, ProcessRequestDTO processRequestDTO) {
        if (equipmentType == EquipmentType.LIFT){
            inspectionApplyHandler.setNextProcessHandler(instructionIssueHandler);
        }else{
            inspectionApplyHandler.setNextProcessHandler(inspectHandler);
        }
        instructionIssueHandler.setNextProcessHandler(inspectHandler);
        inspectHandler.setNextProcessHandler(checkHandler);
        inspectionApplyHandler.dealWithRequest(processRequestDTO);
    }
}
