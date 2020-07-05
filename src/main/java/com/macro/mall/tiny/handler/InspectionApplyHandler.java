package com.macro.mall.tiny.handler;

import com.macro.mall.tiny.config.ProcessStep;
import com.macro.mall.tiny.dto.ProcessRequestDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author shamo
 */
@Slf4j
@Component
public class InspectionApplyHandler extends AbstractProcessHandler {

    public InspectionApplyHandler() {
        this.processStep = ProcessStep.INSPECTION_APPLY;
    }

    @Override
    void handle(ProcessRequestDTO processRequestDTO) {
        log.info("current step {}, content {}", processStep.getName(), processRequestDTO.toString());
    }
}
